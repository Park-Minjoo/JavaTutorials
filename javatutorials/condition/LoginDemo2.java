package com.example.javatutorials.condition;

public class LoginDemo2 {

	public static void main(String[] args) {
		String id = args[0];
		String password = args[1];
		
		if(id.equals("minjoo")) {
			if(password.equals("1234")) {
				System.out.println("rignt");
			} else {
				System.out.println("wrong");
			}
			
		} else {
			System.out.println("wrong");
		}
	}

}
