public class HomeTheatreSystem {
    private DVDPlayer d;
    private Light l;
    private Projector p;
    private SoundSystem s;

    public HomeTheatreSystem(DVDPlayer d, Light l, Projector p, SoundSystem s){
        this.d = d;
        this.l = l;
        this.s = s;
        this.p = p;
    }

    public void startMovie(){
        this.d.on();
        this.l.on();
        this.s.on();
        this.p.on();
    }

    public void endMovie(){
        this.d.off();
        this.l.dim(0);
        this.s.off();
        this.p.off();
    }
}
