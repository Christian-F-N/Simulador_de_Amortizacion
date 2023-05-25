/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.JTable;

/**
 *
 * @author Usuario
 */
public class Convertir {
    public void exportarTablaAPDF(JTable table, String nombreArchivo) throws FileNotFoundException {
        try {
            Document documento = new Document(PageSize.A4.rotate());
            PdfWriter.getInstance(documento, new FileOutputStream(nombreArchivo));

            documento.open();

            // Crear la tabla con el mismo número de columnas que el JTable
            PdfPTable pdfTable = new PdfPTable(table.getColumnCount());

            // Agregar las celdas del encabezado
            for (int i = 0; i < table.getColumnCount(); i++) {
                pdfTable.addCell(new PdfPCell(new Phrase(table.getColumnName(i))));
            }

            // Agregar las filas y celdas de datos
            for (int i = 0; i < table.getRowCount(); i++) {
                for (int j = 0; j < table.getColumnCount(); j++) {
                    pdfTable.addCell(new PdfPCell(new Phrase(table.getValueAt(i, j).toString())));
                }
            }

            documento.add(pdfTable);
            documento.close();

            System.out.println("El archivo PDF se ha generado correctamente.");
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
