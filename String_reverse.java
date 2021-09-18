package com.java.demo;

import java.util.Scanner;

public class String_reverse {
	
	public static void main(String args[]) {
		/* using Stringbuffer with reverse method
		StringBuffer s = new StringBuffer("12345");
		System.out.println(s.reverse());
		*/
		/* using stringbuilder with reverse method 
		StringBuilder b = new StringBuilder("123456");
		System.out.println(b.reverse());
		*/
		int n;
		System.out.println("Enter your string to reverse : ");
		Scanner ob = new Scanner(System.in);
		String name = ob.nextLine();
		String rev = "";
		n=name.length();
		
		for(int i=n-1;i>=0;i--)
		{
			 rev = rev+name.charAt(i); 
		}
		
		System.out.println("The reversed string is : " + rev);
	ob.close();
	}

}
