public class Car {
    private String make; // Field to store the make of the car
    private String model; // Field to store the model of the car
    private int year; // Field to store the manufacturing year of the car

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to update the car's year
    public void updateYear(int newYear) {
        if (newYear > year) {
            this.year = newYear;
        } else {
            System.out.println("New year must be later than the current year.");
        }
    }

    // Method that uses the fields
    public void displayInfo() {
        System.out.println("Car: " + make + " " + model + " (" + year + ")");
    }

    public static void main(String[] args) {
        // Creating a car object
        Car myCar = new Car("Toyota", "Corolla", 2015);

        // Display initial car information
        myCar.displayInfo();

        // Updating the car's year
        myCar.updateYear(2018);
        myCar.displayInfo(); // Display updated info

        // Attempt to set the year to an older year
        myCar.updateYear(2010); // This should fail with an error message

        // Display final car information
        myCar.displayInfo();
    }
}
