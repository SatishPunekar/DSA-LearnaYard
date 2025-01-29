package Basics;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumbersAtoN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the starting point");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("enter the number of prime numbers to be:");
		int n=sc.nextInt();
		sc.close();
		System.out.println(Arrays.toString(printPrimes(a, n)));

	}
	public static boolean isPrime(int n) {
		if(n==0 || n==1) {
			return false;
		}
		int count = 0;
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==0) {
			return true;
		}
		return false;
	}
	public static int[] printPrimes(int a, int n) {
		int[] arr=new int[n];
		int cnt=0;
		for(;cnt<n;a++) {
		if(isPrime(a)) {
			arr[cnt]=a;
			cnt++;
			
		}
		}
		return arr;
	}

}
//you are given two nums a and n a= starting point n is length
