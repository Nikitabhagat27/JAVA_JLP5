package Array;



public class TwoDimention_new {
public static void main(String[]args) {
	//int[] arr=new int[];//c.E compilation error
	int[]arr= {};
	System.out.println(arr);//[I
	 System.out.println(arr.length);//0
	 
	
	System.out.println();
	int[][] arr2= {
			{10,20,30},
			{40,50},
			{1,2,3},
			{6}
		};
	for(int i=0; i<arr2[0].length; i++) {
		for(int j=0; j<arr2[i].length; j++) {
			System.out.print(arr2 [i][j]+ " ");
		}
	} 
    System.out.println(arr2.length);//4 one dimention 1D
	System.out.println(arr2[0].length);//
	System.out.println(arr2[1].length);//
	System.out.println(arr2[3].length);//
	System.out.println(arr2[4].length);//
		}

}
