package Basics;

import java.util.Scanner;

public class WaterCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
    		int x = sc.nextInt();
    		// write your code here
    		if(x>=2000) {
    			System.out.println("YES");
    		}
    		else {
    			System.out.println("NO");
    		}
		}

	}
	

}
