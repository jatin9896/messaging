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
 * <p>Java class for Boolean.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Boolean">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="1"/>
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="Y"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Boolean")
@XmlEnum
public enum Boolean {


    /**
     * Boolean false value
     * 
     */
    N,

    /**
     * Boolean true value
     * 
     */
    Y;

    public String value() {
        return name();
    }

    public static Boolean fromValue(String v) {
        return valueOf(v);
    }

}