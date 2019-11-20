package workshop;

public class Co2Sensor extends Sensor {
    private double value;

    public Co2Sensor() {
        this.value = Math.random()*((1000-400)-1)+400;
    }

    
    @Override
    public String toString() {
        return "Co2Sensor er : " + value + "ppm";
    }
    
}
