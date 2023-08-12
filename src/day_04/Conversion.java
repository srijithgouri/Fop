package day_04;
import java.util.*;
public class Conversion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temperature");
			double ch=sc.nextDouble();
		System.out.println("Enter the ch number");
		   double t=sc.nextDouble();
			Convertion(t, ch) ;
		}
		
public static void Convertion(double ch,double t) {
	if(ch==0) {
		System.out.println((t-32)*5/9+":celsius");
	}else if(ch==1) {
		System.out.println((t*9/5)+32+":Fahrenheit");
	}else {
		System.out.println("Invalid");
	}
}
}
