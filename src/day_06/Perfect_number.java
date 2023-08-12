package day_06;

public class Perfect_number {

	public static void main(String[] args) {
		System.out.println(Perfect(28));
	}
	public static String Perfect(int num) {
		int sum=0;
		int temp=num;
		for(int i=1;i<num;i++) {
			if(num%i==0)
				sum=sum+i;
		}
		if(temp==sum)
			return "perfect";
		else return "not perfect";
		}
		
	
	}


