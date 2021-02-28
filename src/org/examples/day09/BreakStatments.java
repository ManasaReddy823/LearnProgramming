package org.examples.day09;

public class BreakStatments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 for(int i = 0; i < 5; i++) {
	            if(i == 3) {
	             System.out.println("bye: " + i);
	             break;
	            }
	            System.out.println(i);
	        }
	        System.out.println("Hello World");
		
	}

}
