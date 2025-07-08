package product;

import edu.sm.dto.Product;
import edu.sm.service.ProductService;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SelectAll {
    @Test
    public void test2(){
        System.out.println("Select All Test Start ...");
        ProductService prodservice = new ProductService();
        try {
            List<Product> list = null;
            list = prodservice.get();
            list.forEach(System.out::println);
            System.out.println("Test End Successfully ...");
        } catch (Exception e) {
            System.out.println("Occured Exception During Test ...");
            e.getMessage();
            e.printStackTrace();
        }
    }
}
