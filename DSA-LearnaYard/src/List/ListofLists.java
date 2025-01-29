package List;

import java.util.ArrayList;
import java.util.List;

public class ListofLists {
	public static List<List<Integer>> lists;
	public static void main(String[] args) {
//		Initialize list of lists
		lists=new ArrayList<>();
//		initialise row 1
		List<Integer> row1=new ArrayList<Integer>();
//		row2
		List<Integer> row2=new ArrayList<Integer>();
//		row3
		List<Integer> row3=new ArrayList<Integer>();
		row1.add(1);
		row1.add(2);
		row1.add(3);
		row1.add(10);
		
		row2.add(4);
		row2.add(5);
		row2.add(6);
		
		row3.add(7);
		row3.add(8);
		row3.add(9);
		
		
		lists.add(row1);
		lists.add(row2);
		lists.add(row3);
		System.out.println(lists);//print all the elements  - [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
		
		System.out.println(lists.get(0).get(0)); //1st row 1st element
		System.out.println(lists.get(0).get(1)); // 1st 2nd element
		System.out.println(lists.get(1).get(2));  //2nd row 3rd element
		
		System.out.println(lists.size());//get only number of lists not number of elements
		System.out.println(lists.get(0).size());// get size of 1st row 
	}

}
