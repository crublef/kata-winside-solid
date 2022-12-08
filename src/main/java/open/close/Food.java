package open.close;

public class Food extends Product{
    public Food(String name, double price, String type) {
        super(name, price, type);
    }

    @Override
    public double calculatePrice() {
        return this.price + this.price*0.8;
    }

}
