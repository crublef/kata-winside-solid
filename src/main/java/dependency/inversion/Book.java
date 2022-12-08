package dependency.inversion;

public class Book extends Product {

    protected Book(String name, double price) {
        super(name, price, new ProductPrinter());
    }
}
