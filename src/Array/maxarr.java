package Array;

public class maxarr {
public static void main(String[] args) {
int [ ]arr= {50,90,10, 15, 85, 60};

int temp;
for(int i=0; i<arr.length; i++) {
	for(int j=0+1; j<arr.length; j++) {
		if(arr[i]>arr[j]) {
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
			
	}
      }
}
System.out.println("second largest is "+arr[1]);



}
}

