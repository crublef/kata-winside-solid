package i.segregation;

public class Book implements IProduct {


    @Override
    public boolean readable() {
        return false;
    }

    @Override
    public void swipe() {
        throw new UnsupportedOperationException("swipe is not supported");
    }

    @Override
    public void addToCart() {
        System.out.println("Add to cart proceeded");
    }
}
