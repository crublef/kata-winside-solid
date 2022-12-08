    package liskov;
    public class ProductManagerMainApp {

    public static void main(String[] args){
        BookManager bookManager = new BookManager();
        bookManager.addToCart(new Book("A wonderful story", 9.90d));
    }
}
