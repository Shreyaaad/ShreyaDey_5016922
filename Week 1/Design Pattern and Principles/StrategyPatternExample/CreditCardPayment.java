package StrategyPatternExample;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    @SuppressWarnings("unused")
    private String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card: " + cardNumber);
    }
}

