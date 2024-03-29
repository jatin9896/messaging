//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.08.18 at 04:42:59 PM IST 
//


package com.virginvoyages.seaware.xml.ota.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for List_AirTripType_Base.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List_AirTripType_Base">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Circle"/>
 *     &lt;enumeration value="Inbound"/>
 *     &lt;enumeration value="NonDirectional"/>
 *     &lt;enumeration value="OneWay"/>
 *     &lt;enumeration value="OneWayOnly"/>
 *     &lt;enumeration value="OpenJaw"/>
 *     &lt;enumeration value="Outbound"/>
 *     &lt;enumeration value="OutboundSeasonRoundtrip"/>
 *     &lt;enumeration value="Return"/>
 *     &lt;enumeration value="Roundtrip"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_AirTripType_Base")
@XmlEnum
public enum ListAirTripTypeBase {


    /**
     * Identifies a circle trip type.
     * 
     */
    @XmlEnumValue("Circle")
    CIRCLE("Circle"),

    /**
     * The direction for the fare is inbound.
     * 
     */
    @XmlEnumValue("Inbound")
    INBOUND("Inbound"),

    /**
     * There is no direction specified for the fare.
     * 
     */
    @XmlEnumValue("NonDirectional")
    NON_DIRECTIONAL("NonDirectional"),

    /**
     * Identifies a one way trip type.
     * 
     */
    @XmlEnumValue("OneWay")
    ONE_WAY("OneWay"),

    /**
     * Cannot be doubled to create a roundtrip.
     * 
     */
    @XmlEnumValue("OneWayOnly")
    ONE_WAY_ONLY("OneWayOnly"),

    /**
     * Identifies an open jaw trip type.
     * 
     */
    @XmlEnumValue("OpenJaw")
    OPEN_JAW("OpenJaw"),

    /**
     * The direction for the fare is outbound.
     * 
     */
    @XmlEnumValue("Outbound")
    OUTBOUND("Outbound"),

    /**
     * The direction for the fare is outbound seasonal roundtrip.
     * 
     */
    @XmlEnumValue("OutboundSeasonRoundtrip")
    OUTBOUND_SEASON_ROUNDTRIP("OutboundSeasonRoundtrip"),

    /**
     * Identifies a return trip type.
     * 
     */
    @XmlEnumValue("Return")
    RETURN("Return"),

    /**
     * Identifies travel from one point to another point and return to the original point. (The outbound fare shall be used also for the inbound fare component for the purpose of determining if the pricing unit is a round trip).
     * 
     */
    @XmlEnumValue("Roundtrip")
    ROUNDTRIP("Roundtrip"),

    /**
     * Use: Select this enumeration to exchange a value that is not in the enumerated list by entering the value information in the Code Extension fields.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListAirTripTypeBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListAirTripTypeBase fromValue(String v) {
        for (ListAirTripTypeBase c: ListAirTripTypeBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
