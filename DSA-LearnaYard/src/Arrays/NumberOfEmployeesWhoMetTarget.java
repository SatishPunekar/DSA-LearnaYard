package Arrays;

public class NumberOfEmployeesWhoMetTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Solution {
	    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
	        int count =0;
	        for(int i=0;i<hours.length;i++){
	            if(hours[i]>=target){
	                count++;
	            }
	        }
	        return count;
	    }
	}	

}
