package javaPractice;
import java.util.Scanner;
public class Question9 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//Accept the three sides of triangle and calculate the area using herons formula
	int a =sc.nextInt();
	int b =sc.nextInt();
	int c= sc.nextInt();
	double s=(a+b+c)/2;
	double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
	System.out.println("Tringale area ia a="+area+"kilomeater");
}

}
	

