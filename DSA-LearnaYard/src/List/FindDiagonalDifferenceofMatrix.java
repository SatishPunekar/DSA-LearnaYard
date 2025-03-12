package List;

import java.util.ArrayList;
import java.util.List;

public class FindDiagonalDifferenceofMatrix {
//	private static ListofLists list;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListofLists.returnList();
		System.out.println(diagonalDifference(ListofLists.lists));

	}
	public static int diagonalDifference(List<List<Integer>> lists) {
		int i=0;
	    int sum1=0;
	    int sum2=0;
	    int n=lists.size();
	    List<List<Integer>> listofList = new ArrayList<>();
	    for(List<Integer> list:lists){
	        sum1=sum1+list.get(i);
	        sum2=sum2+list.get(n-1-i);
	        i++;
	    }
	    return Math.abs(sum1 - sum2);
	}

}
