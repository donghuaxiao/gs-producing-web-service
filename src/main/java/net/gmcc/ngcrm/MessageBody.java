//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.07.28 时间 01:34:19 AM CST 
//


package net.gmcc.ngcrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MessageBody complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MessageBody">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MobileNo" type="{http://www.gmcc.net/ngcrm/}MobileNo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageBody", propOrder = {
    "mobileNo"
})
public class MessageBody {

    @XmlElement(name = "MobileNo", required = true)
    protected MobileNo mobileNo;

    /**
     * 获取mobileNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MobileNo }
     *     
     */
    public MobileNo getMobileNo() {
        return mobileNo;
    }

    /**
     * 设置mobileNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MobileNo }
     *     
     */
    public void setMobileNo(MobileNo value) {
        this.mobileNo = value;
    }

}
