//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.29 at 03:39:13 PM IST 
//


package com.virginvoyages.seaware.xml.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PkgClass.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PkgClass">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="15"/>
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="VOYAGE"/>
 *     &lt;enumeration value="LAND"/>
 *     &lt;enumeration value="SHOREX"/>
 *     &lt;enumeration value="HOTEL"/>
 *     &lt;enumeration value="AIR"/>
 *     &lt;enumeration value="ADDON"/>
 *     &lt;enumeration value="DINING"/>
 *     &lt;enumeration value="CARDECK"/>
 *     &lt;enumeration value="SHIPROOM"/>
 *     &lt;enumeration value="TRANSFER"/>
 *     &lt;enumeration value="TRANSFER_REQ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PkgClass")
@XmlEnum
public enum PkgClass {

    VOYAGE,
    LAND,
    SHOREX,
    HOTEL,
    AIR,
    ADDON,
    DINING,
    CARDECK,
    SHIPROOM,
    TRANSFER,
    TRANSFER_REQ;

    public String value() {
        return name();
    }

    public static PkgClass fromValue(String v) {
        return valueOf(v);
    }

}
