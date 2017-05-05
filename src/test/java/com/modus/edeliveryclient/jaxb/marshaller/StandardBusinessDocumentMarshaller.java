/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modus.edeliveryclient.jaxb.marshaller;

import com.modus.edeliveryclient.jaxb.documentheader.StandardBusinessDocumentHeader;
import com.modus.edeliveryclient.jaxb.egif_core_component.AttachmentType;
import com.modus.edeliveryclient.jaxb.egif_core_component.BinaryObjectType;
import com.modus.edeliveryclient.jaxb.egif_core_component.CodeType;
import com.modus.edeliveryclient.jaxb.egif_core_component.DocumentType;
import com.modus.edeliveryclient.jaxb.egif_core_component.NameType;
import com.modus.edeliveryclient.jaxb.egif_core_component.PersonType;
import com.modus.edeliveryclient.jaxb.egif_core_component.PictureType;
import com.modus.edeliveryclient.jaxb.egif_core_component.TextType;
import com.modus.edeliveryclient.jaxb.jaxbwrapper.AttachmentTypeHelper;
import com.modus.edeliveryclient.jaxb.jaxbwrapper.StandardBusinessDocumentWrapper;
import java.io.File;
import java.io.IOException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;
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

public class StandardBusinessDocumentMarshaller {
    
    
    
    private static StandardBusinessDocumentHeader sbdh;
    private static AttachmentTypeHelper att;
    
    private StandardBusinessDocumentWrapper sbd;
    
    
    
    
    public StandardBusinessDocumentMarshaller() {
    }
    
    @BeforeClass
    public static void setUpClass() throws DatatypeConfigurationException, IOException {
        sbdh = new StandardBusinessDocumentHeaderMarshallerGeneratorTest().returnDocHead(); 
        att = new DocumentTypeMarshallerTest().returnAttach();
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
    public void generateHeaderXml(){
        File file = new File("/Users/modussa/Java/EDeliveryClient/src/test/resources/standardBusinessDocumentAllXMLtest.xsd");
        
        try{
            JAXBContext jaxbContext = JAXBContext.newInstance(StandardBusinessDocumentWrapper.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            sbd = new StandardBusinessDocumentWrapper();
//            sbd.setStandardBusinessDocumentHeader(att);
            sbd.setStandardBusinessDocumentHeader(sbdh);
            
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(sbd, file);
            jaxbMarshaller.marshal(sbd, System.out);
            
        }catch(JAXBException e){
            e.printStackTrace();
        }
        
    }
}
