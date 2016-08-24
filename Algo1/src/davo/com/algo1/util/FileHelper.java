package davo.com.algo1.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Helper class to read and write from/to files.
 * @author davo.rmz
 *
 */
public class FileHelper {
	
	/**
	 * If the given file name contains numbers separated with a new line, returns an ArrayList with the content of the file.
	 * @param fileName
	 * @return ArrayList<Integer> - numbers.
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public static ArrayList<Integer> readNumbersFromFile(String fileName) throws NumberFormatException, IOException{
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
