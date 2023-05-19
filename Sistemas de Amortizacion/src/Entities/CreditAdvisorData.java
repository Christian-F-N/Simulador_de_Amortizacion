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
public class CreditAdvisorData {

    private int ID_Fin_Ent;
    private String Nam_Fin_Ent;
    private int ID_Ent_Typ;
    private String Nam_Ent_Typ;
    private int ID_Type_Cred;
    private String Name_Cred;
    private int ID_Int_Rat;
    private double Rat_Year;
    private int Max_Time;
    private int ID_Cred_Adv;
    private String Name_Adv;
    private String Last_Name_Adv;

    public CreditAdvisorData() {
    }

    public CreditAdvisorData(int ID_Fin_Ent, String Nam_Fin_Ent, int ID_Ent_Typ, String Nam_Ent_Typ, int ID_Type_Cred, String Name_Cred, int ID_Int_Rat, double Rat_Year, int Max_Time, int ID_Cred_Adv, String Name_Adv, String Last_Name_Adv) {
        this.ID_Fin_Ent = ID_Fin_Ent;
        this.Nam_Fin_Ent = Nam_Fin_Ent;
        this.ID_Ent_Typ = ID_Ent_Typ;
        this.Nam_Ent_Typ = Nam_Ent_Typ;
        this.ID_Type_Cred = ID_Type_Cred;
        this.Name_Cred = Name_Cred;
        this.ID_Int_Rat = ID_Int_Rat;
        this.Rat_Year = Rat_Year;
        this.Max_Time = Max_Time;
        this.ID_Cred_Adv = ID_Cred_Adv;
        this.Name_Adv = Name_Adv;
        this.Last_Name_Adv = Last_Name_Adv;
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

    public int getID_Ent_Typ() {
        return ID_Ent_Typ;
    }

    public void setID_Ent_Typ(int ID_Ent_Typ) {
        this.ID_Ent_Typ = ID_Ent_Typ;
    }

    public String getNam_Ent_Typ() {
        return Nam_Ent_Typ;
    }

    public void setNam_Ent_Typ(String Nam_Ent_Typ) {
        this.Nam_Ent_Typ = Nam_Ent_Typ;
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

    public int getID_Int_Rat() {
        return ID_Int_Rat;
    }

    public void setID_Int_Rat(int ID_Int_Rat) {
        this.ID_Int_Rat = ID_Int_Rat;
    }

    public double getRat_Year() {
        return Rat_Year;
    }

    public void setRat_Year(double Rat_Year) {
        this.Rat_Year = Rat_Year;
    }

    public int getMax_Time() {
        return Max_Time;
    }

    public void setMax_Time(int Max_Time) {
        this.Max_Time = Max_Time;
    }

    public int getID_Cred_Adv() {
        return ID_Cred_Adv;
    }

    public void setID_Cred_Adv(int ID_Cred_Adv) {
        this.ID_Cred_Adv = ID_Cred_Adv;
    }

    public String getName_Adv() {
        return Name_Adv;
    }

    public void setName_Adv(String Name_Adv) {
        this.Name_Adv = Name_Adv;
    }

    public String getLast_Name_Adv() {
        return Last_Name_Adv;
    }

    public void setLast_Name_Adv(String Last_Name_Adv) {
        this.Last_Name_Adv = Last_Name_Adv;
    }

}
