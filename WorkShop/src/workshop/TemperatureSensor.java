package workshop;

import java.util.Random;
import java.util.UUID;

public class TemperatureSensor extends Sensor {

    private double temp;

    @Override
    public String toString() {
        return "TemperatureSensor er : " + temp +  "graders celsius";
    }

    public TemperatureSensor(double value, double temp, String name, UUID id) {
        super(value, name, id);
        temp = Math.random() * 25 + 12;
        this.temp = temp;
    }
}
