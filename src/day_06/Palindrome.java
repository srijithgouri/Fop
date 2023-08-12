package day_06;

public class Palindrome {

	public static void main(String[] args) {
		
System.out.println(get_Palindrome(121));
	}
public static boolean get_Palindrome(int n) {
	int temp=n;
	int reverse=0;
	while(n>0) {
		reverse=reverse*10+n%10;
		n/=10;
	}
	return (temp==reverse);
}
}
