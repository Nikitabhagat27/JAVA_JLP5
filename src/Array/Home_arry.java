package Array;

public class Home_arry {
public static void main(String[] args) {
	int arr[]= {50,90,10, 15, 85, 60};
	int max= arr[0];
	for(int i=0; i<arr.length; i++) {
		if (max< arr[i]) {
			max=arr[i];
		}
	}

System.out.println("maximum" + max);
}
}