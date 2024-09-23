package javaPractice;
import java.util.Scanner;
public class Question11 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double radius=sc.nextDouble();
	double circumference=2*Math.PI*radius;
	double area=Math.PI*radius*radius;
	System.out.println("circle circumference="+circumference);
	System.out.println("circle area="+area);
}
}
