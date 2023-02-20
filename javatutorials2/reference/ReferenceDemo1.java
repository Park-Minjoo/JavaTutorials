package reference;

public class ReferenceDemo1 {
    public static void runValue(){
        int a = 1;
        int b = a;
        b = 2;
        System.out.println("runValue, "+a);
    }
    public static void main(String[] args) {
        runValue();
    }
}
