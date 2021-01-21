package org.exercises.day05;

public class BitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 25;	/* 25 =  */
        int b = 7;	    /* 7  =  */
        int c = 0;

        c = a & b;        /*  */
        System.out.println("a & b = " + c );

        c = a | b;        /*  */
        System.out.println("a | b = " + c );

        c = a ^ b;        /*  */
        System.out.println("a ^ b = " + c );

        c = ~a;           /* */
        System.out.println("~a = " + c );

        c = a << 2;       /*  */
        System.out.println("a << 2 = " + c );

        c = a >> 2;       /*  */
        System.out.println("a >> 2  = " + c );

        c = a >>> 2;      /*  */
        System.out.println("a >>> 2 = " + c );


	}

}
