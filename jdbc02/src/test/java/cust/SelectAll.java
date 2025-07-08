package cust;

import edu.sm.dto.Cust;
import edu.sm.service.CustService;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SelectAll {
    @Test
    public void test2(){
        System.out.println("Insert Test Start ...");
        CustService custService = new CustService();
        try {
            List<Cust> list = null;
            list = custService.get();
            list.forEach(System.out::println);
            System.out.println("Test End Successfully ...");
        } catch (Exception e) {
            System.out.println("Occured Exception During Test ...");
            e.getMessage();
            e.printStackTrace();
        }
    }
}
