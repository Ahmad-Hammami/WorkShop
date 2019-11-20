package workshop;

import java.util.ArrayList;
import java.util.UUID;

public class Building extends Unit {
    private ArrayList<Sensor> sensorList = new ArrayList<>();
    private ArrayList<Actuator> actuatorList = new ArrayList<>();

    public Building(String name, UUID id) {
        super(name, id);
    }

    public ArrayList<Sensor> getSensorList() {
        return sensorList;
    }

    public ArrayList<Actuator> getActuatorList() {
        return actuatorList;
    }

    public UUID addTemperatureSensor(UUID id) {
         return id;
    }
    
    public UUID addCo2Sensor(UUID id) {
        return id;
    }
    
    public UUID addVentilationActuator(UUID id){
        return id;
    }
    
    public void removeTemperatureSensor(UUID id){
        
    }
    
    public void removeActuatorSensor(UUID id){
        
    }
    
}
