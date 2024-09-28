public class CreditCardStrategy implements PaymentStrategy{

    private String creditCard;

    public CreditCardStrategy(String creditCard){
        this.creditCard = creditCard;
    }

    public void pay(){
        System.out.println("Paid by " + creditCard);
    }
}
