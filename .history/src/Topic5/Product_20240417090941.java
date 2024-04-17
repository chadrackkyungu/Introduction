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

    public void updateProduct(double newPrice) {
        price = newPrice;
    }

    public void setItem() {
        if (quantityAvailable > 0) {
            quantityAvailable--;
            System.out.println("Item sold. Remaining Quantity: " + quantityAvailable);
        } else {
            System.out.println("Item is out of stock.");
        }
    }
}
