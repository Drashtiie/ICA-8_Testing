import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class urinalsTest {
    urinals t =new urinals();
    @Test
    public void checkGoodString(){
        System.out.println("====== Drashti Patel == TEST ONE EXECUTED =======");

        assertEquals("0000 is good string",true, t.goodString("0000"));
    }

}
