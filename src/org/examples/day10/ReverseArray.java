//Take 5 integer inputs from user and store them in an array.
//Now, copy all the elements in an another array but in reverse order.

package org.examples.day10;
import java.util.Scanner;


public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i=0;i<arr.length;i++) {

		System.out.println("Enter a number :");
			arr[i] = input.nextInt(); 

		
		}
		
		int[] arr1 = new int[5];
		int k=0;
		for(int j=arr.length;j>0;j--) {

			arr1[k] = arr[j-1];
			System.out.println(arr[j-1]);

		
		}

	}

}
