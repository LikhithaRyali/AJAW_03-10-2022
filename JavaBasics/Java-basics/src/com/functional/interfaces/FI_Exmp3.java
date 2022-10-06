package com.functional.interfaces;

interface calculator {
	default void add(int n1,int n2) {
		System.out.println("Adding of two numbers: " + (n1 + n2));
	}
	
	default void sub(int n1,int n2) {
		System.out.println("Subtraction of two numbers: " + (n1 - n2));
	}
	
	void mul(int n1,int n2);
	
	default void div(int n1,int n2) {
		System.out.println("Dividing of two numbers: " + (n1/n2));
	}
}

public class FI_Exmp3 implements calculator {
	
	public void mul(int n1,int n2) {
		System.out.println("Multiplication of two numbers: " + (n1 * n2));
	}
	public static void main(String[] args) {
		FI_Exmp3 fie3 = new FI_Exmp3();
		
		
		fie3.add(24, 25);
		fie3.sub(20, 10);
		fie3.mul(15, 68);
		fie3.div(80, 14);
		
	}
}
