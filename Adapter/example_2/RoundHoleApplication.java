public class RoundHoleApplication {
    private RoundPegClient roundPegClient;
    public final static int RADIUS = 10;

    public RoundHoleApplication(RoundPegClient roundPegClient){
        this.roundPegClient = roundPegClient;
    }

    public boolean fits(){
        if(roundPegClient.getRadius() <= RADIUS){
            return true;
        }
        return false;
    }
}
