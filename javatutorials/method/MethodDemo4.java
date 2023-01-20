package com.example.javatutorials.method;

public class MethodDemo4 {
    public static void numbering(int limit) { // limit -> parameter
        int i = 0;
        while (i < limit) {
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) {
        numbering(23); // 23 -> argument
    }
}
