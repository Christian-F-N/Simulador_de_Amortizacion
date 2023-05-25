package FrenchAmortization;

public class FrenchAmortizationProcessor {
//calculateMonthlyPayment(Cuota fija)
//calculateTotalInterest(interes se disminuye)
//calculateCurrentEquity (Capital se incrementa)
//calculateRemainingBalance(Saldo disminuye)


// Metodo para calcular la cuota (Fija) se necesita el capital, tasa de interes anual,
// el tiempo en meseses decir si son 5 año debe ingresar 60(meses) y la temporalidad

    public double calculateMonthlyPayment(double amount, double interestRate, int loanTerm) {
        double monthlyInterestRate = (interestRate/100) /12;
        double monthlyPayment = amount * (monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, -loanTerm)));
        return monthlyPayment;
    }

//Metodo para calcular el interes necesita el saldo, la tasa de interes anual y la temporalidad
    public double calculateTotalInterest(double amount, double interestRate, int temporality) {
        double totalInterest = (amount * interestRate/100) / temporality;
        return totalInterest;
    }

//metodo para calcular el capital necesita la cuota y el interes (I)
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
