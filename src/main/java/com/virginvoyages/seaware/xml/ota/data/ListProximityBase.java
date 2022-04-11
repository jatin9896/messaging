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
 * <p>Java class for List_Proximity_Base.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List_Proximity_Base">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Nearby"/>
 *     &lt;enumeration value="NotSpecified"/>
 *     &lt;enumeration value="Offsite"/>
 *     &lt;enumeration value="Onsite"/>
 *     &lt;enumeration value="OnsiteAndOffsite"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_Proximity_Base")
@XmlEnum
public enum ListProximityBase {

    @XmlEnumValue("Nearby")
    NEARBY("Nearby"),
    @XmlEnumValue("NotSpecified")
    NOT_SPECIFIED("NotSpecified"),
    @XmlEnumValue("Offsite")
    OFFSITE("Offsite"),
    @XmlEnumValue("Onsite")
    ONSITE("Onsite"),
    @XmlEnumValue("OnsiteAndOffsite")
    ONSITE_AND_OFFSITE("OnsiteAndOffsite");
    private final String value;

    ListProximityBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListProximityBase fromValue(String v) {
        for (ListProximityBase c: ListProximityBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
