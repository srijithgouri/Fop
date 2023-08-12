package day_04;
import java.util.*;
public class Even_Odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int x=sc.nextInt();
		even_Odd(x);

	}
	public static void even_Odd(int x) {
		if(x%2==0) {
			System.out.println("The number is even");
		}else {
			System.out.println("The number is not even");
		}
	}
}
