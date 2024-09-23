package Array;

public class Sec_largest {
	
	    public static void main(String[] args) {
	        int[] arr = {50, 90, 10, 15, 85, 60};
	        int[] arr1 = {50, 90, 10, 15, 85, 60};
           int largest =arr[0];
            int secondlargest=arr[0];
           // Object object=arr;
            Object object=arr1;
             int arr6 [][]= new int[0][0];
            
            
         
        	for(int i=0; i<arr.length; i++) {
        		if (arr[i]> largest) {
        			secondlargest=largest;
        			largest=arr[i];
        			
        		}
        	
        //	for(int  i=0; i<arr.length; i++) {
        	else   if(arr[i] > secondlargest && arr[i]< largest) {
            	secondlargest=arr[i];
            }
        }
        	System.out.println(secondlargest);
        	
        	} 
	    
	      
        }