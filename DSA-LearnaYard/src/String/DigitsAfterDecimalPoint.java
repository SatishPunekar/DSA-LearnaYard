package String;

import java.util.Scanner;

public class DigitsAfterDecimalPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		String str=sc.next();
		sc.close();
		digitsAfterDecimal("123.4531");
		

	}
	public static void digitsAfterDecimal(String str) {
		String[] pat=str.split("\\.");
		System.out.println(pat[1]);
	}

}
