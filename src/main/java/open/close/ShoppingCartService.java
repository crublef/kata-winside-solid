package open.close;

import java.util.List;

public class ShoppingCartService {

    public double calculateTotalOrder(List<Product> products) {
        double orderTotal = 0;
        for (Product product : products) {
            if("FOOD".equals(product.getType())) {
                orderTotal += product.getPrice()+ product.getPrice()*0.8;
            } else if("CAR".equals(product.getType())) {
                orderTotal += product.getPrice()*1.60*1.18;
            } else if("Electronics".equals(product.getType())) {
                orderTotal += product.getPrice()*1.18;
            }
        }
        return orderTotal;
    }
}
