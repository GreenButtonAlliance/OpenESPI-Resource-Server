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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Electronic address information.
 * 
 * <p>Java class for ElectronicAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectronicAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://naesb.org/espi/customer}Object"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lan" type="{http://naesb.org/espi/customer}String256" minOccurs="0"/&gt;
 *         &lt;element name="mac" type="{http://naesb.org/espi/customer}String256" minOccurs="0"/&gt;
 *         &lt;element name="email1" type="{http://naesb.org/espi/customer}String256" minOccurs="0"/&gt;
 *         &lt;element name="email2" type="{http://naesb.org/espi/customer}String256" minOccurs="0"/&gt;
 *         &lt;element name="web" type="{http://naesb.org/espi/customer}String256" minOccurs="0"/&gt;
 *         &lt;element name="radio" type="{http://naesb.org/espi/customer}String256" minOccurs="0"/&gt;
 *         &lt;element name="userID" type="{http://naesb.org/espi/customer}String256" minOccurs="0"/&gt;
 *         &lt;element name="password" type="{http://naesb.org/espi/customer}String256" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectronicAddress", propOrder = {
    "lan",
    "mac",
    "email1",
    "email2",
    "web",
    "radio",
    "userID",
    "password"
})
public class ElectronicAddress
    extends Object
{

    protected String lan;
    protected String mac;
    protected String email1;
    protected String email2;
    protected String web;
    protected String radio;
    protected String userID;
    protected String password;

    /**
     * Gets the value of the lan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLan() {
        return lan;
    }

    /**
     * Sets the value of the lan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLan(String value) {
        this.lan = value;
    }

    /**
     * Gets the value of the mac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMac() {
        return mac;
    }

    /**
     * Sets the value of the mac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMac(String value) {
        this.mac = value;
    }

    /**
     * Gets the value of the email1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail1() {
        return email1;
    }

    /**
     * Sets the value of the email1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail1(String value) {
        this.email1 = value;
    }

    /**
     * Gets the value of the email2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail2() {
        return email2;
    }

    /**
     * Sets the value of the email2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail2(String value) {
        this.email2 = value;
    }

    /**
     * Gets the value of the web property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeb() {
        return web;
    }

    /**
     * Sets the value of the web property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeb(String value) {
        this.web = value;
    }

    /**
     * Gets the value of the radio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadio() {
        return radio;
    }

    /**
     * Sets the value of the radio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadio(String value) {
        this.radio = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

}
