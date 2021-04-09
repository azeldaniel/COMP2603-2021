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
    private Ticket ticket;
    
    public Patron(String name){
        this.name = name;
    }
    
    public Patron(Ticket ticket){
        this.ticket = ticket;
        this.name = "";
    }
    
    public Patron(String name, Ticket ticket){
        this.name = name;
        this.ticket = ticket;        
    }
    
    public String getName(){
        return name;
    }
    
    public Ticket getTicket(){
        return ticket;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    
    public String toString(){
        String details = "Patron: " + name;
        if(ticket != null)
            details += " "+ ticket.toString(); 
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
        String details = name + ticket.toString();
        return details.hashCode();
    }
}




