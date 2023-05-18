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
public class FinancialEntity {

    int ID_Fin_Ent;
    String Nam_Fin_Ent;
    int Ent_Typ_ID;

    public FinancialEntity() {
    }

    public FinancialEntity(int ID_Fin_Ent, String Nam_Fin_Ent, int Ent_Typ_ID) {
        this.ID_Fin_Ent = ID_Fin_Ent;
        this.Nam_Fin_Ent = Nam_Fin_Ent;
        this.Ent_Typ_ID = Ent_Typ_ID;
    }

    public int getID_Fin_Ent() {
        return ID_Fin_Ent;
    }

    public void setID_Fin_Ent(int ID_Fin_Ent) {
        this.ID_Fin_Ent = ID_Fin_Ent;
    }

    public String getNam_Fin_Ent() {
        return Nam_Fin_Ent;
    }

    public void setNam_Fin_Ent(String Nam_Fin_Ent) {
        this.Nam_Fin_Ent = Nam_Fin_Ent;
    }

    public int getEnt_Typ_ID() {
        return Ent_Typ_ID;
    }

    public void setEnt_Typ_ID(int Ent_Typ_ID) {
        this.Ent_Typ_ID = Ent_Typ_ID;
    }

}
