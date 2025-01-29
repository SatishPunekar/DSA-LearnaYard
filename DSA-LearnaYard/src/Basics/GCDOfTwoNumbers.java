package Basics;

import java.util.Scanner;

public class GCDOfTwoNumbers {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(gcd(a, b));

	}
	public static int gcd(int a, int b) {
		int rem=1;
		while(rem>0) {
			if(b>a) {
				rem=b%a;
				if(rem==0) {
					return a;
				}
				else {
					b=a;
					a=rem;
				}
			}
			else {
				rem=a%b;
				if(rem==0) {
					return b;
				}
				else {
					a=b;
					b=rem;
				}
			}
		}
		return 1;
    }

}
