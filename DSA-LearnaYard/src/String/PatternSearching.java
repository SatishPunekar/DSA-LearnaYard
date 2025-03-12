package String;

import java.util.Scanner;

public class PatternSearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();;
		System.out.println("Enter the pattern:");
		String pat=sc.next();
		patternSearching(str, pat);

	}
	public static void patternSearching(String txt, String pat) {
		int pos=txt.indexOf(pat);
		while(pos>=0) {
			System.out.print(pos + " ");
			pos=txt.indexOf(pat, pos+1);
		}
	}

}
