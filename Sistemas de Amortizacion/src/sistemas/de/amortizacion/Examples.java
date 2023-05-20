/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemas.de.amortizacion;

import DataAccess.DataDeleter;
import DataAccess.DataInserter;
import DataAccess.DataQuery;
import DataAccess.DataUpdater;
import Entities.CreditAdvisor;
import Entities.CreditAdvisorData;
import Entities.CreditType;
import Entities.EntityType;
import Entities.FinancialEntity;
import Entities.InterestRate;
import Entities.UserCredentialsAndRole;
import Entities.UserRoles;
import FrenchAmortization.FrenchAmortizationProcessor;
import GermanAmortization.GermanAmortizationProcessor;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Examples {

    /**
     * NOTA!!!!
     * No descomentar todo el codigo unicamnete descomntar cada seccion ceparada por el =============
     * @param args the command line arguments
     * Aqui hay algunas pruebas de como manejar los datos.
     */
    public static void main(String[] args) {
        //===========Como mostrar los datos de las consultas muestra todos los datos de la base con la clase DatosUtil
//        DataQuery query = new DataQuery();
//        DatosUtil datos = new DatosUtil();
//        ArrayList<CreditType> credit = query.queryCreditType();
//        ArrayList<EntityType> entity = query.queryEntityType();
//        ArrayList<FinancialEntity> financial = query.queryFinancialEntity();
//        ArrayList<InterestRate> interest = query.queryInterestRate();
//        ArrayList<UserRoles> roles = query.queryUserRoles();
//        datos.mostrarDatos(credit);
//        datos.mostrarDatos(entity);
//        datos.mostrarDatos(financial);
//        datos.mostrarDatos(interest);
//        datos.mostrarDatos(roles);
        //============ Ejemplo del control de login UserCredentialsAndRole 
//        DataQuery query = new DataQuery();
//        UserCredentialsAndRole user = query.findUserByCredentials("Chris", "pass456");
//        if (user == null) {
//            System.out.println("Credenciales incorrectas");
//        } else {
//            System.out.println("ID: " + user.getName());
//            System.out.println("Nombre: " + user.getLastName());
//            System.out.println("Apellido: " + user.getRoleName());
//            System.out.println("----------------------");
//        }
        //============== Muestra los datos Por el id del asesor
//        int id = 2;
//        DataQuery query = new DataQuery();
//        ArrayList<CreditAdvisorData> credit = query.findByCreditAdvisor(id);
//        for (CreditAdvisorData entityName : credit) {
//            System.out.println("Nombre de la entidad: " + entityName.getNam_Fin_Ent()
//                    + "; Tipo de credito: " + entityName.getName_Cred()
//                    + "; Tasa: " + entityName.getRat_Year());
//        }
        //============= Muestra todos los usuarios
//        DataQuery query = new DataQuery();
//        ArrayList<CreditAdvisor> advisors = query.queryAdvisor();
//        for (CreditAdvisor interes : advisors) {
//            System.out.println("ID: " + interes.getID_Cred_Adv());
//            System.out.println("Nombre: " + interes.getName_Adv());
//            System.out.println("Apellido: " + interes.getLast_Name_Adv());
//            System.out.println("Contraseña: " + interes.getPass());
//            System.out.println("Usuario: " + interes.getUser());
//            System.out.println("ID_Entidad: " + interes.getFin_Ent_ID());
//            System.out.println("ID_Rol: " + interes.getID_User_Rol());
//            System.out.println("----------------------");
//        }
        //========Metodos de Amortizacion
        //=================Prueba metodos FrenchAmortizationProcessor
//        double cp = 10000; //capita o monto solicitado
//        double i = 0.14; //tasa de interes
//        int n = 60; //5años aqui va el tiempo en meses
//        int temporalidad = 12; // temporalidad que por lo general es 12
//        FrenchAmortizationProcessor french = new FrenchAmortizationProcessor();
//        double cuotaFrencch = french.calculateMonthlyPayment(cp, i, n);
//        double interesFrencch = french.calculateTotalInterest(cp, i, temporalidad);
//        double capitalFrencch = french.calculateCurrentEquity(cuotaFrencch, interesFrencch);
//        double saldoFrencch = french.calculateRemainingBalance(cp, capitalFrencch);
//        System.out.println("Sistema Frances");
//        System.out.printf("\nCuota = %.2f", cuotaFrencch);
//        System.out.printf("\nInteres = %.2f" , interesFrencch);
//        System.out.printf("\nCapital = %.2f" , capitalFrencch);
//        System.out.printf("\nSaldo = %.2f\n" , saldoFrencch);
        //============= Prueba metodos GermanAmortizationProcessor
//        double cp = 10000; //capita o monto solicitado
//        double i = 0.14; //tasa de interes
//        int n = 60; //5años aqui va el tiempo en meses
//        int temporalidad = 12; // temporalidad que por lo general es 12
//        GermanAmortizationProcessor german = new GermanAmortizationProcessor();
//        double capitalGerman = german.calculateCurrentEquity(cp, n);
//        double interesGerman = german.calculateTotalInterest(cp, i, temporalidad);
//        double cuotaGerman = german.calculateMonthlyPayment(interesGerman, capitalGerman);
//        double saldoGerman = german.calculateRemainingBalance(cp, capitalGerman);
//        System.out.printf("Sistema Aleman");
//        System.out.printf("\nCuota = %.2f" , cuotaGerman);
//        System.out.printf("\nInteres = %.2f" , interesGerman);
//        System.out.printf("\nCapital = %.2f" , capitalGerman);
//        System.out.printf("\nSaldo = %.2f\n" , saldoGerman);
        //============Insert
//        System.out.println("insert");
//        DataInserter test = new DataInserter();
//        CreditType credit= new CreditType();
//        credit.setName_Cred("prueba");
//        test.insertCreditType(credit);
        //============= Elimina una fila de la tasa de interes por el id del interes
//          DataDeleter eliminar = new DataDeleter();
//          eliminar.deleteInterestRate(112);

        //==========Actualiza el tiempo maximo del interes

//        DataUpdater actualizar = new DataUpdater();
//        actualizar.updateMaxTime(70,1,1);
    }
}
