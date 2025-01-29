package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		System.out.println("Enter the array");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int num=a*b;
		
		int[][] arr=new int[a][b];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println(printMissing(num, arr, list));

	}
	
	public static ArrayList<Integer> printMissing(int num,int[][] arr,  ArrayList<Integer> list) {
		for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = i; k < arr.length; k++) {
                    for (int m = (k == i ? j + 1 : 0); m < arr[k].length; m++) {
                        if (arr[i][j] == arr[k][m] && !list.contains(arr[i][j])) {
                            list.add(arr[i][j]);
                        }
                    }
                }
            }
        }
		System.out.println("now find the missing");
		//////////////
		for(int k=1;k<=num;k++) {
			boolean flag=false;
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					if(arr[i][j]==k) {
						flag=true;
					}
				}
			}
			if(flag==false) {
				list.add(k);
			}
		}
		
		return list;
		
	}

}
