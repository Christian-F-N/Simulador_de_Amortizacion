/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemas.de.amortizacion;

import DataAccess.DataQuery;
import Entities.CreditAdvisor;
import Entities.CreditType;
import Entities.EntityType;
import Entities.FinancialEntity;
import Entities.FinancialEntityData;
import Entities.InterestRate;
import Entities.UserCredentialsAndRole;
import Entities.UserRoles;
import FrenchAmortization.FrenchAmortizationProcessor;
import GermanAmortization.GermanAmortizationProcessor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author User
 */
public class SistemasDeAmortizacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Muestra los datos de los usuarios
        DataQuery query = new DataQuery();
//        ArrayList<CreditAdvisor> advisors = query.queryAdvisor();
        
          UserCredentialsAndRole user = query.userCredentialsAndRole("Chris","pass456"); 
          if (user == null) { 
          System.out.println("Credenciales incorrectas"); } else { System.out.println("ID: " + user.getName());
          System.out.println("Nombre: " + user.getLastName());
          System.out.println("Apellido: " + user.getRoleName());
          System.out.println("----------------------"); }


//        ArrayList<CreditType> credit = query.queryCreditType();
//        ArrayList<EntityType> entity = query.queryEntityType();
//        ArrayList<FinancialEntity> financial = query.queryFinancialEntity();
//        ArrayList<InterestRate> interest = query.queryInterestRate();
//        ArrayList<UserRoles> roles = query.queryUserRoles();
//        for (CreditAdvisor advisor : advisors) {
//            System.out.println("ID: " + advisor.getID_Cred_Adv());
//            System.out.println("Nombre: " + advisor.getName_Adv());
//            System.out.println("Apellido: " + advisor.getLast_Name_Adv());
//            System.out.println("Contraseña: " + advisor.getPass());
//            System.out.println("Usuario: " + advisor.getUser());
//            System.out.println("ID_Entidad: " + advisor.getFin_Ent_ID());
//            System.out.println("ID_Rol: " + advisor.getID_User_Rol());
//            System.out.println("----------------------");
//        }
//        DatosUtil datos = new DatosUtil();
//        datos.mostrarDatos(credit);

/**control de filtrado
        ArrayList<FinancialEntityData> credit = query.financialEntityData();
        ArrayList<FinancialEntityData> datos = new ArrayList<>();
        for (FinancialEntityData entityData : credit) {
            if (entityData.getName_Cred().equals("Consumo") && entityData.getNam_Ent_Typ().equals("Banco")) {
                datos.add(entityData);

            }
        }

        for (FinancialEntityData entityName : datos) {
            System.out.println("Nombre: " + entityName.getNam_Fin_Ent() + "; Id del banco: " + entityName.getID_Fin_Ent()
                    + "; Tipo de credito: " + entityName.getName_Cred() + "; Tasa: " + entityName.getRat_Year());
        }
**/
//        mostrarDatos(credit);
//        mostrarDatos(entity);
//        mostrarDatos(financial);
//        mostrarDatos(interest);
//        mostrarDatos(roles);
        /**
         * prueba de amortizacion double cp = 10000; double i = 0.14; int n = 5;
         * //Prueba metodos FrenchAmortizationProcessor
         * FrenchAmortizationProcessor french = new
         * FrenchAmortizationProcessor(); double cuotaFrencch =
         * french.calculateMonthlyPayment(cp, i, n); double interesFrencch =
         * french.calculateTotalInterest(cp, i); double capitalFrencch =
         * french.calculateCurrentEquity(cuotaFrencch, interesFrencch); double
         * saldoFrencch = french.calculateRemainingBalance(cp, capitalFrencch);
         * System.out.println("\nFrancesa"); System.out.println("Cuota = " +
         * cuotaFrencch); System.out.println("Interes = " + interesFrencch);
         * System.out.println("Capital = " + capitalFrencch);
         * System.out.println("Saldo = " + saldoFrencch); //Prueba metodos
         * GermanAmortizationProcessor GermanAmortizationProcessor german = new
         * GermanAmortizationProcessor(); double capitalGerman =
         * german.calculateCurrentEquity(cp, n); double interesGerman =
         * german.calculateTotalInterest(cp, i); double cuotaGerman =
         * german.calculateMonthlyPayment(interesGerman, capitalGerman); double
         * saldoGerman = german.calculateRemainingBalance(cp, capitalGerman);
         * System.out.println("\nAlemana"); System.out.println("Cuota = " +
         * cuotaGerman); System.out.println("Interes = " + interesGerman);
         * System.out.println("Capital = " + capitalGerman);
         * System.out.println("Saldo = " + saldoGerman);
         *
         */
    }

}
