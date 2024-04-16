public class ClassExample {

    // * Main method that run the application
    public static void main(String[] args) {

        ClassExample myBike = new ClassExample(3, 1);

        myBike.speedUp(5);
        System.out.println("Current speed: " + myBike.getSpeed());
        System.out.println("Current gear: " + myBike.getGear());
    }

    // fields, attributes, or properties
    private int gear;
    private int speed;

    // constructors
    public ClassExample(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    // Methods to set the gear
    public void setGear(int newValue) {
        this.gear = newValue;
    }

    // Method to apply the brake
    public void applyBrake(int decrement) {
        this.speed -= decrement;
    }

    // Method to increase speed
    public void speedUp(int increment) {
        this.speed += increment;
    }

    // Accessor method for speed
    public int getSpeed() {
        return this.speed;
    }

    // Accessor method for gear
    public int getGear() {
        return this.gear;
    }
}