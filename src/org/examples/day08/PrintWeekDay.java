package org.examples.day08;

import java.util.Scanner;

public class PrintWeekDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int i = input.nextInt(); 
        switch (i) 
        { 
        case 1: 
            System.out.println("Day is monday "); 
            break; 
        case 2: 
            System.out.println("Day is Tuesday"); 
            break; 
        case 3: 
            System.out.println("Day is wednesday"); 
            break; 
            
        case 4: 
            System.out.println("Day is Thursday"); 
            break; 
        
        case 5: 
            System.out.println("Day is Friday"); 
            break; 
            
        case 6: 
            System.out.println("Day is Saturday"); 
            break; 
        case 7: 
            System.out.println("Day is Sunday"); 
            break; 
        default: 
            System.out.println("Enter numbers between 1-7 to print week days"); 
        } 
		
		

	}

}
