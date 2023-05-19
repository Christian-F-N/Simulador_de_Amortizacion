/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author User
 */
public class CreditAdvisor {
    int ID_Cred_Adv;
    String Nam_Adv;
    String Last_Name_Adv;
    String User;
    String Pass;
    int Fin_Ent_ID;
    int ID_User_Rol;

    public CreditAdvisor() {
    }

    public CreditAdvisor(int ID_Cred_Adv, String Nam_Adv, String Last_Name_Adv, String User, String Pass, int Fin_Ent_ID, int ID_User_Rol) {
        this.ID_Cred_Adv = ID_Cred_Adv;
        this.Nam_Adv = Nam_Adv;
        this.Last_Name_Adv = Last_Name_Adv;
        this.User = User;
        this.Pass = Pass;
        this.Fin_Ent_ID = Fin_Ent_ID;
        this.ID_User_Rol = ID_User_Rol;
    }

    public int getID_Cred_Adv() {
        return ID_Cred_Adv;
    }

    public void setID_Cred_Adv(int ID_Cred_Adv) {
        this.ID_Cred_Adv = ID_Cred_Adv;
    }

    public String getNam_Adv() {
        return Nam_Adv;
    }

    public void setNam_Adv(String Nam_Adv) {
        this.Nam_Adv = Nam_Adv;
    }

    public String getLast_Name_Adv() {
        return Last_Name_Adv;
    }

    public void setLast_Name_Adv(String Last_Name_Adv) {
        this.Last_Name_Adv = Last_Name_Adv;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public int getFin_Ent_ID() {
        return Fin_Ent_ID;
    }

    public void setFin_Ent_ID(int Fin_Ent_ID) {
        this.Fin_Ent_ID = Fin_Ent_ID;
    }

    public int getID_User_Rol() {
        return ID_User_Rol;
    }

    public void setID_User_Rol(int ID_User_Rol) {
        this.ID_User_Rol = ID_User_Rol;
    }
   
    
    
    
}
