public class CalculatorDemo {
    public static void avg(int left, int right) {
        System.out.println((left + right) / 2);
    }
    public static void sum(int left, int right) {
        System.out.println(left + right);
    }
    public static void main(String[] args) {
//        System.out.println(10 + 20);
//        System.out.println(20 + 40);
//        sum(10, 20);
//        sum(20, 40);
        int left, right;

        left = 10;
        right = 20;

        sum(left, right);
        avg(left, right);

        left = 20;
        right = 40;

        sum(left, right);
        avg(left, right);

    }
}
