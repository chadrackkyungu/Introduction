package Topic5;

//* **************Car Dealership System************** */

/* 
You are helping a car dealership automate their systems. As part of the system, you need to develop a Car class that manages information about the vehicles in the inventory. The class should meet the following specifications:

Car Definition:

Each car should have a make (String), model (String), and year (int) to represent its brand, model, and year of manufacture, respectively.
Functional Requirements:

Include a method to update the manufacturing year of the car. However, ensure that the new year is only updated if it is more recent than the current year.
Include a method to display the information about the car in a format like "Car: [make] [model] ([year])".
Usage Scenario:

Instantiate an object of the Car class with specific make, model, and year values.
Display the initial details of the car.
Attempt to update the car's year to a new value and display the updated information.
Try to set the year to an older value than the car currently has, handle this error gracefully, and confirm the year has not been changed by displaying the details again.
*/

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
            System.out.println("New year must be grater than the current year.");
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
