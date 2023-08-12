package day_11;

public class Reverse {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		System.out.println(get_Reverse(arr));
	}
public static String get_Reverse(int arr[]) {
	String result="";
	for(int i=arr.length;i>0;i--) {
		result=result+i;
	}
	return result;
}
}
