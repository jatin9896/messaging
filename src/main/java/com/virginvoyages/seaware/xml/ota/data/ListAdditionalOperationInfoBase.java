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
 * <p>Java class for List_AdditionalOperationInfo_Base.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List_AdditionalOperationInfo_Base">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AfterHoursAvailable"/>
 *     &lt;enumeration value="AfterHoursConditional"/>
 *     &lt;enumeration value="AfterHoursPickups"/>
 *     &lt;enumeration value="AfterHoursReturns"/>
 *     &lt;enumeration value="LimitedAvailability"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_AdditionalOperationInfo_Base")
@XmlEnum
public enum ListAdditionalOperationInfoBase {

    @XmlEnumValue("AfterHoursAvailable")
    AFTER_HOURS_AVAILABLE("AfterHoursAvailable"),
    @XmlEnumValue("AfterHoursConditional")
    AFTER_HOURS_CONDITIONAL("AfterHoursConditional"),
    @XmlEnumValue("AfterHoursPickups")
    AFTER_HOURS_PICKUPS("AfterHoursPickups"),
    @XmlEnumValue("AfterHoursReturns")
    AFTER_HOURS_RETURNS("AfterHoursReturns"),
    @XmlEnumValue("LimitedAvailability")
    LIMITED_AVAILABILITY("LimitedAvailability"),

    /**
     * Use: Select this enumeration to exchange a value that is not in the enumerated list by entering the value information in the Code Extension fields.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListAdditionalOperationInfoBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListAdditionalOperationInfoBase fromValue(String v) {
        for (ListAdditionalOperationInfoBase c: ListAdditionalOperationInfoBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
