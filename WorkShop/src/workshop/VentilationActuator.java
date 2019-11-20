package workshop;

import java.util.UUID;

public class VentilationActuator extends Actuator {

    @Override
    public String toString() {
        return "VentilationActuator{" + '}';
    }

    public VentilationActuator(double value, String name, UUID id) {
        super(value, name, id);
    }
    
    
}
