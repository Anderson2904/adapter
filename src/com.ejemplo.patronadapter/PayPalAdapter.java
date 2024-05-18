public class PayPalAdapter implements PaymentGateway {
    private PayPalGateway payPalGateway;

    public PayPalAdapter() {
        payPalGateway = new PayPalGateway();
    }

    @Override
    public void processPayment(double amount, String cardNumber, String expiryDate, String cvv) {
        // Adaptamos los parámetros de PaymentGateway a los requeridos por PayPalGateway
        String paypalEmail = "your_paypal_email@example.com";
        String paypalPassword = "your_paypal_password";

        payPalGateway.makePayment(amount, paypalEmail, paypalPassword);
    }
}