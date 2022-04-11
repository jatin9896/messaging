//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.18 at 06:25:21 PM IST 
//


package com.virginvoyages.seaware.xml.data;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.virginvoyages.seaware.xml.data package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Errors_QNAME = new QName("", "Errors");
    private final static QName _ComponentReferenceCarDeckRequest_QNAME = new QName("", "CarDeckRequest");
    private final static QName _ComponentReferenceCargo_QNAME = new QName("", "Cargo");
    private final static QName _ComponentReferenceAddon_QNAME = new QName("", "Addon");
    private final static QName _ComponentReferenceTransferReqCode_QNAME = new QName("", "TransferReqCode");
    private final static QName _ComponentReferenceDiningReqID_QNAME = new QName("", "DiningReqID");
    private final static QName _ComponentReferenceShipRoomReqID_QNAME = new QName("", "ShipRoomReqID");
    private final static QName _ComponentReferencePackageID_QNAME = new QName("", "PackageID");
    private final static QName _ComponentReferenceAir_QNAME = new QName("", "Air");
    private final static QName _ComponentReferencePackageCode_QNAME = new QName("", "PackageCode");
    private final static QName _ComponentReferenceRoomSeqN_QNAME = new QName("", "RoomSeqN");
    private final static QName _ResGuestClientID_QNAME = new QName("", "ClientID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.virginvoyages.seaware.xml.data
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DbSearchIN }
     * 
     */
    public DbSearchIN createDbSearchIN() {
        return new DbSearchIN();
    }

    /**
     * Create an instance of {@link DbSearchBaseOUT }
     * 
     */
    public DbSearchBaseOUT createDbSearchBaseOUT() {
        return new DbSearchBaseOUT();
    }

    /**
     * Create an instance of {@link DbSearchOUT }
     * 
     */
    public DbSearchOUT createDbSearchOUT() {
        return new DbSearchOUT();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link Error.Params }
     * 
     */
    public Error.Params createErrorParams() {
        return new Error.Params();
    }

    /**
     * Create an instance of {@link ComponentReference }
     * 
     */
    public ComponentReference createComponentReference() {
        return new ComponentReference();
    }

    /**
     * Create an instance of {@link ComponentReference.Addon }
     * 
     */
    public ComponentReference.Addon createComponentReferenceAddon() {
        return new ComponentReference.Addon();
    }

    /**
     * Create an instance of {@link SailRangeOptional }
     * 
     */
    public SailRangeOptional createSailRangeOptional() {
        return new SailRangeOptional();
    }

    /**
     * Create an instance of {@link SailActivityExtended }
     * 
     */
    public SailActivityExtended createSailActivityExtended() {
        return new SailActivityExtended();
    }

    /**
     * Create an instance of {@link SailActivityExtended.DepartureStatusHistory }
     * 
     */
    public SailActivityExtended.DepartureStatusHistory createSailActivityExtendedDepartureStatusHistory() {
        return new SailActivityExtended.DepartureStatusHistory();
    }

    /**
     * Create an instance of {@link UserInfo }
     * 
     */
    public UserInfo createUserInfo() {
        return new UserInfo();
    }

    /**
     * Create an instance of {@link PkgDefinition }
     * 
     */
    public PkgDefinition createPkgDefinition() {
        return new PkgDefinition();
    }

    /**
     * Create an instance of {@link PkgDefinition.Classifications }
     * 
     */
    public PkgDefinition.Classifications createPkgDefinitionClassifications() {
        return new PkgDefinition.Classifications();
    }

    /**
     * Create an instance of {@link PkgDefinition.Classifications.Classification }
     * 
     */
    public PkgDefinition.Classifications.Classification createPkgDefinitionClassificationsClassification() {
        return new PkgDefinition.Classifications.Classification();
    }

    /**
     * Create an instance of {@link PkgDefinition.Colors }
     * 
     */
    public PkgDefinition.Colors createPkgDefinitionColors() {
        return new PkgDefinition.Colors();
    }

    /**
     * Create an instance of {@link ResShell }
     * 
     */
    public ResShell createResShell() {
        return new ResShell();
    }

    /**
     * Create an instance of {@link RouteDefinition }
     * 
     */
    public RouteDefinition createRouteDefinition() {
        return new RouteDefinition();
    }

    /**
     * Create an instance of {@link RouteDefinition.Classifications }
     * 
     */
    public RouteDefinition.Classifications createRouteDefinitionClassifications() {
        return new RouteDefinition.Classifications();
    }

    /**
     * Create an instance of {@link PkgComponent }
     * 
     */
    public PkgComponent createPkgComponent() {
        return new PkgComponent();
    }

    /**
     * Create an instance of {@link DbSearchOUT.ShipFacilities }
     * 
     */
    public DbSearchOUT.ShipFacilities createDbSearchOUTShipFacilities() {
        return new DbSearchOUT.ShipFacilities();
    }

    /**
     * Create an instance of {@link DbSearchOUT.ShipFacilities.ShipFacility }
     * 
     */
    public DbSearchOUT.ShipFacilities.ShipFacility createDbSearchOUTShipFacilitiesShipFacility() {
        return new DbSearchOUT.ShipFacilities.ShipFacility();
    }

    /**
     * Create an instance of {@link DbSearchBaseOUT.Counts }
     * 
     */
    public DbSearchBaseOUT.Counts createDbSearchBaseOUTCounts() {
        return new DbSearchBaseOUT.Counts();
    }

    /**
     * Create an instance of {@link DbSearchOptions }
     * 
     */
    public DbSearchOptions createDbSearchOptions() {
        return new DbSearchOptions();
    }

    /**
     * Create an instance of {@link DbSearchOptions.SortItems }
     * 
     */
    public DbSearchOptions.SortItems createDbSearchOptionsSortItems() {
        return new DbSearchOptions.SortItems();
    }

    /**
     * Create an instance of {@link DbSearchOptions.SortItems.SortItem }
     * 
     */
    public DbSearchOptions.SortItems.SortItem createDbSearchOptionsSortItemsSortItem() {
        return new DbSearchOptions.SortItems.SortItem();
    }

    /**
     * Create an instance of {@link MsgHeader }
     * 
     */
    public MsgHeader createMsgHeader() {
        return new MsgHeader();
    }

    /**
     * Create an instance of {@link Errors }
     * 
     */
    public Errors createErrors() {
        return new Errors();
    }

    /**
     * Create an instance of {@link DbSearchBaseIN }
     * 
     */
    public DbSearchBaseIN createDbSearchBaseIN() {
        return new DbSearchBaseIN();
    }

    /**
     * Create an instance of {@link DbSearchIN.AccContexts }
     * 
     */
    public DbSearchIN.AccContexts createDbSearchINAccContexts() {
        return new DbSearchIN.AccContexts();
    }

    /**
     * Create an instance of {@link DbSearchIN.PackageTypeAttributes }
     * 
     */
    public DbSearchIN.PackageTypeAttributes createDbSearchINPackageTypeAttributes() {
        return new DbSearchIN.PackageTypeAttributes();
    }

    /**
     * Create an instance of {@link DbSearchIN.PackageTypes }
     * 
     */
    public DbSearchIN.PackageTypes createDbSearchINPackageTypes() {
        return new DbSearchIN.PackageTypes();
    }

    /**
     * Create an instance of {@link DbSearchIN.ShipFacilities }
     * 
     */
    public DbSearchIN.ShipFacilities createDbSearchINShipFacilities() {
        return new DbSearchIN.ShipFacilities();
    }

    /**
     * Create an instance of {@link CodeValuePair }
     * 
     */
    public CodeValuePair createCodeValuePair() {
        return new CodeValuePair();
    }

    /**
     * Create an instance of {@link SailRange }
     * 
     */
    public SailRange createSailRange() {
        return new SailRange();
    }

    /**
     * Create an instance of {@link StaffMemberInfo }
     * 
     */
    public StaffMemberInfo createStaffMemberInfo() {
        return new StaffMemberInfo();
    }

    /**
     * Create an instance of {@link ResShellOptions }
     * 
     */
    public ResShellOptions createResShellOptions() {
        return new ResShellOptions();
    }

    /**
     * Create an instance of {@link ExternalSystemInfo }
     * 
     */
    public ExternalSystemInfo createExternalSystemInfo() {
        return new ExternalSystemInfo();
    }

    /**
     * Create an instance of {@link ResGuest }
     * 
     */
    public ResGuest createResGuest() {
        return new ResGuest();
    }

    /**
     * Create an instance of {@link InventoryUsage }
     * 
     */
    public InventoryUsage createInventoryUsage() {
        return new InventoryUsage();
    }

    /**
     * Create an instance of {@link TravelAgentInfo }
     * 
     */
    public TravelAgentInfo createTravelAgentInfo() {
        return new TravelAgentInfo();
    }

    /**
     * Create an instance of {@link TimeRange }
     * 
     */
    public TimeRange createTimeRange() {
        return new TimeRange();
    }

    /**
     * Create an instance of {@link NodeOptions }
     * 
     */
    public NodeOptions createNodeOptions() {
        return new NodeOptions();
    }

    /**
     * Create an instance of {@link DateTimeRange }
     * 
     */
    public DateTimeRange createDateTimeRange() {
        return new DateTimeRange();
    }

    /**
     * Create an instance of {@link ResHeader }
     * 
     */
    public ResHeader createResHeader() {
        return new ResHeader();
    }

    /**
     * Create an instance of {@link SailRef }
     * 
     */
    public SailRef createSailRef() {
        return new SailRef();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link DynamicField }
     * 
     */
    public DynamicField createDynamicField() {
        return new DynamicField();
    }

    /**
     * Create an instance of {@link TimeAndLocation }
     * 
     */
    public TimeAndLocation createTimeAndLocation() {
        return new TimeAndLocation();
    }

    /**
     * Create an instance of {@link SailActivity }
     * 
     */
    public SailActivity createSailActivity() {
        return new SailActivity();
    }

    /**
     * Create an instance of {@link OpenDateRange }
     * 
     */
    public OpenDateRange createOpenDateRange() {
        return new OpenDateRange();
    }

    /**
     * Create an instance of {@link SailRangeInput }
     * 
     */
    public SailRangeInput createSailRangeInput() {
        return new SailRangeInput();
    }

    /**
     * Create an instance of {@link SailRefInput }
     * 
     */
    public SailRefInput createSailRefInput() {
        return new SailRefInput();
    }

    /**
     * Create an instance of {@link DynamicFields }
     * 
     */
    public DynamicFields createDynamicFields() {
        return new DynamicFields();
    }

    /**
     * Create an instance of {@link LocationRange }
     * 
     */
    public LocationRange createLocationRange() {
        return new LocationRange();
    }

    /**
     * Create an instance of {@link OpenDateTimeRange }
     * 
     */
    public OpenDateTimeRange createOpenDateTimeRange() {
        return new OpenDateTimeRange();
    }

    /**
     * Create an instance of {@link TimeAndLocation2 }
     * 
     */
    public TimeAndLocation2 createTimeAndLocation2() {
        return new TimeAndLocation2();
    }

    /**
     * Create an instance of {@link GenericRoute }
     * 
     */
    public GenericRoute createGenericRoute() {
        return new GenericRoute();
    }

    /**
     * Create an instance of {@link DateRange }
     * 
     */
    public DateRange createDateRange() {
        return new DateRange();
    }

    /**
     * Create an instance of {@link ExtItem }
     * 
     */
    public ExtItem createExtItem() {
        return new ExtItem();
    }

    /**
     * Create an instance of {@link Error.BookingValidation }
     * 
     */
    public Error.BookingValidation createErrorBookingValidation() {
        return new Error.BookingValidation();
    }

    /**
     * Create an instance of {@link Error.RuleInfo }
     * 
     */
    public Error.RuleInfo createErrorRuleInfo() {
        return new Error.RuleInfo();
    }

    /**
     * Create an instance of {@link Error.Params.Param }
     * 
     */
    public Error.Params.Param createErrorParamsParam() {
        return new Error.Params.Param();
    }

    /**
     * Create an instance of {@link ComponentReference.CarDeckRequest }
     * 
     */
    public ComponentReference.CarDeckRequest createComponentReferenceCarDeckRequest() {
        return new ComponentReference.CarDeckRequest();
    }

    /**
     * Create an instance of {@link ComponentReference.Air }
     * 
     */
    public ComponentReference.Air createComponentReferenceAir() {
        return new ComponentReference.Air();
    }

    /**
     * Create an instance of {@link ComponentReference.Addon.LinkedRequest }
     * 
     */
    public ComponentReference.Addon.LinkedRequest createComponentReferenceAddonLinkedRequest() {
        return new ComponentReference.Addon.LinkedRequest();
    }

    /**
     * Create an instance of {@link SailRangeOptional.From }
     * 
     */
    public SailRangeOptional.From createSailRangeOptionalFrom() {
        return new SailRangeOptional.From();
    }

    /**
     * Create an instance of {@link SailRangeOptional.To }
     * 
     */
    public SailRangeOptional.To createSailRangeOptionalTo() {
        return new SailRangeOptional.To();
    }

    /**
     * Create an instance of {@link SailActivityExtended.Arrival }
     * 
     */
    public SailActivityExtended.Arrival createSailActivityExtendedArrival() {
        return new SailActivityExtended.Arrival();
    }

    /**
     * Create an instance of {@link SailActivityExtended.DepartureStatusHistory.HistItem }
     * 
     */
    public SailActivityExtended.DepartureStatusHistory.HistItem createSailActivityExtendedDepartureStatusHistoryHistItem() {
        return new SailActivityExtended.DepartureStatusHistory.HistItem();
    }

    /**
     * Create an instance of {@link UserInfo.TravelAgent }
     * 
     */
    public UserInfo.TravelAgent createUserInfoTravelAgent() {
        return new UserInfo.TravelAgent();
    }

    /**
     * Create an instance of {@link UserInfo.TravelAgency }
     * 
     */
    public UserInfo.TravelAgency createUserInfoTravelAgency() {
        return new UserInfo.TravelAgency();
    }

    /**
     * Create an instance of {@link UserInfo.Consumer }
     * 
     */
    public UserInfo.Consumer createUserInfoConsumer() {
        return new UserInfo.Consumer();
    }

    /**
     * Create an instance of {@link UserInfo.ResAgent }
     * 
     */
    public UserInfo.ResAgent createUserInfoResAgent() {
        return new UserInfo.ResAgent();
    }

    /**
     * Create an instance of {@link UserInfo.Partner }
     * 
     */
    public UserInfo.Partner createUserInfoPartner() {
        return new UserInfo.Partner();
    }

    /**
     * Create an instance of {@link UserInfo.Internal }
     * 
     */
    public UserInfo.Internal createUserInfoInternal() {
        return new UserInfo.Internal();
    }

    /**
     * Create an instance of {@link PkgDefinition.Destinations }
     * 
     */
    public PkgDefinition.Destinations createPkgDefinitionDestinations() {
        return new PkgDefinition.Destinations();
    }

    /**
     * Create an instance of {@link PkgDefinition.PkgComment }
     * 
     */
    public PkgDefinition.PkgComment createPkgDefinitionPkgComment() {
        return new PkgDefinition.PkgComment();
    }

    /**
     * Create an instance of {@link PkgDefinition.PkgTypeComment }
     * 
     */
    public PkgDefinition.PkgTypeComment createPkgDefinitionPkgTypeComment() {
        return new PkgDefinition.PkgTypeComment();
    }

    /**
     * Create an instance of {@link PkgDefinition.Components }
     * 
     */
    public PkgDefinition.Components createPkgDefinitionComponents() {
        return new PkgDefinition.Components();
    }

    /**
     * Create an instance of {@link PkgDefinition.StaffMembers }
     * 
     */
    public PkgDefinition.StaffMembers createPkgDefinitionStaffMembers() {
        return new PkgDefinition.StaffMembers();
    }

    /**
     * Create an instance of {@link PkgDefinition.Classifications.Classification.Comments }
     * 
     */
    public PkgDefinition.Classifications.Classification.Comments createPkgDefinitionClassificationsClassificationComments() {
        return new PkgDefinition.Classifications.Classification.Comments();
    }

    /**
     * Create an instance of {@link PkgDefinition.Colors.Color }
     * 
     */
    public PkgDefinition.Colors.Color createPkgDefinitionColorsColor() {
        return new PkgDefinition.Colors.Color();
    }

    /**
     * Create an instance of {@link ResShell.ResGuests }
     * 
     */
    public ResShell.ResGuests createResShellResGuests() {
        return new ResShell.ResGuests();
    }

    /**
     * Create an instance of {@link RouteDefinition.Classifications.Classification }
     * 
     */
    public RouteDefinition.Classifications.Classification createRouteDefinitionClassificationsClassification() {
        return new RouteDefinition.Classifications.Classification();
    }

    /**
     * Create an instance of {@link PkgComponent.Day }
     * 
     */
    public PkgComponent.Day createPkgComponentDay() {
        return new PkgComponent.Day();
    }

    /**
     * Create an instance of {@link DbSearchOUT.ShipFacilities.ShipFacility.FacilityName }
     * 
     */
    public DbSearchOUT.ShipFacilities.ShipFacility.FacilityName createDbSearchOUTShipFacilitiesShipFacilityFacilityName() {
        return new DbSearchOUT.ShipFacilities.ShipFacility.FacilityName();
    }

    /**
     * Create an instance of {@link DbSearchBaseOUT.Counts.CountItem }
     * 
     */
    public DbSearchBaseOUT.Counts.CountItem createDbSearchBaseOUTCountsCountItem() {
        return new DbSearchBaseOUT.Counts.CountItem();
    }

    /**
     * Create an instance of {@link DbSearchOptions.SortItems.SortItem.OrderBy }
     * 
     */
    public DbSearchOptions.SortItems.SortItem.OrderBy createDbSearchOptionsSortItemsSortItemOrderBy() {
        return new DbSearchOptions.SortItems.SortItem.OrderBy();
    }

    /**
     * Create an instance of {@link MsgHeader.DebugOptions }
     * 
     */
    public MsgHeader.DebugOptions createMsgHeaderDebugOptions() {
        return new MsgHeader.DebugOptions();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Errors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Errors")
    public JAXBElement<Errors> createErrors(Errors value) {
        return new JAXBElement<Errors>(_Errors_QNAME, Errors.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComponentReference.CarDeckRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CarDeckRequest", scope = ComponentReference.class)
    public JAXBElement<ComponentReference.CarDeckRequest> createComponentReferenceCarDeckRequest(ComponentReference.CarDeckRequest value) {
        return new JAXBElement<ComponentReference.CarDeckRequest>(_ComponentReferenceCarDeckRequest_QNAME, ComponentReference.CarDeckRequest.class, ComponentReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Cargo", scope = ComponentReference.class)
    public JAXBElement<Boolean> createComponentReferenceCargo(Boolean value) {
        return new JAXBElement<Boolean>(_ComponentReferenceCargo_QNAME, Boolean.class, ComponentReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComponentReference.Addon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Addon", scope = ComponentReference.class)
    public JAXBElement<ComponentReference.Addon> createComponentReferenceAddon(ComponentReference.Addon value) {
        return new JAXBElement<ComponentReference.Addon>(_ComponentReferenceAddon_QNAME, ComponentReference.Addon.class, ComponentReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TransferReqCode", scope = ComponentReference.class)
    public JAXBElement<String> createComponentReferenceTransferReqCode(String value) {
        return new JAXBElement<String>(_ComponentReferenceTransferReqCode_QNAME, String.class, ComponentReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DiningReqID", scope = ComponentReference.class)
    public JAXBElement<Integer> createComponentReferenceDiningReqID(Integer value) {
        return new JAXBElement<Integer>(_ComponentReferenceDiningReqID_QNAME, Integer.class, ComponentReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ShipRoomReqID", scope = ComponentReference.class)
    public JAXBElement<Integer> createComponentReferenceShipRoomReqID(Integer value) {
        return new JAXBElement<Integer>(_ComponentReferenceShipRoomReqID_QNAME, Integer.class, ComponentReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PackageID", scope = ComponentReference.class)
    public JAXBElement<Integer> createComponentReferencePackageID(Integer value) {
        return new JAXBElement<Integer>(_ComponentReferencePackageID_QNAME, Integer.class, ComponentReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComponentReference.Air }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Air", scope = ComponentReference.class)
    public JAXBElement<ComponentReference.Air> createComponentReferenceAir(ComponentReference.Air value) {
        return new JAXBElement<ComponentReference.Air>(_ComponentReferenceAir_QNAME, ComponentReference.Air.class, ComponentReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PackageCode", scope = ComponentReference.class)
    public JAXBElement<String> createComponentReferencePackageCode(String value) {
        return new JAXBElement<String>(_ComponentReferencePackageCode_QNAME, String.class, ComponentReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RoomSeqN", scope = ComponentReference.class)
    public JAXBElement<BigInteger> createComponentReferenceRoomSeqN(BigInteger value) {
        return new JAXBElement<BigInteger>(_ComponentReferenceRoomSeqN_QNAME, BigInteger.class, ComponentReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ClientID", scope = ResGuest.class)
    public JAXBElement<Integer> createResGuestClientID(Integer value) {
        return new JAXBElement<Integer>(_ResGuestClientID_QNAME, Integer.class, ResGuest.class, value);
    }

}
