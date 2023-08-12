package day_07;

public class Print_prime {

	public static void main(String[] args) {
	
System.out.println(print_prime());
	}
	public static String print_prime() {
		String result="";
		for(int i=1;i<=100;i++) {
			if(get_Prime(i)) {
				result =result+i+",";
			}
		}
		return result;
	}
	public static boolean get_Prime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
		if(num%i==0) {
			count++;
		}
			
	}
		if(count==2) {
			return true;
		}else {
			return false;
		}
	}

}
