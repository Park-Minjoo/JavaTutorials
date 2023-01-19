package constructor;

/*
    Initialization and Constructor
 */
class Calculator {
    int left, right;

    public Calculator(int left, int right) { // Constructor : call when creating an object
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
public class CalculatorDemo1 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator(10,20);
        c1.sum();
        c1.avg();

        Calculator c2 = new Calculator(20, 40);
        c2.sum();
        c2.avg();
    }
}
/*
    < Characteristics of the constructor >
    * The characteristics of the constructor can be summarized as follows
    1. It doesn't return a value
     - The constructor can be a special method that serves to create an instance.
        However, if there is a return value, a wrong object will be created.
        Therefore, the constructor is not used for operations that require a return value.
        Since there is no return value, no return, no return value is included in the method definition.
    2. The name of the constructor is the same as the name of the class
     - In Java, methods that are identical to the class's name are promised to be used as constructors.

 */