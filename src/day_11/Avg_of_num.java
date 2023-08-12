package day_11;

public class Avg_of_num {

	public static void main(String[] args) {
	int[] marks = {99,98,95};
System.out.println(get_Avg(marks));
	}
	public static int get_Avg(int[] marks) {
		int sum=0;
		for(int i=0;i<marks.length;i++) {
			sum=sum+marks[i];
		}
		return sum/marks.length;
	}

}
