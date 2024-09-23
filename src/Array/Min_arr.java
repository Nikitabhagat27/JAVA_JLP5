package Array;



public class Min_arr {
public static void main(String[] args) {
	int arr[]= {50,90,10, 15, 85, 60};
	int min= arr[0];
	for(int i=0; i<arr.length; i++) {
		if (min>arr[i]) {
			min=arr[i];
		}
	}

System.out.println("minimum" + min);
}
}