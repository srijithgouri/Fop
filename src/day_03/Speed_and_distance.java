package day_03;
import java.util.*;
public class Speed_and_distance {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The distance in meters:");
		int meters=sc.nextInt();
		System.out.println("Time in hours:");
		double hours=sc.nextDouble();
		System.out.println("Time in minutes:");
		int minutes=sc.nextInt();
		System.out.println("Time in seconds:");
		int seconds=sc.nextInt();
		
		Meters(meters,hours,minutes,seconds);
		Killometer(meters,hours,minutes,seconds);
		Miles(meters,hours,minutes,seconds);
	}
	public static void Meters(double meters,double h,double m,double s) {
	 double total_sec=(h*3600)+(m*60)+(s*1);
	 double speed=meters/total_sec;
	 System.out.println("The speed in MPS:"+speed);
	}
	public static void Killometer(double meters,double h,double m,double s) {
		 double total_hours=(h/1)+(m/60)+(s/3600);
		 double speed=(meters/1000)/total_hours;
		 System.out.println("The speed in kmps:"+speed);

}
	public static void Miles(double meters,double h,double m,double s) {
		double total_hours=(h/1)+(m/60)+(s/3600);
		double speed=(meters/1609)/total_hours;
		System.out.println("The speed in Miles:"+speed);
	}
}
