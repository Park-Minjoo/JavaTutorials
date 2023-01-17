package com.example.javatutorials;

public class MethodDemo6 {
    public static String numbering(int init, int limit) {
        int i = init;
        String output = ""; // to put numbers in output variables
        while (i < limit) {
            // instead of printing out screen, put in variable output
            output += i;
            i++;
        }
        return output;
        // return to outside of method in the string in outside
    }

    public static void main(String[] args) {
        String result = numbering(1, 5);
        System.out.println(result);
    }
}
