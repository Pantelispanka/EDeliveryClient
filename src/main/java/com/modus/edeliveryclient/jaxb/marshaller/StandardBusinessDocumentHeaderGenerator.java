/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modus.edeliveryclient.jaxb.marshaller;

import com.modus.edeliveryclient.jaxb.documentheader.DocumentHeaderFactory;
import com.modus.edeliveryclient.jaxb.documentheader.StandardBusinessDocumentHeader;
import com.modus.edeliveryclient.jaxb.documentheader.StandardBusinessDocumentHeader.BusinessScope;
import com.modus.edeliveryclient.jaxb.documentheader.StandardBusinessDocumentHeader.BusinessScope.Scope;
import com.modus.edeliveryclient.jaxb.documentheader.StandardBusinessDocumentHeader.DocumentIdentification;
import com.modus.edeliveryclient.jaxb.documentheader.StandardBusinessDocumentHeader.Receiver;
import com.modus.edeliveryclient.jaxb.documentheader.StandardBusinessDocumentHeader.Receiver.Identifier;
import com.modus.edeliveryclient.jaxb.documentheader.StandardBusinessDocumentHeader.Sender;
import com.modus.edeliveryclient.jaxb.jaxbwrapper.StandardBusinessDocumentWrapper;
import java.time.LocalDate;
import java.time.ZoneId;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author Pantelispanka
 * @author AG
 */
public class StandardBusinessDocumentHeaderGenerator {

    StandardBusinessDocumentWrapper businessDocument = new StandardBusinessDocumentWrapper();
    DocumentHeaderFactory headerFactory = new DocumentHeaderFactory();
    

    public StandardBusinessDocumentHeader generateDocumentHeaderfromValues(float headerVersion,
            String participantIdentifierSenderScheme, String participantIdentifierSenderValue,
            String participantIdentifierReceiverScheme, String participantIdentifierReceiverValue,
            String documentIdStandard, int docTypeVersion,
            String documentInstanceIdentifier, String documentType
            , List<StandardBusinessDocumentHeader.BusinessScope.Scope> scopes) throws DatatypeConfigurationException {

        StandardBusinessDocumentHeader header = headerFactory.createStandardBusinessDocumentHeader();
        
        /**
         * Sets the header Version
         *
         */
        header.setHeaderVersion(headerVersion);

        /**
         * Creates and places sender
         *
         */
        Sender sender = new Sender();
        com.modus.edeliveryclient.jaxb.documentheader.StandardBusinessDocumentHeader.Sender.Identifier senderId = new com.modus.edeliveryclient.jaxb.documentheader.StandardBusinessDocumentHeader.Sender.Identifier();
        senderId.setValue(participantIdentifierSenderValue);
        senderId.setAuthority(participantIdentifierSenderScheme);
        sender.setIdentifier(senderId);
        header.setSender(sender);

        /**
         * Creates and places receiver
         *
         */
        Receiver receiver = new Receiver();
        Identifier receiverId = new Identifier();
        receiverId.setAuthority(participantIdentifierReceiverScheme);
        receiverId.setValue(participantIdentifierReceiverValue);
        receiver.setIdentifier(receiverId);
        header.setReceiver(receiver);

        /**
         * Creates and places Document Identification
         *
         */
        DocumentIdentification docInf = new DocumentIdentification();
        docInf.setStandard(documentIdStandard);
//        String typeVersion = Integer.toString(docTypeVersion);
        docInf.setTypeVersion(docTypeVersion);
        docInf.setInstanceIdentifier(documentInstanceIdentifier);
        docInf.setType(documentType);
        LocalDate localDate = LocalDate.now();
        GregorianCalendar gcal = GregorianCalendar.from(localDate.atStartOfDay(ZoneId.systemDefault()));
        XMLGregorianCalendar xdate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
        docInf.setCreationDateAndTime(xdate);
        header.setDocumentIdentification(docInf);

        /**
         * Creates and places business scope
         */
        BusinessScope bscope = new BusinessScope();
        header.setBusinessScope(bscope);
        for (Iterator<Scope> it = scopes.iterator(); it.hasNext();) {
            StandardBusinessDocumentHeader.BusinessScope.Scope businessScope = it.next();
//            Scope scope = new Scope();
//            BusinessScope bscope = new BusinessScope();
//            scope.setInstanceIdentifier(businessScope.getInstanceIdentifier());
//            scope.setType(businessScope.getType());
//            bscope.getScope().add(scope);
//            header.setBusinessScope(bscope);
            header.getBusinessScope().getScope().add(businessScope);
        }

        return header;

    }
    
    
//    public StandardBusinessDocumentHeader generateDocumentHeaderfromClass(){
//        
//        
//        
//        
//        
//    }

}
