package davo.com.algo1;

import java.io.IOException;
import java.util.ArrayList;

import davo.com.algo1.util.FileHelper;

public class Main {
	
	public static void main(String args[]){
		String fileName = "resources/numbers.txt";
		
		try {
			System.out.println("Reading Data ...");
			ArrayList<Integer> numbers = FileHelper.readNumbersFromFile(fileName);
			Integer data[] = new Integer[10];
			data = numbers.toArray(data);
			
			System.out.println("Starting sorting ...");
			Sort.restartInversionsCounter();
			Integer sortedData[] = Sort.mergeSort(data, 0, data.length);
		} catch (NumberFormatException | IOException e) {
			System.out.println(e.getCause());
		}
		System.out.println("Sorted!");
		System.out.println("Number of inversions: " + Sort.getInversionsCounter());
	}
	
}
