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
 * <p>Java class for List_OfferTypesRequested.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List_OfferTypesRequested">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Activity"/>
 *     &lt;enumeration value="Flight"/>
 *     &lt;enumeration value="Cruise"/>
 *     &lt;enumeration value="DayTour"/>
 *     &lt;enumeration value="GroundTransportation"/>
 *     &lt;enumeration value="Lodging"/>
 *     &lt;enumeration value="Merchandise"/>
 *     &lt;enumeration value="PackageTour"/>
 *     &lt;enumeration value="Rail"/>
 *     &lt;enumeration value="VehicleRental"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_OfferTypesRequested")
@XmlEnum
public enum ListOfferTypesRequested {

    @XmlEnumValue("Activity")
    ACTIVITY("Activity"),
    @XmlEnumValue("Flight")
    FLIGHT("Flight"),
    @XmlEnumValue("Cruise")
    CRUISE("Cruise"),
    @XmlEnumValue("DayTour")
    DAY_TOUR("DayTour"),
    @XmlEnumValue("GroundTransportation")
    GROUND_TRANSPORTATION("GroundTransportation"),
    @XmlEnumValue("Lodging")
    LODGING("Lodging"),
    @XmlEnumValue("Merchandise")
    MERCHANDISE("Merchandise"),
    @XmlEnumValue("PackageTour")
    PACKAGE_TOUR("PackageTour"),
    @XmlEnumValue("Rail")
    RAIL("Rail"),
    @XmlEnumValue("VehicleRental")
    VEHICLE_RENTAL("VehicleRental"),

    /**
     * This is a string list of enumerations with an "Other_" literal to support an open enumeration list. Use the "Other_" value in combination with the @OtherType attribute to exchange a literal that is not in the list and is known to your trading partners.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListOfferTypesRequested(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListOfferTypesRequested fromValue(String v) {
        for (ListOfferTypesRequested c: ListOfferTypesRequested.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
