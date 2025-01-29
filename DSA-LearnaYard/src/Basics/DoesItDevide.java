package Basics;

import java.util.Scanner;

public class DoesItDevide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int N=sc.nextInt();
            int S=0;
            int P=1;
            for(int i=1;i<=N;i++){
                S=S+i;
                P=P*i;
            }
            System.out.println(S);
            System.out.println(P);
            if(P%S==0){
            	System.out.println(P%S);
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

	}
}
//https://www.hackerearth.com/practice/math/number-theory/primality-tests/practice-problems/algorithm/does-it-divide-3c60b8fb/
