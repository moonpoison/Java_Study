package cust;

import edu.sm.dto.Cust;
import edu.sm.service.CustService;
import org.junit.jupiter.api.Test;

public class Select {
    @Test
    public void test1(){
        System.out.println("Select Test Start ...");
        CustService custService = new CustService();
        try {
            Cust cust = new Cust();
            cust = custService.get("id01");
            System.out.println(cust);
            System.out.println("Test End Successfully ...");
        } catch (Exception e) {
            System.out.println("Occured Exception During Test ...");
            e.getMessage();
            e.printStackTrace();
        }
    }
}
