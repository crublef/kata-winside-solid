package i.segregation;

public class Phone implements IProduct {


    @Override
    public boolean readable() {
        throw new UnsupportedOperationException("A phone is not readable");
    }

    @Override
    public void swipe() {
        System.out.println("Swipe Event Fired");
    }

    @Override
    public void addToCart() {
        System.out.println("Add to cart proceeded");
    }
}
