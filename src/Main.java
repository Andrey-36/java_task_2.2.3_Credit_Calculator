public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int amount = 1_000_000; //сумма кредита, в рублях
        int monthlyPayment = service.calculate(1_000_000);
        int monthlyPaymenttwo = service.calculate2(1_000_000);
        int monthlyPaymentthree = service.calculate3(1_000_000);

        System.out.println("Срок кредита 1 год." + " Eжемесячный платеж составит: " + monthlyPayment + " рублей.");
        System.out.println("Срок кредита 2 года." + " Eжемесячный платеж составит: " + monthlyPaymenttwo + " рублей.");
        System.out.println("Срок кредита 3 года." + " Eжемесячный платеж составит: " + monthlyPaymentthree + " рублей.");


    }
}
