
/**
 * Write a description of class AirConditioner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AirConditioner
{
    // instance variables - replace the example below with your own
    private String brand;
    private String location;
    private int acID;
    private boolean isOn;
    private String units;
    private String mode;
    private double roomTemperature;
    private double desiredTemperature;

    /**
     * Constructor for objects of class AirConditioner
     */
    /*public AirConditioner()
    {
        // initialise instance variables
        brand = null;
        location = null;
        acID = 0;
        isOn = false;
        units = "Celsius";
        mode = "Cool";
        roomTemperature = 24;
        desiredTemperature = 18;
    }*/
    
    public AirConditioner(String brand, String location, 
                            int acID, boolean isOn){
        this.brand = brand;
        this.location = location;
        this.acID = acID;
        this.isOn = isOn;
        units = "Celsius";
        mode = "Cool";
        roomTemperature = 24;
        desiredTemperature = 18;
    }
    
    public String getBrand(){
        return brand;
    }
    
    public String getLocation(){
        return location;
    }
    
    public int getAcID(){
        return acID;
    }
    
    public boolean getIsOn(){
        return isOn;
    }
    
    public String getUnits(){
        return units;
    }
    
    public String getMode(){
        return mode;
    }
    
    public double getRoomTemperature(){
        return this.roomTemperature;
    }
    
    public double getDesiredTemperature(){
        return desiredTemperature;
    }
    
    public void setUnits(String units){
        if(units.equals("Fahrenheit")){
            this.units = "Fahrenheit";
        }else{
            if(units.equals("Celsius")){
                this.units = "Celsius";
            }else{
                System.out.println("Invalid units specified");
            }
        } 
        
    }
    
    public void setMode(int mode){
        switch(mode){
            case 1:
                this.mode = "Fan"; break;
            case 2:
                this.mode = "Dry"; break;
            case 3:
                this.mode = "Cool"; break;
            default:
                System.out.println("Invalid mode specified"); break;
        }
    }
    
    public boolean turnOff(){
        if(this.isOn == true){
            this.isOn = false; // ac is now turned off
            return true; // successfully turning off of ac
        }
        return false; // failed to turn off ac... already off
    }
    
    
    public boolean turnOn(){
        if(!this.isOn){
            this.isOn = true; // ac is now turned on
            return true; // successfully turning on of ac
        }
        return false; // failed to turn on ac... already on
    }
    
    public String toString(){
        String details = "AC, ID: "+ acID;
        details += " Current Temp: " + roomTemperature + " " + units;
        details += " Desired Temp: " + desiredTemperature + " " + units;
        details += " On: " + isOn;
        details += " Mode: " + mode;
        details += " Brand: " + brand;
        details += " Location: " + location;
        return details;
    }
    
    private double convertCelsiusToFahrenheit(double celsiusValue){
        return (celsiusValue * (9/5)) + 32;
    }
    
    private double convertFahrenheitToCelsius(double fahrenheitValue){
        return (fahrenheitValue - 32) * (5/9);
    }
    
    public void setDesiredTemperature(double temp){
        if(this.units.equals("Fahrenheit")){
            temp = this.convertFahrenheitToCelsius(temp);
        }
        if((temp >= 15.0) && (temp <= 30.0)){
            if(this.units.equals("Fahrenheit")){
                this.desiredTemperature = this.convertCelsiusToFahrenheit(temp);
            }else{
                this.desiredTemperature = temp;
            }
        }else{
            System.out.println("Invalid temperature specified");
        }
    }
}













