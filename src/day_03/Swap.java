package day_03;

public class Swap {
	public static void main(String[] args) {
	System.out.println(get_Swap(10,20));
	}
	public static String get_Swap(int a,int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		return "the swap a is: "+a+b;
		
				
	}
	

}
