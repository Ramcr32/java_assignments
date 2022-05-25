package _2.Q;

public class Main {
	public static void main(String[] args) {
//		int[][] arr = new int[3][3];
//		System.out.println("a");
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//		System.out.println(arr[1].length);
		for(int i=0; i<arr.length; i++) {
			int s=0;
			for(int j=0; j<arr[i].length;j++) {
//				System.out.println(arr[i][j]);
				if(arr[j][i]%2==0) {
					s+=arr[j][i];
				}
			}
			System.out.println(s);
		}
	
	}
}
