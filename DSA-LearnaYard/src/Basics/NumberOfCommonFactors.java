package Basics;

import java.util.Scanner;

public class NumberOfCommonFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println(commonFactors(num, num2));

	}
	public static int commonFactors(int a, int b) {
		int count=1;
		if(a>b) {
			for(int i=2;i<=b;i++) {
				if(a%i==0 && b%i==0) {
					count++;
				}
			}
		}
		else {
			for(int i=2;i<=a;i++) {
				if(a%i==0 && b%i==0) {
					count++;
				}
			}
		}
		return count;

	}

}
