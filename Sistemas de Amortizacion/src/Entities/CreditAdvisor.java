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
    String User;
    String Pass;

    public CreditAdvisor() {
    }

    public CreditAdvisor(int ID_Cred_Adv, String Nam_Adv, String User, String Pass) {
        this.ID_Cred_Adv = ID_Cred_Adv;
        this.Nam_Adv = Nam_Adv;
        this.User = User;
        this.Pass = Pass;
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
    
    
}
