package davo.com.algo1.problems;

import java.util.Scanner;

public class Solution {

    public static int[] arrayLeftRotation(int[] a, int n, int d) {
        int copyArray[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            int newIndex = n -(d - i);
            if(newIndex >= n){
            	newIndex = newIndex - n;
                copyArray[newIndex] = a[i];
            }else{
                copyArray[newIndex] = a[i];
            }
        }
        return copyArray;      
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, d);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }
}
