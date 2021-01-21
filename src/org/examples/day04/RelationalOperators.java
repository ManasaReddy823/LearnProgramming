package org.examples.day04;
public class RelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
        int b = a - 5; //5
        int c = a; //10
        System.out.println("a  < b -> "+ (a < b));  //" F"
        System.out.println("a <= b -> "+ (a <= b));  //"F "
        System.out.println("a  > b -> "+ (a > b));   //" T"
        System.out.println("a >= b -> "+ (a >= b));  //"T "
        System.out.println("a == b -> "+ (a == b));  //"F "
        System.out.println("a != b -> "+ (a != b));  //" T"
        System.out.println("\n==######==\n");
        
        System.out.println("a  < c -> "+ (a < c));  //" F"
        System.out.println("a <= c -> "+ (a <= c));  //"T "
        System.out.println("a  > c -> "+ (a > c));   //"F "
        System.out.println("a >= c -> "+ (a >= c));  //"T "
        System.out.println("a == c -> "+ (a == c));  //"T "
        System.out.println("a != c -> "+ (a != c));  //"F "

	}

}
