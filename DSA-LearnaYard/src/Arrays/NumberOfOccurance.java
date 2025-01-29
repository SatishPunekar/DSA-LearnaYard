package Arrays;

import java.util.Scanner;

public class NumberOfOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int N=sc.nextInt();
		System.out.println("enter the target");
		int target=sc.nextInt();
		int[] arr=new int[N];
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Count freq is:" + countFreq(arr, target));

	}
	static int countFreq(int[] arr, int target) {
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				count++;
			}
		}
		return count;
        // code here
    }
}
//https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1
