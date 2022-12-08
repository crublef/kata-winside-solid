package open.close;

public class Electronics extends Product {

    public Electronics(String name, double price, String type) {
        super(name, price, type);
    }

    @Override
    public double calculatePrice() {
        return this.price * 1.18;
    }
}
