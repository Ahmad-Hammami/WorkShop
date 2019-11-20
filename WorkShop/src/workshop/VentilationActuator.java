package workshop;

import java.util.UUID;

public class VentilationActuator extends Actuator {
     private double value;

    public VentilationActuator() {
        this.value = 1;
    }
 
    @Override
    public String toString() {
        return "VentilationActuator er ;" + value ;
    }

    public VentilationActuator(double value, String name, UUID id) {
        super(value, name, id);
    }
    
    
}
