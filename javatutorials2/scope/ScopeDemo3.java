package scope;

public class ScopeDemo3 {
    static int i = 0;

    static void a() {
        int i = 0;
        // In terms of method alone
        //   -> the variable declared in the method is created
        //      when the method is executed and
        //      deleted when the method is terminated
        // the variable in class <<< the variable in method
        // The principle that regional things have higher priorities than global things
    }

    public static void main(String[] args){
        for (int i = 0; i < 5; i++) {
            a();
            System.out.println(i);
        }
    }
}

