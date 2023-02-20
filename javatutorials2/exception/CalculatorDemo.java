package exception;

class DivideException extends Exception {
    DivideException(){
        super();
    }
    DivideException(String message) {
        super(message);
    }
}
class Calculator{
    int left, right;
    public void setOprands(int left, int right){
//        if(right == 0){
//            throw new IllegalArgumentException("The second argument cannot be 0.");
//        }
        this.left = left;
        this.right = right;
    }
    public void divide() {
        if(this.right == 0){
//            throw new ArithmeticException("It is not allowed to divide by 0.");
            try {
                throw new DivideException("It is not allowed to divide by 0.");
            } catch (DivideException e) {
                e.printStackTrace();
            }
        }
        try {
            System.out.print("The result is ");
            System.out.print(this.left / this.right);
            System.out.print(".");
        } catch (Exception e) {
//            System.out.println("The error has occured : " + e.getMessage());
            System.out.println("\n\ne.getMessage()\n"+e.getMessage());
            System.out.println("\n\ne.toString()\n"+e.toString());
            System.out.println("\n\ne.printStackTree()\n");
            e.printStackTrace();
        }
    }
}
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        c1.divide();

        Calculator c2 = new Calculator();
        c2.setOprands(10, 5);
        c2.divide();
    }
}
