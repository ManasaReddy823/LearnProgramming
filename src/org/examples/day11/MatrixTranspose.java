package org.examples.day11;

import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int a[][] = new int[3][3];

		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j]= input.nextInt();
				
			}
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[j][i]+" ");
				
				
			}
			System.out.println();
		}

	}

}

		 
		 
