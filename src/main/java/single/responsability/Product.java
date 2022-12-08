package single.responsability;

public class Product {

    protected String name;
    protected double price;

    protected Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
