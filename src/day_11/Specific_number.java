package day_11;

public class Specific_number {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		
		System.out.println(get_Specificnumber(arr,3));
	}
public static String get_Specificnumber(int arr[],int value) {
	String result="";
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==value) {
			result="The index value is:"+i;
		}
	}
	return result;
}
}
