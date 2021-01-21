package org.examples.day09;

import java.util.Scanner;

public class TablesUsingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Enter a integer");
    	
    	int number = input.nextInt();
    	
    	int i=1;
    	while(i<=10) {
    		
    		System.out.println(number+"*"+i+"="+(number*i));
    		i++;

	}

}
	
}
