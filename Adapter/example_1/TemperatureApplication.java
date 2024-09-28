public class TemperatureApplication {
    private TemperatureClientCelcius tempatureClientCelcius;
    public TemperatureApplication(TemperatureClientCelcius tempatureClientCelcius){
        this.tempatureClientCelcius = tempatureClientCelcius;
    }
    public void showTemperature(){
        System.out.println("The temperature is " + tempatureClientCelcius.getTempCelcius());
    }    
}
