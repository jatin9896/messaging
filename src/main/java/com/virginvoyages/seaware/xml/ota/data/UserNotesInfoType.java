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
 * Specifies the user note info type.
 * 
 * <p>Java class for UserNotesInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserNotesInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserNotes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;sequence>
 *                     &lt;element name="UserNote" maxOccurs="40" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attribute name="ID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *                             &lt;attribute name="Subject" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *                             &lt;attribute name="Notes" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to255" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserNotesInfoType", namespace = "http://www.versonix.com/ota", propOrder = {
    "userNotes"
})
public class UserNotesInfoType {

    @XmlElement(name = "UserNotes")
    protected UserNotesInfoType.UserNotes userNotes;

    /**
     * Gets the value of the userNotes property.
     * 
     * @return
     *     possible object is
     *     {@link UserNotesInfoType.UserNotes }
     *     
     */
    public UserNotesInfoType.UserNotes getUserNotes() {
        return userNotes;
    }

    /**
     * Sets the value of the userNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserNotesInfoType.UserNotes }
     *     
     */
    public void setUserNotes(UserNotesInfoType.UserNotes value) {
        this.userNotes = value;
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
     *         &lt;sequence>
     *           &lt;element name="UserNote" maxOccurs="40" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;attribute name="ID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *                   &lt;attribute name="Subject" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
     *                   &lt;attribute name="Notes" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to255" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/sequence>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "userNote"
    })
    public static class UserNotes {

        @XmlElement(name = "UserNote", namespace = "http://www.versonix.com/ota")
        protected List<UserNotesInfoType.UserNotes.UserNote> userNote;

        /**
         * Gets the value of the userNote property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the userNote property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUserNote().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UserNotesInfoType.UserNotes.UserNote }
         * 
         * 
         */
        public List<UserNotesInfoType.UserNotes.UserNote> getUserNote() {
            if (userNote == null) {
                userNote = new ArrayList<UserNotesInfoType.UserNotes.UserNote>();
            }
            return this.userNote;
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
         *       &lt;attribute name="ID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
         *       &lt;attribute name="Subject" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
         *       &lt;attribute name="Notes" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to255" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class UserNote {

            @XmlAttribute(name = "ID")
            protected String id;
            @XmlAttribute(name = "Subject")
            protected String subject;
            @XmlAttribute(name = "Notes")
            protected String notes;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setID(String value) {
                this.id = value;
            }

            /**
             * Gets the value of the subject property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubject() {
                return subject;
            }

            /**
             * Sets the value of the subject property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubject(String value) {
                this.subject = value;
            }

            /**
             * Gets the value of the notes property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNotes() {
                return notes;
            }

            /**
             * Sets the value of the notes property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNotes(String value) {
                this.notes = value;
            }

        }

    }

}
