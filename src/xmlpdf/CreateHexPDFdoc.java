/*
 * Copyright 2014 Frank J. Øynes, heksemann@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * 
 * HexPDF is a simple Java class making it easier to use Apache PDFBox
 * for creating pdf documents in from your Java application or web-service.
 * 
 * HexPDF adds stuff like automatic page adding, word-wrap, newline awareness,
 * left/right/center text alignment, table creation and image insertion.
 * It also has support for text colour and page footers.
 * 
 * This file, CreateHexPDFdoc.java is an example showing basic HexPDF usage.
 *
 */
package xmlpdf;

import java.io.IOException;
import java.util.List;

/**
 * Create a simple, two-page, A4 document with text, images and a table.
 * Demonstrates usage of HexPDF
 *
 * @author Frank J. Øynes, heksemann@gmail.com
 */
public class CreateHexPDFdoc {

    public void createDocument(Comprobante c, String path) {
    	try {
	        Object[][] table = getTable(c.getDetalles());
	
	        // Create a new document and include a default footer
	        HexPDF doc = new HexPDF();
	
	        // Create the first page
	        doc.newPage();
	                
	        doc.normalStyle();
	        doc.drawText(c.getNombreComercial());
	        doc.drawText("\n");
	        doc.drawText(c.getNombre());
	        doc.drawText("\n");
	        doc.drawText("Cedula: " + c.getCedula());
	        doc.drawText("\n");
	        doc.drawText("Telefono: " + (c.getTelefono() == null ? "-" : c.getTelefono()));
	        doc.drawText("\n");
	        doc.drawText("Correo: " + c.getCorreo());
	        doc.drawText("\n");
	        doc.drawText("Direccion: " + c.getDireccion());
	        doc.drawText("\n");
	        doc.drawText("Fecha emision: " + c.getFechaEmision());
	        doc.drawText("\n");
	        doc.drawText(c.getTipoComprobante());
	        doc.drawText("\n");
	        doc.drawText("Clave: " + c.getClave());
	        doc.drawText("\n");
	        doc.drawText("Consecutivo: " + c.getClave().substring(21, 40));
	        doc.drawText("\n");
	        doc.drawText("Condicion venta: " + c.getTipoPago());
	        doc.drawText("\n");
	
	        doc.drawText("");
	        doc.drawText("\n");
	        doc.drawText("Cliente: " + (c.getClienteNombre() == null ? "-" : c.getClienteNombre()));
	        doc.drawText("\n");
	        doc.drawText("Cliente cedula: " + (c.getClienteCedula() == null ? "-" : c.getClienteCedula()));
	        doc.drawText("\n");
	        doc.drawText("Cliente correo: " + (c.getClienteCorreo() == null ? "-" : c.getClienteCorreo()));
	        doc.drawText("\n");
	        
	        // Add a table centered on page, crossing page boundary. 
	        // Four columns, aligned left, center, right, left
	        doc.drawTable(table,
	                new float[]{20, 70, 230, 20, 30, 40, 30, 20, 30, 40},
	                new int[]{
	                		HexPDF.CENTER, //	        "#",
	                		HexPDF.LEFT, //    		"Cabys",
	                		HexPDF.LEFT,//    		"Detalle",
	                		HexPDF.CENTER, //    		"Cant.",
	                		HexPDF.RIGHT,//    		"P.Unit",
			                HexPDF.RIGHT, //    		"Subt.",
		            		HexPDF.RIGHT, //    		"Desc.",
		            		HexPDF.CENTER,//    		"T.IVA",
		            		HexPDF.RIGHT, //    		"M.IVA",
		            		HexPDF.RIGHT,//    		"Total"
	                	}, HexPDF.CENTER);
	        
	        doc.drawText("Cantidad: " + String.format("%.0f", c.getCantidad()), HexPDF.LEFT);
	        doc.drawText("\n");
	        doc.drawText("Subtotal: " + String.format("%.0f", c.getSubtotal()), HexPDF.RIGHT);
	        doc.drawText("Descuento: " + String.format("%.0f", c.getMontodescuento()), HexPDF.RIGHT);
	        doc.drawText("Impuesto: " + String.format("%.0f", c.getMontoImpuesto()), HexPDF.RIGHT);
	        doc.drawText("Total: " + String.format("%.0f", c.getTotal()), HexPDF.RIGHT);
	        doc.drawText("\n");
	        doc.drawText("Autorizado mediante la resolución DGT-R-033-2019 del veinte de junio de dos mil diecinueve de la Dirección General", HexPDF.CENTER);
	        doc.drawText("\n");
	        doc.drawText("Versión del Documento Electrónico: 4.3", HexPDF.CENTER);
	        
	        // Save the document
	        doc.finish(path);        
			doc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    private Object[][] getTable(List<Detalle> ds) {
        String tab [][] = new String[ds.size() + 1][];
        tab[0] = new String[] {
        		"#",
        		"Cabys",
        		"Detalle",
        		"Can",
        		"Unit",
        		"Subt.",
        		"Desc.",
        		"",
        		"IVA",
        		"Total"
        };
        
        for(int i  = 0; i< ds.size(); i++) {
        	Detalle d = ds.get(i);
        	tab[i + 1] = new String[] {
            		String.valueOf(i + 1),
            		d.getCabys(),
            		d.getDescripcion(),
            		String.format("%.0f", d.getCantidad()),
            		String.format("%.0f", d.getPrecioUnitario()),
            		String.format("%.0f", d.getSubtotal()),
            		String.format("%.0f", d.getMontodescuento()),
            		String.format("%.0f", d.getTarifaImpuesto()),
            		String.format("%.0f", d.getMontoImpuesto()),
            		String.format("%.0f", d.getTotal())
            };
        }
        return tab;
    }
}