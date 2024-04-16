package Topic5;

public class ClassExample {
    private int gear;
    private int speed;

    public ClassExample(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void setGear(int newValue) {
        this.gear = newValue;
    }

    public void applyBrake(int decrement) {
        this.speed -= decrement;
    }

    public void speedUp(int increment) {
        this.speed += increment;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getGear() {
        return this.gear;
    }

    public static void main(String[] args) {
        ClassExample myBike = new ClassExample(3, 1);
        myBike.speedUp(1);
        System.out.println("Current speed is : " + myBike.getSpeed());
    }
}
