package day_04;
import java.util.*;
public class Statements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day");
		int day=sc.nextInt();
		Week( day);

	}
	public static void Week(int day) {
		if(day==1) {
			System.out.println("oops its Monday");
		}else if(day==2) {
			System.out.println("oops its tuesday");
		}else if(day==3) {
			System.out.println("oops its wednesday");
		}else if(day==4) {
			System.out.println("oops its Thursday");
		}else if(day==5) {
			System.out.println("oops its Friday");
		}else if(day==6) {
			System.out.println("yaa its Saturday");
		}else if(day==7) {
			System.out.println("yaa its weakend &  Sunday");
		}else {
			System.out.println("Invalid");
		}
	}

}
