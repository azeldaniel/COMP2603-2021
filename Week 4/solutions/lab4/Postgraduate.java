
/**
 * Write a description of class Postgraduate here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Postgraduate extends Student
{
    private String supervisor;
    private String thesisTitle;
    private String status;

    public Postgraduate(String name, String supervisor, 
            String thesisTitle)
    {
        super(name);
        this.supervisor = supervisor;
        this.thesisTitle =  thesisTitle;
        status = "Full Time";
    }
    
    public void calculateFees(){
        if(status.equals("Full Time")){
            setFees(2650.0);
        }else{
            setFees(1325.0);
        }
    }
    
    public void setStatus(String s){
        status = s;
    }

     public String toString(){
        String details = super.toString();
        details = "PGRAD - "+ details + " SUPERVISOR: "+ 
            this.supervisor + " THESIS: "+ this.thesisTitle + 
            " STATUS: "+ this.status;
        return details;
    }
}
