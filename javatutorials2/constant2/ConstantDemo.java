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
//interface FRUIT{
//    int APPLE = 1, PEACH = 2, BANANA = 3;
//}
//interface COMPANY{
//    int GOOGLE = 1, APPLE = 2, ORACLE = 3;
//}
//class Fruit{
//    public static final Fruit APPLE = new Fruit();
//    public static final Fruit PEACH = new Fruit();
//    public static final Fruit BANANA = new Fruit();
//
//    }
//class Company{
//    public static final Company GOOGLE = new Company();
//    public static final Company APPLE = new Company();
//    public static final Company ORACLE = new COMPANY(Company);
//
//}
enum Fruit{
    APPLE, PEACH, BANANA;
    Fruit(){
        System.out.println("Call Constructor "+this);
    }
}
enum Company{
    GOOGLE, APPLE, ORACLE;
}
public class ConstantDemo {
    public static void main(String[] args) {
        /*
         * 1. 사과
         * 2. 복숭아
         * 3. 바나나
         */
//        int type = COMPANY.GOOGLE;
//        switch(type){
//            case FRUIT.APPLE:
//                System.out.println(57+" kcal");
//                break;
//            case FRUIT.PEACH:
//                System.out.println(34+" kcal");
//                break;
//            case FRUIT.BANANA:
//                System.out.println(93+" kcal");
//                break;
        /*
        if(Fruit.APPLE == Company.APPLE){
            System.out.println("과일 애플과 회사 애풀이 같다.");
        }
         */
        Fruit type = Fruit.APPLE;
        switch (type){
            case APPLE:
                System.out.println(57 + " kcal");
                break;
            case PEACH:
                System.out.println(34 + " kcal");
                break;
            case BANANA:
                System.out.println(93 + " kcal");
                break;
        }
    }
}
