/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import Entities.CreditAdvisor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class DataQuery {

    ResultSet datos, dato;
    Statement st;
    Connection cn;

    public DataQuery() {
        DbConnection con = new DbConnection();
        cn = con.connection();
    }

    public ArrayList<CreditAdvisor> queryAdvisor() {
        ArrayList<CreditAdvisor> advisors = new ArrayList();
        String query = "SELECT * FROM CreditAdvisor";
        CreditAdvisor advisor;
        try {
            st = cn.createStatement();
            System.out.println("Ejecutando consulta: " + query);
            datos = st.executeQuery(query);
            System.out.println("Consulta ejecutada con éxito.");
            while (datos.next()) {
                advisor = new CreditAdvisor();
                advisor.setID_Cred_Adv(datos.getInt("ID_Cred_Adv"));
                advisor.setNam_Adv(datos.getString("Nam_Adv"));
                advisor.setPass(datos.getString("Pass"));
                advisor.setUser(datos.getString("User"));

                advisors.add(advisor);
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar la consulta: " + ex.getMessage());
            ex.printStackTrace();
        }
        return advisors;
    }
}
