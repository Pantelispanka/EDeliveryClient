//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.03 at 01:28:43 PM EEST 
//


package com.modus.edeliveryclient.jaxb.egif_core_component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PaymentTermsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTermsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{gr:gov:egif:data:standard:UnqualifiedDataType:1}IDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Description" type="{gr:gov:egif:data:standard:UnqualifiedDataType:1}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DueDateTime" type="{gr:gov:egif:data:standard:UnqualifiedDataType:1}DateTimeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DurationMeasure" type="{gr:gov:egif:data:standard:UnqualifiedDataType:1}MeasureType" minOccurs="0"/>
 *         &lt;element name="TypeCode" type="{gr:gov:egif:data:standard:UnqualifiedDataType:1}CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SettlementDiscountRate" type="{gr:gov:egif:data:standard:UnqualifiedDataType:1}RateType" minOccurs="0"/>
 *         &lt;element name="SettlementSurchargeRate" type="{gr:gov:egif:data:standard:UnqualifiedDataType:1}RateType" minOccurs="0"/>
 *         &lt;element name="SettlementDiscountAmount" type="{gr:gov:egif:data:standard:UnqualifiedDataType:1}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquivalentAmount" type="{gr:gov:egif:data:standard:UnqualifiedDataType:1}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InstructedAmount" type="{gr:gov:egif:data:standard:UnqualifiedDataType:1}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentTransactionTypeIndicator" type="{gr:gov:egif:data:standard:UnqualifiedDataType:1}IndicatorType" minOccurs="0"/>
 *         &lt;element name="SettlementPeriod" type="{gr:gov:egif:data:standard:CoreComponents:Period}PeriodType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PenaltyPeriod" type="{gr:gov:egif:data:standard:CoreComponents:Period}PeriodType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTermsType", namespace = "gr:gov:egif:data:standard:CoreComponents:PaymentTerms", propOrder = {
    "id",
    "description",
    "dueDateTime",
    "durationMeasure",
    "typeCode",
    "settlementDiscountRate",
    "settlementSurchargeRate",
    "settlementDiscountAmount",
    "equivalentAmount",
    "instructedAmount",
    "paymentTransactionTypeIndicator",
    "settlementPeriod",
    "penaltyPeriod"
})
public class PaymentTermsType {

    @XmlElement(name = "ID")
    protected List<IDType> id;
    @XmlElement(name = "Description")
    protected List<TextType> description;
    @XmlElement(name = "DueDateTime")
    @XmlSchemaType(name = "dateTime")
    protected List<XMLGregorianCalendar> dueDateTime;
    @XmlElement(name = "DurationMeasure")
    protected MeasureType durationMeasure;
    @XmlElement(name = "TypeCode")
    protected List<CodeType> typeCode;
    @XmlElement(name = "SettlementDiscountRate")
    protected BigDecimal settlementDiscountRate;
    @XmlElement(name = "SettlementSurchargeRate")
    protected BigDecimal settlementSurchargeRate;
    @XmlElement(name = "SettlementDiscountAmount")
    protected List<AmountType> settlementDiscountAmount;
    @XmlElement(name = "EquivalentAmount")
    protected List<AmountType> equivalentAmount;
    @XmlElement(name = "InstructedAmount")
    protected List<AmountType> instructedAmount;
    @XmlElement(name = "PaymentTransactionTypeIndicator")
    protected Boolean paymentTransactionTypeIndicator;
    @XmlElement(name = "SettlementPeriod")
    protected List<PeriodType> settlementPeriod;
    @XmlElement(name = "PenaltyPeriod")
    protected List<PeriodType> penaltyPeriod;

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
     * Gets the value of the dueDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dueDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDueDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getDueDateTime() {
        if (dueDateTime == null) {
            dueDateTime = new ArrayList<XMLGregorianCalendar>();
        }
        return this.dueDateTime;
    }

    /**
     * Gets the value of the durationMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getDurationMeasure() {
        return durationMeasure;
    }

    /**
     * Sets the value of the durationMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setDurationMeasure(MeasureType value) {
        this.durationMeasure = value;
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
     * Gets the value of the settlementDiscountRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSettlementDiscountRate() {
        return settlementDiscountRate;
    }

    /**
     * Sets the value of the settlementDiscountRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSettlementDiscountRate(BigDecimal value) {
        this.settlementDiscountRate = value;
    }

    /**
     * Gets the value of the settlementSurchargeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSettlementSurchargeRate() {
        return settlementSurchargeRate;
    }

    /**
     * Sets the value of the settlementSurchargeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSettlementSurchargeRate(BigDecimal value) {
        this.settlementSurchargeRate = value;
    }

    /**
     * Gets the value of the settlementDiscountAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settlementDiscountAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettlementDiscountAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getSettlementDiscountAmount() {
        if (settlementDiscountAmount == null) {
            settlementDiscountAmount = new ArrayList<AmountType>();
        }
        return this.settlementDiscountAmount;
    }

    /**
     * Gets the value of the equivalentAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equivalentAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquivalentAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getEquivalentAmount() {
        if (equivalentAmount == null) {
            equivalentAmount = new ArrayList<AmountType>();
        }
        return this.equivalentAmount;
    }

    /**
     * Gets the value of the instructedAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instructedAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstructedAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getInstructedAmount() {
        if (instructedAmount == null) {
            instructedAmount = new ArrayList<AmountType>();
        }
        return this.instructedAmount;
    }

    /**
     * Gets the value of the paymentTransactionTypeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaymentTransactionTypeIndicator() {
        return paymentTransactionTypeIndicator;
    }

    /**
     * Sets the value of the paymentTransactionTypeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaymentTransactionTypeIndicator(Boolean value) {
        this.paymentTransactionTypeIndicator = value;
    }

    /**
     * Gets the value of the settlementPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settlementPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettlementPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodType }
     * 
     * 
     */
    public List<PeriodType> getSettlementPeriod() {
        if (settlementPeriod == null) {
            settlementPeriod = new ArrayList<PeriodType>();
        }
        return this.settlementPeriod;
    }

    /**
     * Gets the value of the penaltyPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the penaltyPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPenaltyPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodType }
     * 
     * 
     */
    public List<PeriodType> getPenaltyPeriod() {
        if (penaltyPeriod == null) {
            penaltyPeriod = new ArrayList<PeriodType>();
        }
        return this.penaltyPeriod;
    }

}
