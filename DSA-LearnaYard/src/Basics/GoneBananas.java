package Basics;

import java.util.Scanner;

public class GoneBananas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no of banana's");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=2;
		for(int i=2;i<=(num/2)+1;i++) {
			if(count>2) {
				break;
			}
			if(num%i==0) {
				count++;
			}
		}
		if(count>2) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
	

}
