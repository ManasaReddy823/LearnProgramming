package org.examples.day09;
import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int number;
		
		do {
			System.out.println("enter a number ");
			number = input.nextInt();
			if(number>0) {
			System.out.println("number is positive");
			}
			
		}while(number > 0);
		
		System.out.println("number ended");

	}

}
