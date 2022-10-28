
//Author - Drashti Patel

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class urinals {
    public static String getString(){
        return " ";
    }

    int countUrinals(String a){
//        int i = a.length();
        int j = 0;
        int c=0;
        int ans=0;
        int pz=1;
        String b ="0";
        String d = b.concat(a);
        String e1 = d.concat(b);
        int i = e1.length();


        while(j<i-1) {
//            System.out.println(j);
//
//            System.out.println(e1.charAt(j) == '0');
            if (e1.charAt(j) == '0' && pz == 1) {
                int k =j+1;
//                System.out.println(e1.charAt(k)+ " k " + j + (e1.charAt(k) == '0'));
                if (j + 1 != i && e1.charAt(k) == '0') {
                    if (j == 0){
                        ans=0;
                        pz=1;
                    }
                    else{

                    ans+=1;
//                    System.out.println(j + "inc"+ ans);
                    pz=0;
                    }
                }
                else{
                    pz=1;
//                    System.out.println("Set    pz" + j);
                    }
            }
            else if(e1.charAt(j) == '0') {
                 pz=1;
//                 System.out.println("Set pz" + j);
            }
            else{
                pz=0;
//                System.out.println("Set pz1" + j + e1.charAt(j));
            }
            j += 1;
        }


//                try {
//                    if (j + 1 == i || e1.charAt(j + 1) == 0) {
//                        ans += 1;
//                        pz = 0;
//                    }
//                } catch (Exception e) {
//                    ans += 1;
//                    pz = 0;
//                }


        return ans;
    }
//            System.out.println("b"+ j + i);
//            if(a.charAt(j) == '1'){
//                c=0;
//              }
//            else{
//                while(c<3 && a.charAt(j) == '0'){
//                    c+=1;
//                    j+=1;
//                     }
////                System.out.println("c" +c);
//
//                if(c==3){
////                    System.out.println("c is 3");
//                    ans+=1;
//                    }
//                c=0;
//
//            }



    void openFile() throws IOException {
        System.out.println("Open File");
        Path fileName
                = Path.of("D:\\ICA-8_Testing\\urinal.dat");

        Scanner sc = new Scanner(fileName);

        try {
            int i =0;

            while (sc.hasNext()) {
                String b= sc.next();
                System.out.println(countUrinals(b)+ " " + b );
                }
            sc.close();
        }
        catch (Exception e) {
            e.printStackTrace();
            sc.close();
        }
        System.out.println("A");
    }
    public static void main(String args[]) throws IOException {
        urinals b = new urinals();
        System.out.println("Main");
//        String a = getString();
        System.out.println(b.getString());
        b.openFile();

    }
}
