package workshop;

import java.util.Random;

public class TemperatureSensor extends Sensor {

    private double value;

    public TemperatureSensor() {
        this.value = Math.random()*((30-17)-1)+17;
    }

   

    @Override
    public String toString() {
        return "TemperatureSensor er : " + value + "C";
    }

}
