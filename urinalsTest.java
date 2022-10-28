//Author - Drashti Patel


import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.File;
import java.io.IOException;

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

        System.out.println("====== Drashti Patel == TEST TWO  EXECUTED =======");
        assertEquals(1, t.isFileExists(new File("D:\\ICA-8_Testing\\urinal.dat")));

        assertEquals(0, t.isFileExists(new File("D:\\ICA-8_Testing\\urinal1.dat")));
    }

    @Test
    public void isFileEmptyTest() {

        System.out.println("====== Drashti Patel == TEST THREE  EXECUTED =======");
//        assertEquals(0, t.isFileEmpty(new File("src/main/java/urinals.dat")));

        assertEquals(1, t.isFileEmpty(new File("src/main/java/urinals2.dat")));
    }
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void openFileTest() throws IOException {

        System.out.println("====== Drashti Patel == TEST FOUR  EXECUTED =======");
        expectedException.expect(IOException.class);
        t.openFile("D:\\ICA-8_Testing\\urinal7.dat");
    }
    @Test
    public void badFileNameTest() throws IOException {

        System.out.println("====== Drashti Patel == TEST Seven  EXECUTED =======");
        assertEquals(1, t.badFileName(new File("D:\\ICA-8_Testing\\rule2.txt")));

        assertEquals(0, t.badFileName(new File("D:\\ICA-8_Testing\\rule102.dat")));


    }
    @Test
    public void duplicateFileTest() throws IOException {

        System.out.println("====== Drashti Patel == TEST Five  EXECUTED =======");
        assertEquals(1, t.isDuplicate(new File("D:\\ICA-8_Testing\\rule2.txt")));

        assertEquals(0, t.isDuplicate(new File("D:\\ICA-8_Testing\\rule102.dat")));
    }
    @Test
    public void checkGoodString(){
        System.out.println("====== Drashti Patel == TEST TWO  EXECUTED =======");


        assertEquals("0000 is good string",true, t.goodString("0000"));
        assertEquals("Drashti is not good string",false, t.goodString("Drashti"));
        assertEquals("011 is not a good string",false, t.goodString("011"));

    }
    @Test
    public void checkforNumbers(){
        System.out.println("====== Drashti Patel == TEST Six  EXECUTED =======");
        assertEquals("0102 is not a good string",false, t.goodString("0102"));

    }

}
