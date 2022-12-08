package open.close;

public abstract class Product {

    private final String name;
    protected final double price;
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

    public abstract double calculatePrice();
}
