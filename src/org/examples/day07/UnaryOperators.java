package org.examples.day07;
import java.util.Scanner;

public class UnaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number :");
		
		int i = input.nextInt();
        i++;
        System.out.println(i);    // "6"
        ++i;                     
        System.out.println(i);    // "7"
        System.out.println(++i);  // "8 "
        System.out.println(i++);  // " 8"
        System.out.println(i);    // "9 "
        
        input.close();

	}

}
