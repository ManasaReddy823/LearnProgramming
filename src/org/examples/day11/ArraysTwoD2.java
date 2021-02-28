package org.examples.day11;

import java.util.Arrays;

public class ArraysTwoD2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int [][] mat = new int [4][3];
     for (int row = 0; row < mat.length; row++) {
        for (int col = 0; col < mat[0].length; col++) {
           if (row < col)
              mat[row][col] = 1;
           else if (row == col)
              mat[row][col] = 2;
           else
              mat[row][col] = 3; 
            
        } 
     }
     System.out.println(Arrays.toString(mat[0]));
     System.out.println(Arrays.toString(mat[1]));
     System.out.println(Arrays.toString(mat[2]));
     System.out.println(Arrays.toString(mat[3]));
     
     int[][] m = { {1,1,1,1},{1,2,3,4},{2,2,2,2},{2,4,6,8} };            
     int sum = 0;
     for (int k = 0; k < m.length; k++) {
         sum = sum + m[m.length-1-k][1];
     }
     System.out.println(sum);

}
}
