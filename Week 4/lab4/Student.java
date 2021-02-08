//LAB 5 

public class Student {
    
    private String name;
    private int studentID;
    private double fees;
    private boolean graduated;
    private static int IDGenerator = 10;
    
    public Student() {
        fees = 275.00;
        graduated = false;
        studentID = IDGenerator;
        IDGenerator = IDGenerator + 10;
    }
    //mutators
    public void setName(String name){
        this.name = name;
    }
    
    public void setFees(double fees){
        this.fees = fees;
    }
    
    public void setGraduated(boolean graduated){
        this.graduated = graduated;
    }
    
    //accessors
    public String getName(){
        return  name;
    }
    
    public int getID(){
        return  studentID;
    }
    
    public double getFees(){
        return  fees;
    }
    
    public boolean hasGraduated(){
        return  graduated;
    }   
    
    public void calculateFees(){
    }
    
    public String toString(){
        return "NAME: " + name + " ID: " + studentID + " Fees: $"+ fees + " Graduated: "+ graduated;
    }
    
}
