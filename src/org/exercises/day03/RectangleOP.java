package org.exercises.day03;

import java.util.Scanner; 
public class RectangleOP {
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		
		int length =4;
		int breadth = 9;
		
		int area=length* breadth;
		int perimeter = 2*(length+breadth);
		
		System.out.println("Area of rectangle is " + area );
		System.out.println("perimeter of rectangle is " + perimeter );
		
		
		
		
	}
}
