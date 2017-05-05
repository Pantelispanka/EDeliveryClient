//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.03 at 01:28:43 PM EEST 
//


package com.modus.edeliveryclient.jaxb.egif_core_component;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeographicalCoordinateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeographicalCoordinateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AltitudeMeasure" type="{gr:gov:egif:data:standard:UnqualifiedDataType:1}MeasureType" minOccurs="0"/>
 *         &lt;element name="LatitudeMeasure" type="{gr:gov:egif:data:standard:UnqualifiedDataType:1}MeasureType" minOccurs="0"/>
 *         &lt;element name="LongitudeMeasure" type="{gr:gov:egif:data:standard:UnqualifiedDataType:1}MeasureType" minOccurs="0"/>
 *         &lt;element name="LatitudeDirectionIndicator" type="{gr:gov:egif:data:standard:UnqualifiedDataType:1}IndicatorType" minOccurs="0"/>
 *         &lt;element name="LongitudeDirectionIndicator" type="{gr:gov:egif:data:standard:UnqualifiedDataType:1}IndicatorType" minOccurs="0"/>
 *         &lt;element name="SystemID" type="{gr:gov:egif:data:standard:UnqualifiedDataType:1}IDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeographicalCoordinateType", namespace = "gr:gov:egif:data:standard:CoreComponents:GeographicalCoordinate", propOrder = {
    "altitudeMeasure",
    "latitudeMeasure",
    "longitudeMeasure",
    "latitudeDirectionIndicator",
    "longitudeDirectionIndicator",
    "systemID"
})
public class GeographicalCoordinateType {

    @XmlElement(name = "AltitudeMeasure")
    protected MeasureType altitudeMeasure;
    @XmlElement(name = "LatitudeMeasure")
    protected MeasureType latitudeMeasure;
    @XmlElement(name = "LongitudeMeasure")
    protected MeasureType longitudeMeasure;
    @XmlElement(name = "LatitudeDirectionIndicator")
    protected Boolean latitudeDirectionIndicator;
    @XmlElement(name = "LongitudeDirectionIndicator")
    protected Boolean longitudeDirectionIndicator;
    @XmlElement(name = "SystemID")
    protected IDType systemID;

    /**
     * Gets the value of the altitudeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getAltitudeMeasure() {
        return altitudeMeasure;
    }

    /**
     * Sets the value of the altitudeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setAltitudeMeasure(MeasureType value) {
        this.altitudeMeasure = value;
    }

    /**
     * Gets the value of the latitudeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getLatitudeMeasure() {
        return latitudeMeasure;
    }

    /**
     * Sets the value of the latitudeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setLatitudeMeasure(MeasureType value) {
        this.latitudeMeasure = value;
    }

    /**
     * Gets the value of the longitudeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getLongitudeMeasure() {
        return longitudeMeasure;
    }

    /**
     * Sets the value of the longitudeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setLongitudeMeasure(MeasureType value) {
        this.longitudeMeasure = value;
    }

    /**
     * Gets the value of the latitudeDirectionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLatitudeDirectionIndicator() {
        return latitudeDirectionIndicator;
    }

    /**
     * Sets the value of the latitudeDirectionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLatitudeDirectionIndicator(Boolean value) {
        this.latitudeDirectionIndicator = value;
    }

    /**
     * Gets the value of the longitudeDirectionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLongitudeDirectionIndicator() {
        return longitudeDirectionIndicator;
    }

    /**
     * Sets the value of the longitudeDirectionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLongitudeDirectionIndicator(Boolean value) {
        this.longitudeDirectionIndicator = value;
    }

    /**
     * Gets the value of the systemID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getSystemID() {
        return systemID;
    }

    /**
     * Sets the value of the systemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setSystemID(IDType value) {
        this.systemID = value;
    }

}