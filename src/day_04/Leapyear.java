package day_04;

public class Leapyear {

	public static void main(String[] args) {
	System.out.println(get_Leapyear(2021));

	}
public static String get_Leapyear(int year) {
	String result="";
	if(year%4==0&&year%100!=0||year%400==0) {
		result="The year is  a leap year"+result;
	}else {
		result="Not a leap year"+result;
	}
	return result;
}
}
