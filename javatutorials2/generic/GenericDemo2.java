package generic;
//abstract class Info{
//    public abstract int getLevel();
//}
interface Info{
    int getLevel();
}
class EmployeeInfo implements Info{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
    public int getLevel(){
        return this.rank;
    }
}
class Person<T extends Info>{
    public T info;
    Person(T info) { this.info = info; }
//    public S id;
//    Person(T info, S id){
//        this.info = info;
//        this.id = id;
//    }
//    public <U> void printInfo(U info){
//        System.out.println(info);
//    }
}
//class Person<T extends Info>{
//    public T info;
//    Person(T info){ this.info = info; }
//}
public class GenericDemo2 {
    public static void main(String[] args) {
//        EmployeeInfo e = new EmployeeInfo(1);
//        Integer i = new Integer(10);
//        Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(new EmployeeInfo(1), 1);
//        p1.<EmployeeInfo>printInfo(e);
//        System.out.println(p1.id.intValue());
//        p1.printInfo(e);
        Person p1 = new Person(new EmployeeInfo(1));
//        Person<String> p2 = new Person<String>("부장")
    }
}
