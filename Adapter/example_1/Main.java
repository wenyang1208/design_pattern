public class Main {
    public static void main(String[] args) {
        TemperatureServiceFaren temperatureServiceFaren = new TemperatureServiceFaren();
        TemperatureAdapter temperatureAdapter = new TemperatureAdapter(temperatureServiceFaren);
        TemperatureApplication temperatureApplication = new TemperatureApplication(temperatureAdapter);
        temperatureApplication.showTemperature();
    }
}
