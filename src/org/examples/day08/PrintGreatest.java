package org.examples.day08;
import java.util.Scanner;

public class PrintGreatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		
		int max = (a>b) ? ((a>c) ? a : c) : ((b>c) ? b:c);
		
		System.out.println(max);	

	}

}
