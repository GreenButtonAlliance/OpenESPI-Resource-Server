//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.18 at 12:33:05 AM EDT 
//


package org.greenbuttonalliance.espi.resourceserver.web.model.usage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * [extension] Summary of usage for a billing period
 * 
 * <p>Java class for UsageSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UsageSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://naesb.org/espi}IdentifiedObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="billingPeriod" type="{http://naesb.org/espi}DateTimeInterval" minOccurs="0"/&gt;
 *         &lt;element name="billLastPeriod" type="{http://naesb.org/espi}Int48" minOccurs="0"/&gt;
 *         &lt;element name="billToDate" type="{http://naesb.org/espi}Int48" minOccurs="0"/&gt;
 *         &lt;element name="costAdditionalLastPeriod" type="{http://naesb.org/espi}Int48" minOccurs="0"/&gt;
 *         &lt;element name="costAdditionalDetailLastPeriod" type="{http://naesb.org/espi}LineItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://naesb.org/espi}Currency" minOccurs="0"/&gt;
 *         &lt;element name="overallConsumptionLastPeriod" type="{http://naesb.org/espi}SummaryMeasurement" minOccurs="0"/&gt;
 *         &lt;element name="currentBillingPeriodOverAllConsumption" type="{http://naesb.org/espi}SummaryMeasurement" minOccurs="0"/&gt;
 *         &lt;element name="currentDayLastYearNetConsumption" type="{http://naesb.org/espi}SummaryMeasurement" minOccurs="0"/&gt;
 *         &lt;element name="currentDayNetConsumption" type="{http://naesb.org/espi}SummaryMeasurement" minOccurs="0"/&gt;
 *         &lt;element name="currentDayOverallConsumption" type="{http://naesb.org/espi}SummaryMeasurement" minOccurs="0"/&gt;
 *         &lt;element name="peakDemand" type="{http://naesb.org/espi}SummaryMeasurement" minOccurs="0"/&gt;
 *         &lt;element name="previousDayLastYearOverallConsumption" type="{http://naesb.org/espi}SummaryMeasurement" minOccurs="0"/&gt;
 *         &lt;element name="previousDayNetConsumption" type="{http://naesb.org/espi}SummaryMeasurement" minOccurs="0"/&gt;
 *         &lt;element name="previousDayOverallConsumption" type="{http://naesb.org/espi}SummaryMeasurement" minOccurs="0"/&gt;
 *         &lt;element name="qualityOfReading" type="{http://naesb.org/espi}QualityOfReading" minOccurs="0"/&gt;
 *         &lt;element name="ratchetDemand" type="{http://naesb.org/espi}SummaryMeasurement" minOccurs="0"/&gt;
 *         &lt;element name="ratchetDemandPeriod" type="{http://naesb.org/espi}DateTimeInterval" minOccurs="0"/&gt;
 *         &lt;element name="statusTimeStamp" type="{http://naesb.org/espi}TimeType"/&gt;
 *         &lt;element name="commodity" type="{http://naesb.org/espi}CommodityKind" minOccurs="0"/&gt;
 *         &lt;element name="tariffProfile" type="{http://naesb.org/espi}String256" minOccurs="0"/&gt;
 *         &lt;element name="readCycle" type="{http://naesb.org/espi}String256" minOccurs="0"/&gt;
 *         &lt;element name="tariffRiderRefs" type="{http://naesb.org/espi}TariffRiderRefs" minOccurs="0"/&gt;
 *         &lt;element name="billingChargeSource" type="{http://naesb.org/espi}BillingChargeSource" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsageSummary", propOrder = {
    "billingPeriod",
    "billLastPeriod",
    "billToDate",
    "costAdditionalLastPeriod",
    "costAdditionalDetailLastPeriod",
    "currency",
    "overallConsumptionLastPeriod",
    "currentBillingPeriodOverAllConsumption",
    "currentDayLastYearNetConsumption",
    "currentDayNetConsumption",
    "currentDayOverallConsumption",
    "peakDemand",
    "previousDayLastYearOverallConsumption",
    "previousDayNetConsumption",
    "previousDayOverallConsumption",
    "qualityOfReading",
    "ratchetDemand",
    "ratchetDemandPeriod",
    "statusTimeStamp",
    "commodity",
    "tariffProfile",
    "readCycle",
    "tariffRiderRefs",
    "billingChargeSource"
})
public class UsageSummary
    extends IdentifiedObject
{

    protected DateTimeInterval billingPeriod;
    protected Long billLastPeriod;
    protected Long billToDate;
    protected Long costAdditionalLastPeriod;
    protected List<LineItem> costAdditionalDetailLastPeriod;
    protected String currency;
    protected SummaryMeasurement overallConsumptionLastPeriod;
    protected SummaryMeasurement currentBillingPeriodOverAllConsumption;
    protected SummaryMeasurement currentDayLastYearNetConsumption;
    protected SummaryMeasurement currentDayNetConsumption;
    protected SummaryMeasurement currentDayOverallConsumption;
    protected SummaryMeasurement peakDemand;
    protected SummaryMeasurement previousDayLastYearOverallConsumption;
    protected SummaryMeasurement previousDayNetConsumption;
    protected SummaryMeasurement previousDayOverallConsumption;
    protected String qualityOfReading;
    protected SummaryMeasurement ratchetDemand;
    protected DateTimeInterval ratchetDemandPeriod;
    protected long statusTimeStamp;
    protected String commodity;
    protected String tariffProfile;
    protected String readCycle;
    protected TariffRiderRefs tariffRiderRefs;
    protected BillingChargeSource billingChargeSource;

    /**
     * Gets the value of the billingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeInterval }
     *     
     */
    public DateTimeInterval getBillingPeriod() {
        return billingPeriod;
    }

    /**
     * Sets the value of the billingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeInterval }
     *     
     */
    public void setBillingPeriod(DateTimeInterval value) {
        this.billingPeriod = value;
    }

    /**
     * Gets the value of the billLastPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBillLastPeriod() {
        return billLastPeriod;
    }

    /**
     * Sets the value of the billLastPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBillLastPeriod(Long value) {
        this.billLastPeriod = value;
    }

    /**
     * Gets the value of the billToDate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBillToDate() {
        return billToDate;
    }

    /**
     * Sets the value of the billToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBillToDate(Long value) {
        this.billToDate = value;
    }

    /**
     * Gets the value of the costAdditionalLastPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCostAdditionalLastPeriod() {
        return costAdditionalLastPeriod;
    }

    /**
     * Sets the value of the costAdditionalLastPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCostAdditionalLastPeriod(Long value) {
        this.costAdditionalLastPeriod = value;
    }

    /**
     * Gets the value of the costAdditionalDetailLastPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the costAdditionalDetailLastPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCostAdditionalDetailLastPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItem }
     * 
     * 
     */
    public List<LineItem> getCostAdditionalDetailLastPeriod() {
        if (costAdditionalDetailLastPeriod == null) {
            costAdditionalDetailLastPeriod = new ArrayList<LineItem>();
        }
        return this.costAdditionalDetailLastPeriod;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the overallConsumptionLastPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryMeasurement }
     *     
     */
    public SummaryMeasurement getOverallConsumptionLastPeriod() {
        return overallConsumptionLastPeriod;
    }

    /**
     * Sets the value of the overallConsumptionLastPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryMeasurement }
     *     
     */
    public void setOverallConsumptionLastPeriod(SummaryMeasurement value) {
        this.overallConsumptionLastPeriod = value;
    }

    /**
     * Gets the value of the currentBillingPeriodOverAllConsumption property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryMeasurement }
     *     
     */
    public SummaryMeasurement getCurrentBillingPeriodOverAllConsumption() {
        return currentBillingPeriodOverAllConsumption;
    }

    /**
     * Sets the value of the currentBillingPeriodOverAllConsumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryMeasurement }
     *     
     */
    public void setCurrentBillingPeriodOverAllConsumption(SummaryMeasurement value) {
        this.currentBillingPeriodOverAllConsumption = value;
    }

    /**
     * Gets the value of the currentDayLastYearNetConsumption property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryMeasurement }
     *     
     */
    public SummaryMeasurement getCurrentDayLastYearNetConsumption() {
        return currentDayLastYearNetConsumption;
    }

    /**
     * Sets the value of the currentDayLastYearNetConsumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryMeasurement }
     *     
     */
    public void setCurrentDayLastYearNetConsumption(SummaryMeasurement value) {
        this.currentDayLastYearNetConsumption = value;
    }

    /**
     * Gets the value of the currentDayNetConsumption property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryMeasurement }
     *     
     */
    public SummaryMeasurement getCurrentDayNetConsumption() {
        return currentDayNetConsumption;
    }

    /**
     * Sets the value of the currentDayNetConsumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryMeasurement }
     *     
     */
    public void setCurrentDayNetConsumption(SummaryMeasurement value) {
        this.currentDayNetConsumption = value;
    }

    /**
     * Gets the value of the currentDayOverallConsumption property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryMeasurement }
     *     
     */
    public SummaryMeasurement getCurrentDayOverallConsumption() {
        return currentDayOverallConsumption;
    }

    /**
     * Sets the value of the currentDayOverallConsumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryMeasurement }
     *     
     */
    public void setCurrentDayOverallConsumption(SummaryMeasurement value) {
        this.currentDayOverallConsumption = value;
    }

    /**
     * Gets the value of the peakDemand property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryMeasurement }
     *     
     */
    public SummaryMeasurement getPeakDemand() {
        return peakDemand;
    }

    /**
     * Sets the value of the peakDemand property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryMeasurement }
     *     
     */
    public void setPeakDemand(SummaryMeasurement value) {
        this.peakDemand = value;
    }

    /**
     * Gets the value of the previousDayLastYearOverallConsumption property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryMeasurement }
     *     
     */
    public SummaryMeasurement getPreviousDayLastYearOverallConsumption() {
        return previousDayLastYearOverallConsumption;
    }

    /**
     * Sets the value of the previousDayLastYearOverallConsumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryMeasurement }
     *     
     */
    public void setPreviousDayLastYearOverallConsumption(SummaryMeasurement value) {
        this.previousDayLastYearOverallConsumption = value;
    }

    /**
     * Gets the value of the previousDayNetConsumption property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryMeasurement }
     *     
     */
    public SummaryMeasurement getPreviousDayNetConsumption() {
        return previousDayNetConsumption;
    }

    /**
     * Sets the value of the previousDayNetConsumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryMeasurement }
     *     
     */
    public void setPreviousDayNetConsumption(SummaryMeasurement value) {
        this.previousDayNetConsumption = value;
    }

    /**
     * Gets the value of the previousDayOverallConsumption property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryMeasurement }
     *     
     */
    public SummaryMeasurement getPreviousDayOverallConsumption() {
        return previousDayOverallConsumption;
    }

    /**
     * Sets the value of the previousDayOverallConsumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryMeasurement }
     *     
     */
    public void setPreviousDayOverallConsumption(SummaryMeasurement value) {
        this.previousDayOverallConsumption = value;
    }

    /**
     * Gets the value of the qualityOfReading property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualityOfReading() {
        return qualityOfReading;
    }

    /**
     * Sets the value of the qualityOfReading property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualityOfReading(String value) {
        this.qualityOfReading = value;
    }

    /**
     * Gets the value of the ratchetDemand property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryMeasurement }
     *     
     */
    public SummaryMeasurement getRatchetDemand() {
        return ratchetDemand;
    }

    /**
     * Sets the value of the ratchetDemand property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryMeasurement }
     *     
     */
    public void setRatchetDemand(SummaryMeasurement value) {
        this.ratchetDemand = value;
    }

    /**
     * Gets the value of the ratchetDemandPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeInterval }
     *     
     */
    public DateTimeInterval getRatchetDemandPeriod() {
        return ratchetDemandPeriod;
    }

    /**
     * Sets the value of the ratchetDemandPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeInterval }
     *     
     */
    public void setRatchetDemandPeriod(DateTimeInterval value) {
        this.ratchetDemandPeriod = value;
    }

    /**
     * Gets the value of the statusTimeStamp property.
     * 
     */
    public long getStatusTimeStamp() {
        return statusTimeStamp;
    }

    /**
     * Sets the value of the statusTimeStamp property.
     * 
     */
    public void setStatusTimeStamp(long value) {
        this.statusTimeStamp = value;
    }

    /**
     * Gets the value of the commodity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodity() {
        return commodity;
    }

    /**
     * Sets the value of the commodity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodity(String value) {
        this.commodity = value;
    }

    /**
     * Gets the value of the tariffProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffProfile() {
        return tariffProfile;
    }

    /**
     * Sets the value of the tariffProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffProfile(String value) {
        this.tariffProfile = value;
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
     * Gets the value of the tariffRiderRefs property.
     * 
     * @return
     *     possible object is
     *     {@link TariffRiderRefs }
     *     
     */
    public TariffRiderRefs getTariffRiderRefs() {
        return tariffRiderRefs;
    }

    /**
     * Sets the value of the tariffRiderRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffRiderRefs }
     *     
     */
    public void setTariffRiderRefs(TariffRiderRefs value) {
        this.tariffRiderRefs = value;
    }

    /**
     * Gets the value of the billingChargeSource property.
     * 
     * @return
     *     possible object is
     *     {@link BillingChargeSource }
     *     
     */
    public BillingChargeSource getBillingChargeSource() {
        return billingChargeSource;
    }

    /**
     * Sets the value of the billingChargeSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingChargeSource }
     *     
     */
    public void setBillingChargeSource(BillingChargeSource value) {
        this.billingChargeSource = value;
    }

}
