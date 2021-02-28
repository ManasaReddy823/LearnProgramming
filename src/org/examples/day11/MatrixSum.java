package org.examples.day11;

import java.util.Scanner;

public class MatrixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];	
		int c[][] = new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j]= input.nextInt();
				
			}
		}
		
		for(int k=0;k<3;k++) {
			for(int l=0;l<3;l++) {
				b[k][l]= input.nextInt();
				
			}
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]= a[i][j]+b[i][j];
				
			}
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(c[i][j]+ " ");
				
			}
			System.out.println();
		}
		
		

	}

}
