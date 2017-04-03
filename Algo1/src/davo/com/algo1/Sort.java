package davo.com.algo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * This Class implements sort algorithms: mergesort and Quicksort.
 * @author davo.rmz
 *
 */
public class Sort {
	
	private static long inversionsCounter;
	
	/**
	 * Sort the given data at the start index to the end index, using mergesort method.
	 * @param data
	 * @param startIndex
	 * @param endIndex
	 * @return
	 */
	//TODO: review and test
	public static Integer[] mergeSort(Integer data[], int startIndex, int endIndex){
		int middleIndex = (endIndex + startIndex)/2;
		
		if(middleIndex == endIndex){
			Integer[] auxData = new Integer[1];
			auxData[0] = data[middleIndex];
			return auxData;
		}else{
			Integer[] firstHalfSorted = mergeSort(data, startIndex, middleIndex);
			Integer[] secondHalfSorted = mergeSort(data, middleIndex + 1, endIndex - 1);
			return merge(firstHalfSorted, secondHalfSorted);
		}
	}
	
	private static Integer[] merge(Integer[] firstSortedArray, Integer[] secondSortedArray){
		Integer mergedArray[] = new Integer[firstSortedArray.length + secondSortedArray.length];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < firstSortedArray.length && j < secondSortedArray.length){
			if(firstSortedArray[i] < secondSortedArray[j]){
				mergedArray[k] = firstSortedArray[i];
				i++;
			}else{
				mergedArray[k] = secondSortedArray[j];
				j++;
				inversionsCounter++;
			}
			k++;
		}
		if(i < firstSortedArray.length){
			System.arraycopy(firstSortedArray, i, mergedArray, k, firstSortedArray.length - i);
		}
		if(j < secondSortedArray.length){
			System.arraycopy(secondSortedArray, j, mergedArray, k, secondSortedArray.length - j);
			inversionsCounter ++;
		}
		
		return	mergedArray;
	}

	/**
	 * Gets the inversions counter's value.
	 * @return
	 */
	public static long getInversionsCounter() {
		return inversionsCounter;
	}
	
	/**
	 * Restarts the inversions counter to 0.
	 */
	public static void restartInversionsCounter(){
		inversionsCounter = 0;
	}

	/**
	 * Quicksort implementation.
	 * @param arr
	 * @return
	 */
	public static Integer[] quicksort(Integer[] arr){
		Integer pivot = null;
		ArrayList<Integer> less = new ArrayList<Integer>();
		ArrayList<Integer> greater = new ArrayList<Integer>();
		if(arr.length < 2){
			return arr;
		}else{
			pivot = arr[0];
			for(int i = 1 ; i < arr.length ; i++){
				if(arr[i] <= pivot){
					less.add(arr[i]);
				}else{
					greater.add(arr[i]);
				}
			}
		}
		Integer lessArray[] = toArray(less);
		Integer greaterArray[] = toArray(greater);
		
		return addAll(quicksort(lessArray), 
				pivot, 
				quicksort(greaterArray));
	}
	
	private static Integer[] toArray(ArrayList<Integer> list){
		return list.toArray(new Integer[list.size()]);
	}
	
	private static Integer[] addAll(Integer less[], Integer pivot, Integer greater[]){
		ArrayList<Integer> all = new ArrayList<Integer>();
		all.addAll(Arrays.asList(less));
		all.add(pivot);
		all.addAll(Arrays.asList(greater));
		return toArray(all);
	}
	
	public static void main(String arg[]){
		Integer arr[] = {9, 7, 5, 11, 12, 2, 14, 3, 10, 6};
		arr = quicksort(arr);
		for(Integer item : arr){
			System.out.print(item + ",");
		}
	}
	
}
