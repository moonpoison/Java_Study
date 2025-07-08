package cust;

import edu.sm.dto.Cust;
import edu.sm.service.CustService;
import org.junit.jupiter.api.Test;

public class Insert {
    @Test
    public void test1(){
        System.out.println("Insert Test Start ...");
        CustService custService = new CustService();
        Cust cust = Cust.builder()
                .custId("id55")
                .custPwd("pwd55")
                .custName("대말숙")
                .build();
        try {
            custService.register(cust);
            System.out.println("Test End Successfully ...");
        } catch (Exception e) {
            System.out.println("Occured Exception During Test ...");
            e.getMessage();
            e.printStackTrace();
        }
    }
}
