package org.examples.day13;

public class MethodExampleThree {
	
    public static int sum(int a, int b)
    {
        System.out.println("a = " + a + " b = " + b);
        return a + b;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 34;
        int b = 56;
        int c = sum(a, b);
        System.out.println("c = " + c);
        System.out.println("sum = " + sum(a,b));

	}

}
