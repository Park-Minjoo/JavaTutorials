package Inheritance.example4;
/*
    Complexity from generators and inheritance : super
 */
public class ConstructorDemo {
//    public ConstructorDemo(int param1) {}
    /* ERROR: A constructor with parameters -> not automatically create a default constructor
       Therefore, the above example calls a non-existent constructor
            => Add a basic constructor
     */
    public ConstructorDemo(){}
    public ConstructorDemo(int param1) {}
    public static void main(String[] args) {
        ConstructorDemo c = new ConstructorDemo();
    }
}
