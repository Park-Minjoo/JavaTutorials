package generic;
class StudentInfo{
    public int grade;
    StudentInfo(int grade){ this.grade = grade; }
}
//class StudentPerson{
//    public StudentInfo info;
//    StudentPerson(StudentInfo info){ this.info = info; }
//}
class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank;}
}
//class EmployeePerson{
//    public EmployeeInfo info;
//    EmployeePerson(EmployeeInfo info){ this.info = info; }
//}
class Person<T>{
    public T info;
    Person(T info){ this.info = info; }
}
public class GenericDemo1_1 {
    public static void main(String[] args) {
//        StudentInfo si = new StudentInfo(2);
//        StudentPerson sp = new StudentPerson(si);
//        System.out.println(sp.info.grade);
//        Person pl = new Person("부장");
        Person<EmployeeInfo> pl = new Person<EmployeeInfo>(new EmployeeInfo(1));
        EmployeeInfo ei1 = pl.info;
//        EmployeeInfo ei = new EmployeeInfo(1);
//        EmployeePerson ep = new EmployeePerson(ei);
        System.out.println(ei1.rank);

        Person<String> p2 = new Person<String>("부장");
        String ei2 = p2.info;
//        System.out.println(ei2.rank);
    }
}
