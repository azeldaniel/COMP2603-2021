
/**
 * Write a description of class CoolingSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CoolingSystem
{
    public static void main(String[] args){
        
        // 8 a)
        AirConditioner ac1 = new AirConditioner("Carrier", "Atrium", 34, false);
        AirConditioner ac2 = new AirConditioner("Lennox", "Lobby", 93, false);
        AirConditioner ac3 = new AirConditioner("Trane", "Kitchen", 67, true);
        
        // ac1.setBrand("Carrier");
        // ac1.setLocation("Atrium");
        
        // 8 b)
        AirConditioner[] acs = {ac1, ac2, ac3};
        AirConditioner[] acs2 = { 
            new AirConditioner("Carrier", "Atrium", 34, false),
            new AirConditioner("Lennox", "Lobby", 93, false),
            new AirConditioner("Trane", "Kitchen", 67, true),
        };
        
        // 8 c)
        for(int i = 0; i < 3; i++){
            System.out.println(acs[i].toString());
        }
        
        //ac1.
        acs[0].turnOn();
        acs[0].setUnits("Celsius");
        acs[0].setMode(3);
        acs[0].setDesiredTemperature(19.5);
        
        acs[1].turnOn();
        acs[1].setMode(1);
        acs[1].setDesiredTemperature(16.3);
        acs[1].setUnits("Fahrenheit");
        
        acs[2].turnOff();
        acs[2].setUnits("Celsius");
        acs[2].setMode(2);
        acs[2].setDesiredTemperature(24.0);
        
        for(int i = 0; i < 3; i++){
            System.out.println(acs[i].toString());
        }
    }
}
