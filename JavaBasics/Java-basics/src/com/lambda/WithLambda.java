package com.lambda;

interface printName1 {
	public void print();
}

public class WithLambda {
	public static void main(String[] args) {
		String name = "Likhithaa Ryali";
		
		printName1 Myname = () -> System.out.println("Printing my name: " + name);
		
		Myname.print();
	}
}
