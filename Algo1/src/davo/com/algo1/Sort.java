package davo.com.algo1;

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
	public static Integer[] mergeSort(Integer data[], int startIndex, int endIndex){
		int middleIndex = (endIndex + startIndex)/2;
		
		if(middleIndex == endIndex){
			Integer[] auxData = new Integer[1];
			auxData[0] = data[middleIndex];
			return auxData;
		}else{
			Integer[] firstHalfSorted = mergeSort(data, startIndex, middleIndex);
			Integer[] secondHalfSorted = mergeSort(data, middleIndex + 1, endIndex);
			return merge(firstHalfSorted, secondHalfSorted);
		}
	}
	
	private static Integer[] merge(Integer[] firstSortedArray, Integer[] secondSortedArray){
		Integer mergedArray[] = new Integer[firstSortedArray.length + secondSortedArray.length];
		int i = 0;
		int j = 0;
		
		for(int k = 0 ; k < mergedArray.length ; k++){
			if(firstSortedArray[i] < secondSortedArray[j]){
				mergedArray[k] = firstSortedArray[i];
				i++;
				inversionsCounter++;
			}else{
				mergedArray[k] = secondSortedArray[j];
				j++;
				inversionsCounter++;
			}
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

	
}
