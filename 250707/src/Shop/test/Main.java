package Shop.test;

import Shop.dto.CustDTO;
import Shop.frame.SmService;
import Shop.service.CustService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start Main Application...");

        SmService<CustDTO, String> smService = new CustService();

        System.out.println("1. Cust Register...");
        CustDTO cust = new CustDTO("id01", "pwd01", "이말숙");
        smService.register(cust);
        System.out.println();

        System.out.println("2. Cust Modify...");
        List<CustDTO> custList = null;
        custList = smService.get();
        for(CustDTO c : custList){
            System.out.println(c);
        }
        System.out.println();

        System.out.println("3. Cust Remove...");
        String id = "id99";
        smService.remove(id);
        System.out.println();

        System.out.println("4. Cust Get...");
        id = "id01";
        CustDTO myInfo = smService.get(id);
        System.out.println(myInfo);
        System.out.println();

        System.out.println("5. Cust update...");
        CustDTO uCust = new CustDTO("id01", "pwd01", "장말숙");
        smService.modify(uCust);
        System.out.println();


        System.out.println("End Main Application...");
    }
}
