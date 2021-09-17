package com.java.demo;

import java.util.Scanner;

public class C {
	
	public void addition() {
		int a,b,sum;
		
		System.out.println("Enter 2 numbers for addition:");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		sum=a+b;
		System.out.println("Sum of 2 non-static integers from class c is : "+ sum);
		sc.close();
	}

}
