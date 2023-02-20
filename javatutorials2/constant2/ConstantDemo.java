package constant2;

    // fruit
//    private final static int FRUIT_APPLE = 1;
//    private final static int FRUIT_PEACH = 2;
//    private final static int FRUIT_BANANA = 3;
//
//    // company
//    private final static int COMPANY_GOOGLE = 1;
//    private final static int COMPANY_APPLE = 2;
//    private final static int COMPANY_ORACLE = 3;
interface FRUIT{
    int APPLE = 1, PEACH = 2, BANANA = 3;
}
interface COMPANY{
    int GOOGLE = 1, APPLE = 2, ORACLE = 3;
}
public class ConstantDemo {
    public static void main(String[] args) {
        /*
         * 1. 사과
         * 2. 복숭아
         * 3. 바나나
         */
        int type = FRUIT.APPLE;
        switch(type){
            case FRUIT.APPLE:
                System.out.println(57+" kcal");
                break;
            case FRUIT.PEACH:
                System.out.println(34+" kcal");
                break;
            case FRUIT.BANANA:
                System.out.println(93+" kcal");
                break;
        }
    }
}
