//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.4-10/27/2009 06:09 PM(mockbuild)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.12.23 at 06:27:19 PM PST 
//


package com.googlecode.sardine.model;

import java.util.ArrayList;
import java.util.List;
//import javax.xml.bind.annotation.XmlAccessType;
//import javax.xml.bind.annotation.XmlAccessorType;
//import javax.xml.bind.annotation.XmlAnyElement;
//import javax.xml.bind.annotation.XmlRootElement;
//import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{DAV:}creationdate" minOccurs="0"/>
 *         &lt;element ref="{DAV:}displayname" minOccurs="0"/>
 *         &lt;element ref="{DAV:}getcontentlanguage" minOccurs="0"/>
 *         &lt;element ref="{DAV:}getcontentlength" minOccurs="0"/>
 *         &lt;element ref="{DAV:}getcontenttype" minOccurs="0"/>
 *         &lt;element ref="{DAV:}getetag" minOccurs="0"/>
 *         &lt;element ref="{DAV:}getlastmodified" minOccurs="0"/>
 *         &lt;element ref="{DAV:}lockdiscovery" minOccurs="0"/>
 *         &lt;element ref="{DAV:}resourcetype" minOccurs="0"/>
 *         &lt;element ref="{DAV:}supportedlock" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "", propOrder = {
//
//})
//@XmlRootElement(name = "prop")
public class Prop {

    protected Creationdate creationdate;
    protected Displayname displayname;
    protected Getcontentlanguage getcontentlanguage;
    protected Getcontentlength getcontentlength;
    protected Getcontenttype getcontenttype;
    protected Getetag getetag;
    protected Getlastmodified getlastmodified;
    protected Lockdiscovery lockdiscovery;
    protected Resourcetype resourcetype;
    protected Supportedlock supportedlock;
//    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the creationdate property.
     * 
     * @return
     *     possible object is
     *     {@link Creationdate }
     *     
     */
    public Creationdate getCreationdate() {
        return creationdate;
    }

    /**
     * Sets the value of the creationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Creationdate }
     *     
     */
    public void setCreationdate(Creationdate value) {
        this.creationdate = value;
    }

    /**
     * Gets the value of the displayname property.
     * 
     * @return
     *     possible object is
     *     {@link Displayname }
     *     
     */
    public Displayname getDisplayname() {
        return displayname;
    }

    /**
     * Sets the value of the displayname property.
     * 
     * @param value
     *     allowed object is
     *     {@link Displayname }
     *     
     */
    public void setDisplayname(Displayname value) {
        this.displayname = value;
    }

    /**
     * Gets the value of the getcontentlanguage property.
     * 
     * @return
     *     possible object is
     *     {@link Getcontentlanguage }
     *     
     */
    public Getcontentlanguage getGetcontentlanguage() {
        return getcontentlanguage;
    }

    /**
     * Sets the value of the getcontentlanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Getcontentlanguage }
     *     
     */
    public void setGetcontentlanguage(Getcontentlanguage value) {
        this.getcontentlanguage = value;
    }

    /**
     * Gets the value of the getcontentlength property.
     * 
     * @return
     *     possible object is
     *     {@link Getcontentlength }
     *     
     */
    public Getcontentlength getGetcontentlength() {
        return getcontentlength;
    }

    /**
     * Sets the value of the getcontentlength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Getcontentlength }
     *     
     */
    public void setGetcontentlength(Getcontentlength value) {
        this.getcontentlength = value;
    }

    /**
     * Gets the value of the getcontenttype property.
     * 
     * @return
     *     possible object is
     *     {@link Getcontenttype }
     *     
     */
    public Getcontenttype getGetcontenttype() {
        return getcontenttype;
    }

    /**
     * Sets the value of the getcontenttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Getcontenttype }
     *     
     */
    public void setGetcontenttype(Getcontenttype value) {
        this.getcontenttype = value;
    }

    /**
     * Gets the value of the getetag property.
     * 
     * @return
     *     possible object is
     *     {@link Getetag }
     *     
     */
    public Getetag getGetetag() {
        return getetag;
    }

    /**
     * Sets the value of the getetag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Getetag }
     *     
     */
    public void setGetetag(Getetag value) {
        this.getetag = value;
    }

    /**
     * Gets the value of the getlastmodified property.
     * 
     * @return
     *     possible object is
     *     {@link Getlastmodified }
     *     
     */
    public Getlastmodified getGetlastmodified() {
        return getlastmodified;
    }

    /**
     * Sets the value of the getlastmodified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Getlastmodified }
     *     
     */
    public void setGetlastmodified(Getlastmodified value) {
        this.getlastmodified = value;
    }

    /**
     * Gets the value of the lockdiscovery property.
     * 
     * @return
     *     possible object is
     *     {@link Lockdiscovery }
     *     
     */
    public Lockdiscovery getLockdiscovery() {
        return lockdiscovery;
    }

    /**
     * Sets the value of the lockdiscovery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lockdiscovery }
     *     
     */
    public void setLockdiscovery(Lockdiscovery value) {
        this.lockdiscovery = value;
    }

    /**
     * Gets the value of the resourcetype property.
     * 
     * @return
     *     possible object is
     *     {@link Resourcetype }
     *     
     */
    public Resourcetype getResourcetype() {
        return resourcetype;
    }

    /**
     * Sets the value of the resourcetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resourcetype }
     *     
     */
    public void setResourcetype(Resourcetype value) {
        this.resourcetype = value;
    }

    /**
     * Gets the value of the supportedlock property.
     * 
     * @return
     *     possible object is
     *     {@link Supportedlock }
     *     
     */
    public Supportedlock getSupportedlock() {
        return supportedlock;
    }

    /**
     * Sets the value of the supportedlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Supportedlock }
     *     
     */
    public void setSupportedlock(Supportedlock value) {
        this.supportedlock = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getAny() {
        if (any == null) {
            any = new ArrayList<Element>();
        }
        return this.any;
    }

}
