package workshop;

import java.util.Random;
import java.util.UUID;

public class TemperatureSensor extends Sensor {

<<<<<<< HEAD
    private double value;

    public TemperatureSensor() {
        this.value = Math.random()*((30-17)-1)+17;
    }

   
=======
    private double temp;
>>>>>>> master

    @Override
    public String toString() {
        return "TemperatureSensor er : " + temp +  "graders celsius";
    }

<<<<<<< HEAD
=======
    public TemperatureSensor(double value, double temp, String name, UUID id) {
        super(value, name, id);
        temp = Math.random() * 25 + 12;
        this.temp = temp;
    }
>>>>>>> master
}
