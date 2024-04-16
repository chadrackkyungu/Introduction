public class Five {
    // * ******OOP (Classes, Inheritance, Abstraction, Polymorphism)****** */

    public static void main(String[] args) throws Exception {

        Bicycle myBike = new Bicycle(3, 2);
        myBike.speedUp(10);
        System.out.println(" Current speed: " + myBike.getSpeed());

        myBike.applyBrake(4);
    }
}

class Bicycle {

    // Fields, attributes, or properties
    private int gear;
    private int speed;

    // Constructor
    public Bicycle(int startGear, int startSpeed) {

        System.out.println(" First value : " + startGear);
        System.out.println(" Second value : " + startSpeed);

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
    // end

    // Accessor method
    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

}
