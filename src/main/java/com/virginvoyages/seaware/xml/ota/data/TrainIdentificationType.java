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
 * Defines train identification information, including a train number and a train network code.
 * 
 * <p>Java class for TrainIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrainIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TrainNumber" type="{http://www.opentravel.org/OTA/2003/05}TrainNumberType"/>
 *         &lt;element name="NetworkCode" type="{http://www.opentravel.org/OTA/2003/05}NetworkCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainIdentificationType", propOrder = {
    "trainNumber",
    "networkCode"
})
public class TrainIdentificationType {

    @XmlElement(name = "TrainNumber", required = true)
    protected String trainNumber;
    @XmlElement(name = "NetworkCode")
    protected NetworkCodeType networkCode;

    /**
     * Gets the value of the trainNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainNumber() {
        return trainNumber;
    }

    /**
     * Sets the value of the trainNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainNumber(String value) {
        this.trainNumber = value;
    }

    /**
     * Gets the value of the networkCode property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkCodeType }
     *     
     */
    public NetworkCodeType getNetworkCode() {
        return networkCode;
    }

    /**
     * Sets the value of the networkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkCodeType }
     *     
     */
    public void setNetworkCode(NetworkCodeType value) {
        this.networkCode = value;
    }

}
