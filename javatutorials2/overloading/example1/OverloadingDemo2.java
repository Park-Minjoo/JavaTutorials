package overloading.example1;
/*
    Can overloading be used in the relationship of inheritance? 'Of Course'
 */
public class OverloadingDemo2 extends OverloadingDemo{
    void A(String arg1, String arg2){System.out.println("sub class: void A (String arg1, String arg2)");}
    void A (){System.out.println("sub class: void A");}
    public static void main(String[] args){
        OverloadingDemo2 od = new OverloadingDemo2();
        od.A();
        od.A(1);
        od.A("Hello JIU!");
        od.A("Hello JIU!", "Hello JIU!");
    }
}
