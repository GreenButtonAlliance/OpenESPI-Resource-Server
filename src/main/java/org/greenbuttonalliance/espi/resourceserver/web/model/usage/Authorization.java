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

import javax.xml.bind.annotation.*;


/**
 * [extension] Represents a permission granted by an owner for access to a resource.
 * 
 *                 Atom Links:
 *                 self link to this resource
 *                 rel corresponding ApplicationInformation (if this is the client access containing token instance)
 *                 rel corresponding to the authorized resource (if this is the access_token containing instance for a customer resource)
 * 
 *                 Note: for privacy there is no identifier of the RetailCustomer in this structure but an implementation will have consider how to maintain a correspondence between a RetailCustomer and his authorization.
 * 
 * <p>Java class for Authorization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Authorization"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://naesb.org/espi}IdentifiedObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authorizedPeriod" type="{http://naesb.org/espi}DateTimeInterval" minOccurs="0"/&gt;
 *         &lt;element name="publishedPeriod" type="{http://naesb.org/espi}DateTimeInterval" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://naesb.org/espi}AuthorizationStatus"/&gt;
 *         &lt;element name="expires_at" type="{http://naesb.org/espi}TimeType"/&gt;
 *         &lt;element name="grant_type" type="{http://naesb.org/espi}GrantType" minOccurs="0"/&gt;
 *         &lt;element name="scope" type="{http://naesb.org/espi}String256"/&gt;
 *         &lt;element name="token_type" type="{http://naesb.org/espi}TokenType"/&gt;
 *         &lt;element name="error" type="{http://naesb.org/espi}OAuthError" minOccurs="0"/&gt;
 *         &lt;element name="error_description" type="{http://naesb.org/espi}String256" minOccurs="0"/&gt;
 *         &lt;element name="error_uri" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="resourceURI" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="authorizationURI" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="customerResourceURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Authorization", propOrder = {
    "authorizedPeriod",
    "publishedPeriod",
    "status",
    "expiresAt",
    "grantType",
    "scope",
    "tokenType",
    "error",
    "errorDescription",
    "errorUri",
    "resourceURI",
    "authorizationURI",
    "customerResourceURI"
})
public class Authorization
    extends IdentifiedObject
{

    protected DateTimeInterval authorizedPeriod;
    protected DateTimeInterval publishedPeriod;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(name = "expires_at")
    protected long expiresAt;
    @XmlElement(name = "grant_type")
    @XmlSchemaType(name = "string")
    protected GrantType grantType;
    @XmlElement(required = true)
    protected String scope;
    @XmlElement(name = "token_type", required = true)
    @XmlSchemaType(name = "string")
    protected TokenType tokenType;
    @XmlSchemaType(name = "string")
    protected OAuthError error;
    @XmlElement(name = "error_description")
    protected String errorDescription;
    @XmlElement(name = "error_uri")
    @XmlSchemaType(name = "anyURI")
    protected String errorUri;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String resourceURI;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String authorizationURI;
    @XmlSchemaType(name = "anyURI")
    protected String customerResourceURI;

    /**
     * Gets the value of the authorizedPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeInterval }
     *     
     */
    public DateTimeInterval getAuthorizedPeriod() {
        return authorizedPeriod;
    }

    /**
     * Sets the value of the authorizedPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeInterval }
     *     
     */
    public void setAuthorizedPeriod(DateTimeInterval value) {
        this.authorizedPeriod = value;
    }

    /**
     * Gets the value of the publishedPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeInterval }
     *     
     */
    public DateTimeInterval getPublishedPeriod() {
        return publishedPeriod;
    }

    /**
     * Sets the value of the publishedPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeInterval }
     *     
     */
    public void setPublishedPeriod(DateTimeInterval value) {
        this.publishedPeriod = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the expiresAt property.
     * 
     */
    public long getExpiresAt() {
        return expiresAt;
    }

    /**
     * Sets the value of the expiresAt property.
     * 
     */
    public void setExpiresAt(long value) {
        this.expiresAt = value;
    }

    /**
     * Gets the value of the grantType property.
     * 
     * @return
     *     possible object is
     *     {@link GrantType }
     *     
     */
    public GrantType getGrantType() {
        return grantType;
    }

    /**
     * Sets the value of the grantType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrantType }
     *     
     */
    public void setGrantType(GrantType value) {
        this.grantType = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

    /**
     * Gets the value of the tokenType property.
     * 
     * @return
     *     possible object is
     *     {@link TokenType }
     *     
     */
    public TokenType getTokenType() {
        return tokenType;
    }

    /**
     * Sets the value of the tokenType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenType }
     *     
     */
    public void setTokenType(TokenType value) {
        this.tokenType = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link OAuthError }
     *     
     */
    public OAuthError getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link OAuthError }
     *     
     */
    public void setError(OAuthError value) {
        this.error = value;
    }

    /**
     * Gets the value of the errorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * Sets the value of the errorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDescription(String value) {
        this.errorDescription = value;
    }

    /**
     * Gets the value of the errorUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorUri() {
        return errorUri;
    }

    /**
     * Sets the value of the errorUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorUri(String value) {
        this.errorUri = value;
    }

    /**
     * Gets the value of the resourceURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceURI() {
        return resourceURI;
    }

    /**
     * Sets the value of the resourceURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceURI(String value) {
        this.resourceURI = value;
    }

    /**
     * Gets the value of the authorizationURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationURI() {
        return authorizationURI;
    }

    /**
     * Sets the value of the authorizationURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationURI(String value) {
        this.authorizationURI = value;
    }

    /**
     * Gets the value of the customerResourceURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerResourceURI() {
        return customerResourceURI;
    }

    /**
     * Sets the value of the customerResourceURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerResourceURI(String value) {
        this.customerResourceURI = value;
    }

}
