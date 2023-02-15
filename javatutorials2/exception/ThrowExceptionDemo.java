package exception;

import java.io.*;

class B{
//    void run(){
//        BufferedReader bReader = null;
//        String input = null;
//        try {
//            bReader = new BufferedReader(new FileReader("out.txt"));
//        } catch (FileNotFoundException e){
//            e.printStackTrace();
//        }
//        try{
//            input = bReader.readLine();
//        } catch (IOException e){
//            e.printStackTrace();
//        }
//        System.out.println(input);
//    }
    void run() throws IOException, FileNotFoundException{
        BufferedReader bReader = null;
        String input = null;
        bReader = new BufferedReader(new FileReader("out.txt"));
        input = bReader.readLine();
        System.out.println(input);
    }
}
class C{
    void run() throws IOException, FileNotFoundException{
        B b = new B();
        b.run();
//        try {
//            b.run();
//        } catch (FileNotFoundException e){
//            e.printStackTrace();
//        } catch (IOException e){
//            e.printStackTrace();
//        }
    }
}
public class ThrowExceptionDemo {
    public static void main(String[] args) {
        C c = new C();
//        c.run();
        try{
            c.run();
        } catch (FileNotFoundException e){
            System.out.println("out.txt is the setting file. This file should be exist in other root directories.");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
