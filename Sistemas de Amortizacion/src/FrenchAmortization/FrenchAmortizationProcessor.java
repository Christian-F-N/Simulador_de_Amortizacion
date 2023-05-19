/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrenchAmortization;

/**
 *
 * @author User
 */
public class FrenchAmortizationProcessor {
//calculateMonthlyPayment(Cuota)
//calculateTotalInterest(interes)
//calculateCurrentEquity (Capital)
//calculateRemainingBalance(Saldo)

    //Metodo para calcular la cuota necesita el capital, tasa de interes anual y el tiempo en años
    public double calculateMonthlyPayment(double amount, double interestRate, int loanTerm) {
        double monthlyInterestRate = interestRate / 12;
        int totalPayments = loanTerm * 12;
        double monthlyPayment = amount * (monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, -totalPayments)));
        return monthlyPayment;
    }

    //Metodo para calcular el interes necesita el saldo y la tasa de interes anual
    public double calculateTotalInterest(double amount, double interestRate) {
        double totalInterest = (amount * interestRate) / 12;
        return totalInterest;
    }
//metodo para calcular el capital necesita la cuota y el interes

    public double calculateCurrentEquity(double monthlyPayment, double Interest) {
        double remainingBalance = monthlyPayment - Interest;
        return remainingBalance;
    }

    //Metodo para calcular el saldo anterior y el capital
    public double calculateRemainingBalance(double amountPast, double currentEquity) {
        double remainingBalance = amountPast - currentEquity;
        return remainingBalance;
    }

}
