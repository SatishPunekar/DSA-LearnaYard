package Basics;

import java.util.Scanner;

public class AmstrongNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(armstrongNumber(num));
		

	}
	public static boolean armstrongNumber(int n) {
        // code here
		int sum=0;
		int temp=n;
		while(temp>0) {
			int rem=temp%10;
			sum=sum + (rem*rem*rem);
			temp/=10;
		}
		if(sum==n) {
			return true;
		}
		return false;
    }
}


//https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1
