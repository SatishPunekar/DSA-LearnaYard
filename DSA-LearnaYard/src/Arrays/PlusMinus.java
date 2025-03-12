package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlusMinus {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements:");
		ArrayList<Integer> list=new ArrayList<Integer>(5);
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		System.out.println(list);
		plusMinus(list);
		
	}
	public static void plusMinus(List<Integer> arr) {
	    // Write your code here
	    int pos=0;
	    int nag=0;
	    int zero=0;
	    for( int i:arr){
	        if(i==0){
	            zero++;
	        }
	        else if(i>0){
	            pos++;
	        }
	        else{
	            nag++;
	        }
	    }
	    int n=arr.size();
	    System.out.println("%.6f%n"+ (double)pos/n);
	    System.out.println("%.6f%n"+ (double)nag/n);
	    System.out.println("%.6f%n"+ (double)zero/n);
	    }

}
