package day_07;
import java.util.*;
public class Chooice_In_Resturent {

	public static void main(String[] args) {
		System.out.println(get_resturent());
	}
	public static String get_resturent() {
		int coffie=100 , cooldrinks=50, vegburger=80, nonvegburger=110,icecream=35;
		
		int chooise=0;
	  int bill=0;
	  Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Well come to Tajbanjara");
			System.out.println("****Menu****");
			System.out.println("1.Coffie:100");
			System.out.println("2.Cool drinks:50");
			System.out.println("3.veg burger:80");
			System.out.println("4.non veg burger:110");
			System.out.println("5.ice cream:35");
			System.out.println("6.bye bye");
			System.out.println("enter your Chooise");
			chooise=sc.nextInt();
			switch (chooise) {
			case 1:
				bill=bill+coffie;
				break;
			case 2:
				bill=bill+cooldrinks;
				break;
			case 3:
				bill+=vegburger;
				break;
			case 4:
				bill+=nonvegburger;
				break;
			case 5:
				bill+=icecream;
				break;
				default:
					System.out.println("thanks visit again");
				
			}
	}
		while(chooise<6);
		return "The bill is:"+bill;
}
}
