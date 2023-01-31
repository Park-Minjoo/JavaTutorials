package abstractclass.example2;

abstract class A{
    public abstract int b();
    public void d(){
        System.out.println("world");
    }
}
class B extends A{ /* Inheritance */
    public int b(){return 1;} /* Overriding */
}
public class AbstractDemo {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.b());
    }
}
