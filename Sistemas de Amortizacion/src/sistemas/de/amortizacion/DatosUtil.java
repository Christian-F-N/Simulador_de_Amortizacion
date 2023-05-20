/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemas.de.amortizacion;

import java.lang.reflect.Field;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class DatosUtil {

    public void mostrarDatos(ArrayList<?> entidades) {
        for (Object entidad : entidades) {
            Class<?> clase = entidad.getClass();
            Field[] campos = clase.getDeclaredFields();

            for (Field campo : campos) {
                campo.setAccessible(true);
                try {
                    Object valor = campo.get(entidad);
                    System.out.println(campo.getName() + ": " + valor);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("----------------------");
        }
    }

    public boolean cargarIntereses(JTable tab) {
        CargarTabla tab1 = new CargarTabla();
        tab1.tbtInteres(tab);
        return true;
    }

    public void mostrarDatosFilaSeleccionada(JTable tabla) {
        int filaSeleccionada = tabla.getSelectedRow();
        if (filaSeleccionada != -1) {
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            int columnaCount = modelo.getColumnCount();
            Object[] datosFila = new Object[columnaCount];
            for (int i = 0; i < columnaCount; i++) {

                datosFila[i] = modelo.getValueAt(filaSeleccionada, i);
                System.out.println(datosFila[i]);
                            if (datosFila.length > 0) {
                Object primerElemento = datosFila[i];
                Class<?> tipoDato = primerElemento.getClass();
                System.out.println("Tipo de dato: " + tipoDato.getName());
            }
            }

            // Almacenar cada dato en una variable
            System.out.println("aqui");
            Object tasaInteres = datosFila[1];
            Object tipoCredito = datosFila[2];
            Object entidadFin = datosFila[3];
            Object tiempoMaximo =datosFila[4];

            // Mostrar los datos en un mensaje
            String mensaje = "Datos de la fila seleccionada:\n"
                    //+ "ID interés: " + idInteres + "\n"
                    + "Tasa de interés: " + tasaInteres + "\n"
                    + "Tipo de crédito: " + tipoCredito + "\n"
                    + "Entidad financiera: " + entidadFin + "\n"
                    + "Tiempo máximo: " + tiempoMaximo;
            JOptionPane.showMessageDialog(null, mensaje);
        }

    }

}
