
public class Room {

    private String name;
    private int floor;
    private double squareFootage;
    private String roomID;
    private int numSeats;
    private AirConditioner[] airConditioners;
    private int numACs;

    private static int floor1IDGenerator = 100;
    private static int floor2IDGenerator = 200;

    public Room(String name, int floor, double squareFootage) {
        this.name = name;
        this.floor = floor;
        this.squareFootage = squareFootage;
        roomID = "FST";
        setNumSeats();
        numACs = 0;
        airConditioners = new AirConditioner[5];
    }

    public Room(String name, int floor, double squareFootage, int numSeats) {
        this.name = name;
        this.floor = floor;
        this.squareFootage = squareFootage;
        roomID = "FST";
        this.numSeats = numSeats;
        numACs = 0;
        airConditioners = new AirConditioner[5];
    }

    // Default average for the number of seats based on room size
    private void setNumSeats() {
        float seats = (float) squareFootage * 9 / 20;
        numSeats = java.lang.Math.round(seats);
    }

    public String getRoomID() {
        return roomID;
    }

    public int getFloor() {
        return floor;
    }

    public String toString() {
        String details = "Room : " + roomID + " " + name + " Floor: " + floor + " " + squareFootage
                + "sq ft.  Num Seats: " + numSeats;
        return details;

    }

    public void generateRoomID(int floor) {
        if (floor == 1) {
            roomID = roomID + floor1IDGenerator;
            floor1IDGenerator = floor1IDGenerator + 10;
        }
        if (floor == 2) {
            roomID = roomID + floor2IDGenerator;
            floor2IDGenerator = floor2IDGenerator + 10;
        }
    }

    public void addAirConditioner(AirConditioner ac) {
        if (numACs < 5) {
            airConditioners[numACs] = ac;
            numACs++;
        }
    }

    public String listAirConditioner() {
        if (numACs == 0) {
            return "No A/Cs are installed in this room";
        } else {
            String details = "ACS: ";
            for (int i = 0; i < numACs; i++) {
                details += "\n" + airConditioners[i].toString();
            }
            return details;
        }
    }
}
