/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modus.edeliveryclient.jaxb.marshaller;

import com.modus.edeliveryclient.jaxb.egif_core_component.AttachmentType;
import com.modus.edeliveryclient.jaxb.egif_core_component.BinaryObjectType;
import com.modus.edeliveryclient.jaxb.egif_core_component.CodeType;
import com.modus.edeliveryclient.jaxb.egif_core_component.DocumentType;
import com.modus.edeliveryclient.jaxb.egif_core_component.EgifCoreComponentsFactory;
import com.modus.edeliveryclient.jaxb.egif_core_component.EventType;
import com.modus.edeliveryclient.jaxb.egif_core_component.ExaminationResultType;
import com.modus.edeliveryclient.jaxb.egif_core_component.HierarchicalStructureType;
import com.modus.edeliveryclient.jaxb.egif_core_component.NameType;
import com.modus.edeliveryclient.jaxb.egif_core_component.OrganizationType;
import com.modus.edeliveryclient.jaxb.egif_core_component.PartyType;
import com.modus.edeliveryclient.jaxb.egif_core_component.PaymentTermsType;
import com.modus.edeliveryclient.jaxb.egif_core_component.PaymentType;
import com.modus.edeliveryclient.jaxb.egif_core_component.PeriodType;
import com.modus.edeliveryclient.jaxb.egif_core_component.PersonType;
import com.modus.edeliveryclient.jaxb.egif_core_component.PictureType;
import com.modus.edeliveryclient.jaxb.egif_core_component.ServiceChargeType;
import com.modus.edeliveryclient.jaxb.egif_core_component.StatusType;
import com.modus.edeliveryclient.jaxb.egif_core_component.TextType;
import com.modus.edeliveryclient.jaxb.egif_core_component.UsageConditionType;
import com.modus.edeliveryclient.jaxb.jaxbwrapper.AttachmentTypeHelper;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
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
public class DocumentTypeMarshallerTest {

    private static DocumentType docType;
    private static AttachmentType attachment;

    private static AttachmentTypeHelper attachHelp;
    
    
    private static BinaryObjectType embeddedBinObj;
    private static NameType nameTypeValue;
    private static PictureType pictureTypeValue;
    private static CodeType statusCode;
    private static TextType uriText;
    
//    private static final PeriodType period = new PeriodType();
//    private static final OrganizationType organization = new OrganizationType();
//    private static final PartyType party = new PartyType();
//    private static final PersonType person = new PersonType();
//    private static final ServiceChargeType chargeType = new ServiceChargeType();
//    private static final TextType text = new TextType();
//    private static final HierarchicalStructureType stracture = new HierarchicalStructureType();
//    private static final PeriodType effectivePeriod = new PeriodType();
//    private static final OrganizationType issuerOrganization = new OrganizationType();
//    private static final PartyType issuerParty = new PartyType();
//    private static final TextType purpose = new TextType();
//    private static final ExaminationResultType examinationResult = new ExaminationResultType();
//    private static final PaymentType payment = new PaymentType();
//    private static final PaymentTermsType paymentTerms = new PaymentTermsType();
//    private static final StatusType referenceStatus = new StatusType();
//    private static final EventType relatedEvent = new EventType();
//    private static final UsageConditionType conditionType = new UsageConditionType();
//    private static final NameType name = new NameType();
//    private static final CodeType season = new CodeType();
//    private static final CodeType organizationType = new CodeType();

    private File file = new File("/Users/modussa/Java/EDeliveryClient/src/test/resources/DocumentTypeXMLtest.xsd");

    private Path pathToTestFile = Paths.get("/Users/modussa/Java/EDeliveryClient/src/test/resources/test.txt");
    private static byte[] data ;

    public DocumentTypeMarshallerTest() throws DatatypeConfigurationException, IOException {
        this.data = Files.readAllBytes(pathToTestFile);
        GregorianCalendar c = new GregorianCalendar();
        c.setTime(new Date());
        XMLGregorianCalendar xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
    }

    @BeforeClass
    public static void setUpClass() throws DatatypeConfigurationException, IOException {
        DocumentTypeMarshallerTest march = new DocumentTypeMarshallerTest();
//        purpose.setLanguageCode("gre");
//        purpose.setValue("eng");
//        
//        name.setLanguageCode("gre");
//        name.setValue("gre");
//        
//        season.setLanguageCode("eng");
//        season.setListAgencyID("agency id");
//        season.setListAgencyName("agency name");
//        season.setListID("id");
//        season.setListName("lisn name");
//        season.setListSchemeURI("list scheme uri");
//        season.setListURI("list uri");
//        season.setListVersionID("version id");
//        season.setName("name");
//        season.setValue("value");
//        period.setEndDateTime(issueDateTime);
//        period.setInclusiveIndicator(Boolean.FALSE);
//        period.setName(name);
//        period.setSeasonCode(season);
//        period.setSequenceNumeric(BigDecimal.ONE);
//        period.setSpecificDateTime(issueDateTime);
//        period.setStartDateTime(issueDateTime);
//        period.setStatusIndicator(Boolean.FALSE);
//        person.set
//        
//        referenceStatus.setResponsiblePerson(person);
//        docType = new DocumentGenerator().generateDocTypeFromClasses(period,
//                organization, party, person, chargeType, text, stracture,
//                Boolean.FALSE, BigDecimal.ONE, effectivePeriod, BigDecimal.TEN,
//                issueDateTime, issuerOrganization, issuerParty, Boolean.TRUE,
//                purpose, receiptDateTime, referenceDateTime, examinationResult,
//                payment, paymentTerms, referenceStatus, relatedEvent, conditionType, submissionDateTime);
        EgifCoreComponentsFactory fac = new EgifCoreComponentsFactory();
        JAXBElement test = fac.createAttachment(attachment);
        embeddedBinObj = new BinaryObjectType();
        embeddedBinObj.setCharacterSetCode("characterCodeSet");
        embeddedBinObj.setEncodingCode("encoding Code");
        embeddedBinObj.setFileName("test.txt");
        embeddedBinObj.setFormat("txt");
        embeddedBinObj.setMimeCode("mimeCode");
        embeddedBinObj.setUri("uri");
        embeddedBinObj.setValue(data);
        nameTypeValue = new NameType();
        nameTypeValue.setLanguageCode("languageCode");
        nameTypeValue.setValue("language value");
        pictureTypeValue = new PictureType();
        attachment = new AttachmentGenerator().attachmentTypeGenerator(embeddedBinObj, nameTypeValue, pictureTypeValue, docType, statusCode, uriText);
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
    public void testAttachmentMarshaller(){
        try{
            JAXBContext jaxbContext = JAXBContext.newInstance(AttachmentTypeHelper.class);
            attachHelp = new AttachmentTypeHelper();
            attachHelp.setAttachment(attachment);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(attachHelp, file);
            jaxbMarshaller.marshal(attachHelp, System.out);
            
        }catch(JAXBException e){
            e.printStackTrace();
        }
    }
}
