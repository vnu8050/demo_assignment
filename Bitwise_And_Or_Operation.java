package demo;

import java.util.Scanner;

public class Bitwise_And_Or_Operation {
	public static void main(String[] args){
		   System.out.println("Enter 2 numbers for bitwise operation ");
		   Scanner sc = new Scanner(System.in);
		   int a= sc.nextInt();
		   int b= sc.nextInt();
		   int c=a&b;
		   int d=a|b;
		  System.out.println("The output of a&b operation is : "+c);
		  System.out.println("The output of a|b operation is : "+d);
		  sc.close();
	}
	}
