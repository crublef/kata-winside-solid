package single.responsability;
import java.util.List;

public class ProductService {

    public String displayAllOrder(List<Product> products) {
        double orderTotal = 0;
        String result = "";
        for (Product product : products) {
            orderTotal = orderTotal + product.getPrice();
            result = result + product.getName() + ": " + product.getPrice() + "\n";
        }
        return result + "total: " + orderTotal;
    }
}
