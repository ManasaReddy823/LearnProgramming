package org.examples.day13;

import java.util.Scanner;

public class SimpleCalci {
	
	static int Additon(int a, int b) {
		return a+b;
	}
	static int Substraction(int a, int b) {
		return a+b;
	}
	static int Multiplication(int a, int b) {
		return a+b;
	}
	static int Division(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int input1=input.nextInt();
		int a = input.nextInt();
		int b =  input.nextInt();
		int result;
		
		switch (input1){
			case 1:
				result=Additon(a, b);
				break;
			case 2:
				result=Substraction(a, b);
				break;
			case 3:
				result=Multiplication(a, b);
				break;
			case 4:
				result=Division(a, b);
				break;
				
			default: 
	            System.out.println("not a valid input"); 
	            result=0;
				
		}
	        System.out.println(result);
		

}
}
