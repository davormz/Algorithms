package davo.com.algo1.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

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
	    
	    
	    public static int numberNeeded(String first, String second) {
	    	char firstArray[] = first.toCharArray();
	    	char secondArray[] = second.toCharArray();
	    	int numberNeeded = 0;
	    	
	    	HashMap<Character, Integer> firstHash = createHash(firstArray);
	    	HashMap<Character, Integer> secondHash = createHash(secondArray);
	    	
	    	ArrayList<Character> visited = new ArrayList<Character>();
	    	
	    	Set<Character> firstKeys = firstHash.keySet();
	    	
	    	for(Character element : firstKeys){
	    		if(secondHash.containsKey(element)){
	    			Integer numberOfElementSecondHash = secondHash.get(element);
	    			Integer numberOfElementFirstHash = firstHash.get(element);
	    			if(numberOfElementSecondHash != numberOfElementFirstHash){
	    				numberNeeded += Math.abs(numberOfElementSecondHash - numberOfElementFirstHash);
	    			}
	    		}else{
	    			Integer numberOfElementFirstHash = firstHash.get(element);
	    			numberNeeded += numberOfElementFirstHash;
	    		}
	    		visited.add(element);
	    	}
	    	
	    	Collections.sort(visited);
	    	
	    	Set<Character> secondKeys = secondHash.keySet();
	    	for(Character element : secondKeys){
	    		int foundIndex = Collections.binarySearch(visited, element);
	    		if(foundIndex < 0){
	    			Integer numberOfElementSecondHash = secondHash.get(element);
	    			numberNeeded += numberOfElementSecondHash;
	    		}
	    	}
	    	
	    	return numberNeeded;
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
