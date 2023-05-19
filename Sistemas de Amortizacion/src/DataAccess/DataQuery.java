/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import Entities.CreditAdvisor;
import Entities.CreditType;
import Entities.EntityType;
import Entities.FinancialEntity;
import Entities.FinancialEntityData;
import Entities.InterestRate;
import Entities.UserCredentialsAndRole;
import Entities.UserRoles;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
            datos = st.executeQuery(query);
            while (datos.next()) {
                advisor = new CreditAdvisor();
                advisor.setID_Cred_Adv(datos.getInt("ID_Cred_Adv"));
                advisor.setName_Adv(datos.getString("Name_Adv"));
                advisor.setLast_Name_Adv(datos.getString("Last_Name_Adv"));
                advisor.setPass(datos.getString("Pass"));
                advisor.setUser(datos.getString("User"));
                advisor.setFin_Ent_ID(datos.getInt("Fin_Ent_ID"));
                advisor.setID_User_Rol(datos.getInt("ID_User_Rol"));

                advisors.add(advisor);
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar la consulta: " + ex.getMessage());
            ex.printStackTrace();
        }
        return advisors;
    }

    public ArrayList<CreditType> queryCreditType() {
        ArrayList<CreditType> credits = new ArrayList();
        String query = "SELECT * FROM CreditType";
        CreditType credit;
        try {
            st = cn.createStatement();
            datos = st.executeQuery(query);
            while (datos.next()) {
                credit = new CreditType();
                credit.setID_Type_Cred(datos.getInt("ID_Type_Cred"));
                credit.setName_Cred(datos.getString("Name_Cred"));
                credits.add(credit);
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar la consulta: " + ex.getMessage());
            ex.printStackTrace();
        }
        return credits;
    }

    public ArrayList<EntityType> queryEntityType() {
        ArrayList<EntityType> entitys = new ArrayList();
        String query = "SELECT * FROM EntityType";
        EntityType entity;
        try {
            st = cn.createStatement();
            datos = st.executeQuery(query);
            while (datos.next()) {
                entity = new EntityType();
                entity.setID_Ent_Typ(datos.getInt("ID_Ent_Typ"));
                entity.setNam_Ent_Typ(datos.getString("Nam_Ent_Typ"));
                entitys.add(entity);
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar la consulta: " + ex.getMessage());
            ex.printStackTrace();
        }
        return entitys;
    }

    public ArrayList<FinancialEntity> queryFinancialEntity() {
        ArrayList<FinancialEntity> financials = new ArrayList();
        String query = "SELECT * FROM FinancialEntity";
        FinancialEntity financial;
        try {
            st = cn.createStatement();
            datos = st.executeQuery(query);
            while (datos.next()) {
                financial = new FinancialEntity();
                financial.setID_Fin_Ent(datos.getInt("ID_Fin_Ent"));
                financial.setNam_Fin_Ent(datos.getString("Nam_Fin_Ent"));
                financial.setEnt_Typ_ID(datos.getInt("Ent_Typ_ID"));

                financials.add(financial);
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar la consulta: " + ex.getMessage());
            ex.printStackTrace();
        }
        return financials;
    }

    public ArrayList<InterestRate> queryInterestRate() {
        ArrayList<InterestRate> interests = new ArrayList();
        String query = "SELECT * FROM InterestRate";
        InterestRate interest;
        try {
            st = cn.createStatement();
            datos = st.executeQuery(query);
            while (datos.next()) {
                interest = new InterestRate();
                interest.setID_Int_Rat(datos.getInt("ID_Int_Rat"));
                interest.setRat_Year(datos.getDouble("Rat_Year"));
                interest.setCre_Typ_ID(datos.getInt("Cre_Typ_ID"));
                interest.setFin_Ent_ID(datos.getInt("Fin_Ent_ID"));
                interests.add(interest);
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar la consulta: " + ex.getMessage());
            ex.printStackTrace();
        }
        return interests;
    }

    public ArrayList<UserRoles> queryUserRoles() {
        ArrayList<UserRoles> roles = new ArrayList();
        String query = "SELECT * FROM UserRoles";
        UserRoles rol;
        try {
            st = cn.createStatement();
//            System.out.println("Ejecutando consulta: " + query);
            datos = st.executeQuery(query);
//            System.out.println("Consulta ejecutada con éxito.");
            while (datos.next()) {
                rol = new UserRoles();
                rol.setID_User_Rol(datos.getInt("ID_User_Rol"));
                rol.setName_Rol(datos.getString("Name_Rol"));
                roles.add(rol);
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar la consulta: " + ex.getMessage());
            ex.printStackTrace();
        }
        return roles;
    }

    public UserCredentialsAndRole userCredentialsAndRole(String user, String pass) {
        String query = "SELECT Name_Adv , Last_Name_Adv, Name_Rol\n"
                + "FROM CreditAdvisor\n"
                + "JOIN UserRoles ON CreditAdvisor.ID_User_Rol = UserRoles.ID_User_Rol\n"
                + "WHERE User = '" + user + "' AND Pass = '" + pass + "';";
        UserCredentialsAndRole credential = null;
        try {
            st = cn.createStatement();
            datos = st.executeQuery(query);
            while (datos.next()) {
                credential = new UserCredentialsAndRole();
                credential.setName(datos.getString(1));
                credential.setLastName(datos.getString(2));
                credential.setRoleName(datos.getString(3));
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar la consulta: " + ex.getMessage());
            ex.printStackTrace();
        }
        return credential;
    }

    public ArrayList<FinancialEntityData> financialEntityData() {
        ArrayList<FinancialEntityData> roles = new ArrayList();
        String query = "SELECT FinancialEntity.ID_Fin_Ent, FinancialEntity.Nam_Fin_Ent, EntityType.ID_Ent_Typ, EntityType.Nam_Ent_Typ, CreditType.ID_Type_Cred, CreditType.Name_Cred, InterestRate.ID_Int_Rat, InterestRate.Rat_Year\n"
                + "FROM FinancialEntity\n"
                + "JOIN EntityType ON FinancialEntity.Ent_Typ_ID = EntityType.ID_Ent_Typ\n"
                + "JOIN InterestRate ON FinancialEntity.ID_Fin_Ent = InterestRate.Fin_Ent_ID\n"
                + "JOIN CreditType ON InterestRate.Cre_Typ_ID = CreditType.ID_Type_Cred;";
        FinancialEntityData rol;
        try {
            st = cn.createStatement();
            datos = st.executeQuery(query);
            while (datos.next()) {
                rol = new FinancialEntityData();
                rol.setID_Fin_Ent(datos.getInt("ID_Fin_Ent"));
                rol.setNam_Fin_Ent(datos.getString("Nam_Fin_Ent"));
                rol.setID_Ent_Typ(datos.getInt("ID_Ent_Typ"));
                rol.setNam_Ent_Typ(datos.getString("Nam_Ent_Typ"));
                rol.setID_Type_Cred(datos.getInt("ID_Type_Cred"));
                rol.setName_Cred(datos.getString("Name_Cred"));
                rol.setID_Int_Rat(datos.getInt("ID_Int_Rat"));
                rol.setRat_Year(datos.getDouble("Rat_Year"));
                roles.add(rol);
            }
        } catch (SQLException ex) {
            System.err.println("Error al ejecutar la consulta: " + ex.getMessage());
            ex.printStackTrace();
        }
        return roles;
    }
}
