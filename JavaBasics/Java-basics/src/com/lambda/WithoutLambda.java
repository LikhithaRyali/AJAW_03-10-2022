package com.lambda;

interface printName {
	public void print();
}

public class WithoutLambda {
	public static void main(String[] args) {
		String name = "Likhithaa";
		
		printName Myname = new printName() {

			@Override
			public void print() {
				System.out.println("Printing " + name);
			}
			
		};
		Myname.print();
	}
}
