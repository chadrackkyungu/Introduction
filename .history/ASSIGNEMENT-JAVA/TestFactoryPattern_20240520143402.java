/*4.1  You are tasked with implementing a factory design pattern for a car building process. The process involves several steps, from allocating accessories to final makeup. The main goal is to provide a structured approach for building different types of cars, such as Hatchback, Sedan, and SUVs, each with its specific characteristics and accessories. Define Abstract Factory Class. Start by defining an abstract class named CarFactory. This class should contain abstract methods representing the steps involved in the car-building process, such as allocateAccessories(), paintCar(), etc. Implement subclasses Hatchback, Sedan, and SUV, extending the CarFactory class. Each subclass should override the abstract methods to provide concrete implementations specific to that type of car.
Implement a TestFactoryPattern class to demonstrate the factory pattern in action. In this class, create instances of Hatchback, Sedan, and SUV and use the factory methods. Then, print out the details of each car, including its accessories and other specifications. Ensure that the factory pattern allows for easy extension and modification of the car building process without modifying existing code.

Write the classes according to the above specifications and demonstrate their functionality with appropriate test cases.     (20 Marks)
 * 
 * 
 */

public class TestFactoryPattern {
    public static void main(String[] args) {
        CarFactory hatchback = new Hatchback();
        CarFactory sedan = new Sedan();
        CarFactory suv = new SUV();

        System.out.println("Building a Hatchback:");
        hatchback.buildCar();
        System.out.println("\nBuilding a Sedan:");
        sedan.buildCar();
        System.out.println("\nBuilding an SUV:");
        suv.buildCar();
    }
}
