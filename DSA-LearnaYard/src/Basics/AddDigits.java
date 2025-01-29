package Basics;

import java.util.Scanner;

public class AddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
//		System.out.println(addDigits(num));
		System.out.println(addDigitsOptimum(num));

	}
	public static int addDigits(int num) {
		while(num>9) {
			num=SumOfDigits.sumOfDigits(num);
		}
		return num;
	}
	//OPTIMUM SOLUTION.
	public static int addDigitsOptimum(int num) {
		if(num ==0 ||num==9) {
			return num;
		}
		num=num%9;
		if(num==0)
			return 9;
		return num;
	}

}
//Given an integer num, repeatedly add all its digits until the result 
//has only one digit, and return it.