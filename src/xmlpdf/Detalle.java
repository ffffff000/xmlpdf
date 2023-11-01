package xmlpdf;

import java.math.BigDecimal;

public class Detalle {
	private String cabys;
	private String descripcion;
	private double precioUnitario;
	private double cantidad;
	private double subtotal;
	private BigDecimal tarifaImpuesto;
	private double montoImpuesto;
	private double montodescuento;
	private double total;
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
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
	public BigDecimal getTarifaImpuesto() {
		return tarifaImpuesto;
	}
	public void setTarifaImpuesto(BigDecimal tarifaImpuesto) {
		this.tarifaImpuesto = tarifaImpuesto;
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
	public String getCabys() {
		return cabys;
	}
	public void setCabys(String cabys) {
		this.cabys = cabys;
	}
	@Override
	public String toString() {
		return "Detalle [cabys=" + cabys + ", descripcion=" + descripcion + ", precioUnitario=" + precioUnitario
				+ ", cantidad=" + cantidad + ", subtotal=" + subtotal + ", tarifaImpuesto=" + tarifaImpuesto
				+ ", montoImpuesto=" + montoImpuesto + ", montodescuento=" + montodescuento + ", total=" + total + "]";
	}
	
}
