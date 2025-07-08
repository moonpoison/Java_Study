package cust;

import edu.sm.service.CustService;
import org.junit.jupiter.api.Test;

public class Delete {
    @Test
    public void test1(){
        System.out.println("Delete Test Start ...");
        CustService custService = new CustService();
        try {
            custService.remove("id55");
            System.out.println("Test End Successfully ...");
        } catch (Exception e) {
            System.out.println("Occured Exception During Test ...");
            e.getMessage();
            e.printStackTrace();
        }
    }
}
