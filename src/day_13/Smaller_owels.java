package day_13;

public class Smaller_owels {
//WAP to find smaller case vowels fom string s="javadev"
//a.print vowels b.count vowels 
	public static void main(String[] args) {
		
		String s= "javadev";
		System.out.println(get_no_of_owels(s));
		System.out.println();
	}
	public static String get_no_of_owels(String s) {
		int count=0;
		String result="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
				count++;
				result+=s.charAt(i);
			}
			result+=" ";
		}
		return "The no of vowels are:"+count+"\n"+"The vowels are:"+result;
	}

}
