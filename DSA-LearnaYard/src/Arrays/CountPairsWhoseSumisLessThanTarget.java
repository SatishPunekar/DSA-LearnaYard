package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountPairsWhoseSumisLessThanTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-1,1,2,3,1};
		int target=2;
		
		System.out.println(countPairs(arr,target));

	}
	 public static int countPairs(int[] nums, int target) {
	        int count = 0;
	        int n=nums.length;
	        for(int i=0;i<n;i++){
	            for(int j=i+1;j<n;j++){
	                if(nums[i]+nums[j]<target){
	                    count++;
	                }
	            }
	        }
	        return count;
	    }

}
