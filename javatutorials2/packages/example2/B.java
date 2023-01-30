package packages.example2;

import packages.example1.A; // Class A and B are is different packages.

public class B {
    public static void main(String[] args) {
        A a = new A();
    }
}
