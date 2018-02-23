package davo.com.algo1.problems;

import java.util.Hashtable;

/**
 * Max difference problem
 * @author davo
 *
 * Algorithm.
 * Find the min value and the position of the array.
 * Find the max value and the position of the array.
 * then the maxDifference = maxValue - minValue.
 * Print the result.
 */
public class MaxDifference {
	
	private int values[];
	private int minValue;
	private int minValueIndex;
	private int maxValue;
	private int maxValueIndex;
	private int maxProfit;
	
	public MaxDifference(int values[]){
		this.values = MaxDifference.cloneArray(values);
	}
	
	
	public static void main(String args[]){
		int array[] = {-1, 5, 2, 1, 4};
		MaxDifference md = new MaxDifference(array);
		md.solve();
		
		System.out.println("Buy at day: " + md.getMinValueIndex());
		System.out.println("Sell at day: " + md.getMaxValueIndex());
		System.out.println("Max profit: " + md.getMaxProfit());
		
		
		
	}
	
	public void solve(){
		findMinValue(this.values);
		findMaxValue(this.values);
		maxDifference(minValue, maxValue);
	}
	
	public int maxDifference(int minValue, int maxValue){
		maxProfit = Math.abs(maxValue) + Math.abs(minValue);
		return maxProfit;
	}
	
	public static int[] cloneArray(int array[]){
		int dest[] = new int[array.length];
		System.arraycopy(array, 0, dest, 0, dest.length);
		return dest;
	}
	
	public int findMinValue(int array[]){
		int min = array[0];
		int index = 0;
		
		while(index < array.length){
			for(int i = 1; i < array.length ; i ++){
				if(min > array[i]){
					min = array[i];
					minValueIndex = i;
				}
			}
			index++;
		}
		minValue = min;
		return min;
	}
	
	public int findMaxValue(int array[]){
		int max = array[0];
		int index = 0;
		
		while(index < array.length){
			for(int i = 1; i < array.length ; i ++){
				if(max < array[i]){
					max = array[i];
					maxValueIndex = i;
				}
			}
			index++;
		}
		maxValue = max;
		return max;
	}


	public int[] getValues() {
		return values;
	}


	public void setValues(int[] values) {
		this.values = values;
	}


	public int getMinValue() {
		return minValue;
	}


	public void setMinValue(int minValue) {
		this.minValue = minValue;
	}


	public int getMinValueIndex() {
		return minValueIndex;
	}


	public void setMinValueIndex(int minValueIndex) {
		this.minValueIndex = minValueIndex;
	}


	public int getMaxValue() {
		return maxValue;
	}


	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}


	public int getMaxValueIndex() {
		return maxValueIndex;
	}


	public void setMaxValueIndex(int maxValueIndex) {
		this.maxValueIndex = maxValueIndex;
	}


	public int getMaxProfit() {
		return maxProfit;
	}


	public void setMaxProfit(int maxProfit) {
		this.maxProfit = maxProfit;
	}
	
}
