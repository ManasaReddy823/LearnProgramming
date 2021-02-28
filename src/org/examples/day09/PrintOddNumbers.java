//"PrintOddNumbers : write a program to print odd numbers between 0 to 10."

package org.examples.day09;

public class PrintOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 11; i++) {
            if(i%2 !=0) {
             System.out.println("number is odd "+ i);
             continue;
            }

        }


	}

}
