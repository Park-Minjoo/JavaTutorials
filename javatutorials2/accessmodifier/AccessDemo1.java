package accessmodifier;

class A {
    public String y() {
        return "public void y()";
    }
    private String z() {
        return "public void z()";
    }
    public String x() {
        return z(); // same Class so that can call
    }
}
public class AccessDemo1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.y());
//        System.out.println(a.z()); // private -> cannot access outside of class A
        System.out.println(a.x());
    }
}
