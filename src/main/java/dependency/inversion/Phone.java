package dependency.inversion;

public class Phone extends Product {

    protected Phone(String name, double price) {
        super(name, price, new ProductPrinter());
    }
}
