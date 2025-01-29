package Basics;

import java.util.Scanner;

public class CheckIfArrayIsSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the array elements");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int a=-1;
		int b=-2;
		if(a>b) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}

	}

}
