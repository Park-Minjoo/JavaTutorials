package overriding.example1;
/*
    Inheritance: a function that inherits the function of a higher class to a lower class
    Then, should lower classes use the methods of higher classes as they are given? 'Too many constraints'
    => Method Overriding (the subclass must be able to change the basic way the parent class behaves)
 */
class Calculator {
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

//    public void avg() {
//        System.out.println((this.left + this.right) / 2);
    public int avg() {
        return ((this.left + this.right) / 2);
    }

    public void substract() {
        System.out.println(this.left - this.right);
    }
}

class SubstractionableCalculator extends Calculator {
    public void sum() { // the methid sum added
        System.out.println("The result is : " + (this.left + this.right) + ".");
    }

    public int avg() {
//        return (this.left + this.right)/2;
        /*
            No need to Duplicate : super
         */
        return super.avg();
    }
    /*
        The return format of the method must be the same in order to override.
        the method avg of the class calculator : (return type) void
        the class SubstractionableCalculator : (return type) int
        >>> Conditions to override (Signature) <<<
           - Name of the method
           - Number and data type and order of method parameters
           - Return type of method

        -> Let's bypass this problem by changing the code of the higher class
     */

    public void substract() {
        System.out.println(this.left - this.right);
    }
}
public class CalculatorDemo {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20); // lower-class method sum >>> high-class method sum
        c1.sum();
//        c1.avg();
        System.out.println("The result is : " + c1.avg());
        c1.substract();
    }
}
/*
    From the perspective of the lower class,
    the parent class can be considered to be a definition of a basic operating method.
    If the lower class defines the same method as the upper class,
    it has the effect of changing the basic behavior method inherited from the parent class.
    ...Method Overriding...
 */
