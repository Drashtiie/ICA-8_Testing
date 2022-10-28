import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;
public class urinalsTest {
    urinals t =new urinals();
    @Test
    public void checkGoodString(){
        System.out.println("====== Drashti Patel == TEST ONE EXECUTED =======");

        System.out.println("====== Drashti Patel == TEST TWO  EXECUTED =======");
        File fileName = new File("D:\\ICA-8_Testing\\urinal.dat");

        try {
            assertTrue(fileName.exists());
        }
        catch (Exception e) {
           System.out.println("File doesnot exists");
            assertFalse(fileName.exists());
        }
//
        System.out.println("====== Drashti Patel == TEST THREE EXECUTED =======");

        assertEquals("0000 is good string",true, t.goodString("0000"));
        assertEquals("0000 is good string",false, t.goodString("Drashti"));
        assertEquals("011 is  good string",false, t.goodString("011"));

    }

}
