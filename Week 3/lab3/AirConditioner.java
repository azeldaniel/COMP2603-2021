
public class AirConditioner{
	
    private String brand;
    private int acID;
    private int btu;
    private boolean isOn;
    private String units;
    private String mode;
    private double roomTemperature;
    private double desiredTemperature;
    private static int acIDGenerator = 1000; //example of a class variable
    
    //Constructor
    public AirConditioner(String brand, int btu){
      this.brand = brand;
      this.btu = btu;
      acID = acIDGenerator; // assign value of class variable to instance variable 
      acIDGenerator++;  //increment class variable
      isOn = false;
      units = "Celsius";
      roomTemperature = 24;
      desiredTemperature =18;
      System.out.println("AC created " + acID);
      
    }
    
    //Accessors
    public String getBrand(){
        return brand;
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
        if(units.equals("Celsius"))
           return roomTemperature;
         else
           return convertCelsiusToFahrenheit(roomTemperature);
    }
    public double getDesiredTemperature(){
        if(units.equals("Celsius"))
            return desiredTemperature;
        else
           return convertCelsiusToFahrenheit(desiredTemperature);   
    }
    
    //Private helper method
    private double convertCelsiusToFahrenheit(double cValue){
        return cValue * 9/5 + 32;
     }
    
    //Private helper method
    private double convertFahrenheitToCelsius(double fValue){
        return fValue - 32 * 5/9;
     }

    //Mutators 
    public void setUnits(String value){
      if(value.equals("Fahrenheit"))
        units = "Fahrenheit";
    }
    
    public void setDesiredTemperature(double userTemperature){
        if(units.equals("Fahrenheit")){
            userTemperature = convertFahrenheitToCelsius(userTemperature);
        }
        if( (userTemperature >=15.0) && (userTemperature <=30.0))
            desiredTemperature = userTemperature;
        else
            System.out.println("Error in setting temperature" );
            
    }
    
    public void setMode(int userMode){
        switch(userMode){
            case 1: 
                mode = "Fan";
                break;
            case 2: 
                mode = "Dry";
                break;
            default:
                mode = "Cool";
                break;
        }
    }
    
    public String toString(){
        String details ="";
        details  += roomTemperature;
        return details;
    }
    
    
    /* This main method can be used for testing a class however it should be removed
     * when testing is completed.
    public static void main(String[] args){
        AirConditioner ac1 = new AirConditioner("Carrier",5000);
        ac1.setDesiredTemperature(20);
         AirConditioner ac2 = new AirConditioner("Carrier", 7000);
        ac2.setDesiredTemperature(15);
    }*/

}
