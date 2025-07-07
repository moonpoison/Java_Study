package Shop;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start Main Application...");

        SmService<CustDTO, String> smService = new CustService();

        System.out.println("1. Cust Register...");
        CustDTO cust = new CustDTO("id01", "pwd01", "이말숙");
        smService.register(cust);

        System.out.println("End Main Application...");
    }
}
