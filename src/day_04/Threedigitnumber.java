package day_04;
import java.util.*;
public class Threedigitnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int x=sc.nextInt();
		Number( x);
				

	}
	public static void Number(int x) {
		if(x>=100&&x<=999) {
			System.out.println("yes it is three digit");
		}else {
			System.out.println("in valid number");
		}
	}

}
