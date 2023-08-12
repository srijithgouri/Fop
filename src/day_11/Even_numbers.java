package day_11;

public class Even_numbers {

	public static void main(String[] args) {
int arr[]= {1,2,3,4,5,6,7,8,9};
System.out.println(get_Even(arr));
System.out.println(get_Odd(arr));

	}
	public static String get_Even(int arr[]) {
		int c=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				c++;
			}
		}return ""+c;
	}
public static String get_Odd(int arr[]) {
	int c=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2!=0) {
			c++;
		}
	}return ""+c;
}

}
