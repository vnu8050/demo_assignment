package com.java.demo;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int n,r,a=0;
		System.out.println("Enter your string : ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int c=n; 
		while(n>0)
		{
		r=n%10;
		a=(a*10)+r;
		n=n/10;
		s.close();
	}
		if(c==a)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not a Palindrome Number");
	}		
			
}
