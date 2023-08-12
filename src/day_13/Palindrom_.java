package day_13;

public class Palindrom_ {
//	pallindrome or not.
//	 a."madam" b."Mom"
	public static void main(String[] args) {
		String s="madam";
		System.out.println(get_palindrom(s));
		
	}
public static String get_palindrom(String s) {
//	int reverse=0;
//	String temp=s;
	String result="";
	for(int i=s.length()-1;i>=0;i--) {
		result=result+s.charAt(i);
	}
	if(s.equals(result)) {
		return "it is palindrom";
	}else {
		return "not palindrom";
	}
}
}
