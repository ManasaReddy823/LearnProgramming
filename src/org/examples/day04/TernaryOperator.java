package org.examples.day04;

//MaxOfTwoNumbers: write a program to find the maximum of two integers(n1 = 25, n2 = 13) 
//using ternary operator.

public class TernaryOperator {
	public static void main(String[] args) {
		int n1=25;
		int n2=13;
		
		int n3= n1>n2 ? n1 : n2;
		System.out.println(n3);
		
		//MaxOfThreeNumbers: write a program to find the maximum of 
		//three integers(n1 = 5, n2 = 7, n3 = 3) 
		//using ternary operator.
		
		int a=5;
		int b=7;
		int c=3;
		
		int max = (a>b) ? ((a>c) ? a : c) : ((b>c) ? b:c);
		
		System.out.println(max);	

		
	}
	

}
