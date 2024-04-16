public class Five {
    // * ******OOP (Classes, Inheritance, Abstraction, Polymorphism)****** */

    public static void main(String[] args) throws Exception {
Bicycle myBike= new Bicycle(3, 0);
myBike.speedUp(10);
System.out.println(" Current speed: " + myBike.getSpeed())
    }
}

class Bicycle {

    // Fields, attributes, or properties
    private int gear;
    private int speed;

    // Constructor
    public Bicycle(int startGear, int startSpeed) {
        gear = startGear;
        speed = startSpeed;
    }

    // Methods
    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    // Accessor method
    public int getSpeed() {
        return speed;
    }

}
