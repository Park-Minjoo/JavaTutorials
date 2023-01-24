package overloading.example1;

class Calculator{
    int left, right;
    int third = 0;

    public void setOprands(int left, int right) {
        System.out.println("setOprands(int left, int right)");
        this.left = left;
        this.right = right;
    }
}
public class CalculatorDemo {
}
