public class Singleton {
    private static Singleton s1;
    private Singleton(){
    }
    public static Singleton getInstance(){
        if(s1 == null){
            s1 = new Singleton();
        }
        return s1;
    }
    public void showMessage(){
        System.out.println("Singleton!");
    }
}
