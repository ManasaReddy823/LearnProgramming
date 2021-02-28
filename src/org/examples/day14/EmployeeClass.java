package org.examples.day14;

public class EmployeeClass {
	
	String name;
	int id;
	
	void assignFields(String name, int id) {
		this.name=name;
		this.id=id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeClass e1= new EmployeeClass();
		e1.name= "Manasa";
		e1.id=1;
		
		EmployeeClass e2= new EmployeeClass();
		e2.assignFields("john", 2);
		
		System.out.println(e1.name+" "+ e1.id);
		System.out.println(e2.name+" "+ e2.id);
		
		
		

	}

}
