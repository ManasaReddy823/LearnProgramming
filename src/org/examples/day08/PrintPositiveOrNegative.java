package org.examples.day08;

import java.util.Scanner;



public class PrintPositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number :");
		
		int number = input.nextInt();
		
		if(number>0) {
			System.out.println("number is positive");
		}
		else {
			System.out.println("number is negative");
		}
	}

}
