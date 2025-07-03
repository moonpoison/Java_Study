package Control;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Control7 {
    public static void main(String[] args) {
        // 로또 프로그램, 번호 5개, 모두랜덤
        Scanner sc = new Scanner(System.in);
        long balance=100000;
        long price=0;
        int num[] = new int[5];
        int price_num [] = new int[5];

        while(true){
            Random rand = new Random();
            Arrays.sort(num);
            Arrays.sort(price_num);

            System.out.println("---------------------------------------------------");
            System.out.println("1. 당첨금 및 당첨번호 생성");
            System.out.println("2. 당첨 번호 생성 (1000원)");
            System.out.println("3. 당첨 여부 확인");
            System.out.println("4. 종료");
            System.out.println("당첨금 : "+price+"원, "+"보유금 : "+balance+"원");
            System.out.print("보유 번호 : "+num[0]+" "+num[1]+" "+num[2]+" "+num[3]+" "+num[4]+" "+"\n");
            System.out.println("---------------------------------------------------");
            System.out.print("enter command(**Number Only**): ");
            String command = sc.nextLine();

            if (command.equals("1")) { // 1. 당첨금 및 당첨번호 생성
                price = rand.nextInt(100000000)+100000000;
                int i=0;
                while(i<5){
                    int a = rand.nextInt(9)+1;
                    if(!Arrays.stream(price_num).anyMatch(value -> value == a)){
                        price_num[i] = a;
                        ++i;
                    }
                }
            } else if (command.equals("2")) { // 2. 번호 생성
                int i=0;
                while(i<5){
                    int a = rand.nextInt(9)+1;
                    if(!Arrays.stream(num).anyMatch(value -> value == a)){
                        num[i] = a;
                        ++i;
                    }
                }
                balance-=1000;
            } else if (command.equals("3")) { // 3. 당첨 여부 확인
                int cnt=0;
                for(int i=0;i<5;++i){
                    for(int j=0;j<5;++j){
                        if(num[i]==price_num[j]){
                            ++cnt;
                            break;
                        }
                    }
                }
                System.out.println("보유 번호 : "+Arrays.toString(num));
                System.out.println("당첨 번호 : "+Arrays.toString(price_num));
                /*
                * 5개 -> 전액
                * 4개 -> 절반
                * 3개 -> 절반에 절반
                */
                long tmp=0;
                if(cnt==5){
                    tmp = price;
                    balance+=tmp;
                    price=0;
                    System.out.printf("5개를 전부 맞추어 %d원을 수령하였습니다.\n", tmp);
                }else if(cnt==4){
                    tmp = price/2;
                    balance+=tmp;
                    price=0;
                    System.out.printf("4개를 맞추어 %d원을 수령하였습니다.\n", tmp);
                }else if(cnt==3){
                    tmp = price/4;
                    balance+=tmp;
                    price=0;
                    System.out.printf("3개를 맞추어 %d원을 수령하였습니다.\n", tmp);
                }else{
                    System.out.printf("%d개 만큼 맞추어 당첨금을 수령하지 못하였습니다...\n", cnt);
                    price=0;
                }
                price_num = new int[5];
                num = new int[5];
                System.out.print("Press any key to continue...");
                String pause = sc.nextLine();
            } else if (command.equals("4")) { // 4. 종료
                System.out.println("The Program is Exited...");
                break;
            } else {
                System.out.println("Wrong Command Enter...");
            }
        }
    }
}
