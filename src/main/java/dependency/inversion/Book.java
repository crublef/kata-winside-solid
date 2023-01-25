package dependency.inversion;

public class Book extends Product {

    protected Book(String name, double price) {
        super(name, price, new ProductPrinter());
    }

    @Override
    public void print() {
        this.printer.print("Book has been added to cart");
    }
}
