package single.responsability;
import java.util.List;

public class ProductDisplayOrderService {

    IProductCalculateOrder productCalculateOrderService;

    public ProductDisplayOrderService(IProductCalculateOrder productCalculateOrderService) {
        this.productCalculateOrderService = productCalculateOrderService;
    }

    public String displayAllOrder(List<Product> products) {
        double orderTotal = productCalculateOrderService.calculateOrderTotal(products);
        String result = "";
        for (Product product : products) {
            result = result + product.getName() + ": " + product.getPrice() + "\n";
        }
        return result + "total: " + orderTotal;
    }
}
