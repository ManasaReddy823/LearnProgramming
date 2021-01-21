package org.examples.day06;

import java.util.Scanner;

public class UsingScannerNext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner input = new Scanner(System.in);
	     
         System.out.print("Enter your first & last name by space seperated: ");
         String firstName = input.next();
         System.out.println("First Name : " + firstName);
         String lastName = input.next();
         System.out.println("Last Name : " + lastName);

	}

}
