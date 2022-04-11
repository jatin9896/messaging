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
 * Extension for the RelatedTravelerType element to be used mostly for LinkedBooking element.
 * 
 * <p>Java class for RelatedTravelerTypeExtensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedTravelerTypeExtensionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RelationInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="IsMain" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedTravelerTypeExtensionType", namespace = "http://www.versonix.com/ota", propOrder = {
    "relationInfo"
})
public class RelatedTravelerTypeExtensionType {

    @XmlElement(name = "RelationInfo")
    protected RelatedTravelerTypeExtensionType.RelationInfo relationInfo;

    /**
     * Gets the value of the relationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedTravelerTypeExtensionType.RelationInfo }
     *     
     */
    public RelatedTravelerTypeExtensionType.RelationInfo getRelationInfo() {
        return relationInfo;
    }

    /**
     * Sets the value of the relationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedTravelerTypeExtensionType.RelationInfo }
     *     
     */
    public void setRelationInfo(RelatedTravelerTypeExtensionType.RelationInfo value) {
        this.relationInfo = value;
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
     *       &lt;attribute name="IsMain" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RelationInfo {

        @XmlAttribute(name = "IsMain")
        protected Boolean isMain;
        @XmlAttribute(name = "Enabled")
        protected Boolean enabled;

        /**
         * Gets the value of the isMain property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsMain() {
            return isMain;
        }

        /**
         * Sets the value of the isMain property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsMain(Boolean value) {
            this.isMain = value;
        }

        /**
         * Gets the value of the enabled property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isEnabled() {
            return enabled;
        }

        /**
         * Sets the value of the enabled property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setEnabled(Boolean value) {
            this.enabled = value;
        }

    }

}
