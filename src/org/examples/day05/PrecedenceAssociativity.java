package org.examples.day05;

public class PrecedenceAssociativity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myInt = 12 - 4 * 2;    //two possibilities - (12-4)x2 and 12-(4x2)
        System.out.println(myInt);
        
        int i = 10, j = 5, k = 1, result1;
    	result1 = i-++k-++j;
    	
    	int x = 5;
        int y = 10;
        int z = ++x * y--;
        System.out.println(z); // ""
        
        System.out.println("1 + 2 = " + 1 + 2);
        System.out.println("1 + 2 = " + (1 + 2));
        
        System.out.println(1 + 2 + "abc");
        System.out.println("abc" + 1 + 2);

        int a = 10, b = 5, c = 3, result;
       
	   	result = a*b/c;
	   	System.out.println(result); //" "
	   	
	   	result = b*a/c;
	   	System.out.println(result); //" "
	   	
	   	result = b/c*a;
	   	System.out.println(result); //" "
	   	
	   	result = b/a*c;
	   	System.out.println(result); //" "
	   	
	   	result = a/c*b;
	   	System.out.println(result); //" "
        
        
	}

}
