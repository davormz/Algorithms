package davo.com.algo1.problems;

import java.util.Scanner;

public class StairCase {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int levels = 0;
		levels = in.nextInt();
		
		for(int i = 0; i <= levels; i++){
			for(int j = 0; j < (levels-i) -1 ; j++){
				System.out.print(" ");
			}
			for(int k = 0; k < (i+1) ; k++){
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
