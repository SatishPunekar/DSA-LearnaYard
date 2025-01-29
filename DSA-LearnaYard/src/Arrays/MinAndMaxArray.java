package Arrays;

import java.util.Scanner;

import Mains.Pair;

public class MinAndMaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size");
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(MinMax(arr).getKey()+" "+MinMax(arr).getValue());

	}
	public static Pair<Integer,Integer> MinMax(int arr[]) {
		int min=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            else if(arr[i]>max){
                max=arr[i];
            }
        }
        return new Pair<>(min,max);
	}
}
