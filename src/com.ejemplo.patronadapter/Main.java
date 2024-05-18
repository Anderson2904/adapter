public class Main {
    public static void main(String[] args) {
        PaymentGateway paymentGateway = new PayPalAdapter();
        paymentGateway.processPayment(100.0, "1234567890123456", "12/25", "123");
    }
}