package progenitor;

class Student implements Cloneable{
    String name;
    Student(String name){
        this.name = name;
    }
//    public boolean equals(Object obj){
//        Student _obj = (Student) obj;
//        return  name == _obj.name;
//    }
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student("egoing"); // false
//        Student s2 = new Student("egoing"); // true
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));
        try {
            Student s2 = (Student) s1.clone();
            System.out.println(s1.name);
            System.out.println(s2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
