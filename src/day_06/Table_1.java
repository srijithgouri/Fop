package day_06;
import java.util.*;
public class Table_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the table u want");
		int n=sc.nextInt();
           System.out.println(get_Table(n));
	}
public static String get_Table(int n) {
    String result="";
	for(int i=1;i<=10;i++) {
		result=result+n*i+"\n";
	}
	return result;
}
}
