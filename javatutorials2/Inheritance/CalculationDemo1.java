package Inheritance;
/*
    Inheritance
    - Maximize object-oriented recyclability
    - Major cause of complicating object orientation
    - Allow other objects to inherit fields (variables) and methods of an abject when there is an object.
    - A new object is created based on the existing object without modifying the existing object
    the existing object (parent) - the new object (child)
 */

class Calculator{
    int left, right;

    public void setOprands(int left, int right) {
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

class SubstractionableCalculator extends Calculator { // new class
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
public class CalculationDemo1 {

    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10,20); // method in Calculator can be used
        c1.sum(); // easy to maintenance
        c1.avg();
        c1.substract();
    }
}
