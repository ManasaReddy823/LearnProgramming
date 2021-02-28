package org.examples.day07;
import java.util.Scanner;
public class DigitsSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
        System.out.print("Enter your number: ");
        // reads the entire line
        int n = input.nextInt();
		int first, second, third, sum;
        /*finding the digits of the entered number n*/

        first = n/100;     //first digit
        n = n%100;
	    
        second = n/10;     //second digit
        
        third = n%10;      //third digit
	    
        /*reverse number */
        sum = first + second + third;
        System.out.println("Sum of digits in a 3 digit number : "+sum);

	}

}
