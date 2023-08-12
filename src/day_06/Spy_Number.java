package day_06;

public class Spy_Number {

	public static void main(String[] args) {
		System.out.println(get_Spy(9));
	}
public static String get_Spy(int num) {
	int product=1;
	int temp=0;
	int sum=0;
	while(num>0) {
		 temp=num%10;
		product=product*temp;
		sum=sum+temp;
		num=num/10;
	}
	if(sum==product) { 
		return "It is spy number";
}else {
		return "Not a spy number";
	}
}
}
