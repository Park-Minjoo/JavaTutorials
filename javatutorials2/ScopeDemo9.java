/*
    How to access the instance variable v in method m? (this)
 */

class C3 {
    int v = 10;

    void m() {
        int v = 20;
        System.out.println(this.v);
    }
}
public class ScopeDemo9 {
    public static void main(String[] args) {
        C3 c1 = new C3();
        c1.m(); // this.v
    }
}
/*
So we looked at the range of validity.
The effective range is to make it more convenient to manage variables by dividing them into global and regional variables.
In procedure-oriented programming where the concept of an object does not exist,
there is a tendency to condemn the use of accessible variables in all methods.
Global variables are limitedly used only for data with clear global use.
Object-oriented programming can be seen as an effort to overcome this problem.
In other words, by allowing related variables and methods to be grouped,
global variables can be used more freely within the object.
The global variable is no longer an object to be condemned.
As such, tools and people's minds are closely related.

It can also be considered from the perspective of parts.
The fact that a method is using a global variable means that the method depends on that global variable.
Relying on global variables means that this method cannot be used as a part of other finished products.
Thanks to object orientation, we have come to use global variables with more confidence,
but as objects grow in size, management issues arise.
In object-oriented programming, it is preferable to refrain from using global variables as much as possible,
and at the same time, it is also important to divide the size appropriately so that a single object does not become too bulky.
 */
