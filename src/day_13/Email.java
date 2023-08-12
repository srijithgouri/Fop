package day_13;

public class Email {

	public static void main(String[] args) {
		String s= "srijithgouri2@gamil.com";
		System.out.println(get_(s));
}
	public static StringBuffer get_(String s) {
		int count=0;
		String result="";
		StringBuffer s1=new StringBuffer(s);
		for(int i=1;i<s.indexOf('@');i++) {
			count++;
			result=result+"*";
		}
		s1.replace(1,count+1,result);
		return s1;
	}
}