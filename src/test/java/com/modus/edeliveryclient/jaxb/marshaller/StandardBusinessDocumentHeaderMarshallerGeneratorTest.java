/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modus.edeliveryclient.jaxb.marshaller;

import com.modus.edeliveryclient.jaxb.documentheader.StandardBusinessDocumentHeader;
import com.modus.edeliveryclient.jaxb.documentheader.StandardBusinessDocumentHeader.BusinessScope.Scope;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static javafx.scene.input.KeyCode.T;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pantelispanka
 */
public class StandardBusinessDocumentHeaderMarshallerGeneratorTest {
    
    private static StandardBusinessDocumentHeader businDocHeader;
    
    private static int headerVersion = 1;
    
    private final static String participantIdentifierSenderScheme = "iso6523-actorid-upis";
    private final static String participantIdentifierSenderValue = "9933:test1";
    private final static String participantIdentifierReceiverScheme = "iso6523-actorid-upis";
    private final static String participantIdentifierReceiverValue = "9933:test1";
    
    private final static String documentIdStandard = "urn:oasis:names:specification:ubl:schema:xsd:Invoice-2";
    private final static int docTypeVersion = 1;
    private final static String documentInstanceIdentifier = "627a2e9a-a146-461f-b62f-f22f5799fd55";
    private final static String documentType = "Invoice";
    
    private final static String scopeType = "DOCUMENTID";
    private final static String scopeIdentifier = "urn:oasis:names:specification:ubl:schema:xsd:Invoice-2:: Invoice##urn:www.cenbii.eu:transaction:biitrns010:ver2.0:extended:urn: www.peppol.eu:bis:peppol4a:ver2.0::2.1";
    private final static String scopeType2 = "PROCESSID";
    private final static String scopeIdentifier2 = "urn:www.cenbii.eu:profile:bii04:ver2.0";

    private final static List<Scope> scopes = new ArrayList<Scope>() {
    {
        add(new Scope(scopeType, scopeIdentifier));
        add(new Scope(scopeType2, scopeIdentifier2));
    }
};
    
    
    
    public StandardBusinessDocumentHeaderMarshallerGeneratorTest() {

    }
    
    public StandardBusinessDocumentHeader returnDocHead(){
        return businDocHeader;
    }
    
    
    @BeforeClass
    public static void setUpClass() throws DatatypeConfigurationException {

        businDocHeader = new StandardBusinessDocumentHeaderGenerator()
                .generateDocumentHeaderfromValues(headerVersion, participantIdentifierSenderScheme, participantIdentifierSenderValue,
                        participantIdentifierReceiverScheme, participantIdentifierReceiverValue,
                        documentIdStandard, docTypeVersion, documentInstanceIdentifier, documentType, scopes);
//        businDocHeader.
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    /**
     * The file to be written
     */
//    /Users/modussa/Desktop/Marshalling.txt
    @Test
    public void generateHeaderXml(){
        File file = new File("/Users/modussa/Java/EDeliveryClient/src/test/resources/standardBusinessDocumentXMLtest.xsd");
        
        try{
            JAXBContext jaxbContext = JAXBContext.newInstance(StandardBusinessDocumentHeader.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(businDocHeader, file);
            jaxbMarshaller.marshal(businDocHeader, System.out);
            
        }catch(JAXBException e){
            e.printStackTrace();
        }
        
    }
    
    
}
