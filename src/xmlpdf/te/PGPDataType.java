//
// \u6b64\u6587\u4ef6\u662f\u7531 JavaTM Architecture for XML Binding (JAXB) \u5f15\u7528\u5b9e\u73b0 v2.2.8-b130911.1802 \u751f\u6210\u7684
// \u8bf7\u8bbf\u95ee <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// \u5728\u91cd\u65b0\u7f16\u8bd1\u6e90\u6a21\u5f0f\u65f6, \u5bf9\u6b64\u6587\u4ef6\u7684\u6240\u6709\u4fee\u6539\u90fd\u5c06\u4e22\u5931\u3002
// \u751f\u6210\u65f6\u95f4: 2019.04.22 \u65f6\u95f4 12:59:07 AM CST 
//


package xmlpdf.te;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>PGPDataType complex type\u7684 Java \u7c7b\u3002
 * 
 * <p>\u4ee5\u4e0b\u6a21\u5f0f\u7247\u6bb5\u6307\u5b9a\u5305\u542b\u5728\u6b64\u7c7b\u4e2d\u7684\u9884\u671f\u5185\u5bb9\u3002
 * 
 * <pre>
 * &lt;complexType name="PGPDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="PGPKeyID" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *           &lt;element name="PGPKeyPacket" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *           &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="PGPKeyPacket" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *           &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PGPDataType", propOrder = {
    "content"
})
public class PGPDataType {

    @XmlElementRefs({
        @XmlElementRef(name = "PGPKeyPacket", namespace = "http://www.w3.org/2000/09/xmldsig#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PGPKeyID", namespace = "http://www.w3.org/2000/09/xmldsig#", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> content;

    /**
     * \u83b7\u53d6\u5185\u5bb9\u6a21\u578b\u7684\u5176\u4f59\u90e8\u5206\u3002
     * 
     * <p>
     * \u7531\u4e8e\u4ee5\u4e0b\u539f\u56e0, \u60a8\u83b7\u53d6\u7684\u662f\u6b64 "catch-all" \u5c5e\u6027: 
     * \u5b57\u6bb5\u540d\u79f0 "PGPKeyPacket" \u7531\u6a21\u5f0f\u7684\u4e24\u4e2a\u4e0d\u540c\u90e8\u5206\u4f7f\u7528\u3002\u8bf7\u53c2\u9605: 
     * http://www.w3.org/TR/2008/REC-xmldsig-core-20080610/xmldsig-core-schema.xsd\u7684\u7b2c 218 \u884c
     * http://www.w3.org/TR/2008/REC-xmldsig-core-20080610/xmldsig-core-schema.xsd\u7684\u7b2c 213 \u884c
     * <p>
     * \u8981\u6e05\u9664\u6b64\u5c5e\u6027, \u8bf7\u5c06\u5c5e\u6027\u5b9a\u5236\u8bbe\u7f6e\u5e94\u7528\u4e8e\u4ee5\u4e0b\u4e24\u4e2a\u58f0\u660e
     * \u6216\u5176\u4e2d\u4e00\u4e2a\u4ee5\u66f4\u6539\u5176\u540d\u79f0: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * {@link Element }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

}
