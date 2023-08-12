package day_03;
import java.util.*;
public class Inches_to_meters {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value in meters:");
		double inches=sc.nextDouble();
		
		Meters(inches);
	}
    public static void Meters(double inches) {
    	double meters=inches*0.0254;
    	System.out.println("The inches is:"+meters);
    }
}

// Doubt in this program