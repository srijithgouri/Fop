package day_07;

public class Palindrom {

	public static void main(String[] args) {
		System.out.println(print_palindrom());
	}
public static String print_palindrom() {
	String result="";
	for(int i=1;i<=100;i++) {
		if(get_Palindrome(i))
			result += i+" ";
	}
	return result;
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