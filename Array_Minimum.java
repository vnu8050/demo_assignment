package demo;

import java.util.Scanner;

public class Array_Minimum {
	
	public static void main(String[] args) {
		System.out.println("Enter number of array elements :");
		int a=0;
		int minimum = min(a);
		System.out.println("the minimum value in array is : "+minimum);
	}
	public static int min(int x) {
		int min = Integer.MAX_VALUE,n=0;
		int arr[] = new int[8];
		Scanner sc =new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Enter elements into array ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		for(int i=0;i<n;i++) {
		if(min > arr[i]) {
			min = arr[i];
			
		}
		}
		return min;
	
	}
	//sc.close();
	}
