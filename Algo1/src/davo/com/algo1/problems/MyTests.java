package davo.com.algo1.problems;

import java.util.Scanner;

/**
 * 
 * @author davo
 *
 */
public class MyTests {
	
	public static void main(String... arg){
		Scanner in = new Scanner(System.in);
		System.out.println("Input: ");
		Integer input = in.nextInt();
		Integer fact = factorial(input);
		System.out.println("The factorial of " + input + " is: " + fact);
	}
	
	/**
	 * Factorial recursive implementation. 
	 * @param num
	 * @return
	 */
	public static Integer factorial(Integer num){
		 if(num == 1){
			 return num;
		 }else{
			 return num * factorial(num - 1);
		 }
	}

}
