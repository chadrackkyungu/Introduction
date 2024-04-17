package Topic5;

/* *********Product Inventory Management System **********/

/*
 You are tasked with developing a small part of an inventory management system for an e-commerce platform to help manage products more efficiently. The requirements are as follows:

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

public class Product {

    private String productId;
    private String name;
    private double price;
    private int quantityAvailable;

    public Product(String productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantityAvailable = quantity;
    }

    // this method will changed the price property after it been called and received
    // the price
    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    // this method will changed the quantity property after it was called and
    // received the quantity
    public void sellItem() {
        if (this.quantityAvailable > 0) {
            this.quantityAvailable--; // this reduces the quantity
            System.out.println("Item sold. Remaining Quantity: " + this.quantityAvailable);
        } else {
            System.out.println("Item is out of stock.");
        }
    }

    // this method will display the item details when it been called
    public void displayInfo() {
        System.out.println("************START*************");
        System.out.println("Product ID: " + this.productId);
        System.out.println("Name: " + this.name);
        System.out.println("Price: $" + this.price);
        System.out.println("Available Quantity: " + this.quantityAvailable);
        System.out.println("************END*************");
    }

    public static void main(String[] args) {

        // Create a product instance by calling our constructor special method
        Product camera = new Product("CAM12345", "Nikon D3500", 475.00, 10);

        // Display product information
        camera.displayInfo();

        // Selling an item
        camera.sellItem(); // when this function is called it will reduce 10 - 1
        camera.displayInfo(); // now display the new item

        // Updating price
        camera.updatePrice(450.00); // Whe this function is called it will update the price of the item
        camera.displayInfo();

        // Selling another item
        camera.sellItem();
        camera.displayInfo();
    }
}
