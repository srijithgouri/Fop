package day_06;

public class Product_N_terms {

	public static void main(String[] args) {
System.out.println(get_product(5));
	}
	public static int get_product(int n) {
		String result="";
		int product=1;
		for(int i=1;i<=n;i++) {
			product=product*i;
		}
		return   product;
	}
}

