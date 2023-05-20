package DataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataDeleter {

    Connection cn;

    public DataDeleter() {
        DbConnection con = new DbConnection();
        cn = con.connection();
    }
//elimana un asesor o usuario, necesario ingresear el "ID" del usuario o asesor de credito

    public void deleteCreditAdvisor(int ID_Cred_Adv) {
        String query = "DELETE FROM CreditAdvisor WHERE ID_Cred_Adv = ?";

        try {
            PreparedStatement stmt = cn.prepareStatement(query);
            stmt.setInt(1, ID_Cred_Adv);
            stmt.executeUpdate();
            System.out.println("Registro eliminado exitosamente.");
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar la eliminación: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
//elimina un tipo de credito, necesario ingresear el "ID" del tipo de credito

    public void deleteCreditType(int ID_Type_Cred) {
        String query = "DELETE FROM CreditType WHERE ID_Type_Cred = ?;";

        try {
            PreparedStatement stmt = cn.prepareStatement(query);
            stmt.setInt(1, ID_Type_Cred);
            stmt.executeUpdate();
            System.out.println("Registro eliminado exitosamente.");
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar la eliminación: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
//elimina una entidad bancaria, necesario ingresear el "ID" de la entidad bancaria

    public void deleteFinancialEntity(int ID_Fin_Ent) {
        String query = "DELETE FROM FinancialEntity WHERE ID_Fin_Ent = ?;";

        try {
            PreparedStatement stmt = cn.prepareStatement(query);
            stmt.setInt(1, ID_Fin_Ent);
            stmt.executeUpdate();
            System.out.println("Registro eliminado exitosamente.");
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar la eliminación: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
//elimina una tasa de interes, necesario ingresear el "ID" de la tasa de credito
    public void deleteInterestRate(int ID_Int_Rat) {
        String query = "DELETE FROM InterestRate  WHERE ID_Int_Rat  = ?";

        try {
            PreparedStatement stmt = cn.prepareStatement(query);
            stmt.setInt(1, ID_Int_Rat);
            stmt.executeUpdate();
            System.out.println("Registro eliminado exitosamente.");
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar la eliminación: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

}
