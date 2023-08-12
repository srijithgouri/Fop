package day_06;

public class Divisible_by_3_5 {

	public static void main(String[] args) {
		System.out.println(get_Divisible(9,15));
		
	}
	public static int get_Divisible(int a,int b) {
		int sum=0;
		for(int i=a;i<=b;i++) {
			if(i%3==0||i%5==0) {
				sum=sum+i;
			}
			
		}
		return sum;
	}

}
