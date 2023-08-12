package day_11;

public class Max_Min_num {

	public static void main(String[] args) {
int[] numbers= {501,52,46,10,1000,10101};
System.out.println(get_Greatest(numbers));
System.out.println(get_min(numbers));
	}
public static int get_Greatest(int[] numbers) {
	int max=numbers[0];
	for(int i=1;i<numbers.length;i++) {
		if(numbers[i]>max) {
			max=numbers[i];
		}
	}
	return max;
}
public static int get_min(int[] arr) {
	int min=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<min) {
			min=arr[i];
		}
	}
	return min;
}

}
