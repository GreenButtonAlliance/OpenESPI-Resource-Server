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

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 
 *                 The Atom feed construct is defined in section 4.1.1 of the format spec.
 *             
 * 
 * <p>Java class for feedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="feedType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="3"&gt;
 *         &lt;element name="author" type="{http://www.w3.org/2005/Atom}personType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="category" type="{http://www.w3.org/2005/Atom}categoryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contributor" type="{http://www.w3.org/2005/Atom}personType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="generator" type="{http://www.w3.org/2005/Atom}generatorType" minOccurs="0"/&gt;
 *         &lt;element name="icon" type="{http://www.w3.org/2005/Atom}iconType" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2005/Atom}idType"/&gt;
 *         &lt;element name="link" type="{http://www.w3.org/2005/Atom}linkType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="logo" type="{http://www.w3.org/2005/Atom}logoType" minOccurs="0"/&gt;
 *         &lt;element name="rights" type="{http://www.w3.org/2005/Atom}textType" minOccurs="0"/&gt;
 *         &lt;element name="subtitle" type="{http://www.w3.org/2005/Atom}textType" minOccurs="0"/&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2005/Atom}textType"/&gt;
 *         &lt;element name="updated" type="{http://www.w3.org/2005/Atom}dateTimeType"/&gt;
 *         &lt;element name="entry" type="{http://www.w3.org/2005/Atom}entryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{http://www.w3.org/2005/Atom}commonAttributes"/&gt;
 *       &lt;anyAttribute namespace='##other'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "feedType", namespace = "http://www.w3.org/2005/Atom", propOrder = {
    "authorOrCategoryOrContributor"
})
public class FeedType {

    @XmlElementRefs({
        @XmlElementRef(name = "author", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "category", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "contributor", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "generator", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "icon", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "id", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "link", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "logo", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rights", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "subtitle", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "title", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "updated", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "entry", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> authorOrCategoryOrContributor;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anyURI")
    protected String base;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String lang;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Gets the value of the authorOrCategoryOrContributor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorOrCategoryOrContributor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorOrCategoryOrContributor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link PersonType }{@code >}
     * {@link JAXBElement }{@code <}{@link CategoryType }{@code >}
     * {@link JAXBElement }{@code <}{@link PersonType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeneratorType }{@code >}
     * {@link JAXBElement }{@code <}{@link IconType }{@code >}
     * {@link JAXBElement }{@code <}{@link IdType }{@code >}
     * {@link JAXBElement }{@code <}{@link LinkType }{@code >}
     * {@link JAXBElement }{@code <}{@link LogoType }{@code >}
     * {@link JAXBElement }{@code <}{@link TextType }{@code >}
     * {@link JAXBElement }{@code <}{@link TextType }{@code >}
     * {@link JAXBElement }{@code <}{@link TextType }{@code >}
     * {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntryType }{@code >}
     * {@link java.lang.Object }
     * 
     * 
     */
    public List<java.lang.Object> getAuthorOrCategoryOrContributor() {
        if (authorOrCategoryOrContributor == null) {
            authorOrCategoryOrContributor = new ArrayList<>();
        }
        return this.authorOrCategoryOrContributor;
    }

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase(String value) {
        this.base = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
