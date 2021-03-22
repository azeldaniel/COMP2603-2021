
package lab10;

/**
 * @author phaedramohammed
 */
public class Lab10 {

    // Main method 
    public static void main(String[] args) {
        Nursery n = new Nursery();
        GreenhouseGUI gui = new GreenhouseGUI(n);
        gui.setVisible(true);        
    }
    
}
