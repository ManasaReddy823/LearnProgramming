package org.examples.day10;

public class Arrays_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] marks = {35,65,95}; 
		System.out.print(marks.length + "," + marks[1]);
		
		int[] balls = {};
		System.out.print(balls.length);
		
		String[] colors = {"RED","YELLOW","WHITE"};
		System.out.print(colors[2]);
		
		String[] computer = {"RAM","HDD","MOUSE"};
		String[] parts = {computer[0],computer[2]};
		System.out.print(parts[1]);
	   
		int ages[] = {25, 27, 30};
		System.out.println(ages[1]);
		
		String[] ary = {"KITE", "AIR"};
		String str = "PLANE";
		ary[1] = str;
		str = "FLY";
		System.out.println(ary[1]);
		
		

	}

}
