package overloading.example1;

/*
    Method overloading uses parameters.
    In other words, if the parameters are diff, even if the names are the same, they are diff methods.
    On the other hands, if the parameters are the same but the return type is diff, then an error occurs.
 */
class Calculator{
    int left, right;
    int third = 0;
    public void setOprands(int left, int right) {
        System.out.println("setOprands(int left, int right)");
        this.left = left;
        this.right = right;
    }
    public void setOprands(int left, int right, int third) {
        System.out.println("setOprands(int left, int right)");
        this.left = left;
        this.right = right;
        this.third = third;
    }

    public void sum() {
        System.out.println(this.left + this.right + this.third);
    }

    public void avg() {
        System.out.println((this.left + this.right + this.third) / 3);
    }
}
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.setOprands(10,20,30);
        c1.sum();
        c1.avg();

    }
}
