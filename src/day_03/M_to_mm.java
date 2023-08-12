package day_03;

public class M_to_mm {

	public static void main(String[] args) {
		System.out.println(Meterstomm(10));

	}
    public static String Meterstomm(double m) {
    	double meters=m*100;
    	return "The mm is:"+meters;
    }
}
