package day_06;

public class Sum_even_num {

	public static void main(String[] args) {
System.out.println(get_even_sum(10));
	}
public static int get_even_sum(int n) {
	int sum=0;
	for(int i=0;i<=n;i+=2) {
		sum=sum+i;
	}
	return sum;
}
}
