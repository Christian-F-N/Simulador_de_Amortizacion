/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class DbConnection {
    String driver = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost/";
    String bd = "CreditAdvisorDB";
    String usuario = "root";
    String password = "";

    public Connection connection() {
        Connection cn = null;
        try {
            Class.forName(driver);
            cn = DriverManager.getConnection(url + bd, usuario, password);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error " + e);
        }
        return cn;
    }
}
