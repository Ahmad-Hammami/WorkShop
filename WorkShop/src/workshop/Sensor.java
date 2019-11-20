package workshop;

import java.util.UUID;

public abstract class Sensor extends Unit {
    double value;

    public double getValue() {
        return value;
    }

    public Sensor(double value, String name, UUID id) {
        super(name, id);
        this.value = value;
    }
    
}
