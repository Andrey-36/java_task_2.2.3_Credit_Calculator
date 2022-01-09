public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int amount = 1_000_000; //сумма кредита, в рублях
        double percent = 9.99; //процентная ставка
        
        int monthlyPayment = service.calculate(12, amount, percent);
        int monthlyPayment2 = service.calculate(24, amount, percent);
        int monthlyPayment3 = service.calculate(36, amount, percent);

        System.out.println("Срок кредита 1 год." + " Eжемесячный платеж составит: " + monthlyPayment + " рублей.");
        System.out.println("Срок кредита 2 года." + " Eжемесячный платеж составит: " + monthlyPayment2 + " рублей.");
        System.out.println("Срок кредита 3 года." + " Eжемесячный платеж составит: " + monthlyPayment3 + " рублей.");

    }
}
