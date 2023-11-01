package xmlpdf;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;
import xmlpdf.fe.FacturaElectronica;
import xmlpdf.nc.NotaCreditoElectronica;
import xmlpdf.te.TiqueteElectronico;
import java.awt.Color;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(0, 0, 64));
		textArea.setEnabled(false);
		textArea.setEditable(false);
		textArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		frame.getContentPane().add(textArea, BorderLayout.CENTER);
		
		textArea.setDropTarget(new DropTarget() {
		    public synchronized void drop(DropTargetDropEvent evt) {
		        try {
		            evt.acceptDrop(DnDConstants.ACTION_COPY);
		            List<File> droppedFiles = (List<File>) evt.getTransferable().getTransferData(DataFlavor.javaFileListFlavor);
		            for (File file : droppedFiles) {
		                System.out.println(file.getAbsolutePath());
		                textArea.append(file.getAbsolutePath() + "\n");
		                Comprobante c = new Comprobante();		
		                c.setDetalles(new ArrayList<>());
		                
		                String content = new String(Files.readAllBytes(Paths.get(file.getAbsolutePath())));
		                if(content.contains("tiqueteElectronico")) {							
							JAXBContext jaxbContext = JAXBContext.newInstance(TiqueteElectronico.class);							
							Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
							TiqueteElectronico theXML = (TiqueteElectronico) jaxbUnmarshaller.unmarshal(file);
														
							//nombre contable
							c.setNombre(theXML.getEmisor().getNombre());							
							c.setNombreComercial(theXML.getEmisor().getNombreComercial());							
							c.setCedula(String.valueOf(theXML.getClave().substring(9, 21)).replaceFirst("^0+(?!$)", ""));							
							//fecha
							c.setFechaEmision(theXML.getFechaEmision().toString());							
							//clave
							c.setClave(theXML.getClave());							
							if(theXML.getEmisor().getTelefono() != null)
								c.setTelefono(String.valueOf(theXML.getEmisor().getTelefono().getValue().getNumTelefono()));							
							c.setCorreo(theXML.getEmisor().getCorreoElectronico());							
							c.setDireccion(theXML.getEmisor().getUbicacion().getOtrasSenas());							
							//client
							if(theXML.getReceptor() != null) {
								c.setClienteNombre(theXML.getReceptor().getNombre());								
								c.setClienteCedula(theXML.getReceptor().getIdentificacion().getNumero());
								c.setClienteCorreo(theXML.getReceptor().getCorreoElectronico());
							}
							
							for(xmlpdf.te.TiqueteElectronico.DetalleServicio.LineaDetalle detalle : 
								theXML.getDetalleServicio().getLineaDetalle()) {
								Detalle d = new Detalle();
								//descripcion
								d.setDescripcion(detalle.getDetalle());									
								d.setCabys(detalle.getCodigo());								
								//unitario
								d.setPrecioUnitario(detalle.getPrecioUnitario().doubleValue());																
								//cantidad
								d.setCantidad(detalle.getCantidad().doubleValue());								
								//subtotal
								d.setSubtotal(detalle.getSubTotal().doubleValue());								
								if(detalle.getImpuesto() != null) {
									double impuesto = 0;
									for(xmlpdf.te.ImpuestoType tax : detalle.getImpuesto()) {
										impuesto += tax.getMonto().doubleValue();										
										d.setTarifaImpuesto(tax.getTarifa());
									}
									d.setMontoImpuesto(impuesto);
								}								
								//descuento
								if(detalle.getDescuento() != null) {
									double descuento = 0.0;
									for(xmlpdf.te.DescuentoType desc : detalle.getDescuento()) {
										descuento += desc.getMontoDescuento().doubleValue();
									}									
									d.setMontodescuento(descuento);
								}								
								//total
								d.setTotal(detalle.getMontoTotalLinea().doubleValue());
								c.getDetalles().add(d);
							}
							c.setTipoComprobante("Tiquete Electronico");
							c.setTipoPago("Contado");							
							double subtotal = 0;
							double total = 0;
							double timpuesto = 0;
							double tdescuento = 0;
							double tcantidad = 0;							
							for(Detalle d : c.getDetalles()) {
								subtotal += d.getSubtotal();
								total += d.getTotal();
								timpuesto += d.getMontoImpuesto();
								tdescuento += d.getMontodescuento();
								tcantidad += d.getCantidad();
							}							
							c.setCantidad(tcantidad);
							c.setMontodescuento(tdescuento);
							c.setMontoImpuesto(timpuesto);
							c.setTotal(total);
							c.setSubtotal(subtotal);							
							makePDF(c, file.getAbsolutePath() + ".pdf");
							textArea.append(file.getAbsolutePath() + ".pdf\n");
		                }
		                
		                else if(content.contains("facturaElectronica")) {							
							JAXBContext jaxbContext = JAXBContext.newInstance(FacturaElectronica.class);							
							Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
							FacturaElectronica theXML = (FacturaElectronica) jaxbUnmarshaller.unmarshal(file);
														
							//nombre contable
							c.setNombre(theXML.getEmisor().getNombre());							
							c.setNombreComercial(theXML.getEmisor().getNombreComercial());							
							c.setCedula(String.valueOf(theXML.getClave().substring(9, 21)).replaceFirst("^0+(?!$)", ""));							
							//fecha
							c.setFechaEmision(theXML.getFechaEmision().toString());							
							//clave
							c.setClave(theXML.getClave());							
							if(theXML.getEmisor().getTelefono() != null)
								c.setTelefono(String.valueOf(theXML.getEmisor().getTelefono().getValue().getNumTelefono()));							
							c.setCorreo(theXML.getEmisor().getCorreoElectronico());							
							c.setDireccion(theXML.getEmisor().getUbicacion().getOtrasSenas());							
							//client
							if(theXML.getReceptor() != null) {
								c.setClienteNombre(theXML.getReceptor().getNombre());								
								c.setClienteCedula(theXML.getReceptor().getIdentificacion().getNumero());
								c.setClienteCorreo(theXML.getReceptor().getCorreoElectronico());
							}
							
							for(xmlpdf.fe.FacturaElectronica.DetalleServicio.LineaDetalle detalle : 
								theXML.getDetalleServicio().getLineaDetalle()) {
								Detalle d = new Detalle();
								//descripcion
								d.setDescripcion(detalle.getDetalle());									
								d.setCabys(detalle.getCodigo());								
								//unitario
								d.setPrecioUnitario(detalle.getPrecioUnitario().doubleValue());																
								//cantidad
								d.setCantidad(detalle.getCantidad().doubleValue());								
								//subtotal
								d.setSubtotal(detalle.getSubTotal().doubleValue());								
								if(detalle.getImpuesto() != null) {
									double impuesto = 0;
									for(xmlpdf.fe.ImpuestoType tax : detalle.getImpuesto()) {
										impuesto += tax.getMonto().doubleValue();										
										d.setTarifaImpuesto(tax.getTarifa());
									}
									d.setMontoImpuesto(impuesto);
								}								
								//descuento
								if(detalle.getDescuento() != null) {
									double descuento = 0.0;
									for(xmlpdf.fe.DescuentoType desc : detalle.getDescuento()) {
										descuento += desc.getMontoDescuento().doubleValue();
									}									
									d.setMontodescuento(descuento);
								}								
								//total
								d.setTotal(detalle.getMontoTotalLinea().doubleValue());
								c.getDetalles().add(d);
							}
							c.setTipoComprobante("Factura Electronica");
							c.setTipoPago("Contado");							
							double subtotal = 0;
							double total = 0;
							double timpuesto = 0;
							double tdescuento = 0;
							double tcantidad = 0;							
							for(Detalle d : c.getDetalles()) {
								subtotal += d.getSubtotal();
								total += d.getTotal();
								timpuesto += d.getMontoImpuesto();
								tdescuento += d.getMontodescuento();
								tcantidad += d.getCantidad();
							}							
							c.setCantidad(tcantidad);
							c.setMontodescuento(tdescuento);
							c.setMontoImpuesto(timpuesto);
							c.setTotal(total);
							c.setSubtotal(subtotal);							
							makePDF(c, file.getAbsolutePath() + ".pdf");
							textArea.append(file.getAbsolutePath() + ".pdf\n");
		                }
		                
		                else if(content.contains("notaCreditoElectronica")) {							
							JAXBContext jaxbContext = JAXBContext.newInstance(NotaCreditoElectronica.class);							
							Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
							NotaCreditoElectronica theXML = (NotaCreditoElectronica) jaxbUnmarshaller.unmarshal(file);
														
							//nombre contable
							c.setNombre(theXML.getEmisor().getNombre());							
							c.setNombreComercial(theXML.getEmisor().getNombreComercial());							
							c.setCedula(String.valueOf(theXML.getClave().substring(9, 21)).replaceFirst("^0+(?!$)", ""));							
							//fecha
							c.setFechaEmision(theXML.getFechaEmision().toString());							
							//clave
							c.setClave(theXML.getClave());	
							if(theXML.getEmisor().getTelefono() != null)
								c.setTelefono(String.valueOf(theXML.getEmisor().getTelefono().getValue().getNumTelefono()));							
							c.setCorreo(theXML.getEmisor().getCorreoElectronico());							
							c.setDireccion(theXML.getEmisor().getUbicacion().getOtrasSenas());							
							//client
							if(theXML.getReceptor() != null) {
								c.setClienteNombre(theXML.getReceptor().getNombre());								
								c.setClienteCedula(theXML.getReceptor().getIdentificacion().getNumero());
								c.setClienteCorreo(theXML.getReceptor().getCorreoElectronico());
							}
							
							for(xmlpdf.nc.NotaCreditoElectronica.DetalleServicio.LineaDetalle detalle : 
								theXML.getDetalleServicio().getLineaDetalle()) {
								Detalle d = new Detalle();
								//descripcion
								d.setDescripcion(detalle.getDetalle());									
								d.setCabys(detalle.getCodigo());								
								//unitario
								d.setPrecioUnitario(detalle.getPrecioUnitario().doubleValue());																
								//cantidad
								d.setCantidad(detalle.getCantidad().doubleValue());								
								//subtotal
								d.setSubtotal(detalle.getSubTotal().doubleValue());								
								if(detalle.getImpuesto() != null) {
									double impuesto = 0;
									for(xmlpdf.nc.ImpuestoType tax : detalle.getImpuesto()) {
										impuesto += tax.getMonto().doubleValue();										
										d.setTarifaImpuesto(tax.getTarifa());
									}
									d.setMontoImpuesto(impuesto);
								}								
								//descuento
								if(detalle.getDescuento() != null) {
									double descuento = 0.0;
									for(xmlpdf.nc.DescuentoType desc : detalle.getDescuento()) {
										descuento += desc.getMontoDescuento().doubleValue();
									}									
									d.setMontodescuento(descuento);
								}								
								//total
								d.setTotal(detalle.getMontoTotalLinea().doubleValue());
								c.getDetalles().add(d);
							}
							c.setTipoComprobante("Nota Credito Electronica");
							c.setTipoPago("Contado");							
							double subtotal = 0;
							double total = 0;
							double timpuesto = 0;
							double tdescuento = 0;
							double tcantidad = 0;							
							for(Detalle d : c.getDetalles()) {
								subtotal += d.getSubtotal();
								total += d.getTotal();
								timpuesto += d.getMontoImpuesto();
								tdescuento += d.getMontodescuento();
								tcantidad += d.getCantidad();
							}							
							c.setCantidad(tcantidad);
							c.setMontodescuento(tdescuento);
							c.setMontoImpuesto(timpuesto);
							c.setTotal(total);
							c.setSubtotal(subtotal);							
							makePDF(c, file.getAbsolutePath() + ".pdf");
							textArea.append(file.getAbsolutePath() + ".pdf\n");
		                }
		            }
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
		    }
		});
	}
	
	public static void makePDF(Comprobante c, String path) {
		CreateHexPDFdoc hex = new CreateHexPDFdoc();
        hex.createDocument(c, path);
	}

}
