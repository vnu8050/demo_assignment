package demo;

import java.util.Scanner;

public class Calling_user_input_method {
	
	public static void main(String[] args) {
	int a,b;
	String operation;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two numbers : ");
	a = sc.nextInt();
	b = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter what operation to be performed(add or multi)");
	operation = sc.nextLine();
	if(operation.equals("add")) {
		int sum = add(a,b);
		System.out.println("the addition of 2 numbers is "+sum);
	}else {
		
		int product = multi(a,b);
		System.out.println("the product of 2 numbers is "+product);
	}
	sc.close();
	}
	

	public static int add(int x,int y) {
		return x+y;
		}
	public static int multi(int x,int y) {
		return x*y;
	}
}

