package Inheritance;
/*
    Then can we inherit the inherited class again?
 */
class DivisionableCalculator extends MultiplicationableCalculator {
    public void division() {
        System.out.println(this.left / this.right);
    }
}

public class CalculatorDemo3 {
    public static void main(String[] args) {
        DivisionableCalculator c1 = new DivisionableCalculator();
        c1.setOprands(20,10);
        c1.sum();
        c1.avg();
        c1.multiplication();
        c1.division();
    }
}
