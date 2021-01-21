package org.exercises.day04;

/*MixedCalculationWithAO: Write a program to add 10 to the number 456 and then divide it by 3. 
			Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result
			(Note: solve this by using assignment operators).*/

public class MixedCalculationWithAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number= 456;
		
		number += 10;
		number /= 3;
		number %= 5;
		number *= 5;
		
		System.out.println("number is " + number );
		
		
		}
		
		
}