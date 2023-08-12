package day_11;

public class Sum_of_elements {

	public static void main(String[] args) {
	int[] numbers = {5,6,8,7};
	System.out.println("The sum is:"+get_Sum(numbers));
	}
public static int get_Sum(int[] numbers) {
	int sum=0;
	for(int i=0;i<numbers.length;i++) {
		sum+=numbers[i];
	}
	return sum;
}
}
