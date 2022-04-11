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
 * <p>Java class for List_FeeTaxType_Base.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List_FeeTaxType_Base">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AdultRollawayFee"/>
 *     &lt;enumeration value="ApplicationFee"/>
 *     &lt;enumeration value="Assessment/LicenseTax"/>
 *     &lt;enumeration value="BanquetServiceFee"/>
 *     &lt;enumeration value="BedTax"/>
 *     &lt;enumeration value="ChildRollawayCharge"/>
 *     &lt;enumeration value="CityHotelFee"/>
 *     &lt;enumeration value="CityTax"/>
 *     &lt;enumeration value="ConventionTax"/>
 *     &lt;enumeration value="CountryTax"/>
 *     &lt;enumeration value="CountyTax"/>
 *     &lt;enumeration value="CribFee"/>
 *     &lt;enumeration value="EarlyCheckoutFee"/>
 *     &lt;enumeration value="EnergyTax"/>
 *     &lt;enumeration value="Exempt"/>
 *     &lt;enumeration value="ExpressHandlingFee"/>
 *     &lt;enumeration value="ExtraChildCharge"/>
 *     &lt;enumeration value="ExtraPersonCharge"/>
 *     &lt;enumeration value="FederalTax"/>
 *     &lt;enumeration value="FoodAndBeverageTax"/>
 *     &lt;enumeration value="FoodAndBeverageGratuity"/>
 *     &lt;enumeration value="GoodsAndServicesTax(GST)"/>
 *     &lt;enumeration value="InsurancePremiumTax"/>
 *     &lt;enumeration value="LocalFee"/>
 *     &lt;enumeration value="LodgingTax"/>
 *     &lt;enumeration value="MaintenanceFee"/>
 *     &lt;enumeration value="Miscellaneous"/>
 *     &lt;enumeration value="NationalGovernmentTax"/>
 *     &lt;enumeration value="NotKnown"/>
 *     &lt;enumeration value="OccupancyTax"/>
 *     &lt;enumeration value="PackageFee"/>
 *     &lt;enumeration value="PetSanitationFee"/>
 *     &lt;enumeration value="ResortFee"/>
 *     &lt;enumeration value="RollawayFee"/>
 *     &lt;enumeration value="RoomServiceFee"/>
 *     &lt;enumeration value="RoomTax"/>
 *     &lt;enumeration value="SalesTax"/>
 *     &lt;enumeration value="ServiceCharge"/>
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="StateTax"/>
 *     &lt;enumeration value="Surcharge"/>
 *     &lt;enumeration value="SurplusLinesTax"/>
 *     &lt;enumeration value="TotalTax"/>
 *     &lt;enumeration value="TourismTax"/>
 *     &lt;enumeration value="ValueAddedTax(VAT)"/>
 *     &lt;enumeration value="VAT/GSTTax"/>
 *     &lt;enumeration value="Zero-Rated"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_FeeTaxType_Base")
@XmlEnum
public enum ListFeeTaxTypeBase {

    @XmlEnumValue("AdultRollawayFee")
    ADULT_ROLLAWAY_FEE("AdultRollawayFee"),
    @XmlEnumValue("ApplicationFee")
    APPLICATION_FEE("ApplicationFee"),
    @XmlEnumValue("Assessment/LicenseTax")
    ASSESSMENT_LICENSE_TAX("Assessment/LicenseTax"),
    @XmlEnumValue("BanquetServiceFee")
    BANQUET_SERVICE_FEE("BanquetServiceFee"),
    @XmlEnumValue("BedTax")
    BED_TAX("BedTax"),
    @XmlEnumValue("ChildRollawayCharge")
    CHILD_ROLLAWAY_CHARGE("ChildRollawayCharge"),
    @XmlEnumValue("CityHotelFee")
    CITY_HOTEL_FEE("CityHotelFee"),
    @XmlEnumValue("CityTax")
    CITY_TAX("CityTax"),
    @XmlEnumValue("ConventionTax")
    CONVENTION_TAX("ConventionTax"),
    @XmlEnumValue("CountryTax")
    COUNTRY_TAX("CountryTax"),
    @XmlEnumValue("CountyTax")
    COUNTY_TAX("CountyTax"),
    @XmlEnumValue("CribFee")
    CRIB_FEE("CribFee"),
    @XmlEnumValue("EarlyCheckoutFee")
    EARLY_CHECKOUT_FEE("EarlyCheckoutFee"),
    @XmlEnumValue("EnergyTax")
    ENERGY_TAX("EnergyTax"),
    @XmlEnumValue("Exempt")
    EXEMPT("Exempt"),
    @XmlEnumValue("ExpressHandlingFee")
    EXPRESS_HANDLING_FEE("ExpressHandlingFee"),
    @XmlEnumValue("ExtraChildCharge")
    EXTRA_CHILD_CHARGE("ExtraChildCharge"),
    @XmlEnumValue("ExtraPersonCharge")
    EXTRA_PERSON_CHARGE("ExtraPersonCharge"),
    @XmlEnumValue("FederalTax")
    FEDERAL_TAX("FederalTax"),
    @XmlEnumValue("FoodAndBeverageTax")
    FOOD_AND_BEVERAGE_TAX("FoodAndBeverageTax"),
    @XmlEnumValue("FoodAndBeverageGratuity")
    FOOD_AND_BEVERAGE_GRATUITY("FoodAndBeverageGratuity"),
    @XmlEnumValue("GoodsAndServicesTax(GST)")
    GOODS_AND_SERVICES_TAX_GST("GoodsAndServicesTax(GST)"),
    @XmlEnumValue("InsurancePremiumTax")
    INSURANCE_PREMIUM_TAX("InsurancePremiumTax"),
    @XmlEnumValue("LocalFee")
    LOCAL_FEE("LocalFee"),
    @XmlEnumValue("LodgingTax")
    LODGING_TAX("LodgingTax"),
    @XmlEnumValue("MaintenanceFee")
    MAINTENANCE_FEE("MaintenanceFee"),
    @XmlEnumValue("Miscellaneous")
    MISCELLANEOUS("Miscellaneous"),
    @XmlEnumValue("NationalGovernmentTax")
    NATIONAL_GOVERNMENT_TAX("NationalGovernmentTax"),
    @XmlEnumValue("NotKnown")
    NOT_KNOWN("NotKnown"),
    @XmlEnumValue("OccupancyTax")
    OCCUPANCY_TAX("OccupancyTax"),
    @XmlEnumValue("PackageFee")
    PACKAGE_FEE("PackageFee"),
    @XmlEnumValue("PetSanitationFee")
    PET_SANITATION_FEE("PetSanitationFee"),
    @XmlEnumValue("ResortFee")
    RESORT_FEE("ResortFee"),
    @XmlEnumValue("RollawayFee")
    ROLLAWAY_FEE("RollawayFee"),
    @XmlEnumValue("RoomServiceFee")
    ROOM_SERVICE_FEE("RoomServiceFee"),
    @XmlEnumValue("RoomTax")
    ROOM_TAX("RoomTax"),
    @XmlEnumValue("SalesTax")
    SALES_TAX("SalesTax"),
    @XmlEnumValue("ServiceCharge")
    SERVICE_CHARGE("ServiceCharge"),
    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("StateTax")
    STATE_TAX("StateTax"),
    @XmlEnumValue("Surcharge")
    SURCHARGE("Surcharge"),
    @XmlEnumValue("SurplusLinesTax")
    SURPLUS_LINES_TAX("SurplusLinesTax"),
    @XmlEnumValue("TotalTax")
    TOTAL_TAX("TotalTax"),
    @XmlEnumValue("TourismTax")
    TOURISM_TAX("TourismTax"),
    @XmlEnumValue("ValueAddedTax(VAT)")
    VALUE_ADDED_TAX_VAT("ValueAddedTax(VAT)"),
    @XmlEnumValue("VAT/GSTTax")
    VAT_GST_TAX("VAT/GSTTax"),
    @XmlEnumValue("Zero-Rated")
    ZERO_RATED("Zero-Rated"),

    /**
     * Use: Select this enumeration to exchange a value that is not in the enumerated list by entering the value information in the Code Extension fields.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListFeeTaxTypeBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListFeeTaxTypeBase fromValue(String v) {
        for (ListFeeTaxTypeBase c: ListFeeTaxTypeBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
