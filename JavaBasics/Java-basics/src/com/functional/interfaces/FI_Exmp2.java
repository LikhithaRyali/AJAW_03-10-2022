package com.functional.interfaces;

interface Square{
	public void square(int n);
	
	default void print() {
		System.out.println("This is the default method of Functional Interface");
	}
}

public class FI_Exmp2 implements Square {

	@Override
	public void square(int n) {
		// TODO Auto-generated method stub
		System.out.println("The sqare of the given number " + n + " is: " + (n*n));
	}
	
	public static void main(String[] args) {
		FI_Exmp2 fie2 = new FI_Exmp2();
		
		fie2.square(12);
		fie2.print();
	}
	
	
	
}
