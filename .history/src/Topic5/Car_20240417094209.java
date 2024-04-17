package Topic5;

/* *********Product Inventory Management System **********/

/*
 * 
 * You are tasked with developing a small part of an inventory management system for an e-commerce platform to help manage products more efficiently. The requirements are as follows:

Product Definition: Define a class Product that can represent any item in the inventory with the following attributes:

productId (String): a unique identifier for the product
name (String): the name of the product
price (double): the current price of the product
quantityAvailable (int): how many units of the product are currently in stock
Behavioral Requirements:

Implement a method to update the price of the product.
Implement a method to process the sale of the product, which decrements the quantity available by one each time a sale is made. Ensure the method checks if the product is in stock before a sale is processed.
Implement a method to display the product’s details in a user-friendly format.
Operational Scenario:

Create an instance of the Product class with a specified id, name, price, and quantity.
Display the initial state of the product.
Process a sale and then display the new state of the product.
Update the price of the product and show the final state.
The system should be robust enough to handle incorrect updates (e.g., setting an earlier year for a product release should be rejected).

Develop the class with appropriate methods and test it in a main method simulating these operations.
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
