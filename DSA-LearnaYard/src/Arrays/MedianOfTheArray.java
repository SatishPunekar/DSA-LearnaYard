package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MedianOfTheArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		medianOfArray(arr);
	}
	//sort the array
	//if length is odd - midddle number is median
	//if length is even - avg of middle numbers is 
	public static void medianOfArray(int arr[]) {
		Arrays.sort(arr);
		if(arr.length%2==0) {
			float median=((arr[arr.length/2])+(arr[arr.length/2]-1))/2;
			System.out.println(median);
		}
		else {
			System.out.println(arr[arr.length/2]);
		}
	}

}
