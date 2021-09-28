package demo;

import java.util.Scanner;

public class Add_and_Multi {
	public static void main(String[] args) {
		int a=0,b=0;
		System.out.println("Enter two Numbers : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		
		
		//Add_and_Multi ob = new Add_and_Multi();
		int add = add(a,b);
		int multi = multi(a,b);
		System.out.println("Addition of a&b is "+add);
		System.out.println("Product of a&b is "+multi);
		sc.close();
	}
	public static int add(int x,int y) {
		return x+y;
		}
	public static int multi(int x,int y) {
		return x*y;
	}
}

