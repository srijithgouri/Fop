package day_09;

public class Natural_numbers {

	public static void main(String[] args) {
	    System.out.println(get_numbers(100));
		System.out.println(getnumber(100));
	    System.out.println(getNumber(100));
		System.out.println(get_odd(100));
		System.out.println(get_even(100));
		System.out.println(get_Acci(26));
		System.out.println(get_acci(26));
		System.out.println(get_Repetnumber(3));
		System.out.println(get_Alphabits(3));
		System.out.println(get_doublerepetnumber(5));
		System.out.println(get_number_repet(5));
		System.out.println(get_letters_repet(10));
	}
public static String get_numbers(int n) {
	String result="";
	for(int i=1;i<=n;i++) {
		result=result+i;
	}
	return result;
}
public static String getnumber(int n) {
	String result="";
	for(int i=1;i<=n;i++) {
		result=result+i+" ";
	}
	return result;
}
public static String getNumber(int n) {
	String result="";
	for(int i=n;i>=1;i--) {
		result=result+i+" ";
	}
	return result;
}
public static String get_odd(int n) {
String result="";
	for(int i=1;i<=n;i++) {
		if(i%2!=0)
		result=result+i+" ";
	}
	return result;
}
public static String get_even(int n) {
	String result="";
	for(int i=1;i<=n;i++) {
		if(i%2==0)
			result=result+i+" ";
	}
	return result;
}
public static String get_Acci(int n) {
	String result="";
	for(int i=1;i<=n;i++) {
		result=result+(char)(i+64)+" ";
}
	    return result;
}
public static String get_acci(int n) {
	String result="";
	for(int i=1;i<=n;i++) {
		result=result+(char)(i+96)+" ";
	}
	return result;
}
public static String get_Repetnumber(int n) {
	String result="";
	for(int i=1;i<=n;i++) {
		for(int j=1;j<6;j++) {
			result=result+j+" ";
		}
		result=result+"\n";
	}
	return result;
	}
	public static String get_Alphabits(int n) {
		String result="";
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=5;j++) {
				result=result+(char)(j+64)+" ";
			}
			result=result+"\n";
		}
		return result;
	}
	public static String get_doublerepetnumber(int n) {
		String result="";
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				result=result+j;
			}
			
		}
		return result;
	}
	//12233344445555
	public static String get_number_repet(int n) {
		String result="";
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				result=result+i;
			}
		}
		return result;
	}
    public static String get_letters_repet(int n) {
    String result="";
    for(int i=1;i<=n;i++) {
    	for(int j=1;j<=i;j++) {
    		result=result+(char)(i+64);
    	}
    }
    return result;
}
}
    