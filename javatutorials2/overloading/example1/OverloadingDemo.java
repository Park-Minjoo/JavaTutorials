package overloading.example1;
/*
    Method overloading uses parameters.
    In other words, if the parameters are diff, even if the names are the same, they are diff methods.
    On the other hands, if the parameters are the same but the return type is diff, then an error occurs.
 */
public class OverloadingDemo {
    void A (){System.out.println("void A()");}
    void A (int arg1){System.out.println("void A (int arg1)");} // Different numbers of parameters
    void A (String arg1){System.out.println("void A (String arg1)");} // Same Number of factors but different data types in the parameters

    public static void main(String[] args) {
        OverloadingDemo od = new OverloadingDemo();
        od.A();
        od.A(1);
        od.A("Hello JIU!");
    }
    /*
        Java can determine which method to call according to the data type of the factor.
        However, the return value of the method cannot be subject to overloading because it is information
        that is not delivered at the time calling the method.
     */
}
