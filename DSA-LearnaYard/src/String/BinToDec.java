package String;

public class BinToDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(binToDec(1010));

	}
	public static int binToDec(int num) {
		int sum=0;
		int i=0;
		while(num>0) {
			sum=sum+(int) ((num%2) * Math.pow(2, i));
			num=num/10;
			i++;
		}
		return sum;
	}

}
