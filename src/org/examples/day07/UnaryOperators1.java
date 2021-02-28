package org.examples.day07;
import java.util.Scanner;
public class UnaryOperators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		
		 int i = input.nextInt();
	        i--;
	        System.out.println(i);    // "4 "
	        --i;                     
	        System.out.println(i);    // " 3"
	        System.out.println(--i);  // "2 "
	        System.out.println(i--);  // " 2"
	        System.out.println(i);    // " 1"

	}

}
