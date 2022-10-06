package com.lambda;

interface printDesignation {
	public String publish(String Designation);
}

public class WithParameter {
	
	public static void main(String[] args) {
		printDesignation d1 = (Designation) -> {return "Your Designation " + Designation;};
		// OR
		//printDesignation d1 = (Designation) ->  "Your Designation " + Designation;;
		System.out.println(d1.publish("Java Developer"));
	}
	
}
