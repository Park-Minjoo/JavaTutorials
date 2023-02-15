package polymorphism;
/*
    Overloading and Polymorphism
 */
class O{
    public void a(int param){
        System.out.println("Print the number");
        System.out.println(param);
    }
    public void a(String param){
        System.out.println("Print the string");
        System.out.println(param);
    }
}
public class PolymorphismOverloadingDemo {
    public static void main(String[] args) {
        O o = new O();
        o.a(1);
        o.a("one");
    }
}
