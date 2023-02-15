package polymorphism;
//class A{}
//class B extends A{}
//public class PolymorphismDemo1 {
//    public static void main(String[] args) {
//        A obj = new B();
//    }
//}

class A{
    public String x(){return "A.x";}
}
class B extends A{
    public String x(){return "B.x";}
    public String y(){return "y";}
}
class B2 extends A{
    public String x(){return "B2.x";}
}
public class PolymorphismDemo1 {
    public static void main(String[] args) {
//        A obj = new B();
//        obj.x();
//        obj.y();
        B obj = new B();
        obj.x();
        obj.y();
    }
}