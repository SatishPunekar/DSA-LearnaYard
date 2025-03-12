package Matrix;

public class SumOfIthRowIthColumn {
	public static void main(String[] args) {
		int[][] arr= {{3,5,},{5,4,1},{9,1,0,3},{23},{3}};
		int N=arr.length;
		System.out.println(N);
		int M=arr[0].length;
//		System.out.println(sumOfIthRowIthColumn(N, M, arr));
		
	}
	public static int sumOfIthRowIthColumn(int N, int M,int[][] arr) {
		if(N==1) {
			return 1;
		}
		if(M==1) {
			int sum1=arr[0][0];
			int sum2=0;
			for(int i=0;i<arr.length-1;i++) {
				sum2=sum2+arr[i][0];
			}
			if(sum1!=sum2)
				return 0;
		}
		return 1;
	}
	

}
