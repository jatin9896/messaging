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
 * <p>Java class for List_OfferVehicleClass.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List_OfferVehicleClass">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Compact/Economy"/>
 *     &lt;enumeration value="Exotic"/>
 *     &lt;enumeration value="Fullsize"/>
 *     &lt;enumeration value="FuelEfficient"/>
 *     &lt;enumeration value="Intermediate/Midsize"/>
 *     &lt;enumeration value="LargeSUV"/>
 *     &lt;enumeration value="Luxury/Premium"/>
 *     &lt;enumeration value="Minivan"/>
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="Stretch"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_OfferVehicleClass")
@XmlEnum
public enum ListOfferVehicleClass {

    @XmlEnumValue("Compact/Economy")
    COMPACT_ECONOMY("Compact/Economy"),
    @XmlEnumValue("Exotic")
    EXOTIC("Exotic"),
    @XmlEnumValue("Fullsize")
    FULLSIZE("Fullsize"),
    @XmlEnumValue("FuelEfficient")
    FUEL_EFFICIENT("FuelEfficient"),
    @XmlEnumValue("Intermediate/Midsize")
    INTERMEDIATE_MIDSIZE("Intermediate/Midsize"),
    @XmlEnumValue("LargeSUV")
    LARGE_SUV("LargeSUV"),
    @XmlEnumValue("Luxury/Premium")
    LUXURY_PREMIUM("Luxury/Premium"),
    @XmlEnumValue("Minivan")
    MINIVAN("Minivan"),
    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("Stretch")
    STRETCH("Stretch"),

    /**
     * This is a string list of enumerations with an "Other_" literal to support an open enumeration list. Use the "Other_" value in combination with the @OtherType attribute to exchange a literal that is not in the list and is known to your trading partners.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListOfferVehicleClass(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListOfferVehicleClass fromValue(String v) {
        for (ListOfferVehicleClass c: ListOfferVehicleClass.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
