//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.01 at 03:27:18 PM EET 
//


package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for PERS_FNType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PERS_FNType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="_id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="guid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="guidfn" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="minfn" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="sk" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="edit" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PERS_FNType", propOrder = {
    "value"
})
public class PERSFNType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "_id")
    protected String id;
    @XmlAttribute(name = "guid")
    protected String guid;
    @XmlAttribute(name = "code")
    protected String code;
    @XmlAttribute(name = "guidfn")
    protected String guidfn;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "minfn")
    protected String minfn;
    @XmlAttribute(name = "sk")
    protected String sk;
    @XmlAttribute(name = "edit")
    protected String edit;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the guidfn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuidfn() {
        return guidfn;
    }

    /**
     * Sets the value of the guidfn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuidfn(String value) {
        this.guidfn = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the minfn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinfn() {
        return minfn;
    }

    /**
     * Sets the value of the minfn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinfn(String value) {
        this.minfn = value;
    }

    /**
     * Gets the value of the sk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSk() {
        return sk;
    }

    /**
     * Sets the value of the sk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSk(String value) {
        this.sk = value;
    }

    /**
     * Gets the value of the edit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdit() {
        return edit;
    }

    /**
     * Sets the value of the edit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdit(String value) {
        this.edit = value;
    }

}
