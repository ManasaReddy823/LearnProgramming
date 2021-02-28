package org.examples.day11;

public class ArraysTwoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = {{1,2},{3,4}};
        int i, j;
        for (i = 0; i < 2; i++)
            for (j = 0; j < 2; j++)
                System.out.println(a[i][j]);
        
        int[][] matrix = { {1,1,2,2},{1,2,2,4},{1,2,3,4},{1,4,1,2} };
        int sum = 0;
        int col = matrix[0].length - 2;
        for (int row = 0; row < 4; row++)
        {
           sum = sum + matrix[row][col];
        }            
        System.out.println(sum);
        
        
	}

}
