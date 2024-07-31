package AdapterPatternExample;

public class StripePayment {
    public void pay(double amount) {
        System.out.println("Processing Stripe payment of $" + amount);
    }
}

