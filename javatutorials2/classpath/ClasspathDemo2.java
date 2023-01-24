package classpath;

/*
    Class Pass is the role of specifying the location of the class when Java is executed.
    Class Pass is a useful method when the class being used by Java applications is distributed across multiple paths.
 */
public class ClasspathDemo2 {
    public static void main(String[] args){
        Item2 i1 = new Item2();
        i1.print();
    }

    static class Item2 {
        public void print() {
            System.out.println("Hello world");
        }
    }
}
