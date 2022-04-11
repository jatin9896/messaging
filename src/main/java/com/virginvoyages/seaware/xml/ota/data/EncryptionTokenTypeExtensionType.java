//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.08.18 at 04:42:59 PM IST 
//


package com.virginvoyages.seaware.xml.ota.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Extension for the EncryptionTokenType element to be used in PymentCard/CardNumber element (BookRQ, PaymentRQ).
 * 
 * <p>Java class for EncryptionTokenTypeExtensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EncryptionTokenTypeExtensionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CCMerchant" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" minOccurs="0"/>
 *         &lt;element name="CCServerResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptionTokenTypeExtensionType", namespace = "http://www.versonix.com/ota", propOrder = {
    "ccMerchant",
    "ccServerResponse"
})
public class EncryptionTokenTypeExtensionType {

    @XmlElement(name = "CCMerchant")
    protected String ccMerchant;
    @XmlElement(name = "CCServerResponse")
    protected String ccServerResponse;

    /**
     * Gets the value of the ccMerchant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCMerchant() {
        return ccMerchant;
    }

    /**
     * Sets the value of the ccMerchant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCMerchant(String value) {
        this.ccMerchant = value;
    }

    /**
     * Gets the value of the ccServerResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCServerResponse() {
        return ccServerResponse;
    }

    /**
     * Sets the value of the ccServerResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCServerResponse(String value) {
        this.ccServerResponse = value;
    }

}
