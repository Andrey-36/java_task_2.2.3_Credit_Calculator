public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int monthlyPayment = service.calculate(12);
        int monthlyPayment2 = service.calculate(24);
        int monthlyPayment3 = service.calculate(36);

        System.out.println("Срок кредита 1 год." + " Eжемесячный платеж составит: " + monthlyPayment + " рублей.");
        System.out.println("Срок кредита 2 года." + " Eжемесячный платеж составит: " + monthlyPayment2 + " рублей.");
        System.out.println("Срок кредита 3 года." + " Eжемесячный платеж составит: " + monthlyPayment3 + " рублей.");

    }
}
