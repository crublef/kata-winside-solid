package open.close;

public class Car extends Product {


    public Car(String name, double price, String type) {
        super(name, price, type);
    }

    @Override
    public double calculatePrice() {
        return this.price * 1.60 * 1.18;
    }
}
