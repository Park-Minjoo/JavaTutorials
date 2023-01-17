package com.example.javatutorials;

public class ReturnDemo4 {
    public static String[] getMembers() {
        String[] members = { "Minjoo", "Chastin", "Gloria"};
        return members;
    }

    public static void main(String[] args) {
        String[] members = getMembers();
        System.out.println(members[0]);
    }
}
