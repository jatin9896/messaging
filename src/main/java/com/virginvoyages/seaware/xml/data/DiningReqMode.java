//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.10 at 02:38:45 PM IST 
//


package com.virginvoyages.seaware.xml.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiningReqMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DiningReqMode">
 *   &lt;restriction base="{}Code">
 *     &lt;enumeration value="TABLE"/>
 *     &lt;enumeration value="SEAT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DiningReqMode")
@XmlEnum
public enum DiningReqMode {

    TABLE,
    SEAT;

    public String value() {
        return name();
    }

    public static DiningReqMode fromValue(String v) {
        return valueOf(v);
    }

}
