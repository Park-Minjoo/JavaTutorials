package finals;

class Calculator {
    static final double PI = 3.14;
    int left, right;

    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void sum() {
        System.out.println(this.left+this.right);
    }
    public void avg() {
        System.out.println((this.left+this.right)/2);
    }
}
public class CalculatorDemo1 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.PI);
//        Calculator.PI = 10;
        /*
        What is noteworthy in the above code is that the variable is preceded by final.
        And the calculator on lines 10 and 28.
        We are trying to change the value of the class variable PI through PI,
        but Java does not allow this.
        This is because once a value is assigned to a variable designated as final,
        the value cannot be changed.

        You will remember learning that the constant is a constant value.
        And the PI example above is a value that will not change.
        These values can be regulated from changing this value by adding final
        before the variable.
        These features are also applied to instance variables,
        although examples of class variables are given.
         */
    }
}
