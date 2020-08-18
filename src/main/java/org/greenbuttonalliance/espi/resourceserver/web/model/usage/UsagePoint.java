//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.18 at 12:33:05 AM EDT 
//


package org.greenbuttonalliance.espi.resourceserver.web.model.usage;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Logical point on a network at which consumption or production is either physically measured (e.g., metered) or estimated (e.g., unmetered street lights).
 * 
 * <p>Java class for UsagePoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UsagePoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://naesb.org/espi}IdentifiedObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roleFlags" type="{http://naesb.org/espi}HexBinary16" minOccurs="0"/&gt;
 *         &lt;element name="ServiceCategory" type="{http://naesb.org/espi}ServiceCategory" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://naesb.org/espi}UInt8" minOccurs="0"/&gt;
 *         &lt;element name="serviceDeliveryPoint" type="{http://naesb.org/espi}ServiceDeliveryPoint" minOccurs="0"/&gt;
 *         &lt;element name="amiBillingReady" type="{http://naesb.org/espi}AmiBillingReadyKind" minOccurs="0"/&gt;
 *         &lt;element name="checkBilling" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="connectionState" type="{http://naesb.org/espi}UsagePointConnectedKind" minOccurs="0"/&gt;
 *         &lt;element name="estimatedLoad" type="{http://naesb.org/espi}SummaryMeasurement" minOccurs="0"/&gt;
 *         &lt;element name="grounded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isSdp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isVirtual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="minimalUsageExpected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="nominalServiceVoltage" type="{http://naesb.org/espi}SummaryMeasurement" minOccurs="0"/&gt;
 *         &lt;element name="outageRegion" type="{http://naesb.org/espi}String256" minOccurs="0"/&gt;
 *         &lt;element name="phaseCode" type="{http://naesb.org/espi}PhaseCodeKind" minOccurs="0"/&gt;
 *         &lt;element name="ratedCurrent" type="{http://naesb.org/espi}SummaryMeasurement" minOccurs="0"/&gt;
 *         &lt;element name="ratedPower" type="{http://naesb.org/espi}SummaryMeasurement" minOccurs="0"/&gt;
 *         &lt;element name="readCycle" type="{http://naesb.org/espi}String256" minOccurs="0"/&gt;
 *         &lt;element name="readRoute" type="{http://naesb.org/espi}String256" minOccurs="0"/&gt;
 *         &lt;element name="serviceDeliveryRemark" type="{http://naesb.org/espi}String256" minOccurs="0"/&gt;
 *         &lt;element name="servicePriority" type="{http://naesb.org/espi}String32" minOccurs="0"/&gt;
 *         &lt;element name="pnodeRefs" type="{http://naesb.org/espi}PnodeRefs" minOccurs="0"/&gt;
 *         &lt;element name="aggregateNodeRefs" type="{http://naesb.org/espi}AggregateNodeRefs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsagePoint", propOrder = {
    "roleFlags",
    "serviceCategory",
    "status",
    "serviceDeliveryPoint",
    "amiBillingReady",
    "checkBilling",
    "connectionState",
    "estimatedLoad",
    "grounded",
    "isSdp",
    "isVirtual",
    "minimalUsageExpected",
    "nominalServiceVoltage",
    "outageRegion",
    "phaseCode",
    "ratedCurrent",
    "ratedPower",
    "readCycle",
    "readRoute",
    "serviceDeliveryRemark",
    "servicePriority",
    "pnodeRefs",
    "aggregateNodeRefs"
})
public class UsagePoint
    extends IdentifiedObject
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] roleFlags;
    @XmlElement(name = "ServiceCategory")
    protected ServiceCategory serviceCategory;
    @XmlSchemaType(name = "unsignedByte")
    protected Short status;
    protected ServiceDeliveryPoint serviceDeliveryPoint;
    @XmlSchemaType(name = "string")
    protected AmiBillingReadyKind amiBillingReady;
    protected Boolean checkBilling;
    @XmlSchemaType(name = "string")
    protected UsagePointConnectedKind connectionState;
    protected SummaryMeasurement estimatedLoad;
    protected Boolean grounded;
    protected Boolean isSdp;
    protected Boolean isVirtual;
    protected Boolean minimalUsageExpected;
    protected SummaryMeasurement nominalServiceVoltage;
    protected String outageRegion;
    protected String phaseCode;
    protected SummaryMeasurement ratedCurrent;
    protected SummaryMeasurement ratedPower;
    protected String readCycle;
    protected String readRoute;
    protected String serviceDeliveryRemark;
    protected String servicePriority;
    protected PnodeRefs pnodeRefs;
    protected AggregateNodeRefs aggregateNodeRefs;

    /**
     * Gets the value of the roleFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getRoleFlags() {
        return roleFlags;
    }

    /**
     * Sets the value of the roleFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleFlags(byte[] value) {
        this.roleFlags = value;
    }

    /**
     * Gets the value of the serviceCategory property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCategory }
     *     
     */
    public ServiceCategory getServiceCategory() {
        return serviceCategory;
    }

    /**
     * Sets the value of the serviceCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCategory }
     *     
     */
    public void setServiceCategory(ServiceCategory value) {
        this.serviceCategory = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setStatus(Short value) {
        this.status = value;
    }

    /**
     * Gets the value of the serviceDeliveryPoint property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDeliveryPoint }
     *     
     */
    public ServiceDeliveryPoint getServiceDeliveryPoint() {
        return serviceDeliveryPoint;
    }

    /**
     * Sets the value of the serviceDeliveryPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDeliveryPoint }
     *     
     */
    public void setServiceDeliveryPoint(ServiceDeliveryPoint value) {
        this.serviceDeliveryPoint = value;
    }

    /**
     * Gets the value of the amiBillingReady property.
     * 
     * @return
     *     possible object is
     *     {@link AmiBillingReadyKind }
     *     
     */
    public AmiBillingReadyKind getAmiBillingReady() {
        return amiBillingReady;
    }

    /**
     * Sets the value of the amiBillingReady property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmiBillingReadyKind }
     *     
     */
    public void setAmiBillingReady(AmiBillingReadyKind value) {
        this.amiBillingReady = value;
    }

    /**
     * Gets the value of the checkBilling property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckBilling() {
        return checkBilling;
    }

    /**
     * Sets the value of the checkBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckBilling(Boolean value) {
        this.checkBilling = value;
    }

    /**
     * Gets the value of the connectionState property.
     * 
     * @return
     *     possible object is
     *     {@link UsagePointConnectedKind }
     *     
     */
    public UsagePointConnectedKind getConnectionState() {
        return connectionState;
    }

    /**
     * Sets the value of the connectionState property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsagePointConnectedKind }
     *     
     */
    public void setConnectionState(UsagePointConnectedKind value) {
        this.connectionState = value;
    }

    /**
     * Gets the value of the estimatedLoad property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryMeasurement }
     *     
     */
    public SummaryMeasurement getEstimatedLoad() {
        return estimatedLoad;
    }

    /**
     * Sets the value of the estimatedLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryMeasurement }
     *     
     */
    public void setEstimatedLoad(SummaryMeasurement value) {
        this.estimatedLoad = value;
    }

    /**
     * Gets the value of the grounded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGrounded() {
        return grounded;
    }

    /**
     * Sets the value of the grounded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGrounded(Boolean value) {
        this.grounded = value;
    }

    /**
     * Gets the value of the isSdp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSdp() {
        return isSdp;
    }

    /**
     * Sets the value of the isSdp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSdp(Boolean value) {
        this.isSdp = value;
    }

    /**
     * Gets the value of the isVirtual property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsVirtual() {
        return isVirtual;
    }

    /**
     * Sets the value of the isVirtual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsVirtual(Boolean value) {
        this.isVirtual = value;
    }

    /**
     * Gets the value of the minimalUsageExpected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinimalUsageExpected() {
        return minimalUsageExpected;
    }

    /**
     * Sets the value of the minimalUsageExpected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinimalUsageExpected(Boolean value) {
        this.minimalUsageExpected = value;
    }

    /**
     * Gets the value of the nominalServiceVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryMeasurement }
     *     
     */
    public SummaryMeasurement getNominalServiceVoltage() {
        return nominalServiceVoltage;
    }

    /**
     * Sets the value of the nominalServiceVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryMeasurement }
     *     
     */
    public void setNominalServiceVoltage(SummaryMeasurement value) {
        this.nominalServiceVoltage = value;
    }

    /**
     * Gets the value of the outageRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutageRegion() {
        return outageRegion;
    }

    /**
     * Sets the value of the outageRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutageRegion(String value) {
        this.outageRegion = value;
    }

    /**
     * Gets the value of the phaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhaseCode() {
        return phaseCode;
    }

    /**
     * Sets the value of the phaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhaseCode(String value) {
        this.phaseCode = value;
    }

    /**
     * Gets the value of the ratedCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryMeasurement }
     *     
     */
    public SummaryMeasurement getRatedCurrent() {
        return ratedCurrent;
    }

    /**
     * Sets the value of the ratedCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryMeasurement }
     *     
     */
    public void setRatedCurrent(SummaryMeasurement value) {
        this.ratedCurrent = value;
    }

    /**
     * Gets the value of the ratedPower property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryMeasurement }
     *     
     */
    public SummaryMeasurement getRatedPower() {
        return ratedPower;
    }

    /**
     * Sets the value of the ratedPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryMeasurement }
     *     
     */
    public void setRatedPower(SummaryMeasurement value) {
        this.ratedPower = value;
    }

    /**
     * Gets the value of the readCycle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadCycle() {
        return readCycle;
    }

    /**
     * Sets the value of the readCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadCycle(String value) {
        this.readCycle = value;
    }

    /**
     * Gets the value of the readRoute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadRoute() {
        return readRoute;
    }

    /**
     * Sets the value of the readRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadRoute(String value) {
        this.readRoute = value;
    }

    /**
     * Gets the value of the serviceDeliveryRemark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDeliveryRemark() {
        return serviceDeliveryRemark;
    }

    /**
     * Sets the value of the serviceDeliveryRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDeliveryRemark(String value) {
        this.serviceDeliveryRemark = value;
    }

    /**
     * Gets the value of the servicePriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicePriority() {
        return servicePriority;
    }

    /**
     * Sets the value of the servicePriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicePriority(String value) {
        this.servicePriority = value;
    }

    /**
     * Gets the value of the pnodeRefs property.
     * 
     * @return
     *     possible object is
     *     {@link PnodeRefs }
     *     
     */
    public PnodeRefs getPnodeRefs() {
        return pnodeRefs;
    }

    /**
     * Sets the value of the pnodeRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PnodeRefs }
     *     
     */
    public void setPnodeRefs(PnodeRefs value) {
        this.pnodeRefs = value;
    }

    /**
     * Gets the value of the aggregateNodeRefs property.
     * 
     * @return
     *     possible object is
     *     {@link AggregateNodeRefs }
     *     
     */
    public AggregateNodeRefs getAggregateNodeRefs() {
        return aggregateNodeRefs;
    }

    /**
     * Sets the value of the aggregateNodeRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregateNodeRefs }
     *     
     */
    public void setAggregateNodeRefs(AggregateNodeRefs value) {
        this.aggregateNodeRefs = value;
    }

}