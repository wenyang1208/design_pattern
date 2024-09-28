public class Main {
    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Light light = new Light();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        HomeTheatreSystem homeTheatreSystem = new HomeTheatreSystem(dvdPlayer, light, projector, soundSystem);
        homeTheatreSystem.startMovie();   
    }
}
