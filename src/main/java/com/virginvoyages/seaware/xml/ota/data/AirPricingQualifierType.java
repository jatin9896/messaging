//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.08.18 at 04:42:59 PM IST 
//


package com.virginvoyages.seaware.xml.ota.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Additional pricing information, including negotiated fares, restrictions, promotions and tax exemptions.
 * 
 * <p>Java class for AirPricingQualifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirPricingQualifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Restrictions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="AdvancePurchaseInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="FarePenaltyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TaxExemption" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TaxCode" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DesignatorCode">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>AirTaxExemptionEnum">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AirportLocationGroup"/>
 *                                     &lt;attribute name="ExtDesignatorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TaxType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ExemptAllInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="CountryCode" type="{http://www.opentravel.org/OTA/2003/05}ISO3166" />
 *                 &lt;attribute name="ProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="GovernmentBody" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PromotionCode" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="AirlineVendorID" type="{http://www.opentravel.org/OTA/2003/05}UpperCaseAlphaNumericLength2to3" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="AgeQualifyingCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="InputTicketDesigCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirPricingQualifierType", propOrder = {
    "accountCode",
    "restrictions",
    "taxExemption",
    "promotionCode"
})
public class AirPricingQualifierType {

    @XmlElement(name = "AccountCode")
    protected String accountCode;
    @XmlElement(name = "Restrictions")
    protected AirPricingQualifierType.Restrictions restrictions;
    @XmlElement(name = "TaxExemption")
    protected AirPricingQualifierType.TaxExemption taxExemption;
    @XmlElement(name = "PromotionCode")
    protected AirPricingQualifierType.PromotionCode promotionCode;
    @XmlAttribute(name = "AgeQualifyingCode")
    protected String ageQualifyingCode;
    @XmlAttribute(name = "InputTicketDesigCode")
    protected String inputTicketDesigCode;

    /**
     * Gets the value of the accountCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCode() {
        return accountCode;
    }

    /**
     * Sets the value of the accountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCode(String value) {
        this.accountCode = value;
    }

    /**
     * Gets the value of the restrictions property.
     * 
     * @return
     *     possible object is
     *     {@link AirPricingQualifierType.Restrictions }
     *     
     */
    public AirPricingQualifierType.Restrictions getRestrictions() {
        return restrictions;
    }

    /**
     * Sets the value of the restrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPricingQualifierType.Restrictions }
     *     
     */
    public void setRestrictions(AirPricingQualifierType.Restrictions value) {
        this.restrictions = value;
    }

    /**
     * Gets the value of the taxExemption property.
     * 
     * @return
     *     possible object is
     *     {@link AirPricingQualifierType.TaxExemption }
     *     
     */
    public AirPricingQualifierType.TaxExemption getTaxExemption() {
        return taxExemption;
    }

    /**
     * Sets the value of the taxExemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPricingQualifierType.TaxExemption }
     *     
     */
    public void setTaxExemption(AirPricingQualifierType.TaxExemption value) {
        this.taxExemption = value;
    }

    /**
     * Gets the value of the promotionCode property.
     * 
     * @return
     *     possible object is
     *     {@link AirPricingQualifierType.PromotionCode }
     *     
     */
    public AirPricingQualifierType.PromotionCode getPromotionCode() {
        return promotionCode;
    }

    /**
     * Sets the value of the promotionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPricingQualifierType.PromotionCode }
     *     
     */
    public void setPromotionCode(AirPricingQualifierType.PromotionCode value) {
        this.promotionCode = value;
    }

    /**
     * Gets the value of the ageQualifyingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeQualifyingCode() {
        return ageQualifyingCode;
    }

    /**
     * Sets the value of the ageQualifyingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeQualifyingCode(String value) {
        this.ageQualifyingCode = value;
    }

    /**
     * Gets the value of the inputTicketDesigCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputTicketDesigCode() {
        return inputTicketDesigCode;
    }

    /**
     * Sets the value of the inputTicketDesigCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputTicketDesigCode(String value) {
        this.inputTicketDesigCode = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="AirlineVendorID" type="{http://www.opentravel.org/OTA/2003/05}UpperCaseAlphaNumericLength2to3" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class PromotionCode {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "AirlineVendorID")
        protected String airlineVendorID;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the airlineVendorID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAirlineVendorID() {
            return airlineVendorID;
        }

        /**
         * Sets the value of the airlineVendorID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAirlineVendorID(String value) {
            this.airlineVendorID = value;
        }

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
     *       &lt;attribute name="AdvancePurchaseInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="FarePenaltyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Restrictions {

        @XmlAttribute(name = "AdvancePurchaseInd")
        protected Boolean advancePurchaseInd;
        @XmlAttribute(name = "FarePenaltyInd")
        protected Boolean farePenaltyInd;

        /**
         * Gets the value of the advancePurchaseInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAdvancePurchaseInd() {
            return advancePurchaseInd;
        }

        /**
         * Sets the value of the advancePurchaseInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAdvancePurchaseInd(Boolean value) {
            this.advancePurchaseInd = value;
        }

        /**
         * Gets the value of the farePenaltyInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFarePenaltyInd() {
            return farePenaltyInd;
        }

        /**
         * Sets the value of the farePenaltyInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFarePenaltyInd(Boolean value) {
            this.farePenaltyInd = value;
        }

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
     *       &lt;sequence>
     *         &lt;element name="TaxCode" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DesignatorCode">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>AirTaxExemptionEnum">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AirportLocationGroup"/>
     *                           &lt;attribute name="ExtDesignatorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TaxType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="ExemptAllInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="CountryCode" type="{http://www.opentravel.org/OTA/2003/05}ISO3166" />
     *       &lt;attribute name="ProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="GovernmentBody" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "taxCode"
    })
    public static class TaxExemption {

        @XmlElement(name = "TaxCode")
        protected List<AirPricingQualifierType.TaxExemption.TaxCode> taxCode;
        @XmlAttribute(name = "ExemptAllInd")
        protected Boolean exemptAllInd;
        @XmlAttribute(name = "CountryCode")
        protected String countryCode;
        @XmlAttribute(name = "ProvinceCode")
        protected String provinceCode;
        @XmlAttribute(name = "GovernmentBody")
        protected String governmentBody;

        /**
         * Gets the value of the taxCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taxCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaxCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirPricingQualifierType.TaxExemption.TaxCode }
         * 
         * 
         */
        public List<AirPricingQualifierType.TaxExemption.TaxCode> getTaxCode() {
            if (taxCode == null) {
                taxCode = new ArrayList<AirPricingQualifierType.TaxExemption.TaxCode>();
            }
            return this.taxCode;
        }

        /**
         * Gets the value of the exemptAllInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isExemptAllInd() {
            return exemptAllInd;
        }

        /**
         * Sets the value of the exemptAllInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setExemptAllInd(Boolean value) {
            this.exemptAllInd = value;
        }

        /**
         * Gets the value of the countryCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryCode() {
            return countryCode;
        }

        /**
         * Sets the value of the countryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryCode(String value) {
            this.countryCode = value;
        }

        /**
         * Gets the value of the provinceCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProvinceCode() {
            return provinceCode;
        }

        /**
         * Sets the value of the provinceCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProvinceCode(String value) {
            this.provinceCode = value;
        }

        /**
         * Gets the value of the governmentBody property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGovernmentBody() {
            return governmentBody;
        }

        /**
         * Sets the value of the governmentBody property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGovernmentBody(String value) {
            this.governmentBody = value;
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
         *       &lt;sequence>
         *         &lt;element name="DesignatorCode">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>AirTaxExemptionEnum">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AirportLocationGroup"/>
         *                 &lt;attribute name="ExtDesignatorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="TaxType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "designatorCode",
            "taxType"
        })
        public static class TaxCode {

            @XmlElement(name = "DesignatorCode", required = true)
            protected AirPricingQualifierType.TaxExemption.TaxCode.DesignatorCode designatorCode;
            @XmlElement(name = "TaxType")
            protected List<String> taxType;

            /**
             * Gets the value of the designatorCode property.
             * 
             * @return
             *     possible object is
             *     {@link AirPricingQualifierType.TaxExemption.TaxCode.DesignatorCode }
             *     
             */
            public AirPricingQualifierType.TaxExemption.TaxCode.DesignatorCode getDesignatorCode() {
                return designatorCode;
            }

            /**
             * Sets the value of the designatorCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link AirPricingQualifierType.TaxExemption.TaxCode.DesignatorCode }
             *     
             */
            public void setDesignatorCode(AirPricingQualifierType.TaxExemption.TaxCode.DesignatorCode value) {
                this.designatorCode = value;
            }

            /**
             * Gets the value of the taxType property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the taxType property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTaxType().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getTaxType() {
                if (taxType == null) {
                    taxType = new ArrayList<String>();
                }
                return this.taxType;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>AirTaxExemptionEnum">
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AirportLocationGroup"/>
             *       &lt;attribute name="ExtDesignatorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class DesignatorCode {

                @XmlValue
                protected AirTaxExemptionEnum value;
                @XmlAttribute(name = "ExtDesignatorCode")
                protected String extDesignatorCode;
                @XmlAttribute(name = "LocationCode")
                protected String locationCode;
                @XmlAttribute(name = "CodeContext")
                protected String codeContext;
                @XmlAttribute(name = "Terminal")
                protected String terminal;
                @XmlAttribute(name = "Gate")
                protected String gate;

                /**
                 * Types of fees with tax exemption in certain locations.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AirTaxExemptionEnum }
                 *     
                 */
                public AirTaxExemptionEnum getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AirTaxExemptionEnum }
                 *     
                 */
                public void setValue(AirTaxExemptionEnum value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the extDesignatorCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getExtDesignatorCode() {
                    return extDesignatorCode;
                }

                /**
                 * Sets the value of the extDesignatorCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setExtDesignatorCode(String value) {
                    this.extDesignatorCode = value;
                }

                /**
                 * Gets the value of the locationCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLocationCode() {
                    return locationCode;
                }

                /**
                 * Sets the value of the locationCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLocationCode(String value) {
                    this.locationCode = value;
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
                 * Gets the value of the terminal property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTerminal() {
                    return terminal;
                }

                /**
                 * Sets the value of the terminal property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTerminal(String value) {
                    this.terminal = value;
                }

                /**
                 * Gets the value of the gate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGate() {
                    return gate;
                }

                /**
                 * Sets the value of the gate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGate(String value) {
                    this.gate = value;
                }

            }

        }

    }

}
