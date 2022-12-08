package dependency.inversion;

public abstract class Product {

    protected String name;
    protected double price;

    protected ProductPrinter productPrinter;

    protected Product(String name, double price, ProductPrinter productPrinter) {
        this.name = name;
        this.price = price;
        this.productPrinter = productPrinter;
    }

    protected void print(String text) {
        this.productPrinter.print(text);
    }
}
