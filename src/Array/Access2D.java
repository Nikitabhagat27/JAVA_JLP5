package Array;

public class Access2D {
	
	public static void main(String[] args) {
		int[][] arr=new int[3][4];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
		}
		int[][] arr2= {
				{4,5},{7},{8,9}
		};
		System.out.println();
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+" ");
				//System.out.println(arr2[1][0]+" ");
			}
		}
	}
	}

