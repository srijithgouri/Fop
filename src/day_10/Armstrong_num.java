package day_10;

public class Armstrong_num {
public static void main(String[] arge) {
	System.out.println(get_printArmstrong());
	
}
public static String get_printArmstrong() {
	String result="";
	for(int i=1;i<=1000;i++) {
		if(get_Amstrong(i))
			result=result+i+" ";
	}
	return result;
}
public static boolean get_Amstrong(int n) {
	int count=0;
	int temp=n;
	int sum=0;
	int temp2=n;
	while(n>0) {
		n/=10;
		count++;
	}
	while(temp>0) {
		int digit=temp%10;
		temp/=10;
		sum+=Math.pow(digit, count);
}
	if(temp2==sum) {
		return true;
}else {
	return false;
}
}
}
