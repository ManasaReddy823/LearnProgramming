package org.examples.day13;

public class SmallestNumber {
	
	static int smallest(int a, int b, int c) {
		int small;

if(a<b){
	
	if(a<c){
	
	small=a;
	
	}
	else{
	
	small=c;
	}
	
}

else{

	if(b<c){
	
	small=b;
	
	}
	else{
	
	small=c;
	}
}
return small;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int small=smallest(2, 3, 5);
		System.out.println(small);

	}

}
