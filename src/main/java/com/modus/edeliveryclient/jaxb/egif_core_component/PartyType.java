//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.03 at 01:28:43 PM EEST 
//


package com.modus.edeliveryclient.jaxb.egif_core_component;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PartyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{gr:gov:egif:data:standard:UnqualifiedDataType:1}IDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TypeCode" type="{gr:gov:egif:data:standard:UnqualifiedDataType:1}CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Name" type="{gr:gov:egif:data:standard:UnqualifiedDataType:1}NameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Description" type="{gr:gov:egif:data:standard:UnqualifiedDataType:1}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RoleCode" type="{gr:gov:egif:data:standard:UnqualifiedDataType:1}CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RelatedDateTime" type="{gr:gov:egif:data:standard:UnqualifiedDataType:1}DateTimeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecifiedOrganization" type="{gr:gov:egif:data:standard:CoreComponents:Organization}OrganizationType" minOccurs="0"/>
 *         &lt;element name="SpecifiedPerson" type="{gr:gov:egif:data:standard:CoreComponents:Person}PersonType" minOccurs="0"/>
 *         &lt;element name="SpecifiedFinancialInstitution" type="{gr:gov:egif:data:standard:CoreComponents:FinancialInstitution}FinancialInstitutionType" minOccurs="0"/>
 *         &lt;element name="ActionEvent" type="{gr:gov:egif:data:standard:CoreComponents:Event}EventType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DefinedContact" type="{gr:gov:egif:data:standard:CoreComponents:Contact}ContactType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RegistrationAddress" type="{gr:gov:egif:data:standard:CoreComponents:Address}AddressType" minOccurs="0"/>
 *         &lt;element name="PostalAddress" type="{gr:gov:egif:data:standard:CoreComponents:Address}AddressType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IdentifiedStatus" type="{gr:gov:egif:data:standard:CoreComponents:Status}StatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyType", namespace = "gr:gov:egif:data:standard:CoreComponents:Party", propOrder = {
    "id",
    "typeCode",
    "name",
    "description",
    "roleCode",
    "relatedDateTime",
    "specifiedOrganization",
    "specifiedPerson",
    "specifiedFinancialInstitution",
    "actionEvent",
    "definedContact",
    "registrationAddress",
    "postalAddress",
    "identifiedStatus"
})
public class PartyType {

    @XmlElement(name = "ID")
    protected List<IDType> id;
    @XmlElement(name = "TypeCode")
    protected List<CodeType> typeCode;
    @XmlElement(name = "Name")
    protected List<NameType> name;
    @XmlElement(name = "Description")
    protected List<TextType> description;
    @XmlElement(name = "RoleCode")
    protected List<CodeType> roleCode;
    @XmlElement(name = "RelatedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected List<XMLGregorianCalendar> relatedDateTime;
    @XmlElement(name = "SpecifiedOrganization")
    protected OrganizationType specifiedOrganization;
    @XmlElement(name = "SpecifiedPerson")
    protected PersonType specifiedPerson;
    @XmlElement(name = "SpecifiedFinancialInstitution")
    protected FinancialInstitutionType specifiedFinancialInstitution;
    @XmlElement(name = "ActionEvent")
    protected List<EventType> actionEvent;
    @XmlElement(name = "DefinedContact")
    protected List<ContactType> definedContact;
    @XmlElement(name = "RegistrationAddress")
    protected AddressType registrationAddress;
    @XmlElement(name = "PostalAddress")
    protected List<AddressType> postalAddress;
    @XmlElement(name = "IdentifiedStatus")
    protected StatusType identifiedStatus;

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDType }
     * 
     * 
     */
    public List<IDType> getID() {
        if (id == null) {
            id = new ArrayList<IDType>();
        }
        return this.id;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getTypeCode() {
        if (typeCode == null) {
            typeCode = new ArrayList<CodeType>();
        }
        return this.typeCode;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getName() {
        if (name == null) {
            name = new ArrayList<NameType>();
        }
        return this.name;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getDescription() {
        if (description == null) {
            description = new ArrayList<TextType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the roleCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getRoleCode() {
        if (roleCode == null) {
            roleCode = new ArrayList<CodeType>();
        }
        return this.roleCode;
    }

    /**
     * Gets the value of the relatedDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getRelatedDateTime() {
        if (relatedDateTime == null) {
            relatedDateTime = new ArrayList<XMLGregorianCalendar>();
        }
        return this.relatedDateTime;
    }

    /**
     * Gets the value of the specifiedOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationType }
     *     
     */
    public OrganizationType getSpecifiedOrganization() {
        return specifiedOrganization;
    }

    /**
     * Sets the value of the specifiedOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationType }
     *     
     */
    public void setSpecifiedOrganization(OrganizationType value) {
        this.specifiedOrganization = value;
    }

    /**
     * Gets the value of the specifiedPerson property.
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    public PersonType getSpecifiedPerson() {
        return specifiedPerson;
    }

    /**
     * Sets the value of the specifiedPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    public void setSpecifiedPerson(PersonType value) {
        this.specifiedPerson = value;
    }

    /**
     * Gets the value of the specifiedFinancialInstitution property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionType }
     *     
     */
    public FinancialInstitutionType getSpecifiedFinancialInstitution() {
        return specifiedFinancialInstitution;
    }

    /**
     * Sets the value of the specifiedFinancialInstitution property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionType }
     *     
     */
    public void setSpecifiedFinancialInstitution(FinancialInstitutionType value) {
        this.specifiedFinancialInstitution = value;
    }

    /**
     * Gets the value of the actionEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventType }
     * 
     * 
     */
    public List<EventType> getActionEvent() {
        if (actionEvent == null) {
            actionEvent = new ArrayList<EventType>();
        }
        return this.actionEvent;
    }

    /**
     * Gets the value of the definedContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the definedContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefinedContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactType }
     * 
     * 
     */
    public List<ContactType> getDefinedContact() {
        if (definedContact == null) {
            definedContact = new ArrayList<ContactType>();
        }
        return this.definedContact;
    }

    /**
     * Gets the value of the registrationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getRegistrationAddress() {
        return registrationAddress;
    }

    /**
     * Sets the value of the registrationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setRegistrationAddress(AddressType value) {
        this.registrationAddress = value;
    }

    /**
     * Gets the value of the postalAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postalAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostalAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressType }
     * 
     * 
     */
    public List<AddressType> getPostalAddress() {
        if (postalAddress == null) {
            postalAddress = new ArrayList<AddressType>();
        }
        return this.postalAddress;
    }

    /**
     * Gets the value of the identifiedStatus property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getIdentifiedStatus() {
        return identifiedStatus;
    }

    /**
     * Sets the value of the identifiedStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setIdentifiedStatus(StatusType value) {
        this.identifiedStatus = value;
    }

}
