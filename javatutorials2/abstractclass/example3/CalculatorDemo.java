package abstractclass.example3;

import org.w3c.dom.ls.LSOutput;

abstract class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public abstract void sum();
    public abstract void avg();
    public void run(){
        sum();
        avg();
    }
}
class CalculatorDecoPlus extends Calculator{
    public void sum() {
        System.out.println("+ sum:"+(this.left+this.right));
    }
    public void avg() {
        System.out.println("+ avg:"+(this.left+this.right)/2);
    }
}
class CalculatorDecoMinus extends Calculator{
    public void sum() {
        System.out.println("- sum:"+(this.left+this.right));
    }
    public void avg() {
        System.out.println("- avg:"+(this.left+this.right)/2);
    }
}
public class CalculatorDemo {
    public static void main(String[] args) {
        CalculatorDecoPlus c1 = new CalculatorDecoPlus();
        c1.setOprands(10, 20);
        c1.run();

        CalculatorDecoMinus c2 = new CalculatorDecoMinus();
        c2.setOprands(10,20);
        c2.run();
    }
}
/*
    The example above is the code that runs the procedure for executing sum and averaging at once through method run.
    However, in some cases, it is necessary to output the sum and average on the screen differently.
    In such cases, methods(sum, avg), which vary in operation depending on the situation, can be made into abstract methods
    and implemented in lower classes, and in the case of common denominators (setOprands, run) of all classes,
    overlapping codes and convenient maintenance can be achieved.
 */