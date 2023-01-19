package scope;

public class ScopeDemo5 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
//        System.out.println(i);
        // it doesn't work ... -> only in the loop function
    }
}
