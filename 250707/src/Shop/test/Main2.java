package Shop.test;

import Shop.dto.ItemDTO;
import Shop.frame.SmService;
import Shop.service.ItemService;

import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Start Main Application...");

        SmService<ItemDTO, Integer> smService = new ItemService();

        System.out.println("1. Item Register...");
        ItemDTO cust = new ItemDTO(1, "aaa", 10000);
        smService.register(cust);
        System.out.println();

        System.out.println("2. Item Modify...");
        List<ItemDTO> itemList = null;
        itemList = smService.get();
        for(ItemDTO c : itemList){
            System.out.println(c);
        }
        System.out.println();

        System.out.println("3. Item Remove...");
        int id = 99;
        smService.remove(id);
        System.out.println();

        System.out.println("4. Item Get...");
        id = 1;
        ItemDTO myInfo = smService.get(id);
        System.out.println(myInfo);
        System.out.println();

        System.out.println("5. Item update...");
        ItemDTO item = new ItemDTO(1, "aaa", 90000);
        smService.modify(item);
        System.out.println();


        System.out.println("End Main Application...");
    }
}
