public class Main {
    public static void main(String[] args) {
        TransportFactory carFactory = new CarFactory();
        TransportFactory lorryFactory = new LorryFactory();
        lorryFactory.planDelivery();
        carFactory.planDelivery();

    }
}
