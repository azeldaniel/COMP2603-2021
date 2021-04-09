
/**
 * Write a description of class Ticket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ticket
{
    private int ticketNumber;
    private static int counter = 100;
    
    public Ticket(){
        ticketNumber = counter;
        counter = counter + 1;
    }
    
    public String toString(){
        return "Ticket: " + ticketNumber;
    }
}
