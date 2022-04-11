//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.29 at 03:39:13 PM IST 
//


package com.virginvoyages.seaware.xml.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="15"/>
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="REGULAR"/>
 *     &lt;enumeration value="REGULAR EXT"/>
 *     &lt;enumeration value="CARGO"/>
 *     &lt;enumeration value="CARGO EXT"/>
 *     &lt;enumeration value="CHANGE_RECEIPT"/>
 *     &lt;enumeration value="CANCEL_RECEIPT"/>
 *     &lt;enumeration value="MANADJ_RECEIPT"/>
 *     &lt;enumeration value="PMNT_BY_AGEN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResMode")
@XmlEnum
public enum ResMode {


    /**
     * Regular passenger booking
     * 
     */
    REGULAR("REGULAR"),

    /**
     * Extension to regular passenger booking. This is a child
     * 						reservation to book an additional service (like addons, etc). It must be
     * 						attched to parent REGULAR reservation.
     * 
     */
    @XmlEnumValue("REGULAR EXT")
    REGULAR_EXT("REGULAR EXT"),

    /**
     * Regular cargo booking
     * 
     */
    CARGO("CARGO"),

    /**
     * Extension to regular cargo booking. This is a child
     * 						reservation to book an additional service. It must be attched to parent
     * 						CARGO reservation. Is usually used for driver's family.
     * 
     */
    @XmlEnumValue("CARGO EXT")
    CARGO_EXT("CARGO EXT"),

    /**
     * Another kind of extension to regular reservation. Must be
     * 						attached to parent 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;xhtml:i xmlns:xhtml="http://www.w3.org/1999/xhtml" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;not canceled&lt;/xhtml:i&gt;
     * </pre>
     *  reservation and can
     * 						contain financial information only (invoices, adjustments,
     * 						etc)
     * 
     */
    CHANGE_RECEIPT("CHANGE_RECEIPT"),

    /**
     * Another kind of extension to regular reservation. Must be
     * 						attached to parent 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;xhtml:i xmlns:xhtml="http://www.w3.org/1999/xhtml" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;canceled&lt;/xhtml:i&gt;
     * </pre>
     *  reservation and can contain
     * 						financial information only (invoices, adjustments, etc)
     * 
     */
    CANCEL_RECEIPT("CANCEL_RECEIPT"),

    /**
     * Another kind of extension to regular reservation. Must be
     * 						attached to parent reservation and can contain manual invoice adjustments
     * 						only
     * 
     */
    MANADJ_RECEIPT("MANADJ_RECEIPT"),

    /**
     * Another kind of extension to regular reservation. Must be
     * 						attached to parent reservation and can contain final manual invoice
     * 						adjustments and financial information
     * 
     */
    PMNT_BY_AGEN("PMNT_BY_AGEN");
    private final String value;

    ResMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResMode fromValue(String v) {
        for (ResMode c: ResMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
