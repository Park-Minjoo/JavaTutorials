
class Calculator{ // Class (blueprint)
    static double PI = 3.14; // static : make member of class
    static int base = 0;
    int left, right;

    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }

    public void sum(){
        System.out.println(this.left+this.right + base);
    }

    public void avg(){
        System.out.println((this.left+this.right + base)/2);
    }
}
public class CalculatorDemo2 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator(); // instance (the product) -> user-defined data type (class)
        c1.setOprands(20, 40); // the reason we use 'Object' -> reuse
        // left, right -> member of instance
        c1.sum();
        c1.avg();

        Calculator c2 = new Calculator();
        c2.setOprands(20,40);
        c2.sum();
        c2.avg();

        Calculator c3 = new Calculator();
        System.out.println(c3.PI); // way1
        System.out.println(Calculator.PI); // way2

        Calculator.base = 10;
        c1.sum();
        c2.sum();
    }

}

/* Purpose of the class variables
    - When a value that does not change depending on the instance is needed
    (in the above example, PI)
    (In this case, it is best to use 'final' to declare as a constance)
    - When you want to store a value that does not require creating an instance in a class
    - When changes to the value need to be shared by all instances
 */

