package product;

import edu.sm.dto.Product;
import edu.sm.service.ProductService;
import org.junit.jupiter.api.Test;

public class Select {
    @Test
    public void test1(){
        System.out.println("Select Test Start ...");
        ProductService prodservice = new ProductService();
        try {
            Product prod = new Product();
            prod = prodservice.get(1111);
            System.out.println(prod);
            System.out.println("Test End Successfully ...");
        } catch (Exception e) {
            System.out.println("Occured Exception During Test ...");
            e.getMessage();
            e.printStackTrace();
        }
    }
}
