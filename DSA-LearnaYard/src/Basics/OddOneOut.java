package Basics;

import java.util.Scanner;

public class OddOneOut {
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a==b) {
			System.out.println(c);
		}
		else if(a==c) {
			System.out.println(b);
		}
		else {
			System.out.println(a);
		}
		
	}

}
//https://codeforces.com/contest/1915/problem/A
