package product;

import edu.sm.service.ProductService;
import org.junit.jupiter.api.Test;

public class Delete {
    @Test
    public void test1(){
        System.out.println("Delete Test Start ...");
        ProductService prodService = new ProductService();
        try {
            prodService.remove(1111);
            System.out.println("Test End Successfully ...");
        } catch (Exception e) {
            System.out.println("Occured Exception During Test ...");
            e.getMessage();
            e.printStackTrace();
        }
    }
}
