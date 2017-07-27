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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageBody" type="{http://www.gmcc.net/ngcrm/}MessageBody"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "messageBody"
})
@XmlRootElement(name = "MessageRequest")
public class MessageRequest {

    @XmlElement(name = "MessageBody", required = true)
    protected MessageBody messageBody;

    /**
     * 获取messageBody属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MessageBody }
     *     
     */
    public MessageBody getMessageBody() {
        return messageBody;
    }

    /**
     * 设置messageBody属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MessageBody }
     *     
     */
    public void setMessageBody(MessageBody value) {
        this.messageBody = value;
    }

}
