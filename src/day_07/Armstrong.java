package day_07;

public class Armstrong {

	public static void main(String[] args) {
		System.out.println(print_Armstrong());
	}
public static String print_Armstrong() {
	String result="";
	for(int i=1;i<=1000;i++) {
		if(get_Armstrong(i))
			result=result+i+" ";
	}
	return result;
}
public static boolean get_Armstrong(int num){
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
	return true;
	
}else {
	return false;
}
}
}
