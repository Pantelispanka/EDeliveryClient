//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.03 at 01:28:43 PM EEST 
//


package com.modus.edeliveryclient.jaxb.egif_core_component;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.modus.edeliveryclient.jaxbclasses package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class EgifCoreComponentsFactory {

    private final static QName _CharacterSetCode_QNAME = new QName("urn:un:unece:uncefact:codelist:standard:IANA:CharacterSetCode:2006-12-07", "CharacterSetCode");
    private final static QName _Address_QNAME = new QName("gr:gov:egif:data:standard:CoreComponents:Address", "Address");
    private final static QName _PaymentMeans_QNAME = new QName("gr:gov:egif:data:standard:CoreComponents:PaymentMeans", "PaymentMeans");
    private final static QName _Communication_QNAME = new QName("gr:gov:egif:data:standard:CoreComponents:Communication", "Communication");
    private final static QName _DeliveryTerms_QNAME = new QName("gr:gov:egif:data:standard:CoreComponents:DeliveryTerms", "DeliveryTerms");
    private final static QName _MonetarySummation_QNAME = new QName("gr:gov:egif:data:standard:CoreComponents:MonetarySummation", "MonetarySummation");
    private final static QName _GeographicalCoordinate_QNAME = new QName("gr:gov:egif:data:standard:CoreComponents:GeographicalCoordinate", "GeographicalCoordinate");
    private final static QName _CurrencyCode_QNAME = new QName("urn:un:unece:uncefact:codelist:standard:5:4217:2007-03-08", "CurrencyCode");
    private final static QName _PhysicalObject_QNAME = new QName("gr:gov:egif:data:standard:CoreComponents:PhysicalObject", "PhysicalObject");
    private final static QName _Status_QNAME = new QName("gr:gov:egif:data:standard:CoreComponents:Status", "Status");
    private final static QName _LanguageCode_QNAME = new QName("urn:un:unece:uncefact:codelist:standard:5:639:2006", "LanguageCode");
    private final static QName _Signature_QNAME = new QName("gr:gov:egif:data:standard:CoreComponents:Signature", "Signature");
    private final static QName _Document_QNAME = new QName("gr:gov:egif:data:standard:CoreComponents:Document", "Document");
    private final static QName _Organization_QNAME = new QName("gr:gov:egif:data:standard:CoreComponents:Organization", "Organization");
    private final static QName _Contact_QNAME = new QName("gr:gov:egif:data:standard:CoreComponents:Contact", "Contact");
    private final static QName _Country_QNAME = new QName("gr:gov:egif:data:standard:CoreComponents:Country", "Country");
    private final static QName _ServiceCharge_QNAME = new QName("gr:gov:egif:data:standard:CoreComponents:ServiceCharge", "ServiceCharge");
    private final static QName _ExaminationResult_QNAME = new QName("gr:gov:egif:data:standard:CoreComponents:ExaminationResult", "ExaminationResult");
    private final static QName _Person_QNAME = new QName("gr:gov:egif:data:standard:CoreComponents:Person", "Person");
    private final static QName _CharacterSetEncodingCode_QNAME = new QName("urn:un:unece:uncefact:codelist:standard:6:0133:20061205", "CharacterSetEncodingCode");
    private final static QName _CountrySubdivision_QNAME = new QName("gr:gov:egif:data:standard:CoreComponents:CountrySubdivision", "CountrySubdivision");
    private final static QName _Line_QNAME = new QName("gr:gov:egif:data:standard:CoreComponents:Line", "Line");
    private final static QName _Picture_QNAME = new QName("gr:gov:egif:data:standard:CoreComponents:Picture", "Picture");
    private final static QName _Location_QNAME = new QName("gr:gov:egif:data:standard:CoreComponents:Location", "Location");
    private final static QName _CountryCode_QNAME = new QName("urn:un:unece:uncefact:codelist:standard:5:3166:2006-09-26", "CountryCode");
    private final static QName _Attachment_QNAME = new QName("gr:gov:egif:data:standard:CoreComponents:Attachment", "Attachment");
    private final static QName _AddressLine_QNAME = new QName("gr:gov:egif:data:standard:CoreComponents:AddressLine", "AddressLine");
    private final static QName _FinancialInstitution_QNAME = new QName("gr:gov:egif:data:standard:CoreComponents:FinancialInstitution", "FinancialInstitution");
    private final static QName _Event_QNAME = new QName("gr:gov:egif:data:standard:CoreComponents:Event", "Event");
    private final static QName _AgencyIdentificationCode_QNAME = new QName("urn:un:unece:uncefact:codelist:standard:6:3055:D06B", "AgencyIdentificationCode");
    private final static QName _Calculation_QNAME = new QName("gr:gov:egif:data:standard:CoreComponents:Calculation", "Calculation");
    private final static QName _MIMEMediaType_QNAME = new QName("urn:un:unece:uncefact:codelist:standard:IANA:MIMEMediaType:2006-01-10", "MIMEMediaType");
    private final static QName _Feature_QNAME = new QName("gr:gov:egif:data:standard:CoreComponents:Feature", "Feature");
    private final static QName _MeasurementUnitCommonCode_QNAME = new QName("urn:un:unece:uncefact:codelist:standard:6:Recommendation20:4", "MeasurementUnitCommonCode");
    private final static QName _Party_QNAME = new QName("gr:gov:egif:data:standard:CoreComponents:Party", "Party");
    private final static QName _HierarchicalStructure_QNAME = new QName("gr:gov:egif:data:standard:CoreComponents:HierarchicalStructure", "HierarchicalStructure");
    private final static QName _Payment_QNAME = new QName("gr:gov:egif:data:standard:CoreComponents:Payment", "Payment");
    private final static QName _FinancialCard_QNAME = new QName("gr:gov:egif:data:standard:CoreComponents:FinancialCard", "FinancialCard");
    private final static QName _PaymentTerms_QNAME = new QName("gr:gov:egif:data:standard:CoreComponents:PaymentTerms", "PaymentTerms");
    private final static QName _Period_QNAME = new QName("gr:gov:egif:data:standard:CoreComponents:Period", "Period");
    private final static QName _FinancialAccount_QNAME = new QName("gr:gov:egif:data:standard:CoreComponents:FinancialAccount", "FinancialAccount");
    private final static QName _UsageCondition_QNAME = new QName("gr:gov:egif:data:standard:CoreComponents:UsageCondition", "UsageCondition");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.modus.edeliveryclient.jaxbclasses
     * 
     */
    public EgifCoreComponentsFactory() {
    }

    /**
     * Create an instance of {@link DocumentType }
     * 
     */
    public DocumentType createDocumentType() {
        return new DocumentType();
    }

    /**
     * Create an instance of {@link SoundType }
     * 
     */
    public SoundType createSoundType() {
        return new SoundType();
    }

    /**
     * Create an instance of {@link GraphicType }
     * 
     */
    public GraphicType createGraphicType() {
        return new GraphicType();
    }

    /**
     * Create an instance of {@link MeasureType }
     * 
     */
    public MeasureType createMeasureType() {
        return new MeasureType();
    }

    /**
     * Create an instance of {@link NameType }
     * 
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link IDType }
     * 
     */
    public IDType createIDType() {
        return new IDType();
    }

    /**
     * Create an instance of {@link TextType }
     * 
     */
    public TextType createTextType() {
        return new TextType();
    }

    /**
     * Create an instance of {@link VideoType }
     * 
     */
    public VideoType createVideoType() {
        return new VideoType();
    }

    /**
     * Create an instance of {@link BinaryObjectType }
     * 
     */
    public BinaryObjectType createBinaryObjectType() {
        return new BinaryObjectType();
    }

    /**
     * Create an instance of {@link QuantityType }
     * 
     */
    public QuantityType createQuantityType() {
        return new QuantityType();
    }

    /**
     * Create an instance of {@link AmountType }
     * 
     */
    public AmountType createAmountType() {
        return new AmountType();
    }

    /**
     * Create an instance of {@link CodeType }
     * 
     */
    public CodeType createCodeType() {
        return new CodeType();
    }

    /**
     * Create an instance of {@link PeriodType }
     * 
     */
    public PeriodType createPeriodType() {
        return new PeriodType();
    }

    /**
     * Create an instance of {@link AttachmentType }
     * 
     */
    public AttachmentType createAttachmentType() {
        return new AttachmentType();
    }

    /**
     * Create an instance of {@link PictureType }
     * 
     */
    public PictureType createPictureType() {
        return new PictureType();
    }

    /**
     * Create an instance of {@link PartyType }
     * 
     */
    public PartyType createPartyType() {
        return new PartyType();
    }

    /**
     * Create an instance of {@link OrganizationType }
     * 
     */
    public OrganizationType createOrganizationType() {
        return new OrganizationType();
    }

    /**
     * Create an instance of {@link ContactType }
     * 
     */
    public ContactType createContactType() {
        return new ContactType();
    }

    /**
     * Create an instance of {@link CommunicationType }
     * 
     */
    public CommunicationType createCommunicationType() {
        return new CommunicationType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link CountryType }
     * 
     */
    public CountryType createCountryType() {
        return new CountryType();
    }

    /**
     * Create an instance of {@link CountrySubdivisionType }
     * 
     */
    public CountrySubdivisionType createCountrySubdivisionType() {
        return new CountrySubdivisionType();
    }

    /**
     * Create an instance of {@link GeographicalCoordinateType }
     * 
     */
    public GeographicalCoordinateType createGeographicalCoordinateType() {
        return new GeographicalCoordinateType();
    }

    /**
     * Create an instance of {@link AddressLineType }
     * 
     */
    public AddressLineType createAddressLineType() {
        return new AddressLineType();
    }

    /**
     * Create an instance of {@link SignatureType }
     * 
     */
    public SignatureType createSignatureType() {
        return new SignatureType();
    }

    /**
     * Create an instance of {@link LocationType }
     * 
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link StatusType }
     * 
     */
    public StatusType createStatusType() {
        return new StatusType();
    }

    /**
     * Create an instance of {@link PersonType }
     * 
     */
    public PersonType createPersonType() {
        return new PersonType();
    }

    /**
     * Create an instance of {@link FeatureType }
     * 
     */
    public FeatureType createFeatureType() {
        return new FeatureType();
    }

    /**
     * Create an instance of {@link HierarchicalStructureType }
     * 
     */
    public HierarchicalStructureType createHierarchicalStructureType() {
        return new HierarchicalStructureType();
    }

    /**
     * Create an instance of {@link FinancialInstitutionType }
     * 
     */
    public FinancialInstitutionType createFinancialInstitutionType() {
        return new FinancialInstitutionType();
    }

    /**
     * Create an instance of {@link EventType }
     * 
     */
    public EventType createEventType() {
        return new EventType();
    }

    /**
     * Create an instance of {@link DeliveryTermsType }
     * 
     */
    public DeliveryTermsType createDeliveryTermsType() {
        return new DeliveryTermsType();
    }

    /**
     * Create an instance of {@link PhysicalObjectType }
     * 
     */
    public PhysicalObjectType createPhysicalObjectType() {
        return new PhysicalObjectType();
    }

    /**
     * Create an instance of {@link UsageConditionType }
     * 
     */
    public UsageConditionType createUsageConditionType() {
        return new UsageConditionType();
    }

    /**
     * Create an instance of {@link PaymentType }
     * 
     */
    public PaymentType createPaymentType() {
        return new PaymentType();
    }

    /**
     * Create an instance of {@link PaymentMeansType }
     * 
     */
    public PaymentMeansType createPaymentMeansType() {
        return new PaymentMeansType();
    }

    /**
     * Create an instance of {@link FinancialAccountType }
     * 
     */
    public FinancialAccountType createFinancialAccountType() {
        return new FinancialAccountType();
    }

    /**
     * Create an instance of {@link FinancialCardType }
     * 
     */
    public FinancialCardType createFinancialCardType() {
        return new FinancialCardType();
    }

    /**
     * Create an instance of {@link PaymentTermsType }
     * 
     */
    public PaymentTermsType createPaymentTermsType() {
        return new PaymentTermsType();
    }

    /**
     * Create an instance of {@link MonetarySummationType }
     * 
     */
    public MonetarySummationType createMonetarySummationType() {
        return new MonetarySummationType();
    }

    /**
     * Create an instance of {@link CalculationType }
     * 
     */
    public CalculationType createCalculationType() {
        return new CalculationType();
    }

    /**
     * Create an instance of {@link ServiceChargeType }
     * 
     */
    public ServiceChargeType createServiceChargeType() {
        return new ServiceChargeType();
    }

    /**
     * Create an instance of {@link ExaminationResultType }
     * 
     */
    public ExaminationResultType createExaminationResultType() {
        return new ExaminationResultType();
    }

    /**
     * Create an instance of {@link LineType }
     * 
     */
    public LineType createLineType() {
        return new LineType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:un:unece:uncefact:codelist:standard:IANA:CharacterSetCode:2006-12-07", name = "CharacterSetCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCharacterSetCode(String value) {
        return new JAXBElement<String>(_CharacterSetCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gr:gov:egif:data:standard:CoreComponents:Address", name = "Address")
    public JAXBElement<AddressType> createAddress(AddressType value) {
        return new JAXBElement<AddressType>(_Address_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentMeansType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gr:gov:egif:data:standard:CoreComponents:PaymentMeans", name = "PaymentMeans")
    public JAXBElement<PaymentMeansType> createPaymentMeans(PaymentMeansType value) {
        return new JAXBElement<PaymentMeansType>(_PaymentMeans_QNAME, PaymentMeansType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommunicationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gr:gov:egif:data:standard:CoreComponents:Communication", name = "Communication")
    public JAXBElement<CommunicationType> createCommunication(CommunicationType value) {
        return new JAXBElement<CommunicationType>(_Communication_QNAME, CommunicationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryTermsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gr:gov:egif:data:standard:CoreComponents:DeliveryTerms", name = "DeliveryTerms")
    public JAXBElement<DeliveryTermsType> createDeliveryTerms(DeliveryTermsType value) {
        return new JAXBElement<DeliveryTermsType>(_DeliveryTerms_QNAME, DeliveryTermsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetarySummationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gr:gov:egif:data:standard:CoreComponents:MonetarySummation", name = "MonetarySummation")
    public JAXBElement<MonetarySummationType> createMonetarySummation(MonetarySummationType value) {
        return new JAXBElement<MonetarySummationType>(_MonetarySummation_QNAME, MonetarySummationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeographicalCoordinateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gr:gov:egif:data:standard:CoreComponents:GeographicalCoordinate", name = "GeographicalCoordinate")
    public JAXBElement<GeographicalCoordinateType> createGeographicalCoordinate(GeographicalCoordinateType value) {
        return new JAXBElement<GeographicalCoordinateType>(_GeographicalCoordinate_QNAME, GeographicalCoordinateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyCodeContentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:un:unece:uncefact:codelist:standard:5:4217:2007-03-08", name = "CurrencyCode")
    public JAXBElement<CurrencyCodeContentType> createCurrencyCode(CurrencyCodeContentType value) {
        return new JAXBElement<CurrencyCodeContentType>(_CurrencyCode_QNAME, CurrencyCodeContentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhysicalObjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gr:gov:egif:data:standard:CoreComponents:PhysicalObject", name = "PhysicalObject")
    public JAXBElement<PhysicalObjectType> createPhysicalObject(PhysicalObjectType value) {
        return new JAXBElement<PhysicalObjectType>(_PhysicalObject_QNAME, PhysicalObjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gr:gov:egif:data:standard:CoreComponents:Status", name = "Status")
    public JAXBElement<StatusType> createStatus(StatusType value) {
        return new JAXBElement<StatusType>(_Status_QNAME, StatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:un:unece:uncefact:codelist:standard:5:639:2006", name = "LanguageCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLanguageCode(String value) {
        return new JAXBElement<String>(_LanguageCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gr:gov:egif:data:standard:CoreComponents:Signature", name = "Signature")
    public JAXBElement<SignatureType> createSignature(SignatureType value) {
        return new JAXBElement<SignatureType>(_Signature_QNAME, SignatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gr:gov:egif:data:standard:CoreComponents:Document", name = "Document")
    public JAXBElement<DocumentType> createDocument(DocumentType value) {
        return new JAXBElement<DocumentType>(_Document_QNAME, DocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gr:gov:egif:data:standard:CoreComponents:Organization", name = "Organization")
    public JAXBElement<OrganizationType> createOrganization(OrganizationType value) {
        return new JAXBElement<OrganizationType>(_Organization_QNAME, OrganizationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gr:gov:egif:data:standard:CoreComponents:Contact", name = "Contact")
    public JAXBElement<ContactType> createContact(ContactType value) {
        return new JAXBElement<ContactType>(_Contact_QNAME, ContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gr:gov:egif:data:standard:CoreComponents:Country", name = "Country")
    public JAXBElement<CountryType> createCountry(CountryType value) {
        return new JAXBElement<CountryType>(_Country_QNAME, CountryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceChargeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gr:gov:egif:data:standard:CoreComponents:ServiceCharge", name = "ServiceCharge")
    public JAXBElement<ServiceChargeType> createServiceCharge(ServiceChargeType value) {
        return new JAXBElement<ServiceChargeType>(_ServiceCharge_QNAME, ServiceChargeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExaminationResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gr:gov:egif:data:standard:CoreComponents:ExaminationResult", name = "ExaminationResult")
    public JAXBElement<ExaminationResultType> createExaminationResult(ExaminationResultType value) {
        return new JAXBElement<ExaminationResultType>(_ExaminationResult_QNAME, ExaminationResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gr:gov:egif:data:standard:CoreComponents:Person", name = "Person")
    public JAXBElement<PersonType> createPerson(PersonType value) {
        return new JAXBElement<PersonType>(_Person_QNAME, PersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:un:unece:uncefact:codelist:standard:6:0133:20061205", name = "CharacterSetEncodingCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCharacterSetEncodingCode(String value) {
        return new JAXBElement<String>(_CharacterSetEncodingCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountrySubdivisionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gr:gov:egif:data:standard:CoreComponents:CountrySubdivision", name = "CountrySubdivision")
    public JAXBElement<CountrySubdivisionType> createCountrySubdivision(CountrySubdivisionType value) {
        return new JAXBElement<CountrySubdivisionType>(_CountrySubdivision_QNAME, CountrySubdivisionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gr:gov:egif:data:standard:CoreComponents:Line", name = "Line")
    public JAXBElement<LineType> createLine(LineType value) {
        return new JAXBElement<LineType>(_Line_QNAME, LineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PictureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gr:gov:egif:data:standard:CoreComponents:Picture", name = "Picture")
    public JAXBElement<PictureType> createPicture(PictureType value) {
        return new JAXBElement<PictureType>(_Picture_QNAME, PictureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gr:gov:egif:data:standard:CoreComponents:Location", name = "Location")
    public JAXBElement<LocationType> createLocation(LocationType value) {
        return new JAXBElement<LocationType>(_Location_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryCodeContentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:un:unece:uncefact:codelist:standard:5:3166:2006-09-26", name = "CountryCode")
    public JAXBElement<CountryCodeContentType> createCountryCode(CountryCodeContentType value) {
        return new JAXBElement<CountryCodeContentType>(_CountryCode_QNAME, CountryCodeContentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gr:gov:egif:data:standard:CoreComponents:Attachment", name = "Attachment")
    public JAXBElement<AttachmentType> createAttachment(AttachmentType value) {
        return new JAXBElement<AttachmentType>(_Attachment_QNAME, AttachmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressLineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gr:gov:egif:data:standard:CoreComponents:AddressLine", name = "AddressLine")
    public JAXBElement<AddressLineType> createAddressLine(AddressLineType value) {
        return new JAXBElement<AddressLineType>(_AddressLine_QNAME, AddressLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialInstitutionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gr:gov:egif:data:standard:CoreComponents:FinancialInstitution", name = "FinancialInstitution")
    public JAXBElement<FinancialInstitutionType> createFinancialInstitution(FinancialInstitutionType value) {
        return new JAXBElement<FinancialInstitutionType>(_FinancialInstitution_QNAME, FinancialInstitutionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gr:gov:egif:data:standard:CoreComponents:Event", name = "Event")
    public JAXBElement<EventType> createEvent(EventType value) {
        return new JAXBElement<EventType>(_Event_QNAME, EventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:un:unece:uncefact:codelist:standard:6:3055:D06B", name = "AgencyIdentificationCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAgencyIdentificationCode(String value) {
        return new JAXBElement<String>(_AgencyIdentificationCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gr:gov:egif:data:standard:CoreComponents:Calculation", name = "Calculation")
    public JAXBElement<CalculationType> createCalculation(CalculationType value) {
        return new JAXBElement<CalculationType>(_Calculation_QNAME, CalculationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:un:unece:uncefact:codelist:standard:IANA:MIMEMediaType:2006-01-10", name = "MIMEMediaType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMIMEMediaType(String value) {
        return new JAXBElement<String>(_MIMEMediaType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gr:gov:egif:data:standard:CoreComponents:Feature", name = "Feature")
    public JAXBElement<FeatureType> createFeature(FeatureType value) {
        return new JAXBElement<FeatureType>(_Feature_QNAME, FeatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:un:unece:uncefact:codelist:standard:6:Recommendation20:4", name = "MeasurementUnitCommonCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMeasurementUnitCommonCode(String value) {
        return new JAXBElement<String>(_MeasurementUnitCommonCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gr:gov:egif:data:standard:CoreComponents:Party", name = "Party")
    public JAXBElement<PartyType> createParty(PartyType value) {
        return new JAXBElement<PartyType>(_Party_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HierarchicalStructureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gr:gov:egif:data:standard:CoreComponents:HierarchicalStructure", name = "HierarchicalStructure")
    public JAXBElement<HierarchicalStructureType> createHierarchicalStructure(HierarchicalStructureType value) {
        return new JAXBElement<HierarchicalStructureType>(_HierarchicalStructure_QNAME, HierarchicalStructureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gr:gov:egif:data:standard:CoreComponents:Payment", name = "Payment")
    public JAXBElement<PaymentType> createPayment(PaymentType value) {
        return new JAXBElement<PaymentType>(_Payment_QNAME, PaymentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialCardType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gr:gov:egif:data:standard:CoreComponents:FinancialCard", name = "FinancialCard")
    public JAXBElement<FinancialCardType> createFinancialCard(FinancialCardType value) {
        return new JAXBElement<FinancialCardType>(_FinancialCard_QNAME, FinancialCardType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentTermsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gr:gov:egif:data:standard:CoreComponents:PaymentTerms", name = "PaymentTerms")
    public JAXBElement<PaymentTermsType> createPaymentTerms(PaymentTermsType value) {
        return new JAXBElement<PaymentTermsType>(_PaymentTerms_QNAME, PaymentTermsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gr:gov:egif:data:standard:CoreComponents:Period", name = "Period")
    public JAXBElement<PeriodType> createPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_Period_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialAccountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gr:gov:egif:data:standard:CoreComponents:FinancialAccount", name = "FinancialAccount")
    public JAXBElement<FinancialAccountType> createFinancialAccount(FinancialAccountType value) {
        return new JAXBElement<FinancialAccountType>(_FinancialAccount_QNAME, FinancialAccountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsageConditionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gr:gov:egif:data:standard:CoreComponents:UsageCondition", name = "UsageCondition")
    public JAXBElement<UsageConditionType> createUsageCondition(UsageConditionType value) {
        return new JAXBElement<UsageConditionType>(_UsageCondition_QNAME, UsageConditionType.class, null, value);
    }

}