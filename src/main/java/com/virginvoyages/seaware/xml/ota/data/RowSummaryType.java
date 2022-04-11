//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.08.18 at 04:42:59 PM IST 
//


package com.virginvoyages.seaware.xml.ota.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes summary row information, including number and characteristics.
 * 
 * <p>Java class for RowSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="MaxNumberOfSeats" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" />
 *       &lt;attribute name="RowNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="AirBookDesigCode" type="{http://www.opentravel.org/OTA/2003/05}UpperCaseAlphaLength1to2" />
 *       &lt;attribute name="RowSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ColumnQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowSummaryType")
public class RowSummaryType {

    @XmlAttribute(name = "MaxNumberOfSeats")
    protected Integer maxNumberOfSeats;
    @XmlAttribute(name = "RowNumber")
    protected BigInteger rowNumber;
    @XmlAttribute(name = "AirBookDesigCode")
    protected String airBookDesigCode;
    @XmlAttribute(name = "RowSequenceNumber")
    protected BigInteger rowSequenceNumber;
    @XmlAttribute(name = "ColumnQty")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger columnQty;

    /**
     * Gets the value of the maxNumberOfSeats property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNumberOfSeats() {
        return maxNumberOfSeats;
    }

    /**
     * Sets the value of the maxNumberOfSeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNumberOfSeats(Integer value) {
        this.maxNumberOfSeats = value;
    }

    /**
     * Gets the value of the rowNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRowNumber() {
        return rowNumber;
    }

    /**
     * Sets the value of the rowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRowNumber(BigInteger value) {
        this.rowNumber = value;
    }

    /**
     * Gets the value of the airBookDesigCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirBookDesigCode() {
        return airBookDesigCode;
    }

    /**
     * Sets the value of the airBookDesigCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirBookDesigCode(String value) {
        this.airBookDesigCode = value;
    }

    /**
     * Gets the value of the rowSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRowSequenceNumber() {
        return rowSequenceNumber;
    }

    /**
     * Sets the value of the rowSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRowSequenceNumber(BigInteger value) {
        this.rowSequenceNumber = value;
    }

    /**
     * Gets the value of the columnQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getColumnQty() {
        return columnQty;
    }

    /**
     * Sets the value of the columnQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setColumnQty(BigInteger value) {
        this.columnQty = value;
    }

}
