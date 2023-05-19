/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemas.de.amortizacion;

import DataAccess.DataQuery;
import Entities.CreditAdvisor;
import FrenchAmortization.FrenchAmortizationProcessor;
import GermanAmortization.GermanAmortizationProcessor;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class SistemasDeAmortizacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Muestra los datos
        DataQuery query = new DataQuery();
        ArrayList<CreditAdvisor> advisors = query.queryAdvisor();
        for (CreditAdvisor advisor : advisors) {
            System.out.println("ID: " + advisor.getID_Cred_Adv());
            System.out.println("Nombre: " + advisor.getNam_Adv());
            System.out.println("Apellido: " + advisor.getLast_Name_Adv());
            System.out.println("Contraseña: " + advisor.getPass());
            System.out.println("Usuario: " + advisor.getUser());
            System.out.println("ID_Entidad: " + advisor.getFin_Ent_ID());
            System.out.println("ID_Rol: " + advisor.getID_User_Rol());
            System.out.println("----------------------");
        }
        double cp = 10000;
        double i = 0.14;
        int n = 5;
//Prueba metodos FrenchAmortizationProcessor
        FrenchAmortizationProcessor french = new FrenchAmortizationProcessor();
        double cuotaFrencch = french.calculateMonthlyPayment(cp, i, n);
        double interesFrencch = french.calculateTotalInterest(cp, i);
        double capitalFrencch = french.calculateCurrentEquity(cuotaFrencch, interesFrencch);
        double saldoFrencch = french.calculateRemainingBalance(cp, capitalFrencch);
        System.out.println("\nFrancesa");
        System.out.println("Cuota = " + cuotaFrencch);
        System.out.println("Interes = " + interesFrencch);
        System.out.println("Capital = " + capitalFrencch);
        System.out.println("Saldo = " + saldoFrencch);
//Prueba metodos GermanAmortizationProcessor
        GermanAmortizationProcessor german = new GermanAmortizationProcessor();
        double capitalGerman = german.calculateCurrentEquity(cp, n);
        double interesGerman = german.calculateTotalInterest(cp, i);
        double cuotaGerman = german.calculateMonthlyPayment(interesGerman, capitalGerman);
        double saldoGerman = german.calculateRemainingBalance(cp, capitalGerman);
        System.out.println("\nAlemana");
        System.out.println("Cuota = " + cuotaGerman);
        System.out.println("Interes = " + interesGerman);
        System.out.println("Capital = " + capitalGerman);
        System.out.println("Saldo = " + saldoGerman);

    }

}
