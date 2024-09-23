package Array;

public class Three_new {
public static void main(String[] args) {
	int  [][][] arr= {
			{{1,2},{3},{4,5,6}},
	        {{7},{8,9,10}},
	        {{11},{12,13}},
	};
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			for(int k=0;k<arr[i][j].length;k++) {
				System.out.print(arr[i][j][k]+" ");
			}
		}
		//
		
		
		//3 question
		System.out.println(arr[0][2][1]);//5
		System.out.println(arr[1][1][2]);//10
		System.out.println(arr[2][1][1]);//13
}
}}  
