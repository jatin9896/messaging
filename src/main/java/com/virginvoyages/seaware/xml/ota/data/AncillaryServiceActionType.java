//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.08.18 at 04:42:59 PM IST 
//


package com.virginvoyages.seaware.xml.ota.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Airline or ATPCO encoded service family with product group(s), sub-group(s) with required, include or exclude indicators.
 * 
 * <p>Java class for AncillaryServiceActionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AncillaryServiceActionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductGroup" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SubGroup" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="CodeSource">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="AirlineInternal"/>
 *                                 &lt;enumeration value="ATPCO"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="AdditionalCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                           &lt;attribute name="ResultsAction" type="{http://www.opentravel.org/OTA/2003/05}IncludeExcludeType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="CodeSource">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="AirlineInternal"/>
 *                       &lt;enumeration value="ATPCO"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                 &lt;attribute name="BrandedFareName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ResultsAction" type="{http://www.opentravel.org/OTA/2003/05}IncludeExcludeType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="CodeSource">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="AirlineInternal"/>
 *             &lt;enumeration value="ATPCO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ServiceCode" type="{http://www.opentravel.org/OTA/2003/05}AncillaryServiceFamilyEnum" />
 *       &lt;attribute name="ExtServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="ResultsAction" type="{http://www.opentravel.org/OTA/2003/05}IncludeExcludeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AncillaryServiceActionType", propOrder = {
    "productGroup"
})
public class AncillaryServiceActionType {

    @XmlElement(name = "ProductGroup")
    protected List<AncillaryServiceActionType.ProductGroup> productGroup;
    @XmlAttribute(name = "CodeSource")
    protected String codeSource;
    @XmlAttribute(name = "ServiceCode")
    protected AncillaryServiceFamilyEnum serviceCode;
    @XmlAttribute(name = "ExtServiceCode")
    protected String extServiceCode;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "ResultsAction")
    protected IncludeExcludeType resultsAction;

    /**
     * Gets the value of the productGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AncillaryServiceActionType.ProductGroup }
     * 
     * 
     */
    public List<AncillaryServiceActionType.ProductGroup> getProductGroup() {
        if (productGroup == null) {
            productGroup = new ArrayList<AncillaryServiceActionType.ProductGroup>();
        }
        return this.productGroup;
    }

    /**
     * Gets the value of the codeSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeSource() {
        return codeSource;
    }

    /**
     * Sets the value of the codeSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSource(String value) {
        this.codeSource = value;
    }

    /**
     * Gets the value of the serviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryServiceFamilyEnum }
     *     
     */
    public AncillaryServiceFamilyEnum getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryServiceFamilyEnum }
     *     
     */
    public void setServiceCode(AncillaryServiceFamilyEnum value) {
        this.serviceCode = value;
    }

    /**
     * Gets the value of the extServiceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtServiceCode() {
        return extServiceCode;
    }

    /**
     * Sets the value of the extServiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtServiceCode(String value) {
        this.extServiceCode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the rph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * Sets the value of the rph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
    }

    /**
     * Gets the value of the resultsAction property.
     * 
     * @return
     *     possible object is
     *     {@link IncludeExcludeType }
     *     
     */
    public IncludeExcludeType getResultsAction() {
        return resultsAction;
    }

    /**
     * Sets the value of the resultsAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncludeExcludeType }
     *     
     */
    public void setResultsAction(IncludeExcludeType value) {
        this.resultsAction = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SubGroup" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="CodeSource">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="AirlineInternal"/>
     *                       &lt;enumeration value="ATPCO"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="AdditionalCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *                 &lt;attribute name="ResultsAction" type="{http://www.opentravel.org/OTA/2003/05}IncludeExcludeType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="CodeSource">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="AirlineInternal"/>
     *             &lt;enumeration value="ATPCO"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *       &lt;attribute name="BrandedFareName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ResultsAction" type="{http://www.opentravel.org/OTA/2003/05}IncludeExcludeType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "subGroup"
    })
    public static class ProductGroup {

        @XmlElement(name = "SubGroup")
        protected List<AncillaryServiceActionType.ProductGroup.SubGroup> subGroup;
        @XmlAttribute(name = "CodeSource")
        protected String codeSource;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "Description")
        protected String description;
        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "BrandedFareName")
        protected String brandedFareName;
        @XmlAttribute(name = "ResultsAction")
        protected IncludeExcludeType resultsAction;

        /**
         * Gets the value of the subGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AncillaryServiceActionType.ProductGroup.SubGroup }
         * 
         * 
         */
        public List<AncillaryServiceActionType.ProductGroup.SubGroup> getSubGroup() {
            if (subGroup == null) {
                subGroup = new ArrayList<AncillaryServiceActionType.ProductGroup.SubGroup>();
            }
            return this.subGroup;
        }

        /**
         * Gets the value of the codeSource property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeSource() {
            return codeSource;
        }

        /**
         * Sets the value of the codeSource property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeSource(String value) {
            this.codeSource = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the rph property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRPH() {
            return rph;
        }

        /**
         * Sets the value of the rph property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRPH(String value) {
            this.rph = value;
        }

        /**
         * Gets the value of the brandedFareName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrandedFareName() {
            return brandedFareName;
        }

        /**
         * Sets the value of the brandedFareName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrandedFareName(String value) {
            this.brandedFareName = value;
        }

        /**
         * Gets the value of the resultsAction property.
         * 
         * @return
         *     possible object is
         *     {@link IncludeExcludeType }
         *     
         */
        public IncludeExcludeType getResultsAction() {
            return resultsAction;
        }

        /**
         * Sets the value of the resultsAction property.
         * 
         * @param value
         *     allowed object is
         *     {@link IncludeExcludeType }
         *     
         */
        public void setResultsAction(IncludeExcludeType value) {
            this.resultsAction = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="CodeSource">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="AirlineInternal"/>
         *             &lt;enumeration value="ATPCO"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="AdditionalCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
         *       &lt;attribute name="ResultsAction" type="{http://www.opentravel.org/OTA/2003/05}IncludeExcludeType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SubGroup {

            @XmlAttribute(name = "CodeSource")
            protected String codeSource;
            @XmlAttribute(name = "Code")
            protected String code;
            @XmlAttribute(name = "AdditionalCode")
            protected String additionalCode;
            @XmlAttribute(name = "Description")
            protected String description;
            @XmlAttribute(name = "RPH")
            protected String rph;
            @XmlAttribute(name = "ResultsAction")
            protected IncludeExcludeType resultsAction;

            /**
             * Gets the value of the codeSource property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodeSource() {
                return codeSource;
            }

            /**
             * Sets the value of the codeSource property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodeSource(String value) {
                this.codeSource = value;
            }

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * Gets the value of the additionalCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdditionalCode() {
                return additionalCode;
            }

            /**
             * Sets the value of the additionalCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdditionalCode(String value) {
                this.additionalCode = value;
            }

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

            /**
             * Gets the value of the rph property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRPH() {
                return rph;
            }

            /**
             * Sets the value of the rph property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRPH(String value) {
                this.rph = value;
            }

            /**
             * Gets the value of the resultsAction property.
             * 
             * @return
             *     possible object is
             *     {@link IncludeExcludeType }
             *     
             */
            public IncludeExcludeType getResultsAction() {
                return resultsAction;
            }

            /**
             * Sets the value of the resultsAction property.
             * 
             * @param value
             *     allowed object is
             *     {@link IncludeExcludeType }
             *     
             */
            public void setResultsAction(IncludeExcludeType value) {
                this.resultsAction = value;
            }

        }

    }

}
