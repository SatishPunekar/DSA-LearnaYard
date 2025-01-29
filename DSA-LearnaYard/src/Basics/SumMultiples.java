package Basics;

public class SumMultiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int sumOfMultiples(int n) {
        int sum=0;
        for(int i=3;i<=n;i++){
            if(i%3==0||i%5==0 ||i%7==0){
                sum=sum+i;
            }
        }
        return sum;
        
    }

}
//https://leetcode.com/problems/sum-multiples/description/