package demo;

import java.util.Scanner;

public class Circumference_and_Area_of_circle {

	public static void main(String[] args) {
		double r,a;
	//	double PI=3.142;
		System.out.println("Enter th value of radius : ");
		Scanner sc = new Scanner(System.in);
		r = sc.nextDouble();
		a =  area(r);
		System.out.println("Area of circle is : "+a);
		sc.close();
	}
	
	public static double area(double x) {
		return 3.142*x*x;
	}
}
