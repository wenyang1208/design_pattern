public class LorryFactory extends TransportFactory{
    @Override
    public Transport createTransport(){
        return new Lorry();
    }
}
