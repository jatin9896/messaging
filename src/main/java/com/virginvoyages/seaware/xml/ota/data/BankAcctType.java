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
 * Customer bank account definition.
 * 
 * <p>Java class for BankAcctType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankAcctType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BankAcctName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" minOccurs="0"/>
 *         &lt;element name="BankAcctNumber" type="{http://www.opentravel.org/OTA/2003/05}EncryptionTokenType" minOccurs="0"/>
 *         &lt;element name="BankID" type="{http://www.opentravel.org/OTA/2003/05}EncryptionTokenType" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.opentravel.org/OTA/2003/05}List_BankAccountType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PrivacyGroup"/>
 *       &lt;attribute name="ChecksAcceptedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CheckNumber" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankAcctType", propOrder = {
    "bankAcctName",
    "bankAcctNumber",
    "bankID",
    "type"
})
public class BankAcctType {

    @XmlElement(name = "BankAcctName")
    protected String bankAcctName;
    @XmlElement(name = "BankAcctNumber")
    protected EncryptionTokenType bankAcctNumber;
    @XmlElement(name = "BankID")
    protected EncryptionTokenType bankID;
    @XmlElement(name = "Type")
    protected ListBankAccountType type;
    @XmlAttribute(name = "ChecksAcceptedInd")
    protected Boolean checksAcceptedInd;
    @XmlAttribute(name = "CheckNumber")
    protected String checkNumber;
    @XmlAttribute(name = "ShareSynchInd")
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected String shareMarketInd;

    /**
     * Gets the value of the bankAcctName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAcctName() {
        return bankAcctName;
    }

    /**
     * Sets the value of the bankAcctName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAcctName(String value) {
        this.bankAcctName = value;
    }

    /**
     * Gets the value of the bankAcctNumber property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptionTokenType }
     *     
     */
    public EncryptionTokenType getBankAcctNumber() {
        return bankAcctNumber;
    }

    /**
     * Sets the value of the bankAcctNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptionTokenType }
     *     
     */
    public void setBankAcctNumber(EncryptionTokenType value) {
        this.bankAcctNumber = value;
    }

    /**
     * Gets the value of the bankID property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptionTokenType }
     *     
     */
    public EncryptionTokenType getBankID() {
        return bankID;
    }

    /**
     * Sets the value of the bankID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptionTokenType }
     *     
     */
    public void setBankID(EncryptionTokenType value) {
        this.bankID = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ListBankAccountType }
     *     
     */
    public ListBankAccountType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListBankAccountType }
     *     
     */
    public void setType(ListBankAccountType value) {
        this.type = value;
    }

    /**
     * Gets the value of the checksAcceptedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChecksAcceptedInd() {
        return checksAcceptedInd;
    }

    /**
     * Sets the value of the checksAcceptedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChecksAcceptedInd(Boolean value) {
        this.checksAcceptedInd = value;
    }

    /**
     * Gets the value of the checkNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckNumber() {
        return checkNumber;
    }

    /**
     * Sets the value of the checkNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckNumber(String value) {
        this.checkNumber = value;
    }

    /**
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareSynchInd(String value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareMarketInd(String value) {
        this.shareMarketInd = value;
    }

}
