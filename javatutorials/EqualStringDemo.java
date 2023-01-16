package com.example.javatutorials;

public class EqualStringDemo {

	public static void main(String[] args) {
		String a = "Hello world";
		String b = new String("Hello workd");
		System.out.println(a == b);
		System.out.println(a.equals(b));
	}

}
