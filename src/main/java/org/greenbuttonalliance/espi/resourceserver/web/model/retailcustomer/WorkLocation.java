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


/**
 * Information about a particular location for various forms of work.
 * 
 * <p>Java class for WorkLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://naesb.org/espi/customer}Location"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkLocation")
@XmlSeeAlso({
    ServiceLocation.class
})
public class WorkLocation
    extends Location
{


}
