public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext1 = new PaymentContext(new CreditCardStrategy("credit card"));
        PaymentContext paymentContext2 = new PaymentContext(new PayPalStrategy("paypal"));
        PaymentContext paymentContext3 = new PaymentContext(new CryptoStrategy("crypto"));
        paymentContext1.execute();
        paymentContext2.execute();
        paymentContext3.execute();   
    }
}
