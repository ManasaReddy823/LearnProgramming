package org.examples.day03;
import java.util.Scanner;
public class ArithmeticOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
	     
        System.out.println("Enter an byte value: ");
        // reads an int value
        byte a = input.nextByte();
        byte b = input.nextByte();

		
		System.out.println("a+b= "+ (a+b));
		System.out.println("a-b= "+ (a-b));
		System.out.println("a*b= "+ (a*b));
		System.out.println("a/b= "+ (a/b));
		System.out.println("a%b= "+ (a%b));
	}

}
