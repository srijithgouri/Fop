package day_10;

public class Fibanacci_By_Method {

	public static void main(String[] args) {
System.out.println(get_Fibanacci(10));
	}
public static String get_Fibanacci(int n) {
	String result="";
	int a=0,b=1;
	int c;
	for(int i=1;i<=n;i++) {
		c=a+b;
		result+=c;
		a=b;
		b=c;
		result+="\n";
		
	}
	return result;
}
}
