package liskov;
public abstract class Product {

    protected String name;
    protected double price;

    protected Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
