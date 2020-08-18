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
import javax.xml.bind.annotation.XmlType;
import java.math.BigInteger;


/**
 * [extension] Interharmonics are represented as a rational number 'numerator' / 'denominator', and harmonics are represented using the same mechanism and identified by 'denominator'=1.
 * 
 * <p>Java class for ReadingInterharmonic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadingInterharmonic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://naesb.org/espi}Object"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numerator" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="denominator" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadingInterharmonic", propOrder = {
    "numerator",
    "denominator"
})
public class ReadingInterharmonic
    extends org.greenbuttonalliance.espi.resourceserver.web.model.usage.Object
{

    protected BigInteger numerator;
    protected java.lang.Object denominator;

    /**
     * Gets the value of the numerator property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumerator() {
        return numerator;
    }

    /**
     * Sets the value of the numerator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumerator(BigInteger value) {
        this.numerator = value;
    }

    /**
     * Gets the value of the denominator property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Object }
     *     
     */
    public java.lang.Object getDenominator() {
        return denominator;
    }

    /**
     * Sets the value of the denominator property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Object }
     *     
     */
    public void setDenominator(java.lang.Object value) {
        this.denominator = value;
    }

}
