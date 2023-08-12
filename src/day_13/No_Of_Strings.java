package day_13;

public class No_Of_Strings {
//WAP to check count of e/E character present in a String s="javaEEdeve"
	public static void main(String[] args) {
		String s="javaEEdeve";
		System.out.println("The no of e/E in string is :"+get_Stringcount(s));

	}
public static int get_Stringcount(String s) {
	int count=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='e'||s.charAt(i)=='E') {
			count++;
		}
	}
	return count;
}
}
