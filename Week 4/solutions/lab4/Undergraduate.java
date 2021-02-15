
/**
 * Write a description of class Undergraduate here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Undergraduate extends Student {
    
    private String minor;
    private String major;
    private int credits;
    

    
    public Undergraduate()
    {
        
    }
    
    public void calculateFees(){
        setFees(credits * 200.0);
    }
    
    
    public String getMinor(){
        return minor;
    }
    
    public String getMajor(){
        return major;
    }
    
    public int getCredits(){
        return credits;
    }
    
    
    
    public void setMinor(String minor){
        this.minor = minor;
    }
    
    public void setMajor(String major){
        this.major = major;
    }
    
    public void setCredits(int credits){
        this.credits = credits;
    }
    
    public String toString(){
        String details = super.toString();
        details = "UGRAD - "+ details + " MAJOR: "+ this.major + " MINOR: "+
            this.minor + " CREDITS: "+ this.getCredits();
        return details;
    }
}


