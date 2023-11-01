//
// \u6b64\u6587\u4ef6\u662f\u7531 JavaTM Architecture for XML Binding (JAXB) \u5f15\u7528\u5b9e\u73b0 v2.2.8-b130911.1802 \u751f\u6210\u7684
// \u8bf7\u8bbf\u95ee <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// \u5728\u91cd\u65b0\u7f16\u8bd1\u6e90\u6a21\u5f0f\u65f6, \u5bf9\u6b64\u6587\u4ef6\u7684\u6240\u6709\u4fee\u6539\u90fd\u5c06\u4e22\u5931\u3002
// \u751f\u6210\u65f6\u95f4: 2019.04.22 \u65f6\u95f4 01:00:11 AM CST 
//


package xmlpdf.nc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>ReceptorType complex type\u7684 Java \u7c7b\u3002
 * 
 * <p>\u4ee5\u4e0b\u6a21\u5f0f\u7247\u6bb5\u6307\u5b9a\u5305\u542b\u5728\u6b64\u7c7b\u4e2d\u7684\u9884\u671f\u5185\u5bb9\u3002
 * 
 * <pre>
 * &lt;complexType name="ReceptorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Nombre">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Identificacion" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}IdentificacionType" minOccurs="0"/>
 *         &lt;element name="IdentificacionExtranjero" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NombreComercial" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Ubicacion" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}UbicacionType" minOccurs="0"/>
 *         &lt;element name="OtrasSenasExtranjero" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="300"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Telefono" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}TelefonoType" minOccurs="0"/>
 *         &lt;element name="Fax" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}TelefonoType" minOccurs="0"/>
 *         &lt;element name="CorreoElectronico" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="160"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceptorType", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", propOrder = {
    "nombre",
    "identificacion",
    "identificacionExtranjero",
    "nombreComercial",
    "ubicacion",
    "otrasSenasExtranjero",
    "telefono",
    "fax",
    "correoElectronico"
})
public class ReceptorType {

    @XmlElement(name = "Nombre", required = true)
    protected String nombre;
    @XmlElement(name = "Identificacion")
    protected IdentificacionType identificacion;
    @XmlElement(name = "IdentificacionExtranjero")
    protected String identificacionExtranjero;
    @XmlElement(name = "NombreComercial")
    protected String nombreComercial;
    @XmlElement(name = "Ubicacion")
    protected UbicacionType ubicacion;
    @XmlElement(name = "OtrasSenasExtranjero")
    protected String otrasSenasExtranjero;
    @XmlElement(name = "Telefono")
    protected TelefonoType telefono;
    @XmlElement(name = "Fax")
    protected TelefonoType fax;
    @XmlElement(name = "CorreoElectronico")
    protected String correoElectronico;

    /**
     * \u83b7\u53d6nombre\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * \u8bbe\u7f6enombre\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * \u83b7\u53d6identificacion\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link IdentificacionType }
     *     
     */
    public IdentificacionType getIdentificacion() {
        return identificacion;
    }

    /**
     * \u8bbe\u7f6eidentificacion\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificacionType }
     *     
     */
    public void setIdentificacion(IdentificacionType value) {
        this.identificacion = value;
    }

    /**
     * \u83b7\u53d6identificacionExtranjero\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacionExtranjero() {
        return identificacionExtranjero;
    }

    /**
     * \u8bbe\u7f6eidentificacionExtranjero\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacionExtranjero(String value) {
        this.identificacionExtranjero = value;
    }

    /**
     * \u83b7\u53d6nombreComercial\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreComercial() {
        return nombreComercial;
    }

    /**
     * \u8bbe\u7f6enombreComercial\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreComercial(String value) {
        this.nombreComercial = value;
    }

    /**
     * \u83b7\u53d6ubicacion\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link UbicacionType }
     *     
     */
    public UbicacionType getUbicacion() {
        return ubicacion;
    }

    /**
     * \u8bbe\u7f6eubicacion\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link UbicacionType }
     *     
     */
    public void setUbicacion(UbicacionType value) {
        this.ubicacion = value;
    }

    /**
     * \u83b7\u53d6otrasSenasExtranjero\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtrasSenasExtranjero() {
        return otrasSenasExtranjero;
    }

    /**
     * \u8bbe\u7f6eotrasSenasExtranjero\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtrasSenasExtranjero(String value) {
        this.otrasSenasExtranjero = value;
    }

    /**
     * \u83b7\u53d6telefono\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link TelefonoType }
     *     
     */
    public TelefonoType getTelefono() {
        return telefono;
    }

    /**
     * \u8bbe\u7f6etelefono\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link TelefonoType }
     *     
     */
    public void setTelefono(TelefonoType value) {
        this.telefono = value;
    }

    /**
     * \u83b7\u53d6fax\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link TelefonoType }
     *     
     */
    public TelefonoType getFax() {
        return fax;
    }

    /**
     * \u8bbe\u7f6efax\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link TelefonoType }
     *     
     */
    public void setFax(TelefonoType value) {
        this.fax = value;
    }

    /**
     * \u83b7\u53d6correoElectronico\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * \u8bbe\u7f6ecorreoElectronico\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreoElectronico(String value) {
        this.correoElectronico = value;
    }

}
