package i.segregation;

public class Book implements IReadable, IAddable {
    @Override
    public boolean read() {
        return false;
    }

    @Override
    public void addToCart() {
        System.out.println("Add to cart proceeded");
    }
}
