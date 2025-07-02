package Variable;

//Reference Type -> Class Object
public class St1{
    public static void main(String[] args) {
        String st1 = new String("abc");
        String st2 = new String("abc");

        String st3 = "abc";     //String 객체만 new 키워드 없이 사용 가능함 -> String Pool이 존재하여서
        String st4 = "abc";

        if(st1 == st2){                   // -> 출력 X
            System.out.println("OK1");
        }
        if(st1 == st3){                   // -> 출력 X
            System.out.println("OK2");
        }
        if(st3 == st4){
            System.out.println("OK3");
        }
        if (st1.equals(st2)) {
            System.out.println("OK4");
        }
        if (st1.equals(st3)) {
            System.out.println("OK5");
        }
    }
}
