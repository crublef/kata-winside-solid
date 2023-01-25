    package dependency.inversion;

    public class ShoppingCartMainApp {

    public static void main(String[] args){

        IShoppingCartService shoppingCartService = new ShoppingCartService();


        shoppingCartService.addToCart(new Book("A wonderful story", 9.90d));
        shoppingCartService.addToCart(new Phone("Apple iPhone 14 Pro Max", 1475d));
    }
}
