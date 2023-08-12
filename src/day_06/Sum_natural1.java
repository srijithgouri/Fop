package day_06;

public class Sum_natural1 {

	public static void main(String[] args) {
		System.out.println(get_sum(10));
	}
	public static String get_sum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		return "the sum of given digits "+sum;
	}
	
}
