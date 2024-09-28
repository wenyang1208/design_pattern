public class SquarePegAdapter extends RoundPegClient{
    private SquarePegService squarePegService;

    public SquarePegAdapter(SquarePegService squarePegService){
        super(squarePegService.getWidth() * Math.sqrt(2) / 2);
        this.squarePegService = squarePegService;
    }
    public double getRadius(){
        return super.getRadius();
    }
}
