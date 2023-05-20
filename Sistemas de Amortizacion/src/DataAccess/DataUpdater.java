package DataAccess;

import Entities.CreditAdvisor;
import Entities.InterestRate;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataUpdater {

    Connection cn;

    public DataUpdater() {
        DbConnection con = new DbConnection();
        cn = con.connection();
    }
//Actualiza la entidad bancararia del asesor o usuario, nesesario enviar el id de la entidad y el id del asesor de credito

    public void updateCreditAdvisorFin_Ent_ID(int Fin_Ent_ID, int ID_Cred_Adv) {
        String query = "UPDATE CreditAdvisor SET Fin_Ent_ID = ? WHERE ID_Cred_Adv =?";
        try {
            PreparedStatement stmt = cn.prepareStatement(query);
            stmt.setInt(1, Fin_Ent_ID);
            stmt.setInt(2, ID_Cred_Adv);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Registro actualizado exitosamente.");
            } else {
                System.out.println("No se encontró ningún registro para actualizar.");
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar la actualización: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

//Actualiza el rol del asesor o usuario, nesesario enviar el id del rol y el id del asesor de credito
    public void updateCreditAdvisorID_User_Rol(int ID_User_Rol, int ID_Cred_Adv) {
        String query = "UPDATE CreditAdvisor SET ID_User_Rol = ? WHERE ID_Cred_Adv =?";
        try {
            PreparedStatement stmt = cn.prepareStatement(query);
            stmt.setInt(1, ID_User_Rol);
            stmt.setInt(2, ID_Cred_Adv);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Registro actualizado exitosamente.");
            } else {
                System.out.println("No se encontró ningún registro para actualizar.");
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar la actualización: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

//Actualiza la tasa de interes, nesesario enviar la tasa de interes, el id de la tasa 
//de interes y el id del tipo de credito
    public void updateInterestRate(double Rat_Year, int ID_Int_Rat, int Cre_Typ_ID) {
        String query = "UPDATE InterestRate SET Rat_Year =? WHERE ID_Int_Rat =? AND Cre_Typ_ID=? ";
        try {
            PreparedStatement stmt = cn.prepareStatement(query);
            stmt.setDouble(1, Rat_Year);
            stmt.setInt(2, ID_Int_Rat);
            stmt.setInt(3, Cre_Typ_ID);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Registro actualizado exitosamente.");
            } else {
                System.out.println("No se encontró ningún registro para actualizar.");
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar la actualización: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

//Actualiza el timpo maximo, nesesario enviar el numero maximo de tiempo de credito
//id de la tasa de credito y el id del tipo de credito
    public void updateMaxTime(int Max_Time, int ID_Int_Rat, int Cre_Typ_ID) {
        String query = "UPDATE InterestRate SET Max_Time = ? WHERE ID_Int_Rat = ? AND Cre_Typ_ID=?";
        try {
            PreparedStatement stmt = cn.prepareStatement(query);
            stmt.setInt(1, Max_Time);
            stmt.setInt(2, ID_Int_Rat);
            stmt.setInt(3, Cre_Typ_ID);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Registro actualizado exitosamente.");
            } else {
                System.out.println("No se encontró ningún registro para actualizar.");
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar la actualización: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

}
