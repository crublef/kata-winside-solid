package dependency.inversion;

public class ShoppingCartService {

    public void addToCart(Product product) {
        if (product instanceof Book book) {
            book.print("Book has been added to cart");
        } else if (product instanceof Phone) {
            product.print("Phone has been added to cart");
        } else {
            System.out.println("Nothing has been added to cart");
        }
    }
}
