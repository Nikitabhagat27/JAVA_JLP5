package javaPractice;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Give the input in this manner: M/F");
	        char a = sc.nextLine().charAt(0);
	        if (a == 'M' || a == 'm') {
	            System.out.println("Good morning mam");
	        } else if (a == 'F' || a == 'f') {
	            System.out.println("Good morning sir");
	        } 
	
	 
  }
}
