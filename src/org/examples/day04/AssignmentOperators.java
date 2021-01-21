package org.examples.day04;

public class AssignmentOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b1 = 2;
		b1 = b1 + 10;
		
		int b2 = 2;
		b2 += 10;
		
		System.out.println(b1 + " " + b2);
		
		int a = 4;
        System.out.println(" a = " + a );
        a += a;
        System.out.println(" a = " + a );
        a = 7 + a;
        System.out.println(" a = " + a );
        a *= a;
        System.out.println(" a = " + a );
        a -= 3;
        System.out.println(" a = " + a );
        a /= 2;
        System.out.println(" a = " + a );
        
        short s = 10;
        int x = s;
        s += 10;
        System.out.println(s + "," + x);


	}

}
