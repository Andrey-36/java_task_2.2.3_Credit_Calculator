public class CreditPaymentService {
    public int calculate(int creditTerm, int amount, double percent) {
       
       int creditTermOne = creditTerm; //срок кредита, в месяцах

       double interestRatePerMonth = percent / 100 / 12;
       double monthlyPayment = amount * (interestRatePerMonth + (interestRatePerMonth / (Math.pow(1 + interestRatePerMonth, creditTermOne) - 1)));

       return (int) monthlyPayment;
    }
}
