/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemas.de.amortizacion;

import DataAccess.DataQuery;
import Entities.CreditAdvisor;
import FrenchAmortization.FrenchAmortizationProcessor;
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
        DataQuery consulta1 = new DataQuery();
        ArrayList<CreditAdvisor> advisors = consulta1.queryAdvisor();
        for (CreditAdvisor advisor : advisors) {
            System.out.println("ID: " + advisor.getID_Cred_Adv());
            System.out.println("Nombre: " + advisor.getNam_Adv());
            System.out.println("Contraseña: " + advisor.getPass());
            System.out.println("Usuario: " + advisor.getUser());
            System.out.println("----------------------");
        }
double cp=10000;
double I=0.14;
int n=5;
    FrenchAmortizationProcessor frenc = new FrenchAmortizationProcessor();
    double cuota= frenc.calculateMonthlyPayment(cp, I, n);
    double interes = frenc.calculateTotalInterest(cp, I);
    double capital = frenc.calculateCurrentEquity(cuota,interes);
    double saldo = frenc.calculateRemainingBalance(cp, capital);
     System.out.println("Cuota = "+cuota);
      System.out.println("Interes = "+interes);
       System.out.println("Capital = "+capital);
       System.out.println("Saldo = "+saldo);
    }
    
    
}
