public class Main {
    public static void main(String[] args) {
        RoundPegClient roundPegClient = new RoundPegClient(3);
        RoundHoleApplication roundHoleApplication = new RoundHoleApplication(roundPegClient);
        System.out.println(roundHoleApplication.fits());
    
        SquarePegService small_sqpeg = new SquarePegService(5);
        SquarePegAdapter squarePegAdapter1 = new SquarePegAdapter(small_sqpeg);
        RoundHoleApplication roundHoleApplication1 = new RoundHoleApplication(squarePegAdapter1);
        System.out.println(roundHoleApplication1.fits());
    
        SquarePegService large_sqpeg = new SquarePegService(100);
        SquarePegAdapter squarePegAdapter2 = new SquarePegAdapter(large_sqpeg);
        RoundHoleApplication roundHoleApplication2 = new RoundHoleApplication(squarePegAdapter2);
        System.out.println(roundHoleApplication2.fits());   
    }
}
