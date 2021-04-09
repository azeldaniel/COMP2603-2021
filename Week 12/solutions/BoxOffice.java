import java.util.*;

public class BoxOffice
{
    private ArrayList<Patron> patrons;
    private HashMap<String,LinkedList<Patron>> patronsMap;
    
    public BoxOffice(){
        patrons = new ArrayList<Patron>();
        patronsMap = new HashMap<String,LinkedList<Patron>>();
    }
    
    public void addPatron(Patron p){
        patrons.add(p);
    }
    
    public ArrayList<Patron> getPatrons(){
        return patrons;
    }
    
    public void findPatron(String name){
        Iterator<Patron> iter = patrons.iterator();
        boolean found = false;
        
        while(iter.hasNext()){
            Patron realP = iter.next();
            Patron fakeP = new Patron(name);
            if(realP.equals(fakeP)){
                System.out.println("Patron found "+name);
                found = true;
            }
        }
        
        if(!found){
            System.out.println("Patron not found");
        }
    }
    
    public void addPatronInMap(Patron p){
        LinkedList<Patron> patronsWithSameName = patronsMap.get(p.getName());
        if(patronsWithSameName != null){
            patronsWithSameName.add(p);
        }else{
            patronsWithSameName = new LinkedList<Patron>();
            patronsWithSameName.add(p);
            patronsMap.put(p.getName(), patronsWithSameName);
        }
    }
    
    public HashMap<String,LinkedList<Patron>> getPatronsMap(){
        return patronsMap;
    }
    
    public void findPatronInMap(String name){
        LinkedList<Patron> ps = patronsMap.get(name);
        if(ps != null)
            System.out.println("One or more patron objects found found "+name);
        else
            System.out.println("Patron not found");            
    }
    
    public static void main(String args[]){
        BoxOffice office = new BoxOffice();
        
        Patron p1 = new Patron("John Doe", new Ticket());
        Patron p2 = new Patron("Jane Doe", new Ticket());
        Patron p3 = new Patron("Johannes Borg", new Ticket());
        Patron p4 = new Patron("John Doe", new Ticket());
        Patron p5 = new Patron("Mary Doe", new Ticket());
        Patron p6 = new Patron("Just Mike", new Ticket());
        
        office.addPatron(p1);
        office.addPatron(p2);
        office.addPatron(p3);
        office.addPatron(p4);
        office.addPatron(p5);
        office.addPatron(p6);
        
        for(Patron p: office.getPatrons()){
            System.out.println(p.toString());
        }
        
        office.findPatron("Johannes Borg");
    }
    
}
