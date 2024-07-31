package StrategyPatternExample;

public class PaymentSystemTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();


        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "John Doe"));
        context.pay(100.0);


        context.setPaymentStrategy(new PayPalPayment("john.doe@example.com"));
        context.pay(150.0);
    }
}

