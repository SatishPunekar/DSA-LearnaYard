package Matrix;

import java.util.ArrayList;

public class SpecialPositionsInBinaryMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int numSpecial(int[][] mat) {
        ArrayList<Boolean> list1=new ArrayList<Boolean>();
        ArrayList<Boolean> list2=new ArrayList<Boolean>();
        for(int i=0;i<mat.length;i++) {
        	int count=0;
        	int count2=0;
        	boolean result1=true;
        	boolean result2=true;
        	for(int j=0;j<mat[i].length;j++) {
        		if(count<=1) {
        			if(mat[i][j]==1) {
            			count++;
            		}
        		}
        		if(count2<=1) {
        			if(mat[j][i]==1) {
        				count2++;
        			}
        		}
        	}
        	if(count>1) {
        		result1=false;
        		list1.add(result1);
        	}
        	if(count2>1) {
        		result2=false;
        		list2.add(result2);
        	}
        }
        int finalResult= 0;
        
		return 0;
    }

}
//https://leetcode.com/problems/special-positions-in-a-binary-matrix/description/