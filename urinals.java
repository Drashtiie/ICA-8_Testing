
//Author - Drashti Patel

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class urinals {

    ArrayList<String> ansarr = new ArrayList<String>(100);
   public static String getString(int a){
        String b = Integer.toString(a);
        return b;
    }
    Boolean goodString( String s ) {  // checks to see if valid string

        if(s.contains("11")){
            return false;
        }
        if(s.length() > 20){
            return false;
        }
        for(int i=0; i<s.length();i++){
            if (s.charAt(i) != '0' && s.charAt(i)!='1'){
                return false;
            }
        }
        return true;
    }
    int countUrinals(String a) throws IOException{
        System.out.println("Count");
//        int i = a.length();
        int j = 0;
        int c=0;
        int ans=0;
        int pz=1;
        String b ="0";
        String d = b.concat(a);
        String e1 = d.concat(b);
        int i = e1.length();
        int p = 0;
        String dfilename="";
        boolean cv = true;
        while(cv){
            String fname= "rule".concat(getString(p));
            String fname2 =fname.concat(".txt");
            System.out.println(fname2);
            String p1 = "D:\\ICA-8_Testing\\".concat(fname2);
            File fileName = new File(p1);
            if(fileName.exists()){
                p+=1;
            }
            else{
                dfilename=p1;
                cv=false;
            }


        }
        System.out.println(dfilename);

        Path fileName = Path.of(
                dfilename);

        if(!goodString(e1)){
//            Files.writeString(fileName, "-1", StandardOpenOption.CREATE);
            this.ansarr.add("-1");
            return -1;
        }
        while(j<i-1) {
            if (e1.charAt(j) == '0' && pz == 1) {
                int k =j+1;
                if (j + 1 != i && e1.charAt(k) == '0') {
                    if (j == 0){
                        ans=0;
                        pz=1;
                    }
                    else{
                       ans+=1;
                    pz=0;
                    }
                }
                else{
                    pz=1;
                    }
            }
            else if(e1.charAt(j) == '0') {
                 pz=1;
            }
            else{
                pz=0;
            }
            j += 1;
        }
        this.ansarr.add(getString(ans));
        return ans;
    }
    void openFile() throws IOException {
        System.out.println("Open File");
        Path fileName
                = Path.of("D:\\ICA-8_Testing\\urinal.dat");

//        Scanner sc = new Scanner(fileName);

        try {
            Scanner sc = new Scanner(fileName);

            int i =0;

            while (sc.hasNext()) {
                String b= sc.next();
                System.out.println(countUrinals(b)+ " " + b );
                }
            sc.close();
        }
        catch (Exception e) {

//            e.printStackTrace();
//            sc.close();
//            handling file not found exception
            System.out.println("File doesnot exists");
        }
//        System.out.println("A");
        printanstofile();
    }

    public void printanstofile(){
        int p = 0;
        String dfilename="";
        boolean cv = true;
        while(cv) {
            String fname = "rule".concat(getString(p));
            String fname2 = fname.concat(".txt");
            System.out.println(fname2);
            String p1 = "D:\\ICA-8_Testing\\".concat(fname2);
            File fileName = new File(p1);
            if (fileName.exists()) {
                p += 1;
            } else {
                dfilename = p1;
                cv = false;
            }
        }
        System.out.println(dfilename);

        Path fileName = Path.of(
                dfilename);

//        ArrayList<Integer> ansarr2=this.ansarr;
        try {
            Files.write(fileName, this.ansarr);
            System.out.println("Written");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String args[]) throws IOException {
        urinals b = new urinals();
        System.out.println("Main");
//        String a = getString();
//        System.out.println(b.getString());
        b.openFile();
//        b.countUrinals();

        Result result = JUnitCore.runClasses(urinalsTest.class);

        for (Failure fail : result.getFailures()) {
            System.out.println(fail.toString());
        }

        System.out.println(result.wasSuccessful());
    }


}
