package scope;

public class ScopeDemo4 {
    static void a() {
        String title = "Hello JIU students";
        // regional variable -> access in method
    }
    public static void main(String[] args){
        a();
//        System.out.println(title);
        // it doesn't work...
    }
}
