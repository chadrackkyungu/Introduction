package Topic5;

public class Classes {
    private int gear;
    private int speed;

    public Classes(int gear, int speed) {
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
        Classes myBike = new Classes(3, 1);

        myBike.speedUp(3); // increment the speed from 1 to 3 = 4
        myBike.applyBrake(1); // decrement the speed from 1 to 1 = 3 4- 1 = 3

        System.out.println("Current speed is : " + myBike.getSpeed());
    }
}
