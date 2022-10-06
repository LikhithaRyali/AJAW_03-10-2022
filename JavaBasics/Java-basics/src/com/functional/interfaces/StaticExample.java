package com.functional.interfaces;

interface sayHello{
	static void say() {
		System.out.println("This is a method using static keyword");
	}
	
	void cheers(int c);
}

public class StaticExample implements sayHello{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticExample se = new StaticExample();
		sayHello.say();
		
		se.cheers(56);

	}

	@Override
	public void cheers(int c) {
		// TODO Auto-generated method stub
		System.out.println("Cheers for today is: " + c);
	}

}
