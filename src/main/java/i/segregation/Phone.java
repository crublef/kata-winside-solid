package i.segregation;

public class Phone implements ISwipeable, IAddable {


    @Override
    public void swipe() {
        System.out.println("Swipe Event Fired");
    }

    @Override
    public void addToCart() {
        System.out.println("Add to cart proceeded");
    }
}
