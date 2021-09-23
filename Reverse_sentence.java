package demo;

public class Reverse_sentence {

public static void main(String[] args) {
			
		String str = "Geekster is my class room";
		
		String[] str1 = str.split(" ");
		int n = str1.length;
		
		String reversedInput = "";
		for(int i=n-1; i>=0; i--) {
			reversedInput += str1[i]+ " ";
			
		}
		
		System.out.println(reversedInput);
			
	}
}
