package day_06;

public class Collatz {

	public static void main(String[] args) {
		System.out.println(get_sequence(5));

	}
public static String get_sequence(int num) {
	String result=num+"";
	while(num!=1) {
		if(num%2==0) {
			num=num/2;
			result+=num+"";
		}
		else {
			num=(num*3)+1;
			result+=num+"";
		}
	}
	return result;
}
}
