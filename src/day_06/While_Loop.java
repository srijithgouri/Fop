package day_06;

public class While_Loop {

	public static void main(String[] args) {
System.out.println(get_Add(1234));
System.out.println(get_Add(12345));
	}
public static int get_Add(int num) {
int sum=0;
while(num>0) {
	sum+=num%10;
	num=num/10;
}
return sum;
}
}