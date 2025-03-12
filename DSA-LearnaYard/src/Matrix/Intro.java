package Matrix;

public class Intro {
	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6}};
		for(int i=0;i<arr.length;i++) {
			for(int j: arr[i]) {
				System.out.print(j);//dont need to write like arr[i][j]
			}
			System.out.println();
		}
		
		////////////////////////////// OR ///////////
		for(int i=0;i<arr.length;i++) {
			for(int j: arr[i]) {
				System.out.print(j);			}
			System.out.println();
		}
		
	}

}
