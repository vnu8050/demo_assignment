package demo;

import java.util.Scanner;

public class Number_appering_once {
		
	public static void main(String[] args) {
		int arr[] =new int[5];
		System.out.println("Enter array  elements : ");
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
	}sc.close();
		boolean flag = false;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					flag = true;
				break;
				}
			}
		for(int k=0;k<arr.length;k++) {
			if(k == i) {
				continue;
			}
			else if(arr[i] == arr[k]) {
				flag = true;
			}
		}
	
	if(flag == false) {
		System.out.println("Number apperaed Once is : "+arr[i]);
		
	}
	}
		
}
}