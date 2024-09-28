public class PayPalStrategy implements PaymentStrategy{

    private String paypal;

    public PayPalStrategy(String paypal){
        this.paypal = paypal;
    }

    public void pay(){
        System.out.println("Paid by " + paypal);
    }
    
}
