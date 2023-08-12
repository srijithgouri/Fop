package day_06;

public class Sum_in_Digit {

	public static void main(String[] args) {
System.out.println(get_Sum(123));
	}
	public static String get_Sum(int n) {
		int sum=0;
		while(n>0) {
			sum=sum+n%10;
			n/=10;
		}
		return "The sum is:"+sum;
	}

}
