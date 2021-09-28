package demo;

import java.util.Scanner;

public class Age_Checking {
	
	public static void main(String[] args) {
		int n=0;
		//boolean flag = false;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your age : ");
		n = sc.nextInt();
		Age_Checking ob = new Age_Checking();
		if((ob.check(n)) == true) {
			System.out.println("You are eligible for voting");
			
		}
		else {
			System.out.println("you are not eligible for voting ");
		}
		sc.close();	
	}
	/*public void check(int n) {
		if(n<18) {
			System.out.println("You are not eligible for voting");
		}
		else {
			System.out.println("you are eliiable for voting");
		}
	}*/
	
	public boolean check(int n) {
		if(n<18) {
			return false;
		}
		else {
			return true;
		}
	}
}
