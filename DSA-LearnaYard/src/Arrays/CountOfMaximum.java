package Arrays;

import java.util.Arrays;

public class CountOfMaximum {

	public static int[] arr=new int[1000];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {1,1,2,2,1,2};
		largest(maxCount(A));
	}
	public static int[] maxCount(int[] A) {
		for(int i=0;i<A.length;i++) {
			arr[A[i]]=arr[A[i]]+1;
		}
		return arr;
	}
	public static void largest(int[] arr) {
		int count=0;
		int value = 0;
		int largest =arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==0) {
				continue;
			}
			if(arr[i]>largest) {
				value = i;
				count=arr[i];
				largest = arr[i];
			}
		}
		System.out.print(value+" "+count);
	}
}
//  https://www.codechef.com/problems/MAXCOUNT
