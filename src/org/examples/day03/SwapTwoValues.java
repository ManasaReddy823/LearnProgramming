package org.examples.day03;
public class SwapTwoValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=3;
		int y=8;
		System.out.println("x is "+ x);
		System.out.println("y is "+ y);
		int z=x;
		x=y;
		y=z;
		System.out.println("x is "+ x);
		System.out.println("y is "+ y);
		
		int a=3;
		int b=8;
		System.out.println("a is "+ a);
		System.out.println("b is "+ b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a is "+ a);
		System.out.println("b is "+ b);
		
		

	}

}
