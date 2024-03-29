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
 * <p>Java class for List_CabinClass_Base.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List_CabinClass_Base">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="Cockpit"/>
 *     &lt;enumeration value="Economy"/>
 *     &lt;enumeration value="First"/>
 *     &lt;enumeration value="PremiumBusiness"/>
 *     &lt;enumeration value="PremiumEconomy"/>
 *     &lt;enumeration value="Suite"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_CabinClass_Base")
@XmlEnum
public enum ListCabinClassBase {


    /**
     * Business class compartment.
     * 
     */
    @XmlEnumValue("Business")
    BUSINESS("Business"),

    /**
     * Cockpit area.
     * 
     */
    @XmlEnumValue("Cockpit")
    COCKPIT("Cockpit"),

    /**
     * Economy class compartment.
     * 
     */
    @XmlEnumValue("Economy")
    ECONOMY("Economy"),

    /**
     * First class compartment.
     * 
     */
    @XmlEnumValue("First")
    FIRST("First"),

    /**
     * Premium Business class compartment.
     * 
     */
    @XmlEnumValue("PremiumBusiness")
    PREMIUM_BUSINESS("PremiumBusiness"),

    /**
     * Premium Economy class compartment.
     * 
     */
    @XmlEnumValue("PremiumEconomy")
    PREMIUM_ECONOMY("PremiumEconomy"),

    /**
     * Suites or Sleep compartments.
     * 
     */
    @XmlEnumValue("Suite")
    SUITE("Suite"),

    /**
     * Use: Select this enumeration to exchange a value that is not in the enumerated list by entering the value information in the Code Extension fields.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListCabinClassBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListCabinClassBase fromValue(String v) {
        for (ListCabinClassBase c: ListCabinClassBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
