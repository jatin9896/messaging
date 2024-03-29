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
 * <p>Java class for SeatAccommodationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SeatAccommodationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSignificant"/>
 *     &lt;enumeration value="Seat"/>
 *     &lt;enumeration value="Sleeperette"/>
 *     &lt;enumeration value="NoSeat"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SeatAccommodationType")
@XmlEnum
public enum SeatAccommodationType {

    @XmlEnumValue("NotSignificant")
    NOT_SIGNIFICANT("NotSignificant"),
    @XmlEnumValue("Seat")
    SEAT("Seat"),
    @XmlEnumValue("Sleeperette")
    SLEEPERETTE("Sleeperette"),
    @XmlEnumValue("NoSeat")
    NO_SEAT("NoSeat");
    private final String value;

    SeatAccommodationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SeatAccommodationType fromValue(String v) {
        for (SeatAccommodationType c: SeatAccommodationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
