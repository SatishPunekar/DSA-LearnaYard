package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintInTheReverseOrderofOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		printReverse(arr);
		reverseTheActualArray(arr);
		reverseTheActualArrayUsingWhile(arr);

	}
	public static void printReverse(int arr[]) {
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
	//reverseTheActualArray using for loop
	public static void reverseTheActualArray(int arr[]) {
		int temp=0;
		int L=arr.length/2;
		if(arr.length%2==0) {
			for(int i=0;i<L;i++) {
				temp=0;
				temp=arr[i];
				arr[i]=arr[arr.length-1-i];
				arr[arr.length-1-i]=temp;
			}
		}
		else {
			for(int i=0;i<L+1;i++) {
				temp=0;
				temp=arr[i];
				arr[i]=arr[arr.length-1-i];
				arr[arr.length-1-i]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	//using while loop
	public static void reverseTheActualArrayUsingWhile(int arr[]) {
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			//update the i and j
			i++;
			j--;
		}
		System.out.println(Arrays.toString(arr));
	}

}
