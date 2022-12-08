package open.close;

import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ShoppingCartServiceTest {

    private final ShoppingCartService shoppingCartService = new ShoppingCartService();

    @Test
    public void calculate_total_order_of_food() {
        // Given
        List<Product> products = Collections.singletonList(
                new Product("Barre de chocolat", 0.65d, "FOOD")
        );
        // Test
        double totalOrderExpected = shoppingCartService.calculateTotalOrder(products);
        // Assert
        assertEquals(1.17d, totalOrderExpected, 0);
    }

    @Test
    public void calculate_total_order_of_car() {
        // Given
        List<Product> products = Collections.singletonList(
                new Product("Tesla model S", 42000d, "CAR")
        );
        // Test
        double totalOrderExpected = shoppingCartService.calculateTotalOrder(products);
        // Assert
        assertEquals(79296d, totalOrderExpected, 0);
    }

    @Test
    public void calculate_total_order_of_electronics() {
        // Given
        List<Product> products = Collections.singletonList(
                new Product("Apple iPhone 14 pro max 256Go", 1250d, "Electronics")
        );
        // Test
        double totalOrderExpected = shoppingCartService.calculateTotalOrder(products);
        // Assert
        assertEquals(1475d, totalOrderExpected, 0);
    }

}