public class TemperatureAdapter implements TemperatureClientCelcius{

    private TemperatureServiceFaren tempatureServiceFaren;

    public TemperatureAdapter(TemperatureServiceFaren tempatureServiceFaren){
        this.tempatureServiceFaren = tempatureServiceFaren;
    }

    public double getTempCelcius(){
        return (tempatureServiceFaren.getTempFarenheit() - 32) * 5 / 9;
    }
}
