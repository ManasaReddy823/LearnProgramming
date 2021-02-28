package org.examples.day14;
import java.util.*;

public class Triangle {
	
	static double getArea(int a, int b, int c) {
		
		double s=(a+b+c)/2;
		double area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		return area;
		
	}
	
	static int getPerimeter(int a, int b, int c) {
		
		return a+b+c;
		
	}

}
