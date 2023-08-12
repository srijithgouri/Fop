package day_04;

public class Even_odd_2 {

	public static void main(String[] args) {
		
System.out.println(evenodd(2));
	}
public static String evenodd(int x) {
	String result ="";
	if(x%2==0) {
		result="even";
	}else {
		result="odd";
	}
	return result;
}
}
