public class CreditPaymentService {
    public int calculate(int amount) {
        double percent = 9.99; //процентная ставка
        int creditTermone = 12; //срок кредита, в месяцах
        double interestRatePerMonthone = percent / 100 / creditTermone;
        double monthlyPaymentone = amount * (interestRatePerMonthone + (interestRatePerMonthone / (Math.pow(1 + interestRatePerMonthone, creditTermone) - 1)));
    return (int) monthlyPaymentone;
    }

    public int calculate2(int amounttwo) {
        double percent = 9.99; //процентная ставка
        int creditTermtwo = 24; //срок кредита, в месяцах
        double interestRatePerMonthtwo = percent / 100 / 12;
        double monthlyPaymenttwo = amounttwo * (interestRatePerMonthtwo + (interestRatePerMonthtwo / (Math.pow(1 + interestRatePerMonthtwo, creditTermtwo) - 1)));
    return (int) monthlyPaymenttwo;
    }

    public int calculate3(int amountthree) {
        double percent = 9.99; //процентная ставка
        int creditTermthree = 36; //срок кредита, в месяцах
        double interestRatePerMonththree = percent / 100 / 12;
        double monthlyPaymentthree = amountthree * (interestRatePerMonththree + (interestRatePerMonththree / (Math.pow(1 + interestRatePerMonththree, creditTermthree) - 1)));
    return (int) monthlyPaymentthree;
    }
}
