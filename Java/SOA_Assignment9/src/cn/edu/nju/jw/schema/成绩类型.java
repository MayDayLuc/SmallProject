//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.30 at 02:55:55 PM CST 
//


package cn.edu.nju.jw.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for 成绩类型 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="成绩类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="学号" type="{http://jw.nju.edu.cn/schema}学号类型"/>
 *         &lt;element name="得分" type="{http://jw.nju.edu.cn/schema}得分类型"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u6210\u7ee9\u7c7b\u578b", propOrder = {
    "\u5b66\u53f7",
    "\u5f97\u5206"
})
public class 成绩类型 {

    @XmlElement(required = true)
    protected String 学号;
    protected int 得分;

    /**
     * Gets the value of the 学号 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get学号() {
        return 学号;
    }

    /**
     * Sets the value of the 学号 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set学号(String value) {
        this.学号 = value;
    }

    /**
     * Gets the value of the 得分 property.
     * 
     */
    public int get得分() {
        return 得分;
    }

    /**
     * Sets the value of the 得分 property.
     * 
     */
    public void set得分(int value) {
        this.得分 = value;
    }

}
