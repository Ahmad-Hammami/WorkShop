package workshop;

import java.util.UUID;

public class Co2Sensor extends Sensor {
    private double co2;

    @Override
    public String toString() {
        return "Co2Sensor er : " + co2;
    }

    public Co2Sensor(double co2, double value, String name, UUID id) {
        super(value, name, id);
        co2 = Math.random()*((1000-400)-1)+400;
        this.co2 = co2;
    }
}
