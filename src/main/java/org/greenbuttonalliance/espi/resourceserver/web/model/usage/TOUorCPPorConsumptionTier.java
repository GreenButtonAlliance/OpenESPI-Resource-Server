//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.18 at 12:33:05 AM EDT 
//


package org.greenbuttonalliance.espi.resourceserver.web.model.usage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tOUorCPPorConsumptionTier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tOUorCPPorConsumptionTier"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="tou"/&gt;
 *     &lt;enumeration value="cpp"/&gt;
 *     &lt;enumeration value="consumptiontier"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tOUorCPPorConsumptionTier")
@XmlEnum
public enum TOUorCPPorConsumptionTier {


    /**
     * Time of Use
     * 
     */
    @XmlEnumValue("tou")
    TOU("tou"),

    /**
     * Consumption Peak Period
     * 
     */
    @XmlEnumValue("cpp")
    CPP("cpp"),

    /**
     * Consumption Tier
     * 
     */
    @XmlEnumValue("consumptiontier")
    CONSUMPTIONTIER("consumptiontier");
    private final String value;

    TOUorCPPorConsumptionTier(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TOUorCPPorConsumptionTier fromValue(String v) {
        for (TOUorCPPorConsumptionTier c: TOUorCPPorConsumptionTier.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}