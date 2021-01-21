package org.examples.day09;

import java.util.Scanner;

public class CountOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
    	
    	System.out.println("Enter a integer");
    	
    	int number = input.nextInt(); //456
    	int count=0;
    	
    	while(number>0) {
    		
    		count=count+1;
    		
    		number=number/10;
    	}
    	
    	System.out.println(count);
    	    

	}

}
