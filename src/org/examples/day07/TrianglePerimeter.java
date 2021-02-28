package org.examples.day07;
import java.util.Scanner;
public class TrianglePerimeter {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner input =  new Scanner(System.in);
		
		int l1 = input.nextInt();
		int l2 = input.nextInt(); 
		int l3 = input.nextInt();
		
		System.out.println("perimeter of triangle " + (l1+l2+l3));
	}

}
