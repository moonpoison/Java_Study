package Shop.app;

import Shop.dto.CustDTO;
import Shop.dto.ItemDTO;
import Shop.frame.SmService;
import Shop.service.CustService;
import Shop.service.ItemService;

import java.util.List;
import java.util.Scanner;

public class CustApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmService<CustDTO, String> custService = new CustService();
        SmService<ItemDTO, Integer> itemService = new ItemService();
        boolean flag=true;
        String pause;

        while(flag){
            System.out.println("1. 고객 정보 관리");
            System.out.println("2. 상품 정보 관리");
            System.out.println("3. 종료");
            System.out.print("수행할 작업의 번호를 입력하십시오: ");
            String cmd = sc.nextLine();
            switch (cmd){
                case "1":{
                    System.out.println("1. 회원가입");
                    System.out.println("2. 회원 정보 삭제");
                    System.out.println("3. 회원 정보 조회");
                    System.out.println("4. 회원 정보 전체 조회");
                    System.out.println("5. 회원 정보 수정");
                    System.out.print("수행할 작업의 번호를 입력하십시오: ");
                    String input = sc.nextLine();
                    switch (input){
                        case "1":{
                            System.out.print("아이디를 입력하십시오: ");
                            String cust_id = sc.nextLine();
                            System.out.print("비밀번호를 입력하십시오: ");
                            String cust_pwd = sc.nextLine();
                            System.out.print("이름을 입력하십시오: ");
                            String cust_name = sc.nextLine();
                            CustDTO cust = new CustDTO(cust_id, cust_pwd, cust_name);
                            custService.register(cust);
                            System.out.println();
                            break;}
                        case "2":{
                            System.out.print("삭제하실 아이디를 입력하십시오: ");
                            String id = sc.nextLine();
                            custService.remove(id);
                            System.out.println();
                            break;}
                        case "3":{
                            System.out.print("조회하실 아이디를 입력하십시오: ");
                            String id = sc.nextLine();
                            CustDTO myInfo = custService.get(id);
                            System.out.println(myInfo);
                            System.out.println();
                            break;}
                        case "4":
                            List<CustDTO> custList = null;
                            custList = custService.get();
                            for(CustDTO c : custList){
                                System.out.println(c);
                            }
                            System.out.println();
                            break;
                        case "5":{
                            System.out.print("아이디를 입력하십시오: ");
                            String cust_id = sc.nextLine();
                            System.out.print("비밀번호를 입력하십시오: ");
                            String cust_pwd = sc.nextLine();
                            System.out.print("이름을 입력하십시오: ");
                            String cust_name = sc.nextLine();
                            CustDTO uCust = new CustDTO(cust_id, cust_pwd, cust_name);
                            custService.modify(uCust);
                            System.out.println();
                            break;}
                        default:
                            System.out.println("잘못된 값을 입력하셨습니다.");
                            break;
                    }
                    System.out.println("계속하려면 아무값이나 입력하십시오");
                    pause = sc.nextLine();
                    break;}
                case "2":{
                    System.out.println("1. 상품 등록");
                    System.out.println("2. 상품 정보 삭제");
                    System.out.println("3. 상품 정보 조회");
                    System.out.println("4. 상품 정보 전체 조회");
                    System.out.println("5. 상품 정보 수정");
                    System.out.print("수행할 작업의 번호를 입력하십시오: ");
                    String input = sc.nextLine();
                    switch (input){
                        case "1":
                            int item_id = sc.nextInt();
                            String item_name = sc.nextLine();
                            int item_price = sc.nextInt();

                            ItemDTO cust = new ItemDTO(item_id, item_name, item_price);
                            itemService.register(cust);
                            System.out.println();
                            break;
                        case "2":
                            List<ItemDTO> itemList = null;
                            itemList = itemService.get();
                            for(ItemDTO c : itemList){
                                System.out.println(c);
                            }
                            System.out.println();
                            break;
                        case "3":{
                            int id = sc.nextInt();
                            itemService.remove(id);
                            System.out.println();
                            break;}
                        case "4":
                            int id = sc.nextInt();
                            ItemDTO myInfo = itemService.get(id);
                            System.out.println(myInfo);
                            System.out.println();
                            break;
                        case "5":
                            ItemDTO item = new ItemDTO(1, "aaa", 90000);
                            itemService.modify(item);
                            System.out.println();
                            break;
                        default:
                            System.out.println("잘못된 값을 입력하셨습니다.");
                            break;
                    }
                    System.out.println("계속하려면 아무값이나 입력하십시오");
                    pause = sc.nextLine();
                    break;}
                case "3":
                    System.out.println("프로그램이 종료됩니다.");
                    flag=false;
                    break;
                default:
                    System.out.println("잘못된 값을 입력하셨습니다.");
                    break;
            }
        }
        sc.close();
    }
}
