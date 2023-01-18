/*
    Scope of instance : this
 */
class C2 {
    int v = 10;

    void m(){
        int v = 20; // the variable declared in method become regional variable
        // higher priority than instance variable v
        System.out.println(v);
    }
}
public class ScopeDemo8 {
    public static void main(String[] args) {
        C2 c1 = new C2();
        c1.m();
    }
}
