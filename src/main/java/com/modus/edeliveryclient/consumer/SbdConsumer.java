/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modus.edeliveryclient.consumer;

import com.modus.edeliveryclient.exception.EDeliveryException;
import com.modus.edeliveryclient.jaxb.standardbusinessdocument.PapyrosDocument;
import com.modus.edeliveryclient.jaxb.standardbusinessdocument.SBDHFactory;
import com.modus.edeliveryclient.jaxb.standardbusinessdocument.StandardBusinessDocument;
import com.modus.edeliveryclient.jaxb.standardbusinessdocument.StandardBusinessDocumentHeader;
import com.modus.edeliveryclient.jaxb.unmarshaller.StandardBusinessDocumentUnmarshaller;
import com.modus.edeliveryclient.models.Authorization;
import com.modus.edeliveryclient.models.ResponseMessage;
import com.modus.edeliveryclient.serialize.Serializer;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.concurrent.CompletableFuture;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import org.asynchttpclient.AsyncHttpClient;

/**
 *
 * @author Pantelispanka
 * @author AG
 */
public class SbdConsumer extends BaseConsumer {

    private final static String SENDENDPOINT = "/api/v1/outbox";

    private static final String MESSAGESENDPOINT = "/api/v1/messages/";

    private JAXBContext jaxbContext;
    private Marshaller marshaller;

    private StandardBusinessDocument sbd;

    private String basePath;
    private final String sendEndpoind;
    private final String messagesEndpoint;

    public SbdConsumer(AsyncHttpClient httpClient, Serializer serializer, String basepath) {
        super(httpClient, serializer, basepath);
        this.basepath = basepath;
        this.sendEndpoind = createPath(basepath, SENDENDPOINT);
        this.messagesEndpoint = createPath(basepath, MESSAGESENDPOINT);
    }

    public CompletableFuture<ResponseMessage> createOutgoingDefault(StandardBusinessDocumentHeader sbdh,
            PapyrosDocument papDoc,
            Authorization auth) throws JAXBException {
        String authorizationHeader;
        sbd = new StandardBusinessDocument();
        ResponseMessage rm = new ResponseMessage();
        try {
            String authHeader = auth.getUsername().toString() + ":" + auth.getPassword().toString();
            String authHeaderEncoded = Base64.getEncoder().encodeToString(authHeader.getBytes("utf-8"));
            authorizationHeader = "Basic " + authHeaderEncoded;
        } catch (UnsupportedEncodingException e) {
            throw new EDeliveryException(e);
        }

        JAXBContext jaxbContext = JAXBContext.newInstance(StandardBusinessDocument.class, SBDHFactory.class);
//        this.jaxbMarshaller = jaxbContext.createMarshaller();
        Marshaller marshaller = jaxbContext.createMarshaller();
        try {
            sbd.setStandardBusinessDocumentHeader(sbdh);
            sbd.setAny(papDoc);
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.setProperty(Marshaller.JAXB_FRAGMENT, false);

        } catch (Exception e) {
            e.printStackTrace();
        }
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        marshaller.marshal(sbd, outputStream);
        return httpClient.preparePost(sendEndpoind)
                .addHeader("Content-Type", "application/xml")
                .addHeader("Authorization", authorizationHeader)
                .setBody(outputStream.toByteArray())
                .execute()
                .toCompletableFuture()
                .exceptionally(t -> {
                    throw new EDeliveryException(t);
                })
                .thenApply(resp -> {
                    int status = resp.getStatusCode();

                    switch (status) {
                        case 201:
                            rm.setStatus(201);
                            rm.setMessage("Participant created");
                            break;
                        case 202:
                            rm.setStatus(202);
                            rm.setMessage("Created");
                            break;
                        case 400:
                            rm.setStatus(400);
                            rm.setMessage("Bad Request");
                            break;
                        case 401:
                            rm.setStatus(401);
                            rm.setMessage(resp.getResponseBody());
                            break;
                        case 406:
                            rm.setStatus(406);
                            rm.setMessage("Message not in the right format");
                            break;
                        case 500:
                            rm.setStatus(500);
                            rm.setMessage("Internal server error from AP connector");
                            break;
                    }
                    return rm;
                });

    }

    public CompletableFuture<Object> getMessageDefault(String messageId,
            Authorization auth) throws JAXBException {
        String authorizationHeader;
        String messageUri = messagesEndpoint + "/" + messageId;
        sbd = new StandardBusinessDocument();
        ResponseMessage rm = new ResponseMessage();
        try {
            String authHeader = auth.getUsername().toString() + ":" + auth.getPassword().toString();
            String authHeaderEncoded = Base64.getEncoder().encodeToString(authHeader.getBytes("utf-8"));
            authorizationHeader = "Basic " + authHeaderEncoded;
        } catch (UnsupportedEncodingException e) {
            throw new EDeliveryException(e);
        }
        return httpClient.prepareGet(messageUri)
                .addHeader("Authorization", authorizationHeader)
                .execute()
                .toCompletableFuture()
                .exceptionally(t -> {
                    throw new EDeliveryException(t);
                })
                .thenApply(resp -> {
                    int status = resp.getStatusCode();

                    switch (status) {
                        case 200: {
                            try {
                                JAXBContext jaxbContext = JAXBContext.newInstance(StandardBusinessDocument.class, SBDHFactory.class);
                                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                                StandardBusinessDocument sbd = (StandardBusinessDocument) JAXBIntrospector.getValue(jaxbUnmarshaller.unmarshal(resp.getResponseBodyAsStream()));
                                return sbd;
                            } catch (Exception ex) {
                                Logger.getLogger(SbdConsumer.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        break;
                        case 401:
                            throw new EDeliveryException(resp.getResponseBody());
                        case 404:
                            throw new EDeliveryException(resp.getResponseBody());

                    }
                    return rm;
                });

    }

}
