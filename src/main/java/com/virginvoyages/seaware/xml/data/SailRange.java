//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.29 at 03:39:13 PM IST 
//


package com.virginvoyages.seaware.xml.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Sail boundaries
 * 
 * <p>Java class for SailRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SailRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ship" type="{}ShipCode" minOccurs="0"/>
 *         &lt;element name="TimePrecision" type="{}SailTimePrecision" minOccurs="0"/>
 *         &lt;element name="From" type="{}SailRef"/>
 *         &lt;element name="To" type="{}SailRef"/>
 *         &lt;element name="PrevArrival" type="{}SailRef" minOccurs="0"/>
 *         &lt;element name="NextDeparture" type="{}SailRef" minOccurs="0"/>
 *         &lt;element name="Route" type="{}RouteDefinition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SailRange", propOrder = {
    "ship",
    "timePrecision",
    "from",
    "to",
    "prevArrival",
    "nextDeparture",
    "route"
})
public class SailRange {

    @XmlElement(name = "Ship")
    protected String ship;
    @XmlElement(name = "TimePrecision")
    protected BigInteger timePrecision;
    @XmlElement(name = "From", required = true)
    protected SailRef from;
    @XmlElement(name = "To", required = true)
    protected SailRef to;
    @XmlElement(name = "PrevArrival")
    protected SailRef prevArrival;
    @XmlElement(name = "NextDeparture")
    protected SailRef nextDeparture;
    @XmlElement(name = "Route")
    protected RouteDefinition route;

    /**
     * Gets the value of the ship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShip() {
        return ship;
    }

    /**
     * Sets the value of the ship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShip(String value) {
        this.ship = value;
    }

    /**
     * Gets the value of the timePrecision property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimePrecision() {
        return timePrecision;
    }

    /**
     * Sets the value of the timePrecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimePrecision(BigInteger value) {
        this.timePrecision = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link SailRef }
     *     
     */
    public SailRef getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link SailRef }
     *     
     */
    public void setFrom(SailRef value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link SailRef }
     *     
     */
    public SailRef getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link SailRef }
     *     
     */
    public void setTo(SailRef value) {
        this.to = value;
    }

    /**
     * Gets the value of the prevArrival property.
     * 
     * @return
     *     possible object is
     *     {@link SailRef }
     *     
     */
    public SailRef getPrevArrival() {
        return prevArrival;
    }

    /**
     * Sets the value of the prevArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link SailRef }
     *     
     */
    public void setPrevArrival(SailRef value) {
        this.prevArrival = value;
    }

    /**
     * Gets the value of the nextDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link SailRef }
     *     
     */
    public SailRef getNextDeparture() {
        return nextDeparture;
    }

    /**
     * Sets the value of the nextDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link SailRef }
     *     
     */
    public void setNextDeparture(SailRef value) {
        this.nextDeparture = value;
    }

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link RouteDefinition }
     *     
     */
    public RouteDefinition getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteDefinition }
     *     
     */
    public void setRoute(RouteDefinition value) {
        this.route = value;
    }

}