package demo;

import java.util.Scanner;

public class Method_calling {


	public static void main(String[] args) {
		int n=0;
		System.out.println("Enter your number : ");
		Scanner sc =new Scanner(System.in);
		n =sc.nextInt();
		//Var_Args ob = new Var_Args();
		check(n);
		sc.close();
	}
	public static void check(int n) {
		if(n<100) {
			System.out.println("number is less than 100");
			if(n>50) {
				System.out.println("number is greater than 50");
			}
			else {
					System.out.println("number is less than 50");
				}
			
		}
		else {
			System.out.println("number is greater than 100");
		
		}
		if(n<150) {
			System.out.println("number is less than 150");
		}
		else {
			System.out.println("number is greater than 150");
		}
	}
	

}
