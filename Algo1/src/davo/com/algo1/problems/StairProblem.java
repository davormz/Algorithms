package davo.com.algo1.problems;

import java.util.Scanner;

/**
 * Print a stair of asterisks
 * @author davo
 *
 */
public class StairProblem {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Number of levels: ");
		int levels = in.nextInt();
		
		for(int i = 0; i < levels ; i++){
			for(int j = 1; j < levels - i; j++){
				System.out.print(" ");
			}
			for(int k = 0; k <= i ; k++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
