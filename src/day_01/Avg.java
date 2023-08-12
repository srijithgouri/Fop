package day_01;

public class Avg {
	public static void main(String[] args) {
		System.out.println(get_Avg(10,20,30));
		
	}
	public static String get_Avg(int a,int b,int c) {
		int Avg=(a+b+c)/3;
		return "The Avg of number is:"+Avg;
	}

}
