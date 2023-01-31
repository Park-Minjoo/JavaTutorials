package abstractclass.example1;

abstract class A{
    public abstract int b();
    // Method with a body cannot have the abstract keyword.
//    public abstract int c() {System.out.println("Hello");}
    /* ERROR
        A method that is not an abstract method may exist within an abstract class.
     */
    public void d() {
        System.out.println("world");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
//        A obj = new A();
        /*
           The keyword 'abstract' appears in the declaration part of Method b.
           This keyword means method b only defines the signature of the method,
           and the specific implementation of this method must be overriden in the subclass.
           Such an empty method is called an abstract class, and naturally an abstract is appended to the name of the class.
         */
    }
}
