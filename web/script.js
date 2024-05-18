const paymentGateway = new java.type('com.ejemplo.patronadapter.PayPalAdapter');

function processPayment() {
    const amount = parseFloat(document.getElementById('amount').value);
    const cardNumber = document.getElementById('card-number').value;
    const expiryDate = document.getElementById('expiry-date').value;
    const cvv = document.getElementById('cvv').value;

    try {
        paymentGateway.processPaymentInstance.processPayment(amount, cardNumber, expiryDate, cvv);
        document.getElementById('result').textContent = 'Pago procesado exitosamente.';
    } catch (error) {
        document.getElementById('result').textContent = 'Error al procesar el pago: ' + error.message;
    }
}