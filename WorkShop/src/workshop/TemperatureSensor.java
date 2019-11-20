package workshop;

import java.util.Random;

public class TemperatureSensor extends Sensor {

    private double value;

    public TemperatureSensor() {
        this.value = Math.random() * 25 + 12 ;
    }

   

    @Override
    public String toString() {
        return "TemperatureSensor er : " + value + "C";
    }


}
