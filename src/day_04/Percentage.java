package day_04;

public class Percentage {

	public static void main(String[] args) {
		System.out.println(get_Percentage(60,70,80));

	}
public static String get_Percentage(double a,double b,double c) {
	double R = ((a+b+c)/300)*100;
	if(R>=90) {
		return "Grade :'A'";
		
	}else if (R>=70&&R<=90) {
		return "Grade : 'B'";
		
	}else if (R>=50&&R<=70) {
		return "Grade : 'c'";
	}else {
		return "Fail:";
	}
}


}
