package day_06;

public class All_Digitofnumber {

	public static void main(String[] args) {
		System.out.println(get_Digit(1234));
	}
	public static String get_Digit(int n) {
		String result="";
		//int temp=n;
		int reverse=0;
		while(n>0) {
			reverse=reverse*10+(n%10);
			n/=10;
		}
			while(reverse>0) {
				result=result+(reverse%10);
				reverse/=10;
			}
			return "The number is"+result;
		}
	}
