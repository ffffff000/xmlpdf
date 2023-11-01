//
// \u6b64\u6587\u4ef6\u662f\u7531 JavaTM Architecture for XML Binding (JAXB) \u5f15\u7528\u5b9e\u73b0 v2.2.8-b130911.1802 \u751f\u6210\u7684
// \u8bf7\u8bbf\u95ee <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// \u5728\u91cd\u65b0\u7f16\u8bd1\u6e90\u6a21\u5f0f\u65f6, \u5bf9\u6b64\u6587\u4ef6\u7684\u6240\u6709\u4fee\u6539\u90fd\u5c06\u4e22\u5931\u3002
// \u751f\u6210\u65f6\u95f4: 2019.04.22 \u65f6\u95f4 01:00:11 AM CST 
//


package xmlpdf.nc;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.w3c.dom.Element;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>anonymous complex type\u7684 Java \u7c7b\u3002
 * 
 * <p>\u4ee5\u4e0b\u6a21\u5f0f\u7247\u6bb5\u6307\u5b9a\u5305\u542b\u5728\u6b64\u7c7b\u4e2d\u7684\u9884\u671f\u5185\u5bb9\u3002
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Clave" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}ClaveType"/>
 *         &lt;element name="CodigoActividad">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *               &lt;minLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NumeroConsecutivo" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}NumeroConsecutivoType"/>
 *         &lt;element name="FechaEmision" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Emisor" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}EmisorType"/>
 *         &lt;element name="Receptor" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}ReceptorType" minOccurs="0"/>
 *         &lt;element name="CondicionVenta">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="01"/>
 *               &lt;enumeration value="02"/>
 *               &lt;enumeration value="03"/>
 *               &lt;enumeration value="04"/>
 *               &lt;enumeration value="05"/>
 *               &lt;enumeration value="06"/>
 *               &lt;enumeration value="07"/>
 *               &lt;enumeration value="08"/>
 *               &lt;enumeration value="09"/>
 *               &lt;enumeration value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PlazoCredito" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MedioPago" maxOccurs="4">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="01"/>
 *               &lt;enumeration value="02"/>
 *               &lt;enumeration value="03"/>
 *               &lt;enumeration value="04"/>
 *               &lt;enumeration value="05"/>
 *               &lt;enumeration value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DetalleServicio" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LineaDetalle" maxOccurs="1000">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="NumeroLinea" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                             &lt;element name="PartidaArancelaria" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="15"/>
 *                                   &lt;minLength value="15"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Codigo" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="13"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CodigoComercial" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}CodigoType" maxOccurs="5" minOccurs="0"/>
 *                             &lt;element name="Cantidad">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;totalDigits value="16"/>
 *                                   &lt;fractionDigits value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="UnidadMedida" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}UnidadMedidaType"/>
 *                             &lt;element name="UnidadMedidaComercial" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Detalle" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="200"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="PrecioUnitario" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/>
 *                             &lt;element name="MontoTotal" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/>
 *                             &lt;element name="Descuento" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DescuentoType" maxOccurs="5" minOccurs="0"/>
 *                             &lt;element name="SubTotal" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/>
 *                             &lt;element name="BaseImponible" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/>
 *                             &lt;element name="Impuesto" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}ImpuestoType" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="ImpuestoNeto" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/>
 *                             &lt;element name="MontoTotalLinea" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OtrosCargos" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}OtrosCargosType" maxOccurs="15" minOccurs="0"/>
 *         &lt;element name="ResumenFactura">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CodigoTipoMoneda" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}CodigoMonedaType" minOccurs="0"/>
 *                   &lt;element name="TotalServGravados" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/>
 *                   &lt;element name="TotalServExentos" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/>
 *                   &lt;element name="TotalServExonerado" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/>
 *                   &lt;element name="TotalMercanciasGravadas" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/>
 *                   &lt;element name="TotalMercanciasExentas" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/>
 *                   &lt;element name="TotalMercExonerada" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/>
 *                   &lt;element name="TotalGravado" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/>
 *                   &lt;element name="TotalExento" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/>
 *                   &lt;element name="TotalExonerado" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/>
 *                   &lt;element name="TotalVenta" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/>
 *                   &lt;element name="TotalDescuentos" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/>
 *                   &lt;element name="TotalVentaNeta" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/>
 *                   &lt;element name="TotalImpuesto" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/>
 *                   &lt;element name="TotalIVADevuelto" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/>
 *                   &lt;element name="TotalOtrosCargos" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/>
 *                   &lt;element name="TotalComprobante" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="InformacionReferencia" maxOccurs="10" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TipoDoc">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="01"/>
 *                         &lt;enumeration value="02"/>
 *                         &lt;enumeration value="03"/>
 *                         &lt;enumeration value="04"/>
 *                         &lt;enumeration value="05"/>
 *                         &lt;enumeration value="06"/>
 *                         &lt;enumeration value="07"/>
 *                         &lt;enumeration value="08"/>
 *                         &lt;enumeration value="09"/>
 *                         &lt;enumeration value="10"/>
 *                         &lt;enumeration value="11"/>
 *                         &lt;enumeration value="12"/>
 *                         &lt;enumeration value="99"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Numero">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="FechaEmision" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="Codigo">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="01"/>
 *                         &lt;enumeration value="02"/>
 *                         &lt;enumeration value="03"/>
 *                         &lt;enumeration value="04"/>
 *                         &lt;enumeration value="05"/>
 *                         &lt;enumeration value="99"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Razon">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="180"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Normativa">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NumeroResolucion">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="13"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="FechaResolucion">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Otros" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OtroTexto" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="OtroContenido" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;any processContents='lax' namespace='##other'/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
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
    "clave",
    "codigoActividad",
    "numeroConsecutivo",
    "fechaEmision",
    "emisor",
    "receptor",
    "condicionVenta",
    "plazoCredito",
    "medioPago",
    "detalleServicio",
    "otrosCargos",
    "resumenFactura",
    "informacionReferencia",
    "normativa",
    "otros",
    "signature"
})
@XmlRootElement(name = "NotaCreditoElectronica", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
public class NotaCreditoElectronica {

    @XmlElement(name = "Clave", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
    protected String clave;
    @XmlElement(name = "CodigoActividad", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
    protected String codigoActividad;
    @XmlElement(name = "NumeroConsecutivo", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
    protected String numeroConsecutivo;
    @XmlElement(name = "FechaEmision", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEmision;
    @XmlElement(name = "Emisor", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
    protected EmisorType emisor;
    @XmlElement(name = "Receptor", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
    protected ReceptorType receptor;
    @XmlElement(name = "CondicionVenta", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
    protected String condicionVenta;
    @XmlElement(name = "PlazoCredito", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
    protected String plazoCredito;
    @XmlElement(name = "MedioPago", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
    protected List<String> medioPago;
    @XmlElement(name = "DetalleServicio", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
    protected NotaCreditoElectronica.DetalleServicio detalleServicio;
    @XmlElement(name = "OtrosCargos", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
    protected List<OtrosCargosType> otrosCargos;
    @XmlElement(name = "ResumenFactura", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
    protected NotaCreditoElectronica.ResumenFactura resumenFactura;
    @XmlElement(name = "InformacionReferencia", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
    protected List<NotaCreditoElectronica.InformacionReferencia> informacionReferencia;
    @XmlElement(name = "Normativa", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
    protected NotaCreditoElectronica.Normativa normativa;
    @XmlElement(name = "Otros", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
    protected NotaCreditoElectronica.Otros otros;
    @XmlElement(name = "Signature", required = true)
    protected SignatureType signature;

    /**
     * \u83b7\u53d6clave\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClave() {
        return clave;
    }

    /**
     * \u8bbe\u7f6eclave\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClave(String value) {
        this.clave = value;
    }

    /**
     * \u83b7\u53d6codigoActividad\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoActividad() {
        return codigoActividad;
    }

    /**
     * \u8bbe\u7f6ecodigoActividad\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoActividad(String value) {
        this.codigoActividad = value;
    }

    /**
     * \u83b7\u53d6numeroConsecutivo\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroConsecutivo() {
        return numeroConsecutivo;
    }

    /**
     * \u8bbe\u7f6enumeroConsecutivo\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroConsecutivo(String value) {
        this.numeroConsecutivo = value;
    }

    /**
     * \u83b7\u53d6fechaEmision\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEmision() {
        return fechaEmision;
    }

    /**
     * \u8bbe\u7f6efechaEmision\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEmision(XMLGregorianCalendar value) {
        this.fechaEmision = value;
    }

    /**
     * \u83b7\u53d6emisor\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link EmisorType }
     *     
     */
    public EmisorType getEmisor() {
        return emisor;
    }

    /**
     * \u8bbe\u7f6eemisor\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link EmisorType }
     *     
     */
    public void setEmisor(EmisorType value) {
        this.emisor = value;
    }

    /**
     * \u83b7\u53d6receptor\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link ReceptorType }
     *     
     */
    public ReceptorType getReceptor() {
        return receptor;
    }

    /**
     * \u8bbe\u7f6ereceptor\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link ReceptorType }
     *     
     */
    public void setReceptor(ReceptorType value) {
        this.receptor = value;
    }

    /**
     * \u83b7\u53d6condicionVenta\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondicionVenta() {
        return condicionVenta;
    }

    /**
     * \u8bbe\u7f6econdicionVenta\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondicionVenta(String value) {
        this.condicionVenta = value;
    }

    /**
     * \u83b7\u53d6plazoCredito\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlazoCredito() {
        return plazoCredito;
    }

    /**
     * \u8bbe\u7f6eplazoCredito\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlazoCredito(String value) {
        this.plazoCredito = value;
    }

    /**
     * Gets the value of the medioPago property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the medioPago property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedioPago().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMedioPago() {
        if (medioPago == null) {
            medioPago = new ArrayList<String>();
        }
        return this.medioPago;
    }

    /**
     * \u83b7\u53d6detalleServicio\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link NotaCreditoElectronica.DetalleServicio }
     *     
     */
    public NotaCreditoElectronica.DetalleServicio getDetalleServicio() {
        return detalleServicio;
    }

    /**
     * \u8bbe\u7f6edetalleServicio\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link NotaCreditoElectronica.DetalleServicio }
     *     
     */
    public void setDetalleServicio(NotaCreditoElectronica.DetalleServicio value) {
        this.detalleServicio = value;
    }

    /**
     * Gets the value of the otrosCargos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otrosCargos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtrosCargos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtrosCargosType }
     * 
     * 
     */
    public List<OtrosCargosType> getOtrosCargos() {
        if (otrosCargos == null) {
            otrosCargos = new ArrayList<OtrosCargosType>();
        }
        return this.otrosCargos;
    }

    /**
     * \u83b7\u53d6resumenFactura\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link NotaCreditoElectronica.ResumenFactura }
     *     
     */
    public NotaCreditoElectronica.ResumenFactura getResumenFactura() {
        return resumenFactura;
    }

    /**
     * \u8bbe\u7f6eresumenFactura\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link NotaCreditoElectronica.ResumenFactura }
     *     
     */
    public void setResumenFactura(NotaCreditoElectronica.ResumenFactura value) {
        this.resumenFactura = value;
    }

    /**
     * Gets the value of the informacionReferencia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informacionReferencia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformacionReferencia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotaCreditoElectronica.InformacionReferencia }
     * 
     * 
     */
    public List<NotaCreditoElectronica.InformacionReferencia> getInformacionReferencia() {
        if (informacionReferencia == null) {
            informacionReferencia = new ArrayList<NotaCreditoElectronica.InformacionReferencia>();
        }
        return this.informacionReferencia;
    }

    /**
     * \u83b7\u53d6normativa\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link NotaCreditoElectronica.Normativa }
     *     
     */
    public NotaCreditoElectronica.Normativa getNormativa() {
        return normativa;
    }

    /**
     * \u8bbe\u7f6enormativa\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link NotaCreditoElectronica.Normativa }
     *     
     */
    public void setNormativa(NotaCreditoElectronica.Normativa value) {
        this.normativa = value;
    }

    /**
     * \u83b7\u53d6otros\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link NotaCreditoElectronica.Otros }
     *     
     */
    public NotaCreditoElectronica.Otros getOtros() {
        return otros;
    }

    /**
     * \u8bbe\u7f6eotros\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link NotaCreditoElectronica.Otros }
     *     
     */
    public void setOtros(NotaCreditoElectronica.Otros value) {
        this.otros = value;
    }

    /**
     * \u83b7\u53d6signature\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * \u8bbe\u7f6esignature\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }


    /**
     * <p>anonymous complex type\u7684 Java \u7c7b\u3002
     * 
     * <p>\u4ee5\u4e0b\u6a21\u5f0f\u7247\u6bb5\u6307\u5b9a\u5305\u542b\u5728\u6b64\u7c7b\u4e2d\u7684\u9884\u671f\u5185\u5bb9\u3002
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="LineaDetalle" maxOccurs="1000">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="NumeroLinea" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *                   &lt;element name="PartidaArancelaria" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="15"/>
     *                         &lt;minLength value="15"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Codigo" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="13"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CodigoComercial" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}CodigoType" maxOccurs="5" minOccurs="0"/>
     *                   &lt;element name="Cantidad">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         &lt;totalDigits value="16"/>
     *                         &lt;fractionDigits value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="UnidadMedida" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}UnidadMedidaType"/>
     *                   &lt;element name="UnidadMedidaComercial" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Detalle" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="200"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="PrecioUnitario" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/>
     *                   &lt;element name="MontoTotal" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/>
     *                   &lt;element name="Descuento" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DescuentoType" maxOccurs="5" minOccurs="0"/>
     *                   &lt;element name="SubTotal" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/>
     *                   &lt;element name="BaseImponible" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/>
     *                   &lt;element name="Impuesto" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}ImpuestoType" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="ImpuestoNeto" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/>
     *                   &lt;element name="MontoTotalLinea" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
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
    @XmlType(name = "", propOrder = {
        "lineaDetalle"
    })
    public static class DetalleServicio {

        @XmlElement(name = "LineaDetalle", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
        protected List<NotaCreditoElectronica.DetalleServicio.LineaDetalle> lineaDetalle;

        /**
         * Gets the value of the lineaDetalle property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lineaDetalle property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLineaDetalle().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NotaCreditoElectronica.DetalleServicio.LineaDetalle }
         * 
         * 
         */
        public List<NotaCreditoElectronica.DetalleServicio.LineaDetalle> getLineaDetalle() {
            if (lineaDetalle == null) {
                lineaDetalle = new ArrayList<NotaCreditoElectronica.DetalleServicio.LineaDetalle>();
            }
            return this.lineaDetalle;
        }


        /**
         * <p>anonymous complex type\u7684 Java \u7c7b\u3002
         * 
         * <p>\u4ee5\u4e0b\u6a21\u5f0f\u7247\u6bb5\u6307\u5b9a\u5305\u542b\u5728\u6b64\u7c7b\u4e2d\u7684\u9884\u671f\u5185\u5bb9\u3002
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="NumeroLinea" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
         *         &lt;element name="PartidaArancelaria" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="15"/>
         *               &lt;minLength value="15"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Codigo" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="13"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CodigoComercial" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}CodigoType" maxOccurs="5" minOccurs="0"/>
         *         &lt;element name="Cantidad">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               &lt;totalDigits value="16"/>
         *               &lt;fractionDigits value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="UnidadMedida" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}UnidadMedidaType"/>
         *         &lt;element name="UnidadMedidaComercial" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="20"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Detalle" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="200"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="PrecioUnitario" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/>
         *         &lt;element name="MontoTotal" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/>
         *         &lt;element name="Descuento" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DescuentoType" maxOccurs="5" minOccurs="0"/>
         *         &lt;element name="SubTotal" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/>
         *         &lt;element name="BaseImponible" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/>
         *         &lt;element name="Impuesto" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}ImpuestoType" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="ImpuestoNeto" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/>
         *         &lt;element name="MontoTotalLinea" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/>
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
            "numeroLinea",
            "partidaArancelaria",
            "codigo",
            "codigoComercial",
            "cantidad",
            "unidadMedida",
            "unidadMedidaComercial",
            "detalle",
            "precioUnitario",
            "montoTotal",
            "descuento",
            "subTotal",
            "baseImponible",
            "impuesto",
            "impuestoNeto",
            "montoTotalLinea"
        })
        public static class LineaDetalle {

            @XmlElement(name = "NumeroLinea", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger numeroLinea;
            @XmlElement(name = "PartidaArancelaria", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
            protected String partidaArancelaria;
            @XmlElement(name = "Codigo", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
            protected String codigo;
            @XmlElement(name = "CodigoComercial", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
            protected List<CodigoType> codigoComercial;
            @XmlElement(name = "Cantidad", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
            protected BigDecimal cantidad;
            @XmlElement(name = "UnidadMedida", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
            protected String unidadMedida;
            @XmlElement(name = "UnidadMedidaComercial", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
            protected String unidadMedidaComercial;
            @XmlElement(name = "Detalle", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
            protected String detalle;
            @XmlElement(name = "PrecioUnitario", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
            protected BigDecimal precioUnitario;
            @XmlElement(name = "MontoTotal", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
            protected BigDecimal montoTotal;
            @XmlElement(name = "Descuento", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
            protected List<DescuentoType> descuento;
            @XmlElement(name = "SubTotal", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
            protected BigDecimal subTotal;
            @XmlElement(name = "BaseImponible", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
            protected BigDecimal baseImponible;
            @XmlElement(name = "Impuesto", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
            protected List<ImpuestoType> impuesto;
            @XmlElement(name = "ImpuestoNeto", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
            protected BigDecimal impuestoNeto;
            @XmlElement(name = "MontoTotalLinea", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
            protected BigDecimal montoTotalLinea;

            /**
             * \u83b7\u53d6numeroLinea\u5c5e\u6027\u7684\u503c\u3002
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNumeroLinea() {
                return numeroLinea;
            }

            /**
             * \u8bbe\u7f6enumeroLinea\u5c5e\u6027\u7684\u503c\u3002
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNumeroLinea(BigInteger value) {
                this.numeroLinea = value;
            }

            /**
             * \u83b7\u53d6partidaArancelaria\u5c5e\u6027\u7684\u503c\u3002
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPartidaArancelaria() {
                return partidaArancelaria;
            }

            /**
             * \u8bbe\u7f6epartidaArancelaria\u5c5e\u6027\u7684\u503c\u3002
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPartidaArancelaria(String value) {
                this.partidaArancelaria = value;
            }

            /**
             * \u83b7\u53d6codigo\u5c5e\u6027\u7684\u503c\u3002
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodigo() {
                return codigo;
            }

            /**
             * \u8bbe\u7f6ecodigo\u5c5e\u6027\u7684\u503c\u3002
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodigo(String value) {
                this.codigo = value;
            }

            /**
             * Gets the value of the codigoComercial property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the codigoComercial property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCodigoComercial().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CodigoType }
             * 
             * 
             */
            public List<CodigoType> getCodigoComercial() {
                if (codigoComercial == null) {
                    codigoComercial = new ArrayList<CodigoType>();
                }
                return this.codigoComercial;
            }

            /**
             * \u83b7\u53d6cantidad\u5c5e\u6027\u7684\u503c\u3002
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCantidad() {
                return cantidad;
            }

            /**
             * \u8bbe\u7f6ecantidad\u5c5e\u6027\u7684\u503c\u3002
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCantidad(BigDecimal value) {
                this.cantidad = value;
            }

            /**
             * \u83b7\u53d6unidadMedida\u5c5e\u6027\u7684\u503c\u3002
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnidadMedida() {
                return unidadMedida;
            }

            /**
             * \u8bbe\u7f6eunidadMedida\u5c5e\u6027\u7684\u503c\u3002
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnidadMedida(String value) {
                this.unidadMedida = value;
            }

            /**
             * \u83b7\u53d6unidadMedidaComercial\u5c5e\u6027\u7684\u503c\u3002
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnidadMedidaComercial() {
                return unidadMedidaComercial;
            }

            /**
             * \u8bbe\u7f6eunidadMedidaComercial\u5c5e\u6027\u7684\u503c\u3002
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnidadMedidaComercial(String value) {
                this.unidadMedidaComercial = value;
            }

            /**
             * \u83b7\u53d6detalle\u5c5e\u6027\u7684\u503c\u3002
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDetalle() {
                return detalle;
            }

            /**
             * \u8bbe\u7f6edetalle\u5c5e\u6027\u7684\u503c\u3002
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDetalle(String value) {
                this.detalle = value;
            }

            /**
             * \u83b7\u53d6precioUnitario\u5c5e\u6027\u7684\u503c\u3002
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPrecioUnitario() {
                return precioUnitario;
            }

            /**
             * \u8bbe\u7f6eprecioUnitario\u5c5e\u6027\u7684\u503c\u3002
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPrecioUnitario(BigDecimal value) {
                this.precioUnitario = value;
            }

            /**
             * \u83b7\u53d6montoTotal\u5c5e\u6027\u7684\u503c\u3002
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMontoTotal() {
                return montoTotal;
            }

            /**
             * \u8bbe\u7f6emontoTotal\u5c5e\u6027\u7684\u503c\u3002
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMontoTotal(BigDecimal value) {
                this.montoTotal = value;
            }

            /**
             * Gets the value of the descuento property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the descuento property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDescuento().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DescuentoType }
             * 
             * 
             */
            public List<DescuentoType> getDescuento() {
                if (descuento == null) {
                    descuento = new ArrayList<DescuentoType>();
                }
                return this.descuento;
            }

            /**
             * \u83b7\u53d6subTotal\u5c5e\u6027\u7684\u503c\u3002
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSubTotal() {
                return subTotal;
            }

            /**
             * \u8bbe\u7f6esubTotal\u5c5e\u6027\u7684\u503c\u3002
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSubTotal(BigDecimal value) {
                this.subTotal = value;
            }

            /**
             * \u83b7\u53d6baseImponible\u5c5e\u6027\u7684\u503c\u3002
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getBaseImponible() {
                return baseImponible;
            }

            /**
             * \u8bbe\u7f6ebaseImponible\u5c5e\u6027\u7684\u503c\u3002
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setBaseImponible(BigDecimal value) {
                this.baseImponible = value;
            }

            /**
             * Gets the value of the impuesto property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the impuesto property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getImpuesto().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ImpuestoType }
             * 
             * 
             */
            public List<ImpuestoType> getImpuesto() {
                if (impuesto == null) {
                    impuesto = new ArrayList<ImpuestoType>();
                }
                return this.impuesto;
            }

            /**
             * \u83b7\u53d6impuestoNeto\u5c5e\u6027\u7684\u503c\u3002
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getImpuestoNeto() {
                return impuestoNeto;
            }

            /**
             * \u8bbe\u7f6eimpuestoNeto\u5c5e\u6027\u7684\u503c\u3002
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setImpuestoNeto(BigDecimal value) {
                this.impuestoNeto = value;
            }

            /**
             * \u83b7\u53d6montoTotalLinea\u5c5e\u6027\u7684\u503c\u3002
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMontoTotalLinea() {
                return montoTotalLinea;
            }

            /**
             * \u8bbe\u7f6emontoTotalLinea\u5c5e\u6027\u7684\u503c\u3002
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMontoTotalLinea(BigDecimal value) {
                this.montoTotalLinea = value;
            }

        }

    }


    /**
     * <p>anonymous complex type\u7684 Java \u7c7b\u3002
     * 
     * <p>\u4ee5\u4e0b\u6a21\u5f0f\u7247\u6bb5\u6307\u5b9a\u5305\u542b\u5728\u6b64\u7c7b\u4e2d\u7684\u9884\u671f\u5185\u5bb9\u3002
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="TipoDoc">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="01"/>
     *               &lt;enumeration value="02"/>
     *               &lt;enumeration value="03"/>
     *               &lt;enumeration value="04"/>
     *               &lt;enumeration value="05"/>
     *               &lt;enumeration value="06"/>
     *               &lt;enumeration value="07"/>
     *               &lt;enumeration value="08"/>
     *               &lt;enumeration value="09"/>
     *               &lt;enumeration value="10"/>
     *               &lt;enumeration value="11"/>
     *               &lt;enumeration value="12"/>
     *               &lt;enumeration value="99"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Numero">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="FechaEmision" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="Codigo">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="01"/>
     *               &lt;enumeration value="02"/>
     *               &lt;enumeration value="03"/>
     *               &lt;enumeration value="04"/>
     *               &lt;enumeration value="05"/>
     *               &lt;enumeration value="99"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Razon">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="180"/>
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
    @XmlType(name = "", propOrder = {
        "tipoDoc",
        "numero",
        "fechaEmision",
        "codigo",
        "razon"
    })
    public static class InformacionReferencia {

        @XmlElement(name = "TipoDoc", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
        protected String tipoDoc;
        @XmlElement(name = "Numero", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
        protected String numero;
        @XmlElement(name = "FechaEmision", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fechaEmision;
        @XmlElement(name = "Codigo", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
        protected String codigo;
        @XmlElement(name = "Razon", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
        protected String razon;

        /**
         * \u83b7\u53d6tipoDoc\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipoDoc() {
            return tipoDoc;
        }

        /**
         * \u8bbe\u7f6etipoDoc\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipoDoc(String value) {
            this.tipoDoc = value;
        }

        /**
         * \u83b7\u53d6numero\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumero() {
            return numero;
        }

        /**
         * \u8bbe\u7f6enumero\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumero(String value) {
            this.numero = value;
        }

        /**
         * \u83b7\u53d6fechaEmision\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFechaEmision() {
            return fechaEmision;
        }

        /**
         * \u8bbe\u7f6efechaEmision\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaEmision(XMLGregorianCalendar value) {
            this.fechaEmision = value;
        }

        /**
         * \u83b7\u53d6codigo\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigo() {
            return codigo;
        }

        /**
         * \u8bbe\u7f6ecodigo\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigo(String value) {
            this.codigo = value;
        }

        /**
         * \u83b7\u53d6razon\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRazon() {
            return razon;
        }

        /**
         * \u8bbe\u7f6erazon\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRazon(String value) {
            this.razon = value;
        }

    }


    /**
     * <p>anonymous complex type\u7684 Java \u7c7b\u3002
     * 
     * <p>\u4ee5\u4e0b\u6a21\u5f0f\u7247\u6bb5\u6307\u5b9a\u5305\u542b\u5728\u6b64\u7c7b\u4e2d\u7684\u9884\u671f\u5185\u5bb9\u3002
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="NumeroResolucion">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="13"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="FechaResolucion">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
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
    @XmlType(name = "", propOrder = {
        "numeroResolucion",
        "fechaResolucion"
    })
    public static class Normativa {

        @XmlElement(name = "NumeroResolucion", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
        protected String numeroResolucion;
        @XmlElement(name = "FechaResolucion", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
        protected String fechaResolucion;

        /**
         * \u83b7\u53d6numeroResolucion\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroResolucion() {
            return numeroResolucion;
        }

        /**
         * \u8bbe\u7f6enumeroResolucion\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroResolucion(String value) {
            this.numeroResolucion = value;
        }

        /**
         * \u83b7\u53d6fechaResolucion\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFechaResolucion() {
            return fechaResolucion;
        }

        /**
         * \u8bbe\u7f6efechaResolucion\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFechaResolucion(String value) {
            this.fechaResolucion = value;
        }

    }


    /**
     * <p>anonymous complex type\u7684 Java \u7c7b\u3002
     * 
     * <p>\u4ee5\u4e0b\u6a21\u5f0f\u7247\u6bb5\u6307\u5b9a\u5305\u542b\u5728\u6b64\u7c7b\u4e2d\u7684\u9884\u671f\u5185\u5bb9\u3002
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="OtroTexto" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OtroContenido" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;any processContents='lax' namespace='##other'/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
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
    @XmlType(name = "", propOrder = {
        "otroTexto",
        "otroContenido"
    })
    public static class Otros {

        @XmlElement(name = "OtroTexto", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
        protected List<NotaCreditoElectronica.Otros.OtroTexto> otroTexto;
        @XmlElement(name = "OtroContenido", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
        protected List<NotaCreditoElectronica.Otros.OtroContenido> otroContenido;

        /**
         * Gets the value of the otroTexto property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otroTexto property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtroTexto().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NotaCreditoElectronica.Otros.OtroTexto }
         * 
         * 
         */
        public List<NotaCreditoElectronica.Otros.OtroTexto> getOtroTexto() {
            if (otroTexto == null) {
                otroTexto = new ArrayList<NotaCreditoElectronica.Otros.OtroTexto>();
            }
            return this.otroTexto;
        }

        /**
         * Gets the value of the otroContenido property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otroContenido property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtroContenido().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NotaCreditoElectronica.Otros.OtroContenido }
         * 
         * 
         */
        public List<NotaCreditoElectronica.Otros.OtroContenido> getOtroContenido() {
            if (otroContenido == null) {
                otroContenido = new ArrayList<NotaCreditoElectronica.Otros.OtroContenido>();
            }
            return this.otroContenido;
        }


        /**
         * <p>anonymous complex type\u7684 Java \u7c7b\u3002
         * 
         * <p>\u4ee5\u4e0b\u6a21\u5f0f\u7247\u6bb5\u6307\u5b9a\u5305\u542b\u5728\u6b64\u7c7b\u4e2d\u7684\u9884\u671f\u5185\u5bb9\u3002
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;any processContents='lax' namespace='##other'/>
         *       &lt;/sequence>
         *       &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "any"
        })
        public static class OtroContenido {

            @XmlAnyElement(lax = true)
            protected Object any;
            @XmlAttribute(name = "codigo")
            protected String codigo;

            /**
             * \u83b7\u53d6any\u5c5e\u6027\u7684\u503c\u3002
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     {@link Element }
             *     
             */
            public Object getAny() {
                return any;
            }

            /**
             * \u8bbe\u7f6eany\u5c5e\u6027\u7684\u503c\u3002
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     {@link Element }
             *     
             */
            public void setAny(Object value) {
                this.any = value;
            }

            /**
             * \u83b7\u53d6codigo\u5c5e\u6027\u7684\u503c\u3002
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodigo() {
                return codigo;
            }

            /**
             * \u8bbe\u7f6ecodigo\u5c5e\u6027\u7684\u503c\u3002
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodigo(String value) {
                this.codigo = value;
            }

        }


        /**
         * <p>anonymous complex type\u7684 Java \u7c7b\u3002
         * 
         * <p>\u4ee5\u4e0b\u6a21\u5f0f\u7247\u6bb5\u6307\u5b9a\u5305\u542b\u5728\u6b64\u7c7b\u4e2d\u7684\u9884\u671f\u5185\u5bb9\u3002
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class OtroTexto {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "codigo")
            protected String codigo;

            /**
             * \u83b7\u53d6value\u5c5e\u6027\u7684\u503c\u3002
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
             * \u8bbe\u7f6evalue\u5c5e\u6027\u7684\u503c\u3002
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
             * \u83b7\u53d6codigo\u5c5e\u6027\u7684\u503c\u3002
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodigo() {
                return codigo;
            }

            /**
             * \u8bbe\u7f6ecodigo\u5c5e\u6027\u7684\u503c\u3002
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodigo(String value) {
                this.codigo = value;
            }

        }

    }


    /**
     * <p>anonymous complex type\u7684 Java \u7c7b\u3002
     * 
     * <p>\u4ee5\u4e0b\u6a21\u5f0f\u7247\u6bb5\u6307\u5b9a\u5305\u542b\u5728\u6b64\u7c7b\u4e2d\u7684\u9884\u671f\u5185\u5bb9\u3002
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CodigoTipoMoneda" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}CodigoMonedaType" minOccurs="0"/>
     *         &lt;element name="TotalServGravados" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/>
     *         &lt;element name="TotalServExentos" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/>
     *         &lt;element name="TotalServExonerado" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/>
     *         &lt;element name="TotalMercanciasGravadas" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/>
     *         &lt;element name="TotalMercanciasExentas" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/>
     *         &lt;element name="TotalMercExonerada" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/>
     *         &lt;element name="TotalGravado" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/>
     *         &lt;element name="TotalExento" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/>
     *         &lt;element name="TotalExonerado" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/>
     *         &lt;element name="TotalVenta" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/>
     *         &lt;element name="TotalDescuentos" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/>
     *         &lt;element name="TotalVentaNeta" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/>
     *         &lt;element name="TotalImpuesto" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/>
     *         &lt;element name="TotalIVADevuelto" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/>
     *         &lt;element name="TotalOtrosCargos" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/>
     *         &lt;element name="TotalComprobante" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/>
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
        "codigoTipoMoneda",
        "totalServGravados",
        "totalServExentos",
        "totalServExonerado",
        "totalMercanciasGravadas",
        "totalMercanciasExentas",
        "totalMercExonerada",
        "totalGravado",
        "totalExento",
        "totalExonerado",
        "totalVenta",
        "totalDescuentos",
        "totalVentaNeta",
        "totalImpuesto",
        "totalIVADevuelto",
        "totalOtrosCargos",
        "totalComprobante"
    })
    public static class ResumenFactura {

        @XmlElement(name = "CodigoTipoMoneda", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
        protected CodigoMonedaType codigoTipoMoneda;
        @XmlElement(name = "TotalServGravados", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
        protected BigDecimal totalServGravados;
        @XmlElement(name = "TotalServExentos", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
        protected BigDecimal totalServExentos;
        @XmlElement(name = "TotalServExonerado", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
        protected BigDecimal totalServExonerado;
        @XmlElement(name = "TotalMercanciasGravadas", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
        protected BigDecimal totalMercanciasGravadas;
        @XmlElement(name = "TotalMercanciasExentas", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
        protected BigDecimal totalMercanciasExentas;
        @XmlElement(name = "TotalMercExonerada", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
        protected BigDecimal totalMercExonerada;
        @XmlElement(name = "TotalGravado", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
        protected BigDecimal totalGravado;
        @XmlElement(name = "TotalExento", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
        protected BigDecimal totalExento;
        @XmlElement(name = "TotalExonerado", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
        protected BigDecimal totalExonerado;
        @XmlElement(name = "TotalVenta", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
        protected BigDecimal totalVenta;
        @XmlElement(name = "TotalDescuentos", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
        protected BigDecimal totalDescuentos;
        @XmlElement(name = "TotalVentaNeta", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
        protected BigDecimal totalVentaNeta;
        @XmlElement(name = "TotalImpuesto", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
        protected BigDecimal totalImpuesto;
        @XmlElement(name = "TotalIVADevuelto", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
        protected BigDecimal totalIVADevuelto;
        @XmlElement(name = "TotalOtrosCargos", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica")
        protected BigDecimal totalOtrosCargos;
        @XmlElement(name = "TotalComprobante", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica", required = true)
        protected BigDecimal totalComprobante;

        /**
         * \u83b7\u53d6codigoTipoMoneda\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @return
         *     possible object is
         *     {@link CodigoMonedaType }
         *     
         */
        public CodigoMonedaType getCodigoTipoMoneda() {
            return codigoTipoMoneda;
        }

        /**
         * \u8bbe\u7f6ecodigoTipoMoneda\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @param value
         *     allowed object is
         *     {@link CodigoMonedaType }
         *     
         */
        public void setCodigoTipoMoneda(CodigoMonedaType value) {
            this.codigoTipoMoneda = value;
        }

        /**
         * \u83b7\u53d6totalServGravados\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalServGravados() {
            return totalServGravados;
        }

        /**
         * \u8bbe\u7f6etotalServGravados\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalServGravados(BigDecimal value) {
            this.totalServGravados = value;
        }

        /**
         * \u83b7\u53d6totalServExentos\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalServExentos() {
            return totalServExentos;
        }

        /**
         * \u8bbe\u7f6etotalServExentos\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalServExentos(BigDecimal value) {
            this.totalServExentos = value;
        }

        /**
         * \u83b7\u53d6totalServExonerado\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalServExonerado() {
            return totalServExonerado;
        }

        /**
         * \u8bbe\u7f6etotalServExonerado\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalServExonerado(BigDecimal value) {
            this.totalServExonerado = value;
        }

        /**
         * \u83b7\u53d6totalMercanciasGravadas\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalMercanciasGravadas() {
            return totalMercanciasGravadas;
        }

        /**
         * \u8bbe\u7f6etotalMercanciasGravadas\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalMercanciasGravadas(BigDecimal value) {
            this.totalMercanciasGravadas = value;
        }

        /**
         * \u83b7\u53d6totalMercanciasExentas\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalMercanciasExentas() {
            return totalMercanciasExentas;
        }

        /**
         * \u8bbe\u7f6etotalMercanciasExentas\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalMercanciasExentas(BigDecimal value) {
            this.totalMercanciasExentas = value;
        }

        /**
         * \u83b7\u53d6totalMercExonerada\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalMercExonerada() {
            return totalMercExonerada;
        }

        /**
         * \u8bbe\u7f6etotalMercExonerada\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalMercExonerada(BigDecimal value) {
            this.totalMercExonerada = value;
        }

        /**
         * \u83b7\u53d6totalGravado\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalGravado() {
            return totalGravado;
        }

        /**
         * \u8bbe\u7f6etotalGravado\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalGravado(BigDecimal value) {
            this.totalGravado = value;
        }

        /**
         * \u83b7\u53d6totalExento\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalExento() {
            return totalExento;
        }

        /**
         * \u8bbe\u7f6etotalExento\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalExento(BigDecimal value) {
            this.totalExento = value;
        }

        /**
         * \u83b7\u53d6totalExonerado\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalExonerado() {
            return totalExonerado;
        }

        /**
         * \u8bbe\u7f6etotalExonerado\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalExonerado(BigDecimal value) {
            this.totalExonerado = value;
        }

        /**
         * \u83b7\u53d6totalVenta\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalVenta() {
            return totalVenta;
        }

        /**
         * \u8bbe\u7f6etotalVenta\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalVenta(BigDecimal value) {
            this.totalVenta = value;
        }

        /**
         * \u83b7\u53d6totalDescuentos\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalDescuentos() {
            return totalDescuentos;
        }

        /**
         * \u8bbe\u7f6etotalDescuentos\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalDescuentos(BigDecimal value) {
            this.totalDescuentos = value;
        }

        /**
         * \u83b7\u53d6totalVentaNeta\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalVentaNeta() {
            return totalVentaNeta;
        }

        /**
         * \u8bbe\u7f6etotalVentaNeta\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalVentaNeta(BigDecimal value) {
            this.totalVentaNeta = value;
        }

        /**
         * \u83b7\u53d6totalImpuesto\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalImpuesto() {
            return totalImpuesto;
        }

        /**
         * \u8bbe\u7f6etotalImpuesto\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalImpuesto(BigDecimal value) {
            this.totalImpuesto = value;
        }

        /**
         * \u83b7\u53d6totalIVADevuelto\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalIVADevuelto() {
            return totalIVADevuelto;
        }

        /**
         * \u8bbe\u7f6etotalIVADevuelto\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalIVADevuelto(BigDecimal value) {
            this.totalIVADevuelto = value;
        }

        /**
         * \u83b7\u53d6totalOtrosCargos\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalOtrosCargos() {
            return totalOtrosCargos;
        }

        /**
         * \u8bbe\u7f6etotalOtrosCargos\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalOtrosCargos(BigDecimal value) {
            this.totalOtrosCargos = value;
        }

        /**
         * \u83b7\u53d6totalComprobante\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalComprobante() {
            return totalComprobante;
        }

        /**
         * \u8bbe\u7f6etotalComprobante\u5c5e\u6027\u7684\u503c\u3002
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalComprobante(BigDecimal value) {
            this.totalComprobante = value;
        }

    }

}
