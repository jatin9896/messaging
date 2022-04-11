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
 * Sail event definition to be used in input messages.
 * If SailRefID is not set in the input message the system will use Ship, Port and DateTime values to determine correct value of SailRefID. The SailRange.TimePrecision value (in minutes) is used to allow some discrepancy in provided departure/arrival Date/Times. For example, if departure time is set to 12:30 and TimePrecision is 20, then if departure time in Seaware tables is within the 12:10 � 12:50 range the system will successfully locate that departure.
 * 
 * <p>Java class for SailRefInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SailRefInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="SailRefID" type="{}RecordID"/>
 *           &lt;sequence>
 *             &lt;group ref="{}SailDateTime" minOccurs="0"/>
 *             &lt;element name="Port" type="{}PortCode" minOccurs="0"/>
 *             &lt;element name="Pier" type="{}PierCode" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SailRefInput", propOrder = {
    "sailRefID",
    "date",
    "dateTime",
    "port",
    "pier"
})
public class SailRefInput {

    @XmlElement(name = "SailRefID")
    protected Integer sailRefID;
    @XmlElement(name = "Date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "DateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlElement(name = "Port")
    protected String port;
    @XmlElement(name = "Pier")
    protected String pier;

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