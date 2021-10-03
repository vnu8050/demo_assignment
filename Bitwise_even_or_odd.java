package demo;

import java.util.Scanner;

public class Bitwise_even_or_odd {

	   public static void main(String[] args){
		   System.out.println("Enter numbers ");
		   Scanner sc = new Scanner(System.in);
		   int a= sc.nextInt();
		  // using ^ operator
		   /* int b=a^1;
		   if(b>a) {
			   System.out.println("number is even");
		   }else {
			   System.out.println("number is odd");
		   }*/
		   //using & operator
		 /*  int b=a&1;
		   if(b==0) {
			   System.out.println("number is even");
		   }else {
			   System.out.println("number is odd");
		   }*/
		   //using | operator
		   int b = a|1;
		   if(b==a)
		   {
			   System.out.println("number is odd");
		   }else {
			   System.out.println("number is even");
		   }
		 sc.close();     
		   
	   }
}
