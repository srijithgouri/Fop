package day_04;

import java.util.Scanner;

public class Placeofnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		Place(number);
		

	}
	public static void Place(int number) {
		if (number>=1&&number<=9) {
			System.out.println("The number has one digit");
		}else if(number>=10&&number<=99) {
			System.out.println("The number has two digit");
		}else if(number>=100&&number<=999) {
			System.out.println("The number has three digit");
	}else if(number>=1000&&number<=9999) {
		System.out.println("The number has four digit");

}else if(number>=10000&&number<=99999) {
	System.out.println("The number has five digit");
}else {
	System.out.println("Invalid number");
}
	}
}

