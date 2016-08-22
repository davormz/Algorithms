package davo.com.algo1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	
	public static void main(String args[]){
		String fileName = "resources/numbers.txt";
		
		try {
			System.out.println("Reading Data ...");
			ArrayList<Integer> numbers = readFile(fileName);
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
	
	private static ArrayList<Integer> readFile(String fileName) throws NumberFormatException, IOException{
		File inputFile = new File(fileName);
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		String line = null;
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		try {
			fileReader = new FileReader(inputFile);
			
			bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
            	numbers.add(Integer.parseInt(line));
            }
		} finally{
			bufferedReader.close();
		}
		return numbers;
	}
	
}
