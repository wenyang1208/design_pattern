public class CryptoStrategy implements PaymentStrategy{
    private String crypto;

    public CryptoStrategy(String crypto){
        this.crypto = crypto;
    }

    public void pay(){
        System.out.println("Paid by " + crypto);
    }
}
