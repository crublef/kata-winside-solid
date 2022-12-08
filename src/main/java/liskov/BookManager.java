package liskov;
public class BookManager extends ProductManager {
    @Override
    void addToCart(Product product) {
        if (product instanceof Book book) {
            System.out.println(book.getName() + " has been added to cart");
        } else {
            throw new UnsupportedOperationException("swipe is not supported");
        }
    }
}
