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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Used for non-tax fees and charges (e.g. service charges) .
 * 
 * <p>Java class for FeeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Taxes" type="{http://www.opentravel.org/OTA/2003/05}TaxesType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}EffectiveExpireOptionalDateGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FeeTaxGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ChargeUnitGroup"/>
 *       &lt;attribute name="TaxInclusiveInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MandatoryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="TaxableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MinAge" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to999" />
 *       &lt;attribute name="MaxAge" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to999" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeType", propOrder = {
    "taxes",
    "description",
    "tpaExtensions"
})
public class FeeType {

    @XmlElement(name = "Taxes")
    protected TaxesType taxes;
    @XmlElement(name = "Description")
    protected List<ParagraphType> description;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "TaxInclusiveInd")
    protected Boolean taxInclusiveInd;
    @XmlAttribute(name = "MandatoryInd")
    protected Boolean mandatoryInd;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "TaxableIndicator")
    protected Boolean taxableIndicator;
    @XmlAttribute(name = "MinAge")
    protected Integer minAge;
    @XmlAttribute(name = "MaxAge")
    protected Integer maxAge;
    @XmlAttribute(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "ExpireDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;
    @XmlAttribute(name = "ExpireDateExclusiveInd")
    protected Boolean expireDateExclusiveInd;
    @XmlAttribute(name = "Type")
    protected AmountDeterminationType type;
    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "Amount")
    protected BigDecimal amount;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "DecimalPlaces")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger decimalPlaces;
    @XmlAttribute(name = "Percent")
    protected BigDecimal percent;
    @XmlAttribute(name = "ChargeUnit")
    protected String chargeUnit;
    @XmlAttribute(name = "ChargeFrequency")
    protected String chargeFrequency;
    @XmlAttribute(name = "ChargeUnitExempt")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger chargeUnitExempt;
    @XmlAttribute(name = "ChargeFrequencyExempt")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger chargeFrequencyExempt;
    @XmlAttribute(name = "MaxChargeUnitApplies")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxChargeUnitApplies;
    @XmlAttribute(name = "MaxChargeFrequencyApplies")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxChargeFrequencyApplies;

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link TaxesType }
     *     
     */
    public TaxesType getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxesType }
     *     
     */
    public void setTaxes(TaxesType value) {
        this.taxes = value;
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
     * {@link ParagraphType }
     * 
     * 
     */
    public List<ParagraphType> getDescription() {
        if (description == null) {
            description = new ArrayList<ParagraphType>();
        }
        return this.description;
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
     * Gets the value of the taxInclusiveInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxInclusiveInd() {
        return taxInclusiveInd;
    }

    /**
     * Sets the value of the taxInclusiveInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxInclusiveInd(Boolean value) {
        this.taxInclusiveInd = value;
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
     * Gets the value of the rph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * Sets the value of the rph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
    }

    /**
     * Gets the value of the taxableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxableIndicator() {
        return taxableIndicator;
    }

    /**
     * Sets the value of the taxableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxableIndicator(Boolean value) {
        this.taxableIndicator = value;
    }

    /**
     * Gets the value of the minAge property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinAge() {
        return minAge;
    }

    /**
     * Sets the value of the minAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinAge(Integer value) {
        this.minAge = value;
    }

    /**
     * Gets the value of the maxAge property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxAge() {
        return maxAge;
    }

    /**
     * Sets the value of the maxAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxAge(Integer value) {
        this.maxAge = value;
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

    /**
     * Gets the value of the expireDateExclusiveInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpireDateExclusiveInd() {
        return expireDateExclusiveInd;
    }

    /**
     * Sets the value of the expireDateExclusiveInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpireDateExclusiveInd(Boolean value) {
        this.expireDateExclusiveInd = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AmountDeterminationType }
     *     
     */
    public AmountDeterminationType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountDeterminationType }
     *     
     */
    public void setType(AmountDeterminationType value) {
        this.type = value;
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
     * Gets the value of the chargeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeUnit() {
        return chargeUnit;
    }

    /**
     * Sets the value of the chargeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeUnit(String value) {
        this.chargeUnit = value;
    }

    /**
     * Gets the value of the chargeFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeFrequency() {
        return chargeFrequency;
    }

    /**
     * Sets the value of the chargeFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeFrequency(String value) {
        this.chargeFrequency = value;
    }

    /**
     * Gets the value of the chargeUnitExempt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChargeUnitExempt() {
        return chargeUnitExempt;
    }

    /**
     * Sets the value of the chargeUnitExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChargeUnitExempt(BigInteger value) {
        this.chargeUnitExempt = value;
    }

    /**
     * Gets the value of the chargeFrequencyExempt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChargeFrequencyExempt() {
        return chargeFrequencyExempt;
    }

    /**
     * Sets the value of the chargeFrequencyExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChargeFrequencyExempt(BigInteger value) {
        this.chargeFrequencyExempt = value;
    }

    /**
     * Gets the value of the maxChargeUnitApplies property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxChargeUnitApplies() {
        return maxChargeUnitApplies;
    }

    /**
     * Sets the value of the maxChargeUnitApplies property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxChargeUnitApplies(BigInteger value) {
        this.maxChargeUnitApplies = value;
    }

    /**
     * Gets the value of the maxChargeFrequencyApplies property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxChargeFrequencyApplies() {
        return maxChargeFrequencyApplies;
    }

    /**
     * Sets the value of the maxChargeFrequencyApplies property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxChargeFrequencyApplies(BigInteger value) {
        this.maxChargeFrequencyApplies = value;
    }

}
