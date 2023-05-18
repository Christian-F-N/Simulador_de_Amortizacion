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
public class CreditType {
        int ID_Type_Cred ;
    String Name_Cred ;

    public CreditType() {
    }

    public CreditType(int ID_Type_Cred, String Name_Cred) {
        this.ID_Type_Cred = ID_Type_Cred;
        this.Name_Cred = Name_Cred;
    }

    public int getID_Type_Cred() {
        return ID_Type_Cred;
    }

    public void setID_Type_Cred(int ID_Type_Cred) {
        this.ID_Type_Cred = ID_Type_Cred;
    }

    public String getName_Cred() {
        return Name_Cred;
    }

    public void setName_Cred(String Name_Cred) {
        this.Name_Cred = Name_Cred;
    }

}
