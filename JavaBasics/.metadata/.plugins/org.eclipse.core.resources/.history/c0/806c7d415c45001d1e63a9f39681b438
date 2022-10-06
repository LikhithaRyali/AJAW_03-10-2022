package com.functional.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class User {
	String name;
	String role;
	User(String n, String r) {
		name = n;
		role = r;
	}
	public String getName() {
		return name;
	}
	
	public String getRole() {
		return role;
	}
	@Override
	public String toString() {
		return "FilterDevPredicate [name=" + name + ", role=" + role + "]";
	}
	
	public static void main(String[] args) {
		List<User> users = new ArrayList<User>();
		users.add(new User("Likhithaa", "snr-Dev"));
		users.add(new User("Surya", "jnr-Dev"));
		users.add(new User("Mounika", "snr-Dev"));
		users.add(new User("Ishwarya", "snr-Dev"));
		users.add(new User("Mounisha", "jnr-Dev"));
		users.add(new User("Vineetha", "snr-Dev"));
		
		List snrdev = process(users, (User u) -> u.getRole().equals("snr-Dev"));
		System.out.println(snrdev);
	}
	private static List process(List<User> users, Predicate<User> predicate) {
		// TODO Auto-generated method stub
		List<User> result = new ArrayList<>();
		
		for(User user: users) 
			if(predicate.test(user))
				result.add(user);
		return result;
	}
}
