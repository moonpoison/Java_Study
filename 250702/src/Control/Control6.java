package Control;

import java.util.Scanner;

public class Control6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter Command: ");
            String cmd = sc.nextLine();
            if(cmd.equals("q")){
                System.out.println("Quit...");
                break;
            }else if(cmd.equals("i")){
                System.out.println("Insert...");
            }else if(cmd.equals("s")){
                System.out.println("Search...");
            }else if(cmd.equals("d")){
                System.out.println("Delete...");
            }else if(cmd.equals("u")){
                System.out.println("Update...");
            }else{
                System.out.println("Invalid Command...");
            }
        }
        sc.close();
    }
}
