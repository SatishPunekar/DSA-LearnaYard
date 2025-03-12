package String;

public class DecToBin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(decToBin(10));

	}
	public static String decToBin(int num) {
		String st="";
		while(num>0) {
			st=(num%2)+st;
			num=num/2;
		}
		return st;
	}

}
