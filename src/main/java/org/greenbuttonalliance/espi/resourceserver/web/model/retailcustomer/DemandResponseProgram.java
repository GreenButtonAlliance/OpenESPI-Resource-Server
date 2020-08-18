/*
 *
 *      Copyright (c) 2020 Green Button Alliance, Inc.
 *
 *      Licensed under the Apache License, Version 2.0 (the "License");
 *      you may not use this file except in compliance with the License.
 *      You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 *      Unless required by applicable law or agreed to in writing, software
 *      distributed under the License is distributed on an "AS IS" BASIS,
 *      WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *      See the License for the specific language governing permissions and
 *      limitations under the License.
 *
 *
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.18 at 12:33:08 AM EDT 
//


package org.greenbuttonalliance.espi.resourceserver.web.model.retailcustomer;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * [extension] Demand Response program characteristics covered by Customer Agreement
 * 
 * <p>Java class for DemandResponseProgram complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DemandResponseProgram"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="programName" type="{http://naesb.org/espi/customer}String256" minOccurs="0"/&gt;
 *         &lt;element name="enrollmentStatus" type="{http://naesb.org/espi/customer}EnrollmentStatus" minOccurs="0"/&gt;
 *         &lt;element name="programDescription" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="programDate" type="{http://naesb.org/espi/customer}ProgramDate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="capacityReservationLevel" type="{http://naesb.org/espi/customer}SummaryMeasurement" minOccurs="0"/&gt;
 *         &lt;element name="DRProgramNomination" type="{http://naesb.org/espi/customer}SummaryMeasurement" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DemandResponseProgram", propOrder = {
    "programName",
    "enrollmentStatus",
    "programDescription",
    "programDate",
    "capacityReservationLevel",
    "drProgramNomination"
})
public class DemandResponseProgram {

    protected String programName;
    protected String enrollmentStatus;
    @XmlSchemaType(name = "anyURI")
    protected String programDescription;
    protected List<ProgramDate> programDate;
    protected SummaryMeasurement capacityReservationLevel;
    @XmlElement(name = "DRProgramNomination")
    protected SummaryMeasurement drProgramNomination;

    /**
     * Gets the value of the programName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramName() {
        return programName;
    }

    /**
     * Sets the value of the programName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramName(String value) {
        this.programName = value;
    }

    /**
     * Gets the value of the enrollmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrollmentStatus() {
        return enrollmentStatus;
    }

    /**
     * Sets the value of the enrollmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrollmentStatus(String value) {
        this.enrollmentStatus = value;
    }

    /**
     * Gets the value of the programDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramDescription() {
        return programDescription;
    }

    /**
     * Sets the value of the programDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramDescription(String value) {
        this.programDescription = value;
    }

    /**
     * Gets the value of the programDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the programDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProgramDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProgramDate }
     * 
     * 
     */
    public List<ProgramDate> getProgramDate() {
        if (programDate == null) {
            programDate = new ArrayList<>();
        }
        return this.programDate;
    }

    /**
     * Gets the value of the capacityReservationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryMeasurement }
     *     
     */
    public SummaryMeasurement getCapacityReservationLevel() {
        return capacityReservationLevel;
    }

    /**
     * Sets the value of the capacityReservationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryMeasurement }
     *     
     */
    public void setCapacityReservationLevel(SummaryMeasurement value) {
        this.capacityReservationLevel = value;
    }

    /**
     * Gets the value of the drProgramNomination property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryMeasurement }
     *     
     */
    public SummaryMeasurement getDRProgramNomination() {
        return drProgramNomination;
    }

    /**
     * Sets the value of the drProgramNomination property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryMeasurement }
     *     
     */
    public void setDRProgramNomination(SummaryMeasurement value) {
        this.drProgramNomination = value;
    }

}
