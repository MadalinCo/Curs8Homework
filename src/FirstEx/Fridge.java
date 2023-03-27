package FirstEx;

public class Fridge extends Electronics{
    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public int changeTemperature(int temperatureToSet) {
       temperature=temperatureToSet;
        return temperatureToSet;
    }
}
