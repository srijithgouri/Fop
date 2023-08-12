package day_04;

public class Time_Calculation {

	public static void main(String[] args) {
		System.out.println(Convert(3000010));
	}
   public static String Convert(int min) {
	   int years=min/(365*24*60);
	   min=min- years*(365*24*60);
	   int days=min/(24*60);
	   min=min-days*(24*60);
	   int hours=min/60;
	   min=min-hours*(60);
	   return "The years is:"+years+"\n"+"the days is:"+days+"\n"+"The hours is:"+hours;
	   
	   
   }
}
