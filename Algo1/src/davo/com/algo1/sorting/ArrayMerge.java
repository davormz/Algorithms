package davo.com.algo1.sorting;

public class ArrayMerge {
	
	public static void main(String args[]){
		int a[] = {1,3,4,8};
		int b[] = {2,5,6,7,9,12,13};
		
		System.out.println("Merging arrays  ...");
		int mergedArray[] = mergeArrays(a, b);
		printArray(mergedArray);
		
	}
	
	public static int[] mergeArrays(int a[], int b[]){
		int i = 0;
		int iSize = a.length;
		int j = 0;
		int jSize = b.length;
		int x = 0;
		int n[] = new int[iSize + jSize];
		
		while(i < iSize && j < jSize){
			if( a[i] < b[j]){
				n[x] = a[i];
				i++;
			}else{
				n[x] = b[j];
				j++;
			}
			x++;
		}
		
		if(i < iSize){
			addRestOfArray(i, a, x, n);
		}
		if(j < jSize){
			addRestOfArray(j, b, x, n);
		}
		
		return n;
	}

	private static void addRestOfArray(int i, int[] a, int x, int[] n) {
		System.arraycopy(a, i, n, x, (n.length - x));
	}
	
	private static void printArray(int arr[]){
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i] + " ,");
		}
	}

}
