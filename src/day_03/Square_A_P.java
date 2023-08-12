package day_03;

public class Square_A_P {
	public static void main(String[]args) {
		System.out.println(Area(10));
		System.out.println(Perimeter(20));
		
	}
	public static String Area(int a) {
		int area=4*a;
		return "The area of square:"+area;
	}
	public static String Perimeter(int a) {
		int perimeter=a*a;
		return "The perimeter of square:"+perimeter;

}
}
