package davo.com.algo1.problems;

/**
 * Having two sorted arrays merge both arrays into one. 
 * @author davo
 * 
 * Algorithm.
 * Create new array size array1 + array2.
 * Loop elements from both arrays keeping 2 indexes.
 * Compare element i from array1 with element i from array2.
 * If element from array1 is less than element from array2 add element into the new array.
 * Increment the index for array1
 * Else add element from array2 into the new array.
 * Increment index for array2.
 * If there is elements pending from any array add them add the end of the new array.
 * Print the result.  
 *
 */
public class SimpleMerge {
	
	public static void main(String args[]){
		int first[] = new int[]{1,3,7,7,9};
		int second[] = new int[]{2,3,4,5,6,8,10,11};
		System.out.println("Merging arrays");
		SimpleMerge simpleMerge = new SimpleMerge();
		int mergedArray[] = simpleMerge.mergeArray(first, second);
		simpleMerge.printArray(mergedArray);
		
	}
	
	public int[] mergeArray(int first[], int second[]){
		int index1 = 0;
		int index2 = 0;
		int mergedIndex = 0;
		int mergedArray[] = new int[first.length + second.length];
		while(index1 < first.length && index2 < second.length){
			if(first[index1] < second[index2]){
				mergedArray[mergedIndex] = first[index1];
				index1++;
			}else{
				mergedArray[mergedIndex] = second[index2];
				index2++;
			}
			mergedIndex++;
		}
		if(index1 < first.length){
			addRestOfArray(first, index1, mergedArray, mergedIndex);
		}
		if(index2 < second.length){
			addRestOfArray(second, index2, mergedArray, mergedIndex);
		}
		return mergedArray;
	}
	
	public void addRestOfArray(int srcArray[], int startSrcPos, int targetArray[], int targetStartPos){
		System.arraycopy(srcArray, startSrcPos, targetArray, targetStartPos, (targetArray.length - targetStartPos));
	}
	
	public void printArray(int array[]){
		for(int i = 0 ; i < array.length ; i++){
			System.out.print(array[i] + ", ");
		}
	}

}
