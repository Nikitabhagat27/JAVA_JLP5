package javaPractice;
import java.util.Scanner;
public class Question18 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	
	if(a>b) {
		System.out.println("a is greater then b and c");
	}else if(b>a){
		System.out.println("b is greater than a");
	}else if(c>a){
		System.out.println("c is grater than a");
	}else {
		System.out.println("invelid input");
	}
	
	
}
}
