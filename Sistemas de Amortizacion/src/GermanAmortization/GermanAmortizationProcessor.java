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

//calculateCurrentEquity (Capital)
//calculateTotalInterest(interes)
//calculateMonthlyPayment(Cuota)
//calculateRemainingBalance(Saldo)
    //metodo para calcular el capital necesita el monto y el tiempo en años
    public double calculateCurrentEquity(double monthlyPayment, int loanTerm) {
        int totalPayments = loanTerm * 12;
        double remainingBalance = monthlyPayment / totalPayments;
        return remainingBalance;
    }

    //Metodo para calcular el interes necesita el saldo y la tasa de interes anual
    public double calculateTotalInterest(double amount, double interestRate) {
        double totalInterest = (amount * interestRate) / 12;
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
