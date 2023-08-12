package day_06;

public class Armstrong {

	public static void main(String[] args) {
		System.out.println(get_Armstrong(1634));

	}
public static String get_Armstrong(int num){
	String result="";
	int temp=num;
	int sum=0;
	int temp2=num;
	// the total count of numbers 
	int count=0;
	while(num>0){
		count++;
		num=num/10;
	}
while(temp>0) {
	int digit=temp%10;
	temp=temp/10;
	sum+=Math.pow(digit, count);
	
}
if(temp2==sum) {
	System.out.println("armstrong");
	
}else {
	System.out.println("not armstrong");
}
return result;
}
}
