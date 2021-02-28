//"Write a program to initialize 10 integer values from 1 to 10 and print sum of all integers."

package org.examples.day10;

public class SumOfTenIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[10];
		
		for(int i=0;i<10;i++) {
			arr[i]= i+1;
			
		}
		
		int sum=0;
		for(int j=0;j<arr.length;j++) {
			sum=sum+arr[j];
			
		}
		
		System.out.println(sum);
		

	}

}
