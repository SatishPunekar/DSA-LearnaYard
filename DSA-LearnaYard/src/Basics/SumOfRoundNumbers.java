package Basics;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfRoundNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		SumOfRoundNumber(num);

	}
	public static void SumOfRoundNumber(int n) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		int rem,count=0;
		while(n>0) {
			if(n%10==0) {
				count++;
				n=n/10;
			}
			else {
				rem=n%10;
				count++;
				list.add((int) (rem*Math.pow(10, count-1)));
				n=n/10;
			}
		}
		System.out.println(list.size());
		System.out.println(list);
	}

}
//https://codeforces.com/contest/1352/problem/A