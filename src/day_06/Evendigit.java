package day_06;

public class Evendigit {

	public static void main(String[] args) {
		
System.out.println(get_evendigit(123456789));
	}
	public static String get_evendigit(int n) {
		String result="";
		int reverse=0;
		while(n>0) {
		reverse=reverse*10+n%10;
		n/=10;
	}
	System.out.println("the even digits are: ");
	while(reverse>0) {
	int digit=reverse%10;
    if(digit%2==0) {
    	result+= digit;	
    }
    reverse/=10;
		}
		return result;
		}
}