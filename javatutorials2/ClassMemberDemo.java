/*
 Class vs Instance
 1. The instance method can access the class member.
 2. The class method cannot access the instance member.
 - class method is created before as instance is created,
    and since the class method is created before an instance is created,
    accessing an instance member is the same as
    accessing an instance variable that does not exist.
 */

class C1{
    static int static_variable = 1;
    int instance_variable = 2;
    static void static_static(){
        System.out.println(static_variable);
    }
    static void static_instance(){
        // the Class method cannot access to instance variable.
    }
    void instance_static(){
        // the Instance method can access to class variable.
        System.out.println(static_variable);
    }
    void instance_instance(){
        System.out.println(instance_variable);
    }
}
public class ClassMemberDemo {
    public static void main(String[] args) {
        C1 c = new C1();
        // access to static method using instance -> Success
        // access to static variable using instance method -> Success
        c.static_static();
        // access to static method using instance -> Success
        // static method is access to instance variable -> Fail
        c.static_instance();
        // access to instance method using instance -> Success
        // instance method is access to class variable -> Success
        c.instance_static();
        // access to instance method using instance -> Success
        // instance method is access to instance variable -> Success
        c.instance_instance();
        // access to class method using class -> Success
        // class method is access to class variable -> Success
        C1.static_static();
        // access to class method using class -> Success
        // class method is access to instance variable -> Fail
        C1.static_instance();
        // access to instance method using class -> Fail
        // C1.static_instance();
        // access to instance method using class -> Fail
        // C1.instance_instance();
    }
}
/*
    Term
        - instance variable -> Non-Static Field
        - class variable -> Static Field
    field? a variable that can be accessed throughout the class
 */