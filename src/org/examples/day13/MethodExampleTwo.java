package org.examples.day13;

public class MethodExampleTwo {
	
	static void myMethod() {
	    System.out.println("I just got executed!");
	  }
	
    static int cube(int theNum)
    {
        return theNum * theNum * theNum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myMethod();
	    myMethod();
	    myMethod();
	    
	    int a = 5;
        System.out.println(cube(a));
    }


	}


