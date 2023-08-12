package day_04;
import java.util.*;
public class Operator {
public static void main(String[] arge) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number ch:");
	int ch=sc.nextInt();
	System.out.println("Enter the value of a:");
	int a=sc.nextInt();
	System.out.println("Enter the value of b:");
	int b=sc.nextInt();
	System.out.println(get_operator(ch,a,b));
}
public static String get_operator(int ch,int a,int b) {
	String result="";
	if(ch==1) {
		result="Addition:"+(a+b);
	}else if(ch==2) {
		result="Subtraction:"+(a-b);
	}else if(ch==3) {
		result="multiplictation:"+(a*b);
	}else if(ch==4) {
		result="Divison:"+(a/b);
	}else {
		result="invalid";
	}
	return result;
}
}
