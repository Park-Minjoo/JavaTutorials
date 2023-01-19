package scope;

/*
    static scope, lexical scope
 */
public class ScopeDemo6 {
    static int i = 5;

    static void a() {
        int i = 10;
        b(); // call i -> class (not method)
    }
    static void b() {
        System.out.println(i);
    }
    public static void main(String[] args) {
        a(); // call b
    }
}
