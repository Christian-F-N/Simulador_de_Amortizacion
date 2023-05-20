/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemas.de.amortizacion;

import DataAccess.DataQuery;
import Entities.CreditType;
import Entities.FinancialEntity;
import Entities.InterestRate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author User
 */
public class CargarTabla {

    public void tbtInteres(JTable tabla) {
        ArrayList<InterestRate> ob;
        ArrayList<CreditType> type;
        ArrayList<FinancialEntity> entity;
        try {

            DataQuery interest = new DataQuery();
            ob = interest.queryInterestRate();
            type = interest.queryCreditType();            //Datos de Tabla
            entity = interest.queryFinancialEntity();
            DefaultTableModel modelo = new DefaultTableModel();
            tabla.setModel(modelo);
           // modelo.addColumn("ID interes");
            modelo.addColumn("Tasa de interes");
            modelo.addColumn("Tipo de credito");
            modelo.addColumn("Entidad fin");
            modelo.addColumn("Tiempo maximo");
            int tamaño = ob.size();
            int i = 0;
            while (i < tamaño) {
                String tipoCredito = "";
                String tipoDeEntFinanaciera = "";
                int tipoCreditoID = ob.get(i).getCre_Typ_ID();
                int tipoEntityFID = ob.get(i).getFin_Ent_ID();

                for (FinancialEntity EntityType : entity) {
                    if (EntityType.getID_Fin_Ent() == tipoEntityFID) {
                        tipoDeEntFinanaciera = EntityType.getNam_Fin_Ent();
                        break;
                    }
                }
                for (CreditType creditType : type) {
                    if (creditType.getID_Type_Cred() == tipoCreditoID) {
                        tipoCredito = creditType.getName_Cred();
                        break;
                    }
                }
                modelo.addRow(new Object[]{
                    ob.get(i).getID_Int_Rat(),
                    ob.get(i).getRat_Year(),
                    tipoCredito,
                    tipoDeEntFinanaciera,
                    ob.get(i).getMax_Time()});
                i++;

            }

            TableColumnModel modeloColumna = tabla.getColumnModel();

            modeloColumna.getColumn(0).setPreferredWidth(1);
            modeloColumna.getColumn(1).setPreferredWidth(1);
            modeloColumna.getColumn(2).setPreferredWidth(1);
           modeloColumna.getColumn(3).setPreferredWidth(1);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error: " + e.getMessage(),
                    "Excepcion al cargar cargarDatosTabla.Asiento ",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    

}
