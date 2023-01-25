package dependency.inversion;

public class ShoppingCartService implements IShoppingCartService {
    @Override
    public void addToCart(IPrintable printable) {
        printable.print();
    }
}
