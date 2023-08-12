package day_04;

public class Greatestofnumber {

	public static void main(String[] args) {
		System.out.println(get_Great(20,30,10));

	}
public static String get_Great(int a,int b,int c) {
	String result="";
	if(a>b&&a>c) {
		result="'A': is Greater";
	}else if(b>a&&b>c) {
		result="'B':is Greater";
	}else if(c>a&&c>b) {
		result="'c': is Greater";
	}
	return result;
}
}
