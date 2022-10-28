import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.File;

import static org.junit.Assert.*;

public class urinalsTest {
    urinals t =new urinals();
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void fileReadTest()  {
        System.out.println("====== Drashti Patel == TEST ONE EXECUTED =======");
        File fileName = new File("D:\\ICA-8_Testing\\urinal.dat");
        try {
            assertTrue(fileName.exists());
        }
        catch (Exception e) {
            System.out.println("File exists");
            assertFalse(fileName.exists());
        }
        File fileName2 = new File("D:\\ICA-8_Testing\\urinal2.dat");
        try {
            assertFalse(fileName2.exists());
        }
        catch (Exception e) {
            System.out.println("File doesnot exists");
            assertFalse(fileName2.exists());
        }



    }
    @Test
    public void isFileExistsTest() {
        assertEquals(1, t.isFileExists(new File("D:\\ICA-8_Testing\\urinal.dat")));

        assertEquals(0, t.isFileExists(new File("D:\\ICA-8_Testing\\urinal1.dat")));
    }
    @Test
    public void checkGoodString(){
        System.out.println("====== Drashti Patel == TEST TWO  EXECUTED =======");

//
        System.out.println("====== Drashti Patel == TEST THREE EXECUTED =======");

        assertEquals("0000 is good string",true, t.goodString("0000"));
        assertEquals("Drashti is not good string",false, t.goodString("Drashti"));
        assertEquals("011 is not a good string",false, t.goodString("011"));

        assertEquals("0102 is not a good string",false, t.goodString("0102"));

    }

}
