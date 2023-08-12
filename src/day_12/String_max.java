package day_12;

public class String_max {
	public static void main(String[] args) {
		System.out.println(get_length());
		
	}
public static String get_length() {
	int value=0;
	String[] address = {"kamareddy","hyderabad","talentsprint" };
  String result=" ";
  for(int i=0;i<address.length;i++) {
  if(address[i].length()>value){
	  result=address[i];
	  value=address[i].length();
  }
  
	
  }return result;
}
}
