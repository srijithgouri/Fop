package day_04;

public class Vote {

	public static void main(String[] args) {
		System.out.println(get_Eligible(17));

	}
	public static String get_Eligible(int age) {
		String result="";
		if(age>=18) {
			result="eligible";
		}else {
			result="Not eligible";
		}
		return result;
	}
}
