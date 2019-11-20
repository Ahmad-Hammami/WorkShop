package workshop;

public class Co2Sensor extends Sensor {
    private double co2;

    public Co2Sensor() {
        this.co2 = Math.random()*((1000-400)-1)+400;
    }

    
    @Override
    public String toString() {
        return "Co2Sensor er : " + co2;
    }

    public static void main(String[] args) {
        Co2Sensor cs = new Co2Sensor();
        System.out.println(cs);
      

    }
    
}
