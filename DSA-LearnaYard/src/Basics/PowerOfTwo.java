package Basics;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(isPowerOfTwo(n));

	}
	public static boolean isPowerOfTwo(int n) {
//		if(n==1) {
//			return true;
//		}
//		else if(n<=0) {
//			return false;
//		}
//        int rem=0;
//        while(rem==0 && n>1){
//            rem=n%2;
//            n=n/2;
//        }
//        if(rem==0){
//            return true;
//        }
//        return false;
		
		
		
		
        //optimum solution using binatry bit manipulation.
        //(n&(n-1))==0   -- ex n=16
//        		16= 10000
//        		15=01111
//        		n&(n-1)=00000
//        i.e
        if((n&(n-1))==0) {
        	return true;
        }
        return false;
    }
	}


