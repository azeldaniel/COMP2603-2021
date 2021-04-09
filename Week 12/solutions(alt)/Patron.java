import java.util.*;
/**
 * Write a description of class Patron here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Patron
{
    private String name;
    private ArrayList<Ticket> tickets;
    
    public Patron(String name){
        this.name = name;
    }
    
    /*
    public Patron(Ticket ticket){
        this.ticket = ticket;
        this.name = "";
    }
    
    public Patron(String name, Ticket ticket){
        this.name = name;
        this.ticket = ticket;        
    }
    */
    
    public String getName(){
        return name;
    }
    
    public ArrayList<Ticket> getTickets(){
        return tickets;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void addTicket(Ticket ticket) {
        this.tickets.add(ticket);
    }
    
    public String toString(){
        String details = "Patron: " + name;
        if(tickets != null)
            details += " "+ tickets.toString(); 
        else
            details += " no ticket as yet";
        return details;
    }
    
    public boolean equals(Object obj){
        if (obj instanceof Patron){
            Patron p = (Patron)obj;
            if(this.name.equals(p.getName()))
                return true;
            else
                return false;
        }
        throw new ClassCastException();
    }
    
    public int hashCode(){
        String details = name + tickets.toString();
        return details.hashCode();
    }
}




