package day_12;

public class String_min {

	public static void main(String[] args) {
		String Address[] = {"kamareddy","hyderabad","talentsprint"};

	System.out.println(get_String(Address));
	}
	public static String get_String(String Address[]) {
		String result=Address[0];
		int value=Address[0].length();
		for(int i=1;i<Address.length;i++) {
			if(Address[i].length()<value) {
				result=Address[i];
				value=Address[i].length();
			}
		}
		return result;
	}
}
