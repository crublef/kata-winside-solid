package dependency.inversion;

public abstract class Product implements  IPrintable{

    protected String name;
    protected double price;

    protected IPrinter printer;

    protected Product(String name, double price, IPrinter printer) {
        this.name = name;
        this.price = price;
        this.printer = printer;
    }


}
