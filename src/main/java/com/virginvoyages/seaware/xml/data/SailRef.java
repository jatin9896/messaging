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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Sail event definition (usually this is either departure or arrival). Sail event can be identified by either combination of SailDateTime,Port/Pier fields or by SailRefID (DEP_ARR_REF_ID in SAIL_ACTIVITY table).
 * 
 * <p>Java class for SailRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SailRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{}SailDateTime" minOccurs="0"/>
 *         &lt;element name="SailRefID" type="{}RecordID" minOccurs="0"/>
 *         &lt;element name="Port" type="{}PortCode" minOccurs="0"/>
 *         &lt;element name="Pier" type="{}PierCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SailRef", propOrder = {
    "date",
    "dateTime",
    "sailRefID",
    "port",
    "pier"
})
public class SailRef {

    @XmlElement(name = "Date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "DateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlElement(name = "SailRefID")
    protected Integer sailRefID;
    @XmlElement(name = "Port")
    protected String port;
    @XmlElement(name = "Pier")
    protected String pier;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the sailRefID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSailRefID() {
        return sailRefID;
    }

    /**
     * Sets the value of the sailRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSailRefID(Integer value) {
        this.sailRefID = value;
    }

    /**
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPort(String value) {
        this.port = value;
    }

    /**
     * Gets the value of the pier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPier() {
        return pier;
    }

    /**
     * Sets the value of the pier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPier(String value) {
        this.pier = value;
    }

}
