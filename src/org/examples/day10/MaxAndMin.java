package org.examples.day10;

public class MaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={25, 14, 23, 15, 36, 56, 77, 18, 29, 49};
		
		int min=arr[0];
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i] < min) {
				min=arr[i];
			}
			if(arr[i] > max) {
				max=arr[i];
			}
			
		}
		System.out.println("minimum number is"+  min);
		System.out.println("maximum number is"+  max);

	}

}
