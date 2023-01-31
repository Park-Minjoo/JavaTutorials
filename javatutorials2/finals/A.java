package finals;

class A {
    final void b(){}
}
class B extends A{
//    void b(){}
}
/*
    The final method is not as frequently used as the final variable.
    An error occurs because the code below attempts to inherit the final method b.
 */