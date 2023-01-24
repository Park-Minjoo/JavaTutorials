package overloading.example1;
/*
    Can overloading be used in the relationship of inheritance? 'Of Course'
 */
public class OverloadingDemo2 extends OverloadingDemo{
    // Class OverloadingDemo2 inherits the OverloadingDemo.

    void A(String arg1, String arg2){System.out.println("sub class: void A (String arg1, String arg2)");}
    // Two parameters with strings as data types
    // Overloading -> it is not defined in the parent class

    void A (){System.out.println("sub class: void A");}
    // no parameters
    // Overriding -> method A already exists in the parent class without parameters.
    // Overloading (X) -> paramters are the same...

    public static void main(String[] args){
        OverloadingDemo2 od = new OverloadingDemo2();
        od.A();
        od.A(1);
        od.A("Hello JIU!");
        od.A("Hello JIU!", "Hello JIU!");
    }
}
