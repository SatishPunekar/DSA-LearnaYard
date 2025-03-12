package Arrays;

import java.util.Arrays;
import java.util.List;

public class MinMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr=Arrays.asList(1,2,3,4,5);
		miniMaxSum(arr);

	}
	public static void miniMaxSum(List<Integer> arr) {
	    // Write your code here
	    int min=Integer.MAX_VALUE;
	    int max=Integer.MIN_VALUE;
	    int sum=0;
	    for(int ele:arr){
	        if(ele>max){
	            max=ele;
	        }
	        if(ele<min){
	            min=ele;
	        }
	        sum=sum+ele;
	    }
	    System.out.println((sum-max) + " " + (sum-min));

	    }

}
