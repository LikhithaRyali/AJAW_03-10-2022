package com.lambda.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class AcceptDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> square = a -> System.out.println(a*a);
		
		square.accept(12);
		
		Consumer<List<Integer>>	displayList = list -> list.stream().forEach(a -> System.out.println(a * 10));
		
		List<Integer> list = new ArrayList<>();
		list.add(25);
		list.add(50);
		list.add(3);
		
		displayList.accept(list);
	}

}
