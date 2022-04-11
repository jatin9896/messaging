//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.08.18 at 04:42:59 PM IST 
//


package com.virginvoyages.seaware.xml.ota.data;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines information used to express traveler preferences when requesting rail avilability information.
 * 
 * <p>Java class for RailAvailPrefsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RailAvailPrefsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OperatorPref" type="{http://www.opentravel.org/OTA/2003/05}CompanyNamePrefType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="TransportModes" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PreferLevelGroup"/>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RailCodeGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RailAmenities" type="{http://www.opentravel.org/OTA/2003/05}RailAmenityType" minOccurs="0"/>
 *         &lt;element name="ClassCodes" type="{http://www.opentravel.org/OTA/2003/05}ClassCodeType" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailAvailPrefsType", propOrder = {
    "operatorPref",
    "transportModes",
    "railAmenities",
    "classCodes"
})
public class RailAvailPrefsType {

    @XmlElement(name = "OperatorPref")
    protected List<CompanyNamePrefType> operatorPref;
    @XmlElement(name = "TransportModes")
    protected List<RailAvailPrefsType.TransportModes> transportModes;
    @XmlElement(name = "RailAmenities")
    protected RailAmenityType railAmenities;
    @XmlElement(name = "ClassCodes")
    protected List<ClassCodeType> classCodes;

    /**
     * Gets the value of the operatorPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operatorPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatorPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyNamePrefType }
     * 
     * 
     */
    public List<CompanyNamePrefType> getOperatorPref() {
        if (operatorPref == null) {
            operatorPref = new ArrayList<CompanyNamePrefType>();
        }
        return this.operatorPref;
    }

    /**
     * Gets the value of the transportModes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportModes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportModes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailAvailPrefsType.TransportModes }
     * 
     * 
     */
    public List<RailAvailPrefsType.TransportModes> getTransportModes() {
        if (transportModes == null) {
            transportModes = new ArrayList<RailAvailPrefsType.TransportModes>();
        }
        return this.transportModes;
    }

    /**
     * Gets the value of the railAmenities property.
     * 
     * @return
     *     possible object is
     *     {@link RailAmenityType }
     *     
     */
    public RailAmenityType getRailAmenities() {
        return railAmenities;
    }

    /**
     * Sets the value of the railAmenities property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailAmenityType }
     *     
     */
    public void setRailAmenities(RailAmenityType value) {
        this.railAmenities = value;
    }

    /**
     * Gets the value of the classCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassCodeType }
     * 
     * 
     */
    public List<ClassCodeType> getClassCodes() {
        if (classCodes == null) {
            classCodes = new ArrayList<ClassCodeType>();
        }
        return this.classCodes;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PreferLevelGroup"/>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RailCodeGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TransportModes {

        @XmlAttribute(name = "PreferLevel")
        protected PreferLevelType preferLevel;
        @XmlAttribute(name = "Code", required = true)
        protected String code;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;
        @XmlAttribute(name = "Quantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger quantity;

        /**
         * Gets the value of the preferLevel property.
         * 
         * @return
         *     possible object is
         *     {@link PreferLevelType }
         *     
         */
        public PreferLevelType getPreferLevel() {
            return preferLevel;
        }

        /**
         * Sets the value of the preferLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link PreferLevelType }
         *     
         */
        public void setPreferLevel(PreferLevelType value) {
            this.preferLevel = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the codeContext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeContext() {
            return codeContext;
        }

        /**
         * Sets the value of the codeContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeContext(String value) {
            this.codeContext = value;
        }

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQuantity(BigInteger value) {
            this.quantity = value;
        }

    }

}
