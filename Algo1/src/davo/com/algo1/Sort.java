package davo.com.algo1;

public class Sort {
	
	private static long inversionsCounter;
	
	public static Integer[] mergeSort(Integer data[], int lowIndex, int highIndex){
		int middleIndex = (highIndex + lowIndex)/2;
		
		if(middleIndex == highIndex){
			Integer[] auxData = new Integer[1];
			auxData[0] = data[middleIndex];
			return auxData;
		}else{
			Integer[] firstHalfSorted = mergeSort(data, lowIndex, middleIndex);
			Integer[] secondHalfSorted = mergeSort(data, middleIndex + 1, highIndex);
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

	public static long getInversionsCounter() {
		return inversionsCounter;
	}
	
	public static void restartInversionsCounter(){
		inversionsCounter = 0;
	}

	
}
