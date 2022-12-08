package single.responsability;

import java.util.List;

public class ProductCalculateOrderService implements IProductCalculateOrder{

    @Override
    public double calculateOrderTotal(List<Product> products) {
        double orderTotal = 0;
        for (Product product : products) {
            orderTotal = orderTotal + product.getPrice();
        }
        return orderTotal;
    }
}
