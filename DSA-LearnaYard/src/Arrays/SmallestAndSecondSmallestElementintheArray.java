package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmallestAndSecondSmallestElementintheArray {

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
//		System.out.println(smallestAndSecondSmallest(arr));
		smallestAndSecondSmallest(arr);

	}
//	public static List<Integer> smallestAndSecondSmallest(int arr[]) {
//		int element=arr[0];
//		for(int i=1;i<arr.length;i++) {
//			if(element>arr[i]) {
//				element = arr[i];
//			}
//		}
//		int element2=arr[0];
//		for(int i=1;i<arr.length;i++) {
//			if(arr[i]==element) {
//				continue;
//			}
//			else if(element2>arr[i]) {
//				element2 = arr[i];
//			}
//		}
//		ArrayList<Integer> ans=new ArrayList<Integer>();
//		ans.add(element);
//		ans.add(element2);
//		return ans;	
//	}
	//optimum solution:
	public static void smallestAndSecondSmallest(int arr[]){
		int min=0;
		int sec_min=0;
		if(arr[0]<arr[1]) {
			min=arr[0];
			sec_min=arr[1];
		}
		else {
			min=arr[1];
			sec_min=arr[0];
		}
		for(int i=2;i<arr.length;i++) {
			if(arr[i]<min && arr[i]<sec_min) {
				sec_min=min;
				min=arr[i];
			}
			else if(arr[i]>min && arr[i]<sec_min) {
				sec_min=arr[i];
			}
		}
		if(min==sec_min) {
			System.out.println(-1+" "+-1);
		}
		else {
			System.out.println(min+" "+sec_min);
		}
		
		
	}
	

}
