
/**
 * Write a description of class Plant here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Plant
{
    private String name;
    
    public Plant(String name){
        this.name = name;
    }
    
    public String toString(){
        return "Plant Name: " + name;
    } 
    
    public boolean equals(Object obj){
        if(obj instanceof Plant){
            Plant p = (Plant)obj;
            if(p.name.equals(this.name))
                return true;
        }
        return false;
    }
}
