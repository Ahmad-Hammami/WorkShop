package workshop;

public class VentilationActuator extends Actuator {
     private double value;

    public VentilationActuator() {
        this.value = 1;
    }
 
    @Override
    public String toString() {
        return "VentilationActuator er ;" + value ;
    }
    
}
