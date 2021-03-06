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
// Generated on: 2020.08.18 at 12:33:05 AM EDT 
//


package org.greenbuttonalliance.espi.resourceserver.web.model.usage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * Time sequence of Readings of the same ReadingType.
 * 
 * <p>Java class for IntervalBlock complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntervalBlock"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://naesb.org/espi}IdentifiedObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="interval" type="{http://naesb.org/espi}DateTimeInterval" minOccurs="0"/&gt;
 *         &lt;element name="IntervalReading" type="{http://naesb.org/espi}IntervalReading" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntervalBlock", propOrder = {
    "interval",
    "intervalReading"
})
public class IntervalBlock
    extends IdentifiedObject
{

    protected DateTimeInterval interval;
    @XmlElement(name = "IntervalReading")
    protected List<IntervalReading> intervalReading;

    /**
     * Gets the value of the interval property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeInterval }
     *     
     */
    public DateTimeInterval getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeInterval }
     *     
     */
    public void setInterval(DateTimeInterval value) {
        this.interval = value;
    }

    /**
     * Gets the value of the intervalReading property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intervalReading property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntervalReading().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntervalReading }
     * 
     * 
     */
    public List<IntervalReading> getIntervalReading() {
        if (intervalReading == null) {
            intervalReading = new ArrayList<>();
        }
        return this.intervalReading;
    }

}
