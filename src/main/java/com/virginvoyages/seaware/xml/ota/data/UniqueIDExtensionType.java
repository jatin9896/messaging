//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.08.18 at 04:42:59 PM IST 
//


package com.virginvoyages.seaware.xml.ota.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Extension for the UniqueID_Type element to be used mostly for ReservationID elements in responses. It is providing header information on a booking - agency and agent details, client identifier if that client created the booking.
 * 
 * <p>Java class for UniqueIDExtensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UniqueIDExtensionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgentInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AgentInfoGroup"/>
 *                 &lt;attribute name="AgentSine" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AgencyInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AgentInfoGroup"/>
 *                 &lt;attribute name="PseudoCityCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ContactInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AgentInfoGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DynamicInfo" type="{http://www.versonix.com/ota}DynamicInfoType" minOccurs="0"/>
 *         &lt;element name="UserNotesInfo" type="{http://www.versonix.com/ota}UserNotesInfoType" minOccurs="0"/>
 *         &lt;element name="TWReferralInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="TWReferralCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AltDeliveryInfo" type="{http://www.versonix.com/ota}AltDeliveryInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UniqueIDExtensionType", namespace = "http://www.versonix.com/ota", propOrder = {
    "agentInfo",
    "agencyInfo",
    "contactInfo",
    "dynamicInfo",
    "userNotesInfo",
    "twReferralInfo",
    "altDeliveryInfo"
})
public class UniqueIDExtensionType {

    @XmlElement(name = "AgentInfo")
    protected UniqueIDExtensionType.AgentInfo agentInfo;
    @XmlElement(name = "AgencyInfo")
    protected UniqueIDExtensionType.AgencyInfo agencyInfo;
    @XmlElement(name = "ContactInfo")
    protected UniqueIDExtensionType.ContactInfo contactInfo;
    @XmlElement(name = "DynamicInfo")
    protected DynamicInfoType dynamicInfo;
    @XmlElement(name = "UserNotesInfo")
    protected UserNotesInfoType userNotesInfo;
    @XmlElement(name = "TWReferralInfo")
    protected UniqueIDExtensionType.TWReferralInfo twReferralInfo;
    @XmlElement(name = "AltDeliveryInfo")
    protected AltDeliveryInfoType altDeliveryInfo;

    /**
     * Gets the value of the agentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDExtensionType.AgentInfo }
     *     
     */
    public UniqueIDExtensionType.AgentInfo getAgentInfo() {
        return agentInfo;
    }

    /**
     * Sets the value of the agentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDExtensionType.AgentInfo }
     *     
     */
    public void setAgentInfo(UniqueIDExtensionType.AgentInfo value) {
        this.agentInfo = value;
    }

    /**
     * Gets the value of the agencyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDExtensionType.AgencyInfo }
     *     
     */
    public UniqueIDExtensionType.AgencyInfo getAgencyInfo() {
        return agencyInfo;
    }

    /**
     * Sets the value of the agencyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDExtensionType.AgencyInfo }
     *     
     */
    public void setAgencyInfo(UniqueIDExtensionType.AgencyInfo value) {
        this.agencyInfo = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDExtensionType.ContactInfo }
     *     
     */
    public UniqueIDExtensionType.ContactInfo getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDExtensionType.ContactInfo }
     *     
     */
    public void setContactInfo(UniqueIDExtensionType.ContactInfo value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the dynamicInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicInfoType }
     *     
     */
    public DynamicInfoType getDynamicInfo() {
        return dynamicInfo;
    }

    /**
     * Sets the value of the dynamicInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicInfoType }
     *     
     */
    public void setDynamicInfo(DynamicInfoType value) {
        this.dynamicInfo = value;
    }

    /**
     * Gets the value of the userNotesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UserNotesInfoType }
     *     
     */
    public UserNotesInfoType getUserNotesInfo() {
        return userNotesInfo;
    }

    /**
     * Sets the value of the userNotesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserNotesInfoType }
     *     
     */
    public void setUserNotesInfo(UserNotesInfoType value) {
        this.userNotesInfo = value;
    }

    /**
     * Gets the value of the twReferralInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDExtensionType.TWReferralInfo }
     *     
     */
    public UniqueIDExtensionType.TWReferralInfo getTWReferralInfo() {
        return twReferralInfo;
    }

    /**
     * Sets the value of the twReferralInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDExtensionType.TWReferralInfo }
     *     
     */
    public void setTWReferralInfo(UniqueIDExtensionType.TWReferralInfo value) {
        this.twReferralInfo = value;
    }

    /**
     * Gets the value of the altDeliveryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AltDeliveryInfoType }
     *     
     */
    public AltDeliveryInfoType getAltDeliveryInfo() {
        return altDeliveryInfo;
    }

    /**
     * Sets the value of the altDeliveryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltDeliveryInfoType }
     *     
     */
    public void setAltDeliveryInfo(AltDeliveryInfoType value) {
        this.altDeliveryInfo = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AgentInfoGroup"/>
     *       &lt;attribute name="PseudoCityCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AgencyInfo {

        @XmlAttribute(name = "PseudoCityCode")
        protected String pseudoCityCode;
        @XmlAttribute(name = "Contact")
        protected String contact;
        @XmlAttribute(name = "ContactID")
        protected String contactID;

        /**
         * Gets the value of the pseudoCityCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPseudoCityCode() {
            return pseudoCityCode;
        }

        /**
         * Sets the value of the pseudoCityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPseudoCityCode(String value) {
            this.pseudoCityCode = value;
        }

        /**
         * Gets the value of the contact property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContact() {
            return contact;
        }

        /**
         * Sets the value of the contact property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContact(String value) {
            this.contact = value;
        }

        /**
         * Gets the value of the contactID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContactID() {
            return contactID;
        }

        /**
         * Sets the value of the contactID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContactID(String value) {
            this.contactID = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AgentInfoGroup"/>
     *       &lt;attribute name="AgentSine" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AgentInfo {

        @XmlAttribute(name = "AgentSine")
        protected String agentSine;
        @XmlAttribute(name = "Contact")
        protected String contact;
        @XmlAttribute(name = "ContactID")
        protected String contactID;

        /**
         * Gets the value of the agentSine property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgentSine() {
            return agentSine;
        }

        /**
         * Sets the value of the agentSine property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgentSine(String value) {
            this.agentSine = value;
        }

        /**
         * Gets the value of the contact property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContact() {
            return contact;
        }

        /**
         * Sets the value of the contact property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContact(String value) {
            this.contact = value;
        }

        /**
         * Gets the value of the contactID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContactID() {
            return contactID;
        }

        /**
         * Sets the value of the contactID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContactID(String value) {
            this.contactID = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AgentInfoGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ContactInfo {

        @XmlAttribute(name = "Contact")
        protected String contact;
        @XmlAttribute(name = "ContactID")
        protected String contactID;

        /**
         * Gets the value of the contact property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContact() {
            return contact;
        }

        /**
         * Sets the value of the contact property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContact(String value) {
            this.contact = value;
        }

        /**
         * Gets the value of the contactID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContactID() {
            return contactID;
        }

        /**
         * Sets the value of the contactID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContactID(String value) {
            this.contactID = value;
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
     *       &lt;attribute name="TWReferralCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TWReferralInfo {

        @XmlAttribute(name = "TWReferralCode")
        protected String twReferralCode;

        /**
         * Gets the value of the twReferralCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTWReferralCode() {
            return twReferralCode;
        }

        /**
         * Sets the value of the twReferralCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTWReferralCode(String value) {
            this.twReferralCode = value;
        }

    }

}
