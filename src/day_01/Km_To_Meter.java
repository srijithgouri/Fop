package day_01;

public class Km_To_Meter {

	public static void main(String[] args) {
		System.out.println(get_Km_To_Meter(10));
		

	}
	public static String get_Km_To_Meter(int a) {
		int b=a*1000;
		return "The meter of km is:"+b;
	}
}
