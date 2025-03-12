package Arrays;

import java.util.Arrays;

public class CountElementsWithMaxFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,2,3,1,4};
//		System.out.println(Arrays.toString(newArray(arr)));
//		System.out.println(largest(newArray(arr)));
		System.out.println(count(newArray(arr), largest(newArray(arr))));
//		System.out.println(maxFrequencyElements(arr));

	}
	public static int maxFrequencyElements(int[] nums) {
		int[] num=newArray(nums);
		return count(num,largest(newArray(nums)));
		
    }
	public static int[] newArray(int[] nums) {
		int[] arr=new int[101];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]] = ++arr[nums[i]];
        }
		return arr;
	}
	public static int largest(int arr[]) {
		int largest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
		return largest;
	}
	public static int count(int arr[], int largest) {
		int count=0;
        for(int i=0;i<arr.length;i++){
            if(largest==arr[i]){
                count=count+arr[i];
            }
        }
        return count;
	}

}
//https://leetcode.com/problems/count-elements-with-maximum-frequency/