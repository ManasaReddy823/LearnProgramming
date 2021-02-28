package org.examples.day14;

public class MainTest {

    int x;

    public static void main(String[] args) {
    	MainTest myObj1 = new MainTest();  // Object 1
    	MainTest myObj2 = new MainTest();  // Object 2
       myObj1.x = 25;
       myObj2 = myObj1;
       System.out.println(myObj1.x);
       System.out.println(myObj2.x);
     }    
  }

