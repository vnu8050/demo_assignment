package demo;

import java.util.Scanner;

public class Swapping_using_bitwise {
	   public static void main(String[] args){
		   System.out.println("Enter numbers before swapping ");
		   Scanner sc = new Scanner(System.in);
		   int a= sc.nextInt();
		   int b= sc.nextInt();
		   
		   System.out.println("a= "+a);
		   System.out.println("b= "+b);
		   a=a^b;
		   b=b^a;
		   a=a^b;
		   System.out.println("after swapping");
		   System.out.println("a= "+a);
		   System.out.println("b= "+b);
		 sc.close();     
		   
	   }

}
