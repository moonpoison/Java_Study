package product;

import edu.sm.dto.Product;
import edu.sm.service.ProductService;
import org.junit.jupiter.api.Test;

public class Update {
    @Test
    public void test1(){
        System.out.println("Update Test Start ...");
        ProductService prodService = new ProductService();
        try {
            Product prod = Product.builder()
                            .productId(1111)
                            .productPrice(100000)
                            .productName("모자")
                            .build();
            prodService.modify(prod);
            System.out.println("Test End Successfully ...");
        } catch (Exception e) {
            System.out.println("Occured Exception During Test ...");
            e.getMessage();
            e.printStackTrace();
        }
    }
}
