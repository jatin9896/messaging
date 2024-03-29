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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Summary ancillary offer information without pricing.
 * 
 * <p>Java class for AirOfferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirOfferType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceFamily" type="{http://www.opentravel.org/OTA/2003/05}AncillaryServiceDetailType" minOccurs="0"/>
 *         &lt;element name="Restriction" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="TripMinOfferQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="TripMaxOfferQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="TravelerMinOfferQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="TravelerMaxOfferQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ShortDescription" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextTextType" minOccurs="0"/>
 *         &lt;element name="TermsAndConditions" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="VoluntaryChanges" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VoluntaryChangesType">
 *                           &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="VoluntaryRefunds" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VoluntaryChangesType">
 *                           &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Other" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="RefundableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="ReusableFundsInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BundleInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="BundleID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MandatoryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="AcceptInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirOfferType", propOrder = {
    "serviceFamily",
    "restriction",
    "shortDescription",
    "termsAndConditions",
    "tpaExtensions"
})
@XmlSeeAlso({
    com.virginvoyages.seaware.xml.ota.data.AirOfferChoiceType.Summary.class
})
public class AirOfferType {

    @XmlElement(name = "ServiceFamily")
    protected AncillaryServiceDetailType serviceFamily;
    @XmlElement(name = "Restriction")
    protected List<AirOfferType.Restriction> restriction;
    @XmlElement(name = "ShortDescription")
    protected FormattedTextTextType shortDescription;
    @XmlElement(name = "TermsAndConditions")
    protected List<AirOfferType.TermsAndConditions> termsAndConditions;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "BundleInd")
    protected Boolean bundleInd;
    @XmlAttribute(name = "BundleID")
    protected String bundleID;
    @XmlAttribute(name = "MandatoryInd")
    protected Boolean mandatoryInd;
    @XmlAttribute(name = "AcceptInd")
    protected Boolean acceptInd;

    /**
     * Gets the value of the serviceFamily property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryServiceDetailType }
     *     
     */
    public AncillaryServiceDetailType getServiceFamily() {
        return serviceFamily;
    }

    /**
     * Sets the value of the serviceFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryServiceDetailType }
     *     
     */
    public void setServiceFamily(AncillaryServiceDetailType value) {
        this.serviceFamily = value;
    }

    /**
     * Gets the value of the restriction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restriction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestriction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirOfferType.Restriction }
     * 
     * 
     */
    public List<AirOfferType.Restriction> getRestriction() {
        if (restriction == null) {
            restriction = new ArrayList<AirOfferType.Restriction>();
        }
        return this.restriction;
    }

    /**
     * Gets the value of the shortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link FormattedTextTextType }
     *     
     */
    public FormattedTextTextType getShortDescription() {
        return shortDescription;
    }

    /**
     * Sets the value of the shortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormattedTextTextType }
     *     
     */
    public void setShortDescription(FormattedTextTextType value) {
        this.shortDescription = value;
    }

    /**
     * Gets the value of the termsAndConditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the termsAndConditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTermsAndConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirOfferType.TermsAndConditions }
     * 
     * 
     */
    public List<AirOfferType.TermsAndConditions> getTermsAndConditions() {
        if (termsAndConditions == null) {
            termsAndConditions = new ArrayList<AirOfferType.TermsAndConditions>();
        }
        return this.termsAndConditions;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the bundleInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBundleInd() {
        return bundleInd;
    }

    /**
     * Sets the value of the bundleInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBundleInd(Boolean value) {
        this.bundleInd = value;
    }

    /**
     * Gets the value of the bundleID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundleID() {
        return bundleID;
    }

    /**
     * Sets the value of the bundleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundleID(String value) {
        this.bundleID = value;
    }

    /**
     * Gets the value of the mandatoryInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMandatoryInd() {
        return mandatoryInd;
    }

    /**
     * Sets the value of the mandatoryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMandatoryInd(Boolean value) {
        this.mandatoryInd = value;
    }

    /**
     * Gets the value of the acceptInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcceptInd() {
        return acceptInd;
    }

    /**
     * Sets the value of the acceptInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptInd(Boolean value) {
        this.acceptInd = value;
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
     *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="TripMinOfferQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="TripMaxOfferQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="TravelerMinOfferQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="TravelerMaxOfferQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "description"
    })
    public static class Restriction {

        @XmlElement(name = "Description")
        protected String description;
        @XmlAttribute(name = "TripMinOfferQty")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger tripMinOfferQty;
        @XmlAttribute(name = "TripMaxOfferQty")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger tripMaxOfferQty;
        @XmlAttribute(name = "TravelerMinOfferQty")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger travelerMinOfferQty;
        @XmlAttribute(name = "TravelerMaxOfferQty")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger travelerMaxOfferQty;
        @XmlAttribute(name = "EffectiveDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar effectiveDate;
        @XmlAttribute(name = "ExpireDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expireDate;

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
         * Gets the value of the tripMinOfferQty property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTripMinOfferQty() {
            return tripMinOfferQty;
        }

        /**
         * Sets the value of the tripMinOfferQty property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTripMinOfferQty(BigInteger value) {
            this.tripMinOfferQty = value;
        }

        /**
         * Gets the value of the tripMaxOfferQty property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTripMaxOfferQty() {
            return tripMaxOfferQty;
        }

        /**
         * Sets the value of the tripMaxOfferQty property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTripMaxOfferQty(BigInteger value) {
            this.tripMaxOfferQty = value;
        }

        /**
         * Gets the value of the travelerMinOfferQty property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTravelerMinOfferQty() {
            return travelerMinOfferQty;
        }

        /**
         * Sets the value of the travelerMinOfferQty property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTravelerMinOfferQty(BigInteger value) {
            this.travelerMinOfferQty = value;
        }

        /**
         * Gets the value of the travelerMaxOfferQty property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTravelerMaxOfferQty() {
            return travelerMaxOfferQty;
        }

        /**
         * Sets the value of the travelerMaxOfferQty property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTravelerMaxOfferQty(BigInteger value) {
            this.travelerMaxOfferQty = value;
        }

        /**
         * Gets the value of the effectiveDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEffectiveDate() {
            return effectiveDate;
        }

        /**
         * Sets the value of the effectiveDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEffectiveDate(XMLGregorianCalendar value) {
            this.effectiveDate = value;
        }

        /**
         * Gets the value of the expireDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExpireDate() {
            return expireDate;
        }

        /**
         * Sets the value of the expireDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setExpireDate(XMLGregorianCalendar value) {
            this.expireDate = value;
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
     *         &lt;element name="VoluntaryChanges" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VoluntaryChangesType">
     *                 &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="VoluntaryRefunds" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VoluntaryChangesType">
     *                 &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Other" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="RefundableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="ReusableFundsInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "voluntaryChanges",
        "voluntaryRefunds",
        "other"
    })
    public static class TermsAndConditions {

        @XmlElement(name = "VoluntaryChanges")
        protected AirOfferType.TermsAndConditions.VoluntaryChanges voluntaryChanges;
        @XmlElement(name = "VoluntaryRefunds")
        protected AirOfferType.TermsAndConditions.VoluntaryRefunds voluntaryRefunds;
        @XmlElement(name = "Other")
        protected String other;
        @XmlAttribute(name = "RefundableInd")
        protected Boolean refundableInd;
        @XmlAttribute(name = "ReusableFundsInd")
        protected Boolean reusableFundsInd;

        /**
         * Gets the value of the voluntaryChanges property.
         * 
         * @return
         *     possible object is
         *     {@link AirOfferType.TermsAndConditions.VoluntaryChanges }
         *     
         */
        public AirOfferType.TermsAndConditions.VoluntaryChanges getVoluntaryChanges() {
            return voluntaryChanges;
        }

        /**
         * Sets the value of the voluntaryChanges property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirOfferType.TermsAndConditions.VoluntaryChanges }
         *     
         */
        public void setVoluntaryChanges(AirOfferType.TermsAndConditions.VoluntaryChanges value) {
            this.voluntaryChanges = value;
        }

        /**
         * Gets the value of the voluntaryRefunds property.
         * 
         * @return
         *     possible object is
         *     {@link AirOfferType.TermsAndConditions.VoluntaryRefunds }
         *     
         */
        public AirOfferType.TermsAndConditions.VoluntaryRefunds getVoluntaryRefunds() {
            return voluntaryRefunds;
        }

        /**
         * Sets the value of the voluntaryRefunds property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirOfferType.TermsAndConditions.VoluntaryRefunds }
         *     
         */
        public void setVoluntaryRefunds(AirOfferType.TermsAndConditions.VoluntaryRefunds value) {
            this.voluntaryRefunds = value;
        }

        /**
         * Gets the value of the other property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOther() {
            return other;
        }

        /**
         * Sets the value of the other property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOther(String value) {
            this.other = value;
        }

        /**
         * Gets the value of the refundableInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRefundableInd() {
            return refundableInd;
        }

        /**
         * Sets the value of the refundableInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRefundableInd(Boolean value) {
            this.refundableInd = value;
        }

        /**
         * Gets the value of the reusableFundsInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReusableFundsInd() {
            return reusableFundsInd;
        }

        /**
         * Sets the value of the reusableFundsInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReusableFundsInd(Boolean value) {
            this.reusableFundsInd = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VoluntaryChangesType">
         *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class VoluntaryChanges
            extends VoluntaryChangesType
        {

            @XmlAttribute(name = "Description")
            protected String description;

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

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VoluntaryChangesType">
         *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class VoluntaryRefunds
            extends VoluntaryChangesType
        {

            @XmlAttribute(name = "Description")
            protected String description;

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

        }

    }

}
