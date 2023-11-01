package xmlpdf;

import java.util.List;

public class Comprobante {
	private String nombre;
	private String nombreComercial;
	private String cedula;
	private String direccion;
	private String telefono;
	private String correo;
	private String fechaEmision;
	private String clave;
	private String clienteNombre;
	private String clienteCedula;
	private String clienteCorreo;
	private List<Detalle> detalles;
	private String tipoPago;
	private String tipoComprobante;
	private double cantidad;
	private double subtotal;
	private double montoImpuesto;
	private double montodescuento;
	private double total;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombreComercial() {
		return nombreComercial;
	}
	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(String fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getClienteNombre() {
		return clienteNombre;
	}
	public void setClienteNombre(String clienteNombre) {
		this.clienteNombre = clienteNombre;
	}
	public String getClienteCedula() {
		return clienteCedula;
	}
	public void setClienteCedula(String clienteCedula) {
		this.clienteCedula = clienteCedula;
	}
	public List<Detalle> getDetalles() {
		return detalles;
	}
	public void setDetalles(List<Detalle> detalles) {
		this.detalles = detalles;
	}
	public String getTipoPago() {
		return tipoPago;
	}
	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}
	public String getTipoComprobante() {
		return tipoComprobante;
	}
	public void setTipoComprobante(String tipoComprobante) {
		this.tipoComprobante = tipoComprobante;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public double getMontoImpuesto() {
		return montoImpuesto;
	}
	public void setMontoImpuesto(double montoImpuesto) {
		this.montoImpuesto = montoImpuesto;
	}
	public double getMontodescuento() {
		return montodescuento;
	}
	public void setMontodescuento(double montodescuento) {
		this.montodescuento = montodescuento;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getClienteCorreo() {
		return clienteCorreo;
	}
	public void setClienteCorreo(String clienteCorreo) {
		this.clienteCorreo = clienteCorreo;
	}
	
	
}
