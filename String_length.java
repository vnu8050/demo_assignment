package com.java.demo;
import java.util.*;

public class String_length {

	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = s.nextLine();
		
		if(name.length()<6) {
			System.out.println("Your name is short");
		}else {
			System.out.println("Your name is long");
		}
	s.close();
	
	}
}
