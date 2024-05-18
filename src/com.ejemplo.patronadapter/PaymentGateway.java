public interface PaymentGateway {
    void processPayment(double amount, String cardNumber, String expiryDate, String cvv);
}