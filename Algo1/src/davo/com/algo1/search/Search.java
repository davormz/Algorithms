package davo.com.algo1.search;

import java.util.Arrays;
import java.util.Scanner;

import davo.com.algo1.util.MetricsHelper;

/**
 * 
 * @author davo
 *
 */
public class Search {
	private MetricsHelper metrics;
	
	public static void main(String args[]){
		Search searcher = new Search();
		Scanner in = new Scanner(System.in);
		Integer theArray[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 
				41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		
		System.out.println("Number to search: ");
		Integer key = in.nextInt();
		
		Integer indexFound = searcher.binarySearch(theArray, key);
//		Integer indexFound = searcher.recursiveBinarySearch(theArray, key);
		
		if(indexFound > 0){
			System.out.println("Item found at index: " + indexFound);
		}else{
			System.out.println("Item not found!");
		}
		searcher.metrics.printMetrics();
		
	}
		
	
	
	/**
	 * Binary search implementation.
	 * @param theArray
	 * @param key - Item to search
	 * @return the index where the key is found. Else -1
	 */
	public Integer binarySearch(Integer theArray[], Integer key){
		metrics = new MetricsHelper();
		metrics.startWatch();
		Integer lowIndex = 0;
		Integer highIndex = theArray.length - 1;
		
		while(lowIndex <= highIndex){
			metrics.addStep();
			Integer midIndex = (lowIndex + highIndex)/2;
			
			Integer guess = theArray[midIndex];
			if(guess == key){
				metrics.stopWatch();
				return midIndex;
			}else if(guess > key){
				highIndex = midIndex - 1;
			}else{
				lowIndex = midIndex + 1;
			}
		}
		metrics.stopWatch();
		return -1;
	}
	
	/**
	 * Binary search recursive implementation
	 * @param theArray
	 * @param key
	 * @return
	 */
	public Integer recursiveBinarySearch(Integer theArray[], Integer key){
		Integer lowIndex = 0;
		Integer highIndex = theArray.length - 1;		
		Integer midIndex = (lowIndex + highIndex)/2;
		
		Integer guess = theArray[midIndex];
		
		if(guess == key){
			return midIndex;
		}else if(guess > key){
			highIndex = midIndex - 1;
		}else{
			lowIndex = midIndex + 1;
		}
		if(lowIndex <= highIndex){
			return recursiveBinarySearch(Arrays.copyOfRange(theArray, lowIndex, highIndex), key);
		}
		return -1;
	}

}
