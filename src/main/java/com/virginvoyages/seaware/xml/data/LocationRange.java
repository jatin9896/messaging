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
 * Locations from/to
 * 
 * <p>Java class for LocationRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="From" type="{}Location" minOccurs="0"/>
 *         &lt;element name="To" type="{}Location" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationRange", propOrder = {
    "from",
    "to"
})
public class LocationRange {

    @XmlElement(name = "From")
    protected Location from;
    @XmlElement(name = "To")
    protected Location to;

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setFrom(Location value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setTo(Location value) {
        this.to = value;
    }

}
