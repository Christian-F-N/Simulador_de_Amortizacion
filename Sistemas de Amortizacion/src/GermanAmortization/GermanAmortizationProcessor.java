/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GermanAmortization;

/**
 *
 * @author User
 */
public class GermanAmortizationProcessor {
    
//calculateCurrentEquity (Capital es fijo)
//calculateTotalInterest(interes se disminuye)
//calculateMonthlyPayment(Cuota es variable)
//calculateRemainingBalance(Saldo disminuye)

// Metodo para calcular el capital, se necesita el monto y el tiempo en meses es decir si son 5 año 
// debe ingresar 60(meses)
    public double calculateCurrentEquity(double monthlyPayment, int loanTerm) {
        double remainingBalance = monthlyPayment / loanTerm;
        return remainingBalance;
    }

//Metodo para calcular el interes necesita el saldo, la tasa de interes anual y la temporalidad
    public double calculateTotalInterest(double amount, double interestRate , int temporality) {
        double totalInterest = (amount * interestRate) / temporality;
        return totalInterest;
    }

//Metodo para calcular la cuota necesita el interes y el capital
    public double calculateMonthlyPayment(double interest, double amount) {
        double monthlyPayment = interest + amount;
        return monthlyPayment;
    }

//Metodo para calcular el saldo anterior y el capital
    public double calculateRemainingBalance(double amountPast, double currentEquity) {
        double remainingBalance = amountPast - currentEquity;
        return remainingBalance;
    }
}
