package org.examples.day08;
import java.lang.*;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=1;
		int b=5;
		int c=1;
		
		double discriminate=  b*b-4*a*c;
		
		double root1 = (-b + Math.sqrt(discriminate))/2*a;
		double root2 = (-b - Math.sqrt(discriminate))/2*a;
		
		System.out.println(root1);
		System.out.println(root2);
		
		
	}

}
