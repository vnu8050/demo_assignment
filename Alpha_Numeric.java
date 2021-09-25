package demo;

import java.util.*;

public class Alpha_Numeric {
	
	public void alpha(String input) {
		int c = 0;
		boolean flag = false;
		for(int i=0;i<input.length();i++) {
			c = input.charAt(i);
			if(!((c>='A' && c<='Z')|| (c>='a' && c<='z')||(c>='0' && c<='9'))) {
				System.out.println("The Given string is not Alpha Numeric ");
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("The Given string is Alpha Numeric ");
			
		}
	}

	public static void main(String[] args) {
		System.out.println("Please enter a string");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		Alpha_Numeric obj =  new Alpha_Numeric();
		obj.alpha(str);

	}

}
