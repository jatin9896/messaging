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
 * Defines rail journey origin and destination location, and time information for the request. Also includes the ability to specify a connection location for the search.
 * 
 * <p>Java class for RailOriginDestinationInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RailOriginDestinationInformationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TravelDateTimeType">
 *       &lt;sequence>
 *         &lt;element name="OriginLocation">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
 *                 &lt;attribute name="MultiCityStationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="AlternateLocationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DestinationLocation">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
 *                 &lt;attribute name="MultiCityStationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="AlternateLocationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ConnectionLocations" type="{http://www.opentravel.org/OTA/2003/05}RailConnectionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailOriginDestinationInformationType", propOrder = {
    "originLocation",
    "destinationLocation",
    "connectionLocations"
})
public class RailOriginDestinationInformationType
    extends TravelDateTimeType
{

    @XmlElement(name = "OriginLocation", required = true)
    protected RailOriginDestinationInformationType.OriginLocation originLocation;
    @XmlElement(name = "DestinationLocation", required = true)
    protected RailOriginDestinationInformationType.DestinationLocation destinationLocation;
    @XmlElement(name = "ConnectionLocations")
    protected RailConnectionType connectionLocations;

    /**
     * Gets the value of the originLocation property.
     * 
     * @return
     *     possible object is
     *     {@link RailOriginDestinationInformationType.OriginLocation }
     *     
     */
    public RailOriginDestinationInformationType.OriginLocation getOriginLocation() {
        return originLocation;
    }

    /**
     * Sets the value of the originLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailOriginDestinationInformationType.OriginLocation }
     *     
     */
    public void setOriginLocation(RailOriginDestinationInformationType.OriginLocation value) {
        this.originLocation = value;
    }

    /**
     * Gets the value of the destinationLocation property.
     * 
     * @return
     *     possible object is
     *     {@link RailOriginDestinationInformationType.DestinationLocation }
     *     
     */
    public RailOriginDestinationInformationType.DestinationLocation getDestinationLocation() {
        return destinationLocation;
    }

    /**
     * Sets the value of the destinationLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailOriginDestinationInformationType.DestinationLocation }
     *     
     */
    public void setDestinationLocation(RailOriginDestinationInformationType.DestinationLocation value) {
        this.destinationLocation = value;
    }

    /**
     * Gets the value of the connectionLocations property.
     * 
     * @return
     *     possible object is
     *     {@link RailConnectionType }
     *     
     */
    public RailConnectionType getConnectionLocations() {
        return connectionLocations;
    }

    /**
     * Sets the value of the connectionLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailConnectionType }
     *     
     */
    public void setConnectionLocations(RailConnectionType value) {
        this.connectionLocations = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
     *       &lt;attribute name="MultiCityStationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="AlternateLocationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DestinationLocation
        extends LocationType
    {

        @XmlAttribute(name = "MultiCityStationInd")
        protected Boolean multiCityStationInd;
        @XmlAttribute(name = "AlternateLocationInd")
        protected Boolean alternateLocationInd;

        /**
         * Gets the value of the multiCityStationInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMultiCityStationInd() {
            return multiCityStationInd;
        }

        /**
         * Sets the value of the multiCityStationInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMultiCityStationInd(Boolean value) {
            this.multiCityStationInd = value;
        }

        /**
         * Gets the value of the alternateLocationInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAlternateLocationInd() {
            return alternateLocationInd;
        }

        /**
         * Sets the value of the alternateLocationInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAlternateLocationInd(Boolean value) {
            this.alternateLocationInd = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
     *       &lt;attribute name="MultiCityStationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="AlternateLocationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OriginLocation
        extends LocationType
    {

        @XmlAttribute(name = "MultiCityStationInd")
        protected Boolean multiCityStationInd;
        @XmlAttribute(name = "AlternateLocationInd")
        protected Boolean alternateLocationInd;

        /**
         * Gets the value of the multiCityStationInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMultiCityStationInd() {
            return multiCityStationInd;
        }

        /**
         * Sets the value of the multiCityStationInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMultiCityStationInd(Boolean value) {
            this.multiCityStationInd = value;
        }

        /**
         * Gets the value of the alternateLocationInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAlternateLocationInd() {
            return alternateLocationInd;
        }

        /**
         * Sets the value of the alternateLocationInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAlternateLocationInd(Boolean value) {
            this.alternateLocationInd = value;
        }

    }

}
