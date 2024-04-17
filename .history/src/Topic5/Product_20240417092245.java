package Topic5;

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
        System.out.println("Product ID: " + this.productId);
        System.out.println("Name: " + this.name);
        System.out.println("Price: $" + this.price);
        System.out.println("Available Quantity: " + this.quantityAvailable);
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
