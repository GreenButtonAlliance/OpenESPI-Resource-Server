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
 * <p>Java class for UsagePointConnectedKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UsagePointConnectedKind"&gt;
 *   &lt;restriction base="{http://naesb.org/espi}String32"&gt;
 *     &lt;enumeration value="connected"/&gt;
 *     &lt;enumeration value="logicallyDisconnected"/&gt;
 *     &lt;enumeration value="physicallyDisconnected"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UsagePointConnectedKind")
@XmlEnum
public enum UsagePointConnectedKind {


    /**
     * The usage point is connected to the network and able to receive or send the applicable commodity (electricity, gas, water, etc.).
     * 
     */
    @XmlEnumValue("connected")
    CONNECTED("connected"),

    /**
     * The usage point has been disconnected through operation of a disconnect function within the meter present at the usage point.  The usage point is unable to receive or send the applicable commodity (electricity, gas, water, etc.)  A logical disconnect can often be achieved without utilising a field crew.
     * 
     */
    @XmlEnumValue("logicallyDisconnected")
    LOGICALLY_DISCONNECTED("logicallyDisconnected"),

    /**
     * The usage point has been disconnected from the network at a point upstream of the meter. The usage point is unable to receive or send the applicable commodity (electricity, gas, water, etc.). A physical disconnect is often achieved by utilising a field crew.
     * 
     */
    @XmlEnumValue("physicallyDisconnected")
    PHYSICALLY_DISCONNECTED("physicallyDisconnected");
    private final String value;

    UsagePointConnectedKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UsagePointConnectedKind fromValue(String v) {
        for (UsagePointConnectedKind c: UsagePointConnectedKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}