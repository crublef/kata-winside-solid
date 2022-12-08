package single.responsability;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ProductCalculateOrderServiceTest {
    private final ProductCalculateOrderService productCalculateOrderService = new ProductCalculateOrderService();

    @Test
    public void calculOrderTotal(){

        //Given
        List<Product> products = Arrays.asList(
                new Product("Barre de chocolat", 0.65),
                new Product("Barre de céréales", 0.68)
        );

        //Test
        double expected = productCalculateOrderService.calculateOrderTotal(products);

        // Assert
        assertEquals(1.33, expected,0);
    }
}