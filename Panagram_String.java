package demo;

public class Panagram_String {
	  public static void main(String[] args) {
		    String str = "thequickbrownfoxjumpsoverthelazydog";
		    str = str.toLowerCase();
		    boolean check = checkPanagram(str);
		    System.out.println(check);
		    }
		    public static boolean checkPanagram(String str) {
		    for(char i='a';i<='z';i++) {
		    	String value = String.valueOf(i);
		    	if(str.contains(value)) {
		    		continue;
		    	}else {
		    		return false;
		    		//break;
		    	}
		    }
		    return true; 
		}

}
