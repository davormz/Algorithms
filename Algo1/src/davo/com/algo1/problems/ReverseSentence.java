package davo.com.algo1.problems;

import java.util.Scanner;

/**
 * Reverse a sentence
 * @author davo
 * 
 * Algorithm.
 * Parse the String into a array of chars.
 * Create a String builder object to keep the value of the new string.
 * Loop the array of chars from Top to bottom and append the char to the String builder object.
 * Print the result.
 *
 */
public class ReverseSentence {
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		ReverseSentence rs = new ReverseSentence();
		System.out.println(rs.reverse(line));
		
	}
	
	public String reverse(String line){
		char array[] = line.toCharArray();
		StringBuilder reversedLine = new StringBuilder();
		for(int i = array.length - 1 ; i >= 0 ; i-- ){
			reversedLine.append(array[i]);
		}
		return reversedLine.toString();
	}

}
