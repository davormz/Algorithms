package davo.com.algo1;

public class Sort {
	
	public static int[] mergeSort(int data[], int lowIndex, int highIndex){
		int middleIndex = (highIndex + lowIndex)/2;
		
		if(middleIndex == highIndex){
			int[] auxData = new int[1];
			auxData[0] = data[middleIndex];
			return auxData;
		}else{
			int[] firstHalfSorted = mergeSort(data, lowIndex, middleIndex);
			int[] secondHalfSorted = mergeSort(data, middleIndex + 1, highIndex);
			return merge(firstHalfSorted, secondHalfSorted);
		}
	}
	
	private static int[] merge(int[] firstSortedArray, int[] secondSortedArray){
		int mergedArray[] = new int[firstSortedArray.length + secondSortedArray.length];
		int i = 0;
		int j = 0;
		
		for(int k = 0 ; k < mergedArray.length ; k++){
			if(firstSortedArray[i] < secondSortedArray[j]){
				mergedArray[k] = firstSortedArray[i];
				i++;
			}else{
				mergedArray[k] = secondSortedArray[j];
				j++;
			}
		}
		
		return	mergedArray;
	}
	
}
