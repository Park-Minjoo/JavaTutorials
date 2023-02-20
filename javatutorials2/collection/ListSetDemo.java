package collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ListSetDemo {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("one");
        a1.add("two");
        a1.add("two");
        a1.add("three");
        a1.add("three");
        a1.add("five");
        System.out.println("array");
        Iterator ai = a1.iterator();
        while (ai.hasNext()){
            System.out.println(ai.next());
        }

        HashSet<String> hs = new HashSet<String>();
        hs.add("one");
        hs.add("two");
        hs.add("two");
        hs.add("three");
        hs.add("three");
        hs.add("five");
        Iterator hi = hs.iterator();
        System.out.println("\nhashset");
        while(hi.hasNext()){
            System.out.println(hi.next());
        }
    }
}
