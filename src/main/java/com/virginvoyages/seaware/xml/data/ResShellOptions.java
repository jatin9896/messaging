//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.29 at 03:39:13 PM IST 
//


package com.virginvoyages.seaware.xml.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResShellOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResShellOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="IncludeElements" type="{}NodeName" minOccurs="0"/>
 *         &lt;element name="ExcludeElements" type="{}NodeName" minOccurs="0"/>
 *         &lt;element name="IncludeNoDelElements" type="{}NodeName" minOccurs="0"/>
 *         &lt;element name="ExcludeNoDelElements" type="{}NodeName" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResShellOptions", propOrder = {

})
public class ResShellOptions {

    @XmlElement(name = "IncludeElements")
    protected String includeElements;
    @XmlElement(name = "ExcludeElements")
    protected String excludeElements;
    @XmlElement(name = "IncludeNoDelElements")
    protected String includeNoDelElements;
    @XmlElement(name = "ExcludeNoDelElements")
    protected String excludeNoDelElements;

    /**
     * Gets the value of the includeElements property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeElements() {
        return includeElements;
    }

    /**
     * Sets the value of the includeElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeElements(String value) {
        this.includeElements = value;
    }

    /**
     * Gets the value of the excludeElements property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcludeElements() {
        return excludeElements;
    }

    /**
     * Sets the value of the excludeElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcludeElements(String value) {
        this.excludeElements = value;
    }

    /**
     * Gets the value of the includeNoDelElements property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeNoDelElements() {
        return includeNoDelElements;
    }

    /**
     * Sets the value of the includeNoDelElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeNoDelElements(String value) {
        this.includeNoDelElements = value;
    }

    /**
     * Gets the value of the excludeNoDelElements property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcludeNoDelElements() {
        return excludeNoDelElements;
    }

    /**
     * Sets the value of the excludeNoDelElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcludeNoDelElements(String value) {
        this.excludeNoDelElements = value;
    }

}