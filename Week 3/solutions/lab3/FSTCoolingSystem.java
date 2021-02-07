
public class FSTCoolingSystem{
   public static void main(String[] args){
    
     // Declare and instantiate your array of Room objects
     Room[] rooms = new Room[10];


     // Create and add Room objects to your array
     Room r1 = new Room ("Lecture Room 1", 1, 120);
     Room r2 = new Room ("Computer Science Lab 1", 2, 100);
     Room r3 = new Room ("Computer Science Lab 2", 1, 150);
     Room r4 = new Room ("Lecture Room 2", 1, 300);
     
     rooms[0] = r1;
     rooms[1] = r2;
     rooms[2] = r3;
     rooms[3] = r4;
     
     // Loop through the array and invoke the toString( ) method of the Room objects
     for(int i = 0; i < 4; i++){
         System.out.println(rooms[i].toString());
     }
     
     
     Room r5 = new Room ("Lecture Room 3", 2, 175, 70);
     rooms[4] = r5;
     System.out.println("\nUpdated Array");
     for(int i = 0; i < 5; i++){
         System.out.println(rooms[i].toString());
     }
     
     
     System.out.println("\nUpdated Array with IDs");
     //Room.floor1IDGenerator = -50;
     //System.out.println("floor1IDGenerator(before): "+ Room.floor1IDGenerator);
     //System.out.println("floor2IDGenerator(before): "+ Room.floor2IDGenerator);
     for(int i = 0; i < 5; i++){
         rooms[i].generateRoomID(rooms[i].getFloor());
         System.out.println(rooms[i].toString());
     }
     //System.out.println("floor1IDGenerator(after): "+ Room.floor1IDGenerator);
     //System.out.println("floor2IDGenerator(after): "+ Room.floor2IDGenerator);
     
     //System.out.println(rooms[0].floor1IDGenerator);
     //System.out.println(rooms[1].floor1IDGenerator);
     
     System.out.println("\nDetails of FST100 and FST210");
     for(int i = 0; i < 5; i++){
         String roomID = rooms[i].getRoomID(); 
         if(roomID.equals("FST100") || roomID.equals("FST210")){
             System.out.println(rooms[i].toString());
         }
     }
     
     System.out.println("\nAssociating Ac1 with FST210");
     AirConditioner ac1 = new AirConditioner("Carrier", 5000);
     for(int i = 0; i < 5; i++){
         String roomID = rooms[i].getRoomID(); 
         if(roomID.equals("FST210")){
             ac1.cools(rooms[i]);
             rooms[i].addAirConditioner(ac1);
             //System.out.println(rooms[i].toString());
             System.out.println(rooms[i].listAirConditioner());
         }
     }
     System.out.println(ac1.listRoom());
     
     System.out.println("\nAssociating Ac2 with FST210");
     AirConditioner ac2 = new AirConditioner("Carrier", 6000);
     for(int i = 0; i < 5; i++){
         String roomID = rooms[i].getRoomID(); 
         if(roomID.equals("FST210")){
             rooms[i].addAirConditioner(ac2);
             System.out.println(rooms[i].listAirConditioner());
         }
     }
     System.out.println(ac2.listRoom());
     
     AirConditioner ac3 = new AirConditioner("Peak", 1800);
     for(int i = 0; i < 5; i++){
         String roomID = rooms[i].getRoomID(); 
         if(roomID.equals("FST120")){
             ac3.cools(rooms[i]);
             rooms[i].addAirConditioner(ac3);
         }
     }
     
     System.out.println("\nUpdated Array and ACs");
     for(int i = 0; i < 5; i++){
         System.out.println("\n"+rooms[i].toString());
         System.out.println(rooms[i].listAirConditioner());
     }
   }
}





