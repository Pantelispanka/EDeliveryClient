/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modus.edeliveryclient.jaxb.marshaller;

import com.modus.edeliveryclient.jaxb.jaxbwrapper.StandardBusinessDocumentWrapper;
import com.modus.edeliveryclient.jaxb.standardbusinessdocumentheader.BusinessScope;
import com.modus.edeliveryclient.jaxb.standardbusinessdocumentheader.SBDHFactory;
import com.modus.edeliveryclient.jaxb.standardbusinessdocumentheader.Scope;
import com.modus.edeliveryclient.jaxb.standardbusinessdocumentheader.StandardBusinessDocument;
import com.modus.edeliveryclient.jaxb.standardbusinessdocumentheader.StandardBusinessDocumentHeader;
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

    private static StandardBusinessDocument sbd;

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

    private final static String manifestDescr = "manifestDescr";
    private final static String manifestLanguage = " manifestLanguage";
    private final static String maniTypeQualCode = "maniTypeQualCode";
    private final static String uniformResourceIdentifier = "uniformResourceIdentifier";

    private final static List<BusinessScope> scopes = new ArrayList<BusinessScope>() {
        {
//            add(new Scope());
//            add(new Scope());
        }
    };

    public StandardBusinessDocumentHeaderMarshallerGeneratorTest() {

    }

    @BeforeClass
    public static void setUpClass() throws DatatypeConfigurationException {
        Scope scope = new Scope();
        scope.setIdentifier(scopeIdentifier);
        scope.setInstanceIdentifier("Instance");
        scope.setType("ScopeType");
//        scope
        BusinessScope bScope = new BusinessScope();
        bScope.getScope().add(scope);
        scopes.add(bScope);
        businDocHeader = new StandardBusinessDocumentHeaderGenerator()
                .generateDocumentHeaderfromValues(headerVersion, participantIdentifierSenderScheme, participantIdentifierSenderValue,
                        participantIdentifierReceiverScheme, participantIdentifierReceiverValue,
                        documentIdStandard, docTypeVersion, documentInstanceIdentifier, documentType, scopes,
                        manifestDescr, manifestLanguage, maniTypeQualCode, uniformResourceIdentifier);

//        sbd.setStandardBusinessDocumentHeader(businDocHeader);

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws DatatypeConfigurationException {
        businDocHeader = new StandardBusinessDocumentHeaderGenerator()
                .generateDocumentHeaderfromValues(headerVersion, participantIdentifierSenderScheme, participantIdentifierSenderValue,
                        participantIdentifierReceiverScheme, participantIdentifierReceiverValue,
                        documentIdStandard, docTypeVersion, documentInstanceIdentifier, documentType, scopes,
                        manifestDescr, manifestLanguage, maniTypeQualCode, uniformResourceIdentifier
                );
    }

    @After
    public void tearDown() {
    }

    public StandardBusinessDocumentHeader returnDocHead() {
        return businDocHeader;
    }

    /**
     * The file to be written
     */
//    /Users/modussa/Desktop/Marshalling.txt
    @Test
    public void generateHeaderXml() {
        File file = new File("/Users/modussa/Java/EDeliveryClient/src/test/resources/standardBusinessDocumentXMLtest.xsd");

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(StandardBusinessDocumentWrapper.class, SBDHFactory.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            sbd.setStandardBusinessDocumentHeader(businDocHeader);
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(sbd, file);
            jaxbMarshaller.marshal(sbd, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

}
