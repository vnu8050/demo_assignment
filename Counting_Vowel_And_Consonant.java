package demo;

public class Counting_Vowel_And_Consonant {
	
	public static void main(String[] args) {
    	int count=0,consonant=0;
    String str = "This is really a simple question";
    for(int i=0;i<str.length();i++) {
    	if((str.charAt(i) == 'a') || (str.charAt(i) == 'e') || (str.charAt(i) == 'i') || (str.charAt(i) == 'o') || (str.charAt(i) == 'u')) {
    		count++;
    	}else {
    		consonant++;
    	}
    }
    System.out.println("vowels in string : "+ count);
    System.out.println("constrant in string : "+consonant);
    }

}
