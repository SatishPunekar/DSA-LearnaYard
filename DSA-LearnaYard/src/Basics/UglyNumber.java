package Basics;

import java.util.Scanner;

import Numbers.PrimeNuber;

//import 

public class UglyNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(isUgly(num));

	}
	public static boolean isUgly(int n) {
		if (n>0 && n<=6){
			return true;
		}
		if(n%2==0 && n%3==0 && n%5==0) {
			return true;
		}
		return false;
	}

}
