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
 * <p>Java class for TransactionActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Book"/>
 *     &lt;enumeration value="Quote"/>
 *     &lt;enumeration value="Hold"/>
 *     &lt;enumeration value="Initiate"/>
 *     &lt;enumeration value="Ignore"/>
 *     &lt;enumeration value="Modify"/>
 *     &lt;enumeration value="Commit"/>
 *     &lt;enumeration value="Cancel"/>
 *     &lt;enumeration value="CommitOverrideEdits"/>
 *     &lt;enumeration value="VerifyPrice"/>
 *     &lt;enumeration value="Ticket"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionActionType")
@XmlEnum
public enum TransactionActionType {


    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:ns="http://www.opentravel.org/OTA/2003/05/common" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Stores changes made previously in temporary storage and unlocks the booking.&lt;/p&gt;
     * </pre>
     * 
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:ns="http://www.opentravel.org/OTA/2003/05/common" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Temporary or locked booking ID (Type=23) must be provided, with Instance attribute (can be used after Initiate, Hold).&lt;/p&gt;
     * </pre>
     * 
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:ns="http://www.opentravel.org/OTA/2003/05/common" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;In special case where absolutely no data is provided in the request except reservation ID (with ID, Type, Instance and ID_Context attributes) this message will not perform any updates to the temporary booking and will just store it.&lt;/p&gt;
     * </pre>
     * 
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:ns="http://www.opentravel.org/OTA/2003/05/common" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Otherwise the booking will be updated to the state passed in this request and then stored.&lt;/p&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("Book")
    BOOK("Book"),
    @XmlEnumValue("Quote")
    QUOTE("Quote"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:ns="http://www.opentravel.org/OTA/2003/05/common" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Used to update a booking in temporary storage and keep it there.&lt;/p&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:ns="http://www.opentravel.org/OTA/2003/05/common" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Temporary/locked booking id must be provided (with ID and Instance attributes) and the booking must be in temporary storage (can be used after Initiate, Hold, OTA_ReadRQ (with lock).&lt;/p&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("Hold")
    HOLD("Hold"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:ns="http://www.opentravel.org/OTA/2003/05/common" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;For new booking: creates a new temporary booking. Request should not have a reservation ID.&lt;/p&gt;
     * </pre>
     * 
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:ns="http://www.opentravel.org/OTA/2003/05/common" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;For existing booking: lock an existing booking in order to edit it and hold new additional inventory, and also so no other users do concurrent changes to it. The ID of an existing booking must be provided in ReservationID element with Type=�23�.&lt;/p&gt;
     * </pre>
     * 
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:ns="http://www.opentravel.org/OTA/2003/05/common" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Note that for an existing booking the OTA_CruiseBookRQ message will lock the booking and update it to the state passed in the request. If the goal is to just lock an existing booking without update then OTA_ReadRQ with UniqueID/Type=�23� should be used instead.&lt;/p&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("Initiate")
    INITIATE("Initiate"),

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:ns="http://www.opentravel.org/OTA/2003/05/common" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Unlock a temporary or locked booking. Release the temporarily held inventory and roll back booking state to the previously stored state (if working with existing booking) or fully destroy the booking (if working with a new booking that was never stored).&lt;/p&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;p xmlns:ns="http://www.opentravel.org/OTA/2003/05/common" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Temporary booking ID (Type=23) must be provided, with ID and Instance attributes.&lt;/p&gt;
     * </pre>
     * 
     * 					
     * 
     */
    @XmlEnumValue("Ignore")
    IGNORE("Ignore"),
    @XmlEnumValue("Modify")
    MODIFY("Modify"),
    @XmlEnumValue("Commit")
    COMMIT("Commit"),
    @XmlEnumValue("Cancel")
    CANCEL("Cancel"),

    /**
     * 
     * Commit the transaction and override the end transaction edits.
     * 
     * 
     */
    @XmlEnumValue("CommitOverrideEdits")
    COMMIT_OVERRIDE_EDITS("CommitOverrideEdits"),

    /**
     * Perform a price verification.
     * 
     */
    @XmlEnumValue("VerifyPrice")
    VERIFY_PRICE("VerifyPrice"),

    /**
     * A ticket for an event, such as a show or theme park.
     * 
     */
    @XmlEnumValue("Ticket")
    TICKET("Ticket");
    private final String value;

    TransactionActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionActionType fromValue(String v) {
        for (TransactionActionType c: TransactionActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}