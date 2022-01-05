public class CreditPaymentService {
    public int calculate(int creditTerm) {
       double percent = 9.99; //процентная ставка
       int amount = 1_000_000; //сумма кредита, в рублях

       int creditTermOne = creditTerm; //срок кредита, в месяцах

       double interestRatePerMonth = percent / 100 / 12;
       double monthlyPayment = amount * (interestRatePerMonth + (interestRatePerMonth / (Math.pow(1 + interestRatePerMonth, creditTermOne) - 1)));

       return (int) monthlyPayment;
    }
}