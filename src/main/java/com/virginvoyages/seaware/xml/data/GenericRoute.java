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
 * <p>Java class for GenericRoute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericRoute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="From" type="{}TimeAndLocation"/>
 *         &lt;element name="To" type="{}TimeAndLocation"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericRoute", propOrder = {
    "from",
    "to"
})
public class GenericRoute {

    @XmlElement(name = "From", required = true)
    protected TimeAndLocation from;
    @XmlElement(name = "To", required = true)
    protected TimeAndLocation to;

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link TimeAndLocation }
     *     
     */
    public TimeAndLocation getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeAndLocation }
     *     
     */
    public void setFrom(TimeAndLocation value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link TimeAndLocation }
     *     
     */
    public TimeAndLocation getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeAndLocation }
     *     
     */
    public void setTo(TimeAndLocation value) {
        this.to = value;
    }

}
