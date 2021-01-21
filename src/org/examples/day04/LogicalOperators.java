package org.examples.day04;
public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1, j = 0;
        boolean a,b,c;
        a = b = c = true;
        System.out.println(i != 0 && j != 0); // False
        System.out.println(i != 0 || j != 0); //True
        
        System.out.println(a && b && c); //true
        System.out.println(!a && b && c); //false
        System.out.println(!a || (b && c)); //true
        System.out.println(a || (!b && c)); //true

	}

}
