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
 * <p>Java class for List_ChargeUnit_Base.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List_ChargeUnit_Base">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AdditionsPerStay"/>
 *     &lt;enumeration value="Complimentary"/>
 *     &lt;enumeration value="Event"/>
 *     &lt;enumeration value="Gallon"/>
 *     &lt;enumeration value="Item"/>
 *     &lt;enumeration value="MaximumCharge"/>
 *     &lt;enumeration value="MinimumCharge"/>
 *     &lt;enumeration value="OneTimeUse"/>
 *     &lt;enumeration value="OneWay"/>
 *     &lt;enumeration value="Order"/>
 *     &lt;enumeration value="OverMinuteCharge"/>
 *     &lt;enumeration value="Person"/>
 *     &lt;enumeration value="Rental"/>
 *     &lt;enumeration value="Reservation/Booking"/>
 *     &lt;enumeration value="Room"/>
 *     &lt;enumeration value="Stay"/>
 *     &lt;enumeration value="Tray"/>
 *     &lt;enumeration value="Unit"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_ChargeUnit_Base")
@XmlEnum
public enum ListChargeUnitBase {

    @XmlEnumValue("AdditionsPerStay")
    ADDITIONS_PER_STAY("AdditionsPerStay"),
    @XmlEnumValue("Complimentary")
    COMPLIMENTARY("Complimentary"),
    @XmlEnumValue("Event")
    EVENT("Event"),
    @XmlEnumValue("Gallon")
    GALLON("Gallon"),
    @XmlEnumValue("Item")
    ITEM("Item"),
    @XmlEnumValue("MaximumCharge")
    MAXIMUM_CHARGE("MaximumCharge"),
    @XmlEnumValue("MinimumCharge")
    MINIMUM_CHARGE("MinimumCharge"),
    @XmlEnumValue("OneTimeUse")
    ONE_TIME_USE("OneTimeUse"),
    @XmlEnumValue("OneWay")
    ONE_WAY("OneWay"),
    @XmlEnumValue("Order")
    ORDER("Order"),
    @XmlEnumValue("OverMinuteCharge")
    OVER_MINUTE_CHARGE("OverMinuteCharge"),
    @XmlEnumValue("Person")
    PERSON("Person"),
    @XmlEnumValue("Rental")
    RENTAL("Rental"),
    @XmlEnumValue("Reservation/Booking")
    RESERVATION_BOOKING("Reservation/Booking"),
    @XmlEnumValue("Room")
    ROOM("Room"),
    @XmlEnumValue("Stay")
    STAY("Stay"),
    @XmlEnumValue("Tray")
    TRAY("Tray"),
    @XmlEnumValue("Unit")
    UNIT("Unit"),

    /**
     * Use: Select this enumeration to exchange a value that is not in the enumerated list by entering the value information in the Code Extension fields.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListChargeUnitBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListChargeUnitBase fromValue(String v) {
        for (ListChargeUnitBase c: ListChargeUnitBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
