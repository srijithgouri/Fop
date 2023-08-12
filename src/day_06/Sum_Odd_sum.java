package day_06;

public class Sum_Odd_sum {

	public static void main(String[] args) {

System.out.println(get_odd_sum(15));
	}
public static int get_odd_sum(int n){
	int sum=0;
	for(int i=1;i<=n;i+=1) {
		if(i%2==0) {
			sum=sum+i;
		}
	}
	return sum;
}
}
