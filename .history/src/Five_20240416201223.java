public class Five {
    // * ******OOP (Classes, Inheritance, Abstraction, Polymorphism)****** */

    public class Bicycle {
        // Fields, attributes, or properties
        private int gear;
        private int speed;

        // Constructor
        public Bicycle(int startGear, int startSpeed) {
            System.out.println("First value: " + startGear);
            System.out.println("Second value: " + startSpeed);

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

        // Accessor methods
        public int getSpeed() {
            return speed;
        }

        public int getGear() {
            return gear;
        }

        public static void main(String[] args) {
            Bicycle myBike = new Bicycle(3, 0);
            myBike.speedUp(10);
            System.out.println("Current speed: " + myBike.getSpeed());
            System.out.println("Current gear: " + myBike.getGear());
        }
    }

}
