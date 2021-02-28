package org.examples.day14;

public class TriangleOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int side1=3;
	    int side2=4;
	    int side3=5;
	    
	    double area = Triangle.getArea(side1, side2, side3);
	    int perimeter = Triangle.getPerimeter(side1, side2, side3);
	    
	    System.out.println("Area "+ area );
	    System.out.println("Perimeter "+ perimeter );
	}

}
