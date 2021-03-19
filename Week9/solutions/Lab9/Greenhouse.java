import java.util.*;

public class Greenhouse
{
    public static void main(String args[]){
        Collection<Plant> vegetables = new LinkedList<Plant>();
        
        Plant p1 = new Plant("Large Tomato");   
        Plant p2 = new Plant("Small Tomato");  
        Plant p3 = new Plant("Potato");
        
        vegetables.add(p1);
        vegetables.add(p2);
        vegetables.add(p3);
        
        if(vegetables.isEmpty()){
            System.out.println("No plants were found in the vegetables collection");
        }else{
            for(Plant p: vegetables){
                System.out.println(p);
            }            
        }
        
        if(vegetables.contains("Large Tomato"))  // line1
            System.out.println("Large Tomato Plant found");
        else
            System.out.println("No Large Tomato Plant found");

        /*vegetables.add(p1);
        for(Plant p: vegetables){
            System.out.println(p);
        }*/   
        
        Plant p4 = new Plant("Small Tomato");
        vegetables.add(p4);
        
        Plant p5 = new Plant("Small Potato");
        vegetables.add(p5);
        System.out.println("\n");
        for(Plant p: vegetables){
            System.out.println(p);
        } 
        
        
        Plant p6 = new Plant("Small Potato");
        if(vegetables.contains(p6) )  // line1
            System.out.println("Small Potato Plant found");
        else
            System.out.println("No Small Potato Plant found");
        
            
        vegetables.add(p6);
        
        LinkedList<Plant> plants = (LinkedList)vegetables;
        Plant fourth = plants.get(3);
        System.out.println("Index of Potato: " + plants.indexOf(p3));
        
        Plant p7 = new Plant("Lettuce");
        plants.add(plants.get(2));
        plants.set(2, p7);
        
        System.out.println("\n");
        for(Plant p: vegetables){
            System.out.println(p);
        } 
        
        Plant p8 = new Plant("Soursop");
        Plant p9 = new Plant("Celery");
        Plant p10 = new Plant("Mango");
        plants.add(p8);
        plants.add(p9);
        plants.add(p10);
        
        System.out.println("\n");
        for(Plant p: vegetables){
            System.out.println(p);
        } 
        
        Plant first = plants.remove(0);
        plants.add(plants.size()/2, first);
        System.out.println("\n");
        for(Plant p: vegetables){
            System.out.println(p);
        } 
        
        ArrayList<Plant> plantsList = new ArrayList<Plant>();
        List<Plant> subList = plants.subList(0,plants.size()/2);
        plantsList.addAll(subList);
        
        System.out.println("\n");
        for(Plant p: plantsList){
            System.out.println(p);
        } 
    }
}







