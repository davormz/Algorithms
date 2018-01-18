package davo.com.algo1.problems;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Given two strings,  and , that may or may not be of the same length, 
 * determine the minimum number of character deletions required to make  and  anagrams. 
 * Any characters can be deleted from either of the strings.
 * @author davo
 *
 */
public class StringAnagrams {
	
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String a = in.next();
	        String b = in.next();
	        System.out.println(numberNeeded(a, b));
	    }
	    
	    
	    //TODO:
	    public static int numberNeeded(String first, String second) {
	    	char firstArray[] = first.toCharArray();
	    	char secondArray[] = second.toCharArray();
	    	
	    	HashMap<Character, Integer> firstHash = createHash(firstArray);
	    	HashMap<Character, Integer> secondHash = createHash(secondArray);
	    	
	    	
		   
	    	return 0;
	    }
	    
	    public static HashMap<Character, Integer> createHash(char aray[]){
	    	HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
	    	Character element = null;
	    	for(int i = 0 ; i < aray.length ; i++){
	    		element = aray[i];
	    		if(hash.containsKey(element)){
	    			Integer elementCount = hash.get(aray[i]);
	    			elementCount++;
	    			hash.put(element, elementCount);
	    		}else{
	    			hash.put(element, 1);
	    		}
	    	}
	    	return hash;
	    }

}
