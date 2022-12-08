package open.close;

public class Product {

    private final String name;
    private final double price;
    private final String type;

    public Product(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getType() {
        return type;
    }
}
