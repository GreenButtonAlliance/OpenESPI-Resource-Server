//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.18 at 12:33:08 AM EDT 
//


package org.greenbuttonalliance.espi.resourceserver.web.model.retailcustomer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * The place, scene, or point of something where someone or something has been, is, and/or will be at a given moment in time. It can be defined with one or more position points (coordinates) in a given coordinate system.
 * 
 * <p>Java class for Location complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Location"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://naesb.org/espi/customer}IdentifiedObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{http://naesb.org/espi/customer}String256" minOccurs="0"/&gt;
 *         &lt;element name="mainAddress" type="{http://naesb.org/espi/customer}StreetAddress" minOccurs="0"/&gt;
 *         &lt;element name="secondaryAddress" type="{http://naesb.org/espi/customer}StreetAddress" minOccurs="0"/&gt;
 *         &lt;element name="phone1" type="{http://naesb.org/espi/customer}TelephoneNumber" minOccurs="0"/&gt;
 *         &lt;element name="phone2" type="{http://naesb.org/espi/customer}TelephoneNumber" minOccurs="0"/&gt;
 *         &lt;element name="electronicAddress" type="{http://naesb.org/espi/customer}ElectronicAddress" minOccurs="0"/&gt;
 *         &lt;element name="geoInfoReference" type="{http://naesb.org/espi/customer}String256" minOccurs="0"/&gt;
 *         &lt;element name="direction" type="{http://naesb.org/espi/customer}String256" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://naesb.org/espi/customer}Status" minOccurs="0"/&gt;
 *         &lt;element name="positionPoints" type="{http://naesb.org/espi/customer}PositionPoint" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location", propOrder = {
    "type",
    "mainAddress",
    "secondaryAddress",
    "phone1",
    "phone2",
    "electronicAddress",
    "geoInfoReference",
    "direction",
    "status",
    "positionPoints"
})
@XmlSeeAlso({
    WorkLocation.class
})
public class Location
    extends IdentifiedObject
{

    protected String type;
    protected StreetAddress mainAddress;
    protected StreetAddress secondaryAddress;
    protected TelephoneNumber phone1;
    protected TelephoneNumber phone2;
    protected ElectronicAddress electronicAddress;
    protected String geoInfoReference;
    protected String direction;
    protected Status status;
    protected List<PositionPoint> positionPoints;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the mainAddress property.
     * 
     * @return
     *     possible object is
     *     {@link StreetAddress }
     *     
     */
    public StreetAddress getMainAddress() {
        return mainAddress;
    }

    /**
     * Sets the value of the mainAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetAddress }
     *     
     */
    public void setMainAddress(StreetAddress value) {
        this.mainAddress = value;
    }

    /**
     * Gets the value of the secondaryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link StreetAddress }
     *     
     */
    public StreetAddress getSecondaryAddress() {
        return secondaryAddress;
    }

    /**
     * Sets the value of the secondaryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetAddress }
     *     
     */
    public void setSecondaryAddress(StreetAddress value) {
        this.secondaryAddress = value;
    }

    /**
     * Gets the value of the phone1 property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneNumber }
     *     
     */
    public TelephoneNumber getPhone1() {
        return phone1;
    }

    /**
     * Sets the value of the phone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneNumber }
     *     
     */
    public void setPhone1(TelephoneNumber value) {
        this.phone1 = value;
    }

    /**
     * Gets the value of the phone2 property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneNumber }
     *     
     */
    public TelephoneNumber getPhone2() {
        return phone2;
    }

    /**
     * Sets the value of the phone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneNumber }
     *     
     */
    public void setPhone2(TelephoneNumber value) {
        this.phone2 = value;
    }

    /**
     * Gets the value of the electronicAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ElectronicAddress }
     *     
     */
    public ElectronicAddress getElectronicAddress() {
        return electronicAddress;
    }

    /**
     * Sets the value of the electronicAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicAddress }
     *     
     */
    public void setElectronicAddress(ElectronicAddress value) {
        this.electronicAddress = value;
    }

    /**
     * Gets the value of the geoInfoReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoInfoReference() {
        return geoInfoReference;
    }

    /**
     * Sets the value of the geoInfoReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoInfoReference(String value) {
        this.geoInfoReference = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the positionPoints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positionPoints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositionPoints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionPoint }
     * 
     * 
     */
    public List<PositionPoint> getPositionPoints() {
        if (positionPoints == null) {
            positionPoints = new ArrayList<PositionPoint>();
        }
        return this.positionPoints;
    }

}
