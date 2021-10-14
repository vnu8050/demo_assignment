package demo;

import java.util.HashMap;

public class Character_Count_Using_HashMap {
    public static void main(String[] args) {
    	String str = "tit for tat is a proverb";
    	str = str.toLowerCase();
    	
    	HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
    	for(int i=0;i<str.length();i++) {
    		Character ch = str.charAt(i);
    		if(ch>='a' && ch<='z') {
    		if(hm.containsKey(ch)) {
    			Integer value = hm.get(ch);
    			value++;
    			hm.put(ch, value);
    		}else {
    			hm.put(ch, 1);
    		}
    	}}
    	int max=0;
    	char maxchar=0;
    	int value=0;
    	Character letter=0;
    	for(Character key:hm.keySet() ) {
    		value = hm.get(key);
    		letter = key;
    		System.out.println(letter+"  character has occurance of  "+value+"  times  ");
    		if(max<value) {
    			max=value;
    			maxchar=key;
    		}
    	}
    	
    System.out.println("the character and maximun count of character is "+ maxchar +" "+ max);
    } 
}
