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
 * [extension] Collection of all customer Energy Efficiency programs
 * 
 * <p>Java class for ProgramDateIdMappings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgramDateIdMappings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://naesb.org/espi/customer}IdentifiedObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="programDateIdMapping" type="{http://naesb.org/espi/customer}ProgramDateIdMapping" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgramDateIdMappings", propOrder = {
    "programDateIdMapping"
})
public class ProgramDateIdMappings
    extends IdentifiedObject
{

    protected ProgramDateIdMapping programDateIdMapping;

    /**
     * Gets the value of the programDateIdMapping property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramDateIdMapping }
     *     
     */
    public ProgramDateIdMapping getProgramDateIdMapping() {
        return programDateIdMapping;
    }

    /**
     * Sets the value of the programDateIdMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramDateIdMapping }
     *     
     */
    public void setProgramDateIdMapping(ProgramDateIdMapping value) {
        this.programDateIdMapping = value;
    }

}
