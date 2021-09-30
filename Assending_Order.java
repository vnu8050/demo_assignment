package demo;

import java.util.Scanner;

public class Assending_Order {
	
	public static void main(String[] args) {
		//boolean flag = false;
		System.out.println("Enter array elements");
		boolean res = assending();
		if(res == true) {
			System.out.println("Array elements are in Assending order");
	}else {
		System.out.println("Array elements are not in Assending order");
	}
	}
	public static boolean assending(){
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		int arr[] = new int[5]; 
		for(int i=0;i<5;i++) {
			arr[i] = sc.nextInt();
			sc.nextLine();
		}
	sc.close();
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				flag = true;
				//break;
			}
			else 
			{
			flag = false;
				break;
			}
		}}
		return flag;
	
	}
	
	}

