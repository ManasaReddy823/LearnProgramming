package org.examples.day10;

import java.util.Scanner;

public class FindInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i=0;i<arr.length;i++) {

		System.out.println("Enter a number :");
			arr[i] = input.nextInt(); 

		
		}
		
		System.out.println("Enter a number to search :");
		int number= input.nextInt();
		boolean found = false;
		for(int j=0; j<arr.length;j++) {
			if(number==arr[j]) {
				System.out.println("number found");
				found= true;
				break;
			}
		}
		
		if(!found) {
			System.out.println("number not found");
			
		}
		

	}

}
