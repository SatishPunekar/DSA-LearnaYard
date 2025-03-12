package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayLeaders {
	public static void main(String[] args) {
		System.out.println("array elements:");
		int arr[]= {1,2,3,4,2,3,1,2,5,3,4};
//		System.out.println(arrayLeaders(arr));
		System.out.println(arrayLeaders_usingRecursion(arr));
		
	}
	public static List<Integer> arrayLeaders(int[] arr) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			boolean flag=true;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				list.add(arr[i]);
			}
		}
		return list;
	}
	public static List<Integer> arrayLeaders_usingRecursion(int[] arr) {
		ArrayList<Integer> list=new ArrayList<Integer>();
        int largest=arr[arr.length-1];
        list.add(largest);
        int N=arr.length-2;
        ArrLeaders(arr, N, largest, list);
        return list;
	}
	public static void ArrLeaders(int[] arr, int n, int largest, List<Integer> list) {
		if(n<0) {
			return;
		}
		ArrLeaders(arr, --n, largest, list);
		if(largest<arr[n]) {
			list.add(arr[n]);
            largest=arr[n];
		}
		
	}
	
	
}
//https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1