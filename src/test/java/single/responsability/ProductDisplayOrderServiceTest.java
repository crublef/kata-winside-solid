package single.responsability;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ProductDisplayOrderServiceTest {


    private final ProductDisplayOrderService productDisplayOrderService = new ProductDisplayOrderService(new ProductCalculateOrderService());
    @Test
    public void display_the_order_total() {
        // Given
        List<Product> products = Arrays.asList(
                new Product("Barre de chocolat", 0.65),
                new Product("Barre de céréales", 0.68)
        );

        // Test
        String expected = productDisplayOrderService.displayAllOrder(products);

        // Assert
        assertEquals("Barre de chocolat: 0.65" + "\nBarre de céréales: 0.68\ntotal: 1.33", expected);

    }


}