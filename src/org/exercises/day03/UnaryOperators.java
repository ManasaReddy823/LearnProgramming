package org.exercises.day03;
public class UnaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int j = 20;
		int n = j++%5; //0
		
		System.out.println(n);
		
		//int ++a = 100 ; //this will not run
		// System.out.println( ++a);
		
		int i = 10;
		i++;i++;++i;
		int k = i++;
		System.out.println(k);
		
		

	}

}
