package workshop;

import java.util.ArrayList;
import java.util.UUID;

public class Building extends Unit {
    ArrayList<Sensor> sensorList = new ArrayList<>();
    ArrayList<Actuator> actuatorList = new ArrayList<>();

    public ArrayList<Sensor> getSensorList() {
        return sensorList;
    }

    public ArrayList<Actuator> getActuatorList() {
        return actuatorList;
    }

    public UUID addTemperatureSensor(String name) {
         
    }
    
    public UUID addCo2Sensor(String name) {
        
    }
    
    public UUID addVentilationActuator(String name){
        
    }
    
    public void removeTemperatureSensor(){
        
    }
    
    public void removeActuatorSensor(){
        
    }
    
}
