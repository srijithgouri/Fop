package day_01;

public class Area_Of_Circle {
	public static void main(String[] args) {
		System.out.println(get_Area(10));
		
	}
	public static String get_Area(float R) {
		float area=3.14f*R*R;
		return "The Area is:"+area;
	}

}
