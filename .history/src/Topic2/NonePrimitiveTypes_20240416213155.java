package Topic2;

public class NonePrimitiveTypes {

    public static void main(String[] args) throws Exception {

        String greeting = " Hello John";

        // * arrays
        int[] array = new int[10];
        array[0] = 100;
        array[1] = 200;

        System.out.println(greeting);
        System.out.println("First element of array: " + array[0]);
        System.out.println("Second element of array: " + array[1]);

        Bicycle myBike = new Bicycle(20, 0, 5);
        System.out.println("Gear of my bike is : " + myBike.getGear());
        System.out.println("Speed of my bike is : " + myBike.getSpeed());

    }
}

class Bicycle {
    private int speed;
    private int cadence;
    private int gear;

    public Bicycle(int startSpeed, int startCadence, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void applyBrakes(int decrement) {
        speed -= decrement;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }
}
