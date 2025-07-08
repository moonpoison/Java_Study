package lombock;

import edu.sm.dto.Cust;
import org.junit.jupiter.api.Test;

public class LombockTest {
    @Test
    public void test1(){
        System.out.println("Test ...");
        Cust cust = Cust.builder()
                .custId("id88")
                .custPwd("pwd88")
                .custName("고말숙")
                .build();
        System.out.println(cust);
    }

    @Test
    public void test2(){
        System.out.println("Test ...");
    }
}
