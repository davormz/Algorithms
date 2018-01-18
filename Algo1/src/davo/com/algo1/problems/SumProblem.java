package davo.com.algo1.problems;

import java.util.Scanner;

public class SumProblem {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int t = in.nextInt();
//        int arr[] = new int[n];
//        for(int i = 0; i < n ; i++){
//            arr[i] = in.nextInt();
//        }
        
        int t = 10;
        int arr[] = {3,3,5,1,7};
        
        System.out.println(sumConsecutive(arr, t));
        
    }
    
    public static int sumConsecutive(int[] arr, int t){
        int largeSum = 0;
        int prevSum = 0;
        int currentSum = 0;
        for(int i =0 ; i < arr.length ; i++){
        	prevSum = largeSum;
        	largeSum = 0;
            for(int j =i; j < arr.length; j++){
                if(largeSum < t && largeSum <= prevSum){
                    largeSum += arr[j];
                }else{
                    break;
                }
                
            }
            currentSum = largeSum;
            
        }
        if(prevSum > currentSum){
            largeSum = prevSum;
        }
        return largeSum;
    }
}