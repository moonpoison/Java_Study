package cust;

import edu.sm.dto.Cust;
import edu.sm.service.CustService;
import org.junit.jupiter.api.Test;

public class Update {
    @Test
    public void test1(){
        System.out.println("Update Test Start ...");
        CustService custService = new CustService();
        try {
            Cust cust = Cust.builder()
                            .custId("id03")
                            .custPwd("pwd33")
                            .custName("대말숙")
                            .build();
            custService.modify(cust);
            System.out.println("Test End Successfully ...");
        } catch (Exception e) {
            System.out.println("Occured Exception During Test ...");
            e.getMessage();
            e.printStackTrace();
        }
    }
}
