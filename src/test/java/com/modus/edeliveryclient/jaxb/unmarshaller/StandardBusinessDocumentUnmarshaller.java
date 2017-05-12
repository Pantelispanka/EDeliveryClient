/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modus.edeliveryclient.jaxb.unmarshaller;

import com.modus.edeliveryclient.jaxb.standardbusinessdocumentheader.SBDHFactory;
import com.modus.edeliveryclient.jaxb.standardbusinessdocumentheader.StandardBusinessDocument;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
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
public class StandardBusinessDocumentUnmarshaller {

    public StandardBusinessDocumentUnmarshaller() {
    }

    @BeforeClass
    public static void setUpClass() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testUnmarshallingAll() {

        try {

            File file = new File("/Users/modussa/Java/EDeliveryClient/src/test/resources/standardBusinessDocumentAllXMLtest.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(StandardBusinessDocument.class, SBDHFactory.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Object sbd =  jaxbUnmarshaller.unmarshal(file);
            System.out.println(sbd);
//            System.out.println(sbd.getStandardBusinessDocumentHeader().toString());

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
    
}
