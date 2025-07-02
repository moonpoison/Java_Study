package Operation;

public class Op3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        char c = 'a';
        if(a > b){
            c = 'T';
        }else{
            c = 'F';
        }
        System.out.println(c);

        //삼항연산자
        c = (a > b) ? 'T' : 'F'; // A ? B : C -> A일때 B를 A가아닐때 C를
        System.out.println(c);
    }
}
