package workshop;

import java.util.UUID;

public abstract class Actuator extends Unit {
    private double value;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Actuator(double value, String name, UUID id) {
        super(name, id);
        this.value = value;
    }
    
}
