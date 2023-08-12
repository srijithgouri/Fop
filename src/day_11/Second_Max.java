package day_11;

public class Second_Max {

	public static void main(String[] args) {
	int arr1[]= {1,25,9,54,86,25,86};
   int[] b=get_secondmax(arr1);
    System.out.println(b[arr1.length-3]);
	}
public static int[] get_secondmax(int arr[]) {
	int temp;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length-1;j++) {
			if(arr[j]>arr[j+1]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	return arr;
}

}
