package day_06;

import java.util.Scanner;

public class Reverse_of_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		get_Reverse(num);
	}
public static void get_Reverse(int num) {
	int tem=num;
	int rev=0;
	while(num>0) {
		rev=rev*10+num%10;
		num=num/10;
		
	}
	System.out.println("the reverse of number is"+rev);
}
}
