package day_02;

public class Add_two_Num {

	public static void main(String[] args) {
		
		System.out.println(get_add(5,6));
	}
	public static String get_add(int a,int b) {
		int sum=0;
		sum=a+b;
		return "The sum is"+sum;
	}
}
