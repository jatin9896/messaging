//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.08.18 at 04:42:59 PM IST 
//


package com.virginvoyages.seaware.xml.ota.data;

import java.math.BigDecimal;
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
 * Details about the rail price, including basic fare, adjustments, discounts, ancillary charges, terms and conditions, fees and taxes.
 * 
 * <p>Java class for RailPriceBreakdownType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RailPriceBreakdownType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RailFareType">
 *       &lt;sequence>
 *         &lt;element name="AccommodationAdjustment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CodeAmountType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FareQualifierAdjustment" type="{http://www.opentravel.org/OTA/2003/05}CodeAmountType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="DiscountClass" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DiscountInfoGroup"/>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TravelerCountGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AncillaryCharge" type="{http://www.opentravel.org/OTA/2003/05}CodeAmountType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="Fee" type="{http://www.opentravel.org/OTA/2003/05}CodeAmountType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}CodeAmountType" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailPriceBreakdownType", propOrder = {
    "accommodationAdjustment",
    "fareQualifierAdjustment",
    "discountClass",
    "ancillaryCharge",
    "fee",
    "tax"
})
public class RailPriceBreakdownType
    extends RailFareType
{

    @XmlElement(name = "AccommodationAdjustment")
    protected RailPriceBreakdownType.AccommodationAdjustment accommodationAdjustment;
    @XmlElement(name = "FareQualifierAdjustment")
    protected List<CodeAmountType> fareQualifierAdjustment;
    @XmlElement(name = "DiscountClass")
    protected List<RailPriceBreakdownType.DiscountClass> discountClass;
    @XmlElement(name = "AncillaryCharge")
    protected List<CodeAmountType> ancillaryCharge;
    @XmlElement(name = "Fee")
    protected List<CodeAmountType> fee;
    @XmlElement(name = "Tax")
    protected List<CodeAmountType> tax;

    /**
     * Gets the value of the accommodationAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link RailPriceBreakdownType.AccommodationAdjustment }
     *     
     */
    public RailPriceBreakdownType.AccommodationAdjustment getAccommodationAdjustment() {
        return accommodationAdjustment;
    }

    /**
     * Sets the value of the accommodationAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailPriceBreakdownType.AccommodationAdjustment }
     *     
     */
    public void setAccommodationAdjustment(RailPriceBreakdownType.AccommodationAdjustment value) {
        this.accommodationAdjustment = value;
    }

    /**
     * Gets the value of the fareQualifierAdjustment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareQualifierAdjustment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareQualifierAdjustment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeAmountType }
     * 
     * 
     */
    public List<CodeAmountType> getFareQualifierAdjustment() {
        if (fareQualifierAdjustment == null) {
            fareQualifierAdjustment = new ArrayList<CodeAmountType>();
        }
        return this.fareQualifierAdjustment;
    }

    /**
     * Gets the value of the discountClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailPriceBreakdownType.DiscountClass }
     * 
     * 
     */
    public List<RailPriceBreakdownType.DiscountClass> getDiscountClass() {
        if (discountClass == null) {
            discountClass = new ArrayList<RailPriceBreakdownType.DiscountClass>();
        }
        return this.discountClass;
    }

    /**
     * Gets the value of the ancillaryCharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ancillaryCharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAncillaryCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeAmountType }
     * 
     * 
     */
    public List<CodeAmountType> getAncillaryCharge() {
        if (ancillaryCharge == null) {
            ancillaryCharge = new ArrayList<CodeAmountType>();
        }
        return this.ancillaryCharge;
    }

    /**
     * Gets the value of the fee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeAmountType }
     * 
     * 
     */
    public List<CodeAmountType> getFee() {
        if (fee == null) {
            fee = new ArrayList<CodeAmountType>();
        }
        return this.fee;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeAmountType }
     * 
     * 
     */
    public List<CodeAmountType> getTax() {
        if (tax == null) {
            tax = new ArrayList<CodeAmountType>();
        }
        return this.tax;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CodeAmountType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AccommodationAdjustment
        extends CodeAmountType
    {


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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DiscountInfoGroup"/>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TravelerCountGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DiscountClass {

        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger decimalPlaces;
        @XmlAttribute(name = "Percent")
        protected BigDecimal percent;
        @XmlAttribute(name = "ID")
        protected String id;
        @XmlAttribute(name = "Description")
        protected String description;
        @XmlAttribute(name = "Age")
        protected Integer age;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;
        @XmlAttribute(name = "URI")
        @XmlSchemaType(name = "anyURI")
        protected String uri;
        @XmlAttribute(name = "Quantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger quantity;

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
        }

        /**
         * Gets the value of the currencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrencyCode() {
            return currencyCode;
        }

        /**
         * Sets the value of the currencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrencyCode(String value) {
            this.currencyCode = value;
        }

        /**
         * Gets the value of the decimalPlaces property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDecimalPlaces() {
            return decimalPlaces;
        }

        /**
         * Sets the value of the decimalPlaces property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDecimalPlaces(BigInteger value) {
            this.decimalPlaces = value;
        }

        /**
         * Gets the value of the percent property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPercent() {
            return percent;
        }

        /**
         * Sets the value of the percent property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPercent(BigDecimal value) {
            this.percent = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setID(String value) {
            this.id = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the age property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getAge() {
            return age;
        }

        /**
         * Sets the value of the age property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setAge(Integer value) {
            this.age = value;
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
         * Gets the value of the uri property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getURI() {
            return uri;
        }

        /**
         * Sets the value of the uri property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setURI(String value) {
            this.uri = value;
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
