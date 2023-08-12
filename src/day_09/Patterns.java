package day_09;

public class Patterns {

	public static void main(String[] args) {
		System.out.println(get_Patters_1_5(5));
		System.out.println(get_Pattern_5_1(5));
		System.out.println(get_Numberpattern(5));
		System.out.println(get_Starpattern(5));
		System.out.println(get_A(5));
		System.out.println(get_B(5));

	}
public static String get_Patters_1_5(int n) {
	String result="";
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			result=result+"*";
		}
		result=result+"\n";
	}
	return result;
}
public static String get_Pattern_5_1(int n) {
	String result="";
	for(int i=1;i<=n;i++) {
		for(int j=n;j>=i;j--) {
			result=result+"*";
		}
		result=result+"\n";
	}
              return result;
}
public static String get_Starpattern(int n) {
	String  result="";
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n-i;j++) {
			result=result+" ";
		}
			for(int j=1;j<=i;j++) {
				result=result+"*"+" ";
		
		}	
		result=result+"\n";	
	}
	return result;
}
public static String get_Numberpattern(int n) {
	String  result="";
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n-i;j++) {
			result=result+" ";
		}
			for(int j=1;j<=i;j++) {
				result=result+j;
		
		}	
		result=result+"\n";	
	}
	return result;
}
public static String get_A(int n) {
	String result="";
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			
			if(i==1||j==1||j==5||(i==n/2+1)) {
				result=result+"A";
			}else {
				result+=" ";
			}
		}
		result+="\n";
	}
	return result;
}
public static String get_B(int n) {
	String result="";
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			
			if((i==1&&j<n)||(i==5&&i<n)||j==1||j==5||(i==n/2+1&&i<n)) {
				result=result+"*";
			}else {
				result+=" ";
			}
		}
		result+="\n";
}
	return result;
}
}