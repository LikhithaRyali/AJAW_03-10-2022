package com.lambda;

import java.util.Scanner;


interface checking {
	void check(int n);
}


public class NumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int check_num = sc.nextInt();
		
		
		
		checking c = (n) -> {
			if(n%2 == 0) {
				System.out.println("EVEN");
			}
			else {
				System.out.println("ODD");
			}
			int flag = 0;
			if(n <=1) {
				System.out.println("NOT A PRIME");;
			}
			for(int i = 2 ; i <= n/2 ; i++) {
				if(n%i == 0) {
					System.out.println("NOT A PRIME");
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				System.out.println("PRIME");
			}
			int verify = n;
			int rev = 0;
			int rem = 0;
			while(n>0) {
				rem = n%10;
				rev = (rev*10) + rem;
				n = n/10;
			}
			if(rev == verify) {
				System.out.println("PALINDROME");
			}
			else {
				System.out.println("NOT A PALLINDROME");
			}
		};
		c.check(check_num);
		
	}
}

