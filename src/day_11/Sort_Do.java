package day_11;

public class Sort_Do {

	public static void main(String[] args) {
		int[] numbers= {5,4,8,1,9};
		System.out.println(get_sort(numbers));
	}
public static String get_sort(int[] numbers) {
	String result="";
	int temp;
	for(int i=0;i<numbers.length;i++) {
		for(int j=0;j<numbers.length;j++) {
			if(numbers[i]>numbers[j]) {
				temp=numbers[i];
				numbers[i]=numbers[j];
				numbers[j]=temp;
			}
		}
		
	}
	for(int i=0;i<numbers.length;i++) {
		result=result+numbers[i];
	}
	return result;
         
}
}
