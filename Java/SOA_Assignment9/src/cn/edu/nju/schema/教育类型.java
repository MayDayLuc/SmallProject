//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.30 at 02:55:55 PM CST 
//


package cn.edu.nju.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for 教育类型.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="教育类型">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="专科"/>
 *     &lt;enumeration value="本科"/>
 *     &lt;enumeration value="硕士"/>
 *     &lt;enumeration value="博士"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "\u6559\u80b2\u7c7b\u578b")
@XmlEnum
public enum 教育类型 {

    专科,
    本科,
    硕士,
    博士;

    public String value() {
        return name();
    }

    public static 教育类型 fromValue(String v) {
        return valueOf(v);
    }

}
