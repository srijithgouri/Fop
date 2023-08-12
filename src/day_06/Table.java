package day_06;

public class Table {
	public static void main(String[] args) {
		
	}
	public static String get_Table(int table) {
		String result="";
		for(int i=1;i<=10;i++) {
			result=result+table+"X"+i+"="+(table*i);
		}
		return result;
	}
}

	