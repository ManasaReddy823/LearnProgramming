package org.examples.day14;

public class ClassWithObjectInitilizationReference {
	int x=5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassWithObjectInitilizationReference myObj1 = new ClassWithObjectInitilizationReference();  // Object 1
		ClassWithObjectInitilizationReference myObj2 = new ClassWithObjectInitilizationReference();  // Object 2
        System.out.println(myObj1.x);
        myObj1.x = 25;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);

	}

}
