package AdapterPatternExample;

public class PaymentProcessorTest {
    public static void main(String[] args) {
        PayPalPayment payPalPayment = new PayPalPayment();
        PaymentProcessor payPalProcessor = new PayPalAdapter(payPalPayment);
        payPalProcessor.processPayment(100.00);

        StripePayment stripePayment = new StripePayment();
        PaymentProcessor stripeProcessor = new StripeAdapter(stripePayment);
        stripeProcessor.processPayment(200.00);
    }
}
