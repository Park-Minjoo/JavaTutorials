package Inheritance.example3;

class Calculator {
    int left, right;

//    public Calculator(){}
/*
    the constructor of the higher class Calculator does not exist.
    When a lower class is called, it automatically calls the primary constructor of the higher class.
    Java does not automatically create a default constructor with parameters if a parent class has a constructor with parameters.
    Therefore, an error occurred because it would call a non-existent constructor.
    To solve this problem, you can add a default constructor to the parent class.
 */
    public Calculator(int left, int right) {
        this.left = left;
        this.right = right;
    }
    /*
        However, there are already constructors in the upper class Calculator that can initialize the left and right values.
        -> unnecessary procedure of directly setting the values of left and right in the subclass.
        How to call a constructor of a higher class? "super"
     */

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right)/2);
    }
}

class SubstractionableCalculator extends Calculator {
    public SubstractionableCalculator(int left, int right) { // Constructor
//        this.left = left;
//        this.right = right;
        super(left, right);
    /*
        The super keyword means the parent class.
        If you add () here, it means the constructor of the parent class.
        This eliminates the default constructor for the parent class, but no error occur.

        => When using super in a subclass constructor, one thing to note is that super should appear first.
            In other words, it is a policy to prevent children from being initialized before parents are initialized.
     */
    }

    public void substract() {
        System.out.println(this.left - this.right);
    }
}
public class CalculatorConstructorDemo5 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
