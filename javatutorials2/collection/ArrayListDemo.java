package collection;
import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        String[] arrayObj = new String[2];
        arrayObj[0] = "one";
        arrayObj[1] = "two";
//        arrayObj[2] = "three";
        for(int i = 0; i < arrayObj.length; i++){
            System.out.println(arrayObj[i]);
        }

        ArrayList a1 = new ArrayList();
        a1.add("one");
        a1.add("two");
        a1.add("three");
        for(int i = 0; i < a1.size(); i++){
            System.out.println(a1.get(i));
        }
    }
}
