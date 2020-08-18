//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.18 at 12:33:05 AM EDT 
//


package org.greenbuttonalliance.espi.resourceserver.web.model.usage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AnodeType"&gt;
 *   &lt;restriction base="{http://naesb.org/espi}String8"&gt;
 *     &lt;enumeration value="SYS"/&gt;
 *     &lt;enumeration value="RUC"/&gt;
 *     &lt;enumeration value="LFZ"/&gt;
 *     &lt;enumeration value="REG"/&gt;
 *     &lt;enumeration value="AGR"/&gt;
 *     &lt;enumeration value="POD"/&gt;
 *     &lt;enumeration value="ALR"/&gt;
 *     &lt;enumeration value="LTAC"/&gt;
 *     &lt;enumeration value="ACA"/&gt;
 *     &lt;enumeration value="ASR"/&gt;
 *     &lt;enumeration value="ECA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AnodeType")
@XmlEnum
public enum AnodeType {


    /**
     * System Zone/Region; 
     * 
     */
    SYS,

    /**
     * RUC Zone
     * 
     */
    RUC,

    /**
     * Load Forecast Zone
     * 
     */
    LFZ,

    /**
     * Market Energy/Ancillary Service Region; 
     * 
     */
    REG,

    /**
     * Aggregate Generation Resource; 
     * 
     */
    AGR,

    /**
     * Point of Delivery; 
     * 
     */
    POD,

    /**
     * Aggregate Load Resource; 
     * 
     */
    ALR,

    /**
     * Load TransmissionAccessCharge (TAC) Group;
     * 
     */
    LTAC,

    /**
     * Adjacent Control Area
     * 
     */
    ACA,

    /**
     * Aggregated System Resource
     * 
     */
    ASR,

    /**
     * Embedded Control Area
     * 
     */
    ECA;

    public String value() {
        return name();
    }

    public static AnodeType fromValue(String v) {
        return valueOf(v);
    }

}
