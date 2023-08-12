package day_04;
import java.util.*;
public class Terinary {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the  of type of vehicle");
		
		System.out.println(get_Vote(4));

	}
	public static boolean get_Vote(int vehicle) {
		boolean result=(vehicle>=4);
		return result;
	}

}
