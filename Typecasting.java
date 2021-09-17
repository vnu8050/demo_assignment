package com.java.demo;
import java.util.Scanner;


public class Typecasting {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter integer value for typecasting into float :");
		int a=sc.nextInt();		
		Typecasting ob1=new Typecasting();
		ob1.int_to_float(a);		
		System.out.print("Enter float value for typecasting into integer :");
		float b=sc.nextFloat();		
		Typecasting ob2=new Typecasting();
		ob2.float_to_int(b);
		sc.close();
	}
	public void int_to_float(int val)
	{
		float f1=val;
		System.out.println("Int value is :" + f1);
	}
	public void float_to_int(float f2) {
		int i=(int)f2;
		System.out.println("Integer value is : " + i);
	}
	
}