package Array;

public class Max_array {
public static void main(String[] args) {
	        int[] arr = {50, 90, 10, 15, 85, 60};

	        // Initialize max with the smallest possible value
	        int max = Integer.MIN_VALUE;

	        // Traverse the array to find the maximum value
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }

	        // Output the maximum value
	        System.out.println("Maximum value: " + max);
	    }


}

