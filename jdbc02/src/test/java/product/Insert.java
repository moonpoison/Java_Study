package product;

import edu.sm.dto.Product;
import edu.sm.service.ProductService;
import org.junit.jupiter.api.Test;

public class Insert {
    @Test
    public void test1(){
        System.out.println("Insert Test Start ...");
        ProductService prodService = new ProductService();
        Product prod = Product.builder()
                .productId(1111)
                .productName("삿갓")
                .productPrice(50000)
                .discountRate(0.05)
                .productImg("v1.png")
                .cateId(10)
                .build();
        try {
            prodService.register(prod);
            System.out.println("Test End Successfully ...");
        } catch (Exception e) {
            System.out.println("Occured Exception During Test ...");
            e.getMessage();
            e.printStackTrace();
        }
    }
}
