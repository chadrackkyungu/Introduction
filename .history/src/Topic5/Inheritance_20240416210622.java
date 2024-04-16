package Topic5;

public class Inheritance extends ClassExample {

    // New field for MountainBike only
    private int seatHeight;

    // Constructor
    public Inheritance(int startHeight, int startSpeed, int startGear) {
        super(startGear, startSpeed);
        seatHeight = startHeight;
    }

    // New method for MountainBike only
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public static void main(String[] args) {

        Inheritance myBike = new Inheritance(20, 10, 3);
        myBike.speedUp(15); // increase speed to 15 = 10 + 15

        myBike.setHeight(25); // change the value of the height to 25
        System.out.println("Current speed: " + myBike.getSpeed() + " Seat height: " + myBike.seatHeight);
    }

}
