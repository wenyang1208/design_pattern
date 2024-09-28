public class PaymentContext {
    private PaymentStrategy p;
    public PaymentContext(PaymentStrategy p){
        this.p = p;
    }
    public void execute(){
        p.pay();
    }
}
