
public class Room{
   
    private String name;
    private int floor;
    private double squareFootage;
    private String roomID;
    private int numSeats;
    
    public Room(String name, int floor, double squareFootage ){
        this.name = name;
        this.floor = floor;
        this.squareFootage = squareFootage;
        roomID = "FST";
        setNumSeats();
    }

    //Default average for the number of seats based on room size
    private void setNumSeats( ){
        float seats = (float)squareFootage * 9/20;
        numSeats = java.lang.Math.round(seats);
     }
     
     public String getRoomID(){
         return roomID;
     }
    
     /*public String toString(){
       String details = "Room : " roomID + " " + name + " Floor: " + floor + " " + squareFootage + "sq ft.  Num Seats: " + numSeats; 
         return details;
     
     }*/
  }
    

