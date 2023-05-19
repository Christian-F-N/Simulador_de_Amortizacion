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
public class InterestRate {

    private int ID_Int_Rat;
    private double Rat_Year;
    private int Cre_Typ_ID;
    private int Fin_Ent_ID;
    private int Max_Time;

    public InterestRate() {
    }

    public InterestRate(int ID_Int_Rat, double Rat_Year, int Cre_Typ_ID, int Fin_Ent_ID, int Max_Time) {
        this.ID_Int_Rat = ID_Int_Rat;
        this.Rat_Year = Rat_Year;
        this.Cre_Typ_ID = Cre_Typ_ID;
        this.Fin_Ent_ID = Fin_Ent_ID;
        this.Max_Time = Max_Time;
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

    public int getCre_Typ_ID() {
        return Cre_Typ_ID;
    }

    public void setCre_Typ_ID(int Cre_Typ_ID) {
        this.Cre_Typ_ID = Cre_Typ_ID;
    }

    public int getFin_Ent_ID() {
        return Fin_Ent_ID;
    }

    public void setFin_Ent_ID(int Fin_Ent_ID) {
        this.Fin_Ent_ID = Fin_Ent_ID;
    }

    public int getMax_Time() {
        return Max_Time;
    }

    public void setMax_Time(int Max_Time) {
        this.Max_Time = Max_Time;
    }

  

}
