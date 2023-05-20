package DataAccess;

import Entities.CreditAdvisor;
import Entities.CreditType;
import Entities.EntityType;
import Entities.FinancialEntity;
import Entities.InterestRate;
import Entities.UserRoles;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataInserter {

    Connection cn;

    public DataInserter() {
        DbConnection con = new DbConnection();
        cn = con.connection();
    }
//Inserta una fila en la tabla de tipo de credito, necesario enviar un objeto de tipo CreditType
    public boolean insertCreditType(CreditType loanType) {
        String sql = "INSERT INTO CreditType (Name_Cred) VALUES (?)";

        try (PreparedStatement pst = cn.prepareStatement(sql)) {
            pst.setString(1, loanType.getName_Cred());
            int rowsAffected = pst.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            Logger.getLogger(DataInserter.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

//Inserta una fila en la tabla de tipo de entidad, necesario enviar un objeto de tipo EntityType
    public boolean insertEntityType(EntityType entity) {
        String sql = "INSERT INTO EntityType  (Nam_Ent_Typ) VALUES (?)";

        try (PreparedStatement pst = cn.prepareStatement(sql)) {
            pst.setString(1, entity.getNam_Ent_Typ());
            int rowsAffected = pst.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            Logger.getLogger(DataInserter.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

//Inserta una fila en la tabla de entidad financiera, necesario enviar un objeto de tipo FinancialEntity
    public boolean insertFinancialEntity(FinancialEntity financial) {
        String sql = "INSERT INTO FinancialEntity   (Nam_Fin_Ent, Ent_Typ_ID)  VALUES (?,?)";

        try (PreparedStatement pst = cn.prepareStatement(sql)) {
            pst.setString(1, financial.getNam_Fin_Ent());
            pst.setInt(2, financial.getEnt_Typ_ID());
            int rowsAffected = pst.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            Logger.getLogger(DataInserter.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

//Inserta una fila en la tabla de tasa de interes, necesario enviar un objeto de tipo InterestRate
    public boolean insertInterestRate(InterestRate interest) {
        String sql = "INSERT INTO InterestRate  (Rat_Year, Cre_Typ_ID, Fin_Ent_ID,Max_Time) VALUES (?,?,?,?)";

        try (PreparedStatement pst = cn.prepareStatement(sql)) {
            pst.setDouble(1, interest.getRat_Year());
            pst.setInt(2, interest.getCre_Typ_ID());
            pst.setInt(3, interest.getFin_Ent_ID());
            pst.setInt(4, interest.getMax_Time());
            int rowsAffected = pst.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            Logger.getLogger(DataInserter.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    //Inserta un tipo de credito, necesario enviar un objeto de tipo UserRoles
    public boolean insertUserRoles(UserRoles rol) {
        String sql = "INSERT INTO UserRoles  (Name_Rol) VALUES (?)";

        try (PreparedStatement pst = cn.prepareStatement(sql)) {
            pst.setString(1, rol.getName_Rol());
            int rowsAffected = pst.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            Logger.getLogger(DataInserter.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    //Inserta un tipo de credito, necesario enviar un objeto de tipo CreditAdvisor
    public boolean insertCreditAdvisor(CreditAdvisor advisor) {
        String sql = "INSERT INTO CreditAdvisor  (Name_Adv, Last_Name_Adv, User, Pass, Fin_Ent_ID, ID_User_Rol) "
                + "VALUES (?,?,?,?,?,?)";

        try (PreparedStatement pst = cn.prepareStatement(sql)) {
            pst.setString(1, advisor.getName_Adv());
            pst.setString(2, advisor.getLast_Name_Adv());
            pst.setString(3, advisor.getUser());
            pst.setString(4, advisor.getPass());
            pst.setInt(5, advisor.getFin_Ent_ID());
            pst.setInt(6, advisor.getID_User_Rol());
            int rowsAffected = pst.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            Logger.getLogger(DataInserter.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

}
