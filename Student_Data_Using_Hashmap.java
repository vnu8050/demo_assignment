package demo;

import java.util.HashMap;
import java.util.Scanner;

public class Student_Data_Using_Hashmap {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student id and name for 5 students");
		HashMap<Integer, String> hm = new HashMap<>();
		int n=5;
		String name = null;
		for(int i=0;i<n;i++) {
			Integer id = sc.nextInt();
			name = sc.next();
			hm.put(id, name);
			
		}
		sc.close();
		System.out.println();
		System.out.println("Students data in hash table");
		System.out.println();
	for(Integer id: hm.keySet()) {
		String value = hm.get(id);
		System.out.println("Student id = "+id+" name = "+value);
	}
	}
			
}
