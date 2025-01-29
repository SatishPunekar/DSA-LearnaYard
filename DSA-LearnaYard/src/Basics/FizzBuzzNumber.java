package Basics;

import java.util.Scanner;

public class FizzBuzzNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		fizzBuzz(number);
		
	}
	public static void fizzBuzz(int range) {
		while(range>0) {
			if(range%3==0 && range%5==0) {
				System.out.println("FizzBuzz");
				range--;
			}
			else if(range%3==0){
				System.out.println("Fizz");
				range--;
			}
			else if(range%5==0) {
				System.out.println("Buzz");
				range--;
			}
			else {
				System.out.println(range);
				range--;
			}
		}
	}

}
//https://www.hackerrank.com/challenges/fizzbuzz/problem