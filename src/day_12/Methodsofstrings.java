package day_12;

public class Methodsofstrings {

	public static void main(String[] args) {
		String names[]= {"Srijith  ","Rohith is good boy","Sumantth","Giri","Rohith","  "};
		String value="srijith";
		String value1="srijith";
		StringBuilder value2 = new StringBuilder("srijith");
		StringBuilder value4 = new StringBuilder("srijith");
		String value3=new String("srijith");
		
		System.out.print(get_sum(names));
		
		
		//length function;
		System.out.println(names[0].length());
		
		
		//charAtindex;
		System.out.println(names[2].charAt(2));
		
		
		//Substring(start index, end index)
		System.out.println(names[0].substring(1,3));
		
		
		//toLowerCase
		System.out.println(names[0].toLowerCase());
		
		
		//toUpperCase
		System.out.println(names[0].toUpperCase());
		
		
		//trim()
		System.out.println(names[0].trim());
		
		
		//.split(delimiter)
		String[] arr= names[1].split("h");
		System.out.println(arr[1] );
		
		
		//.startsWith(prefix)
		System.out.println(names[0].startsWith("S"));
		
		
		//.endsWith(suffix)
		System.out.println(names[0].endsWith("f"));
		
		
		//equals(otherstring);heap and string pool;
		System.out.println(value==value1);
		System.out.println(value1==value3);
		System.out.println(value2.equals(value3));
		
		
		//indexOf(str)
	   System.out.println(names[0].indexOf("t"));
	   
	   
	   //contains(str) 
	   System.out.println(names[2].replace("t","e"));
//	   setCharAt();
//	   value.setCharAt(0,t);
	   value2.setCharAt(0,'h');
	   System.out.println(value2);
//	   String.insert(4,'a')
	   value4.insert(4,'a' );
	   System.out.println(value4);
//	   String.detele(2,4);
	   value4.delete(4, 5);
	   System.out.println(value4);
//	   string.append
value4.append('h');
value4.append('e');
value4.append('l');
value4.append('l');
value4.append('o');
System.out.println(value4);
	   
	   //isEmpty()
	   System.out.println(names[5].isEmpty());
	   // compareTo
//	    Here there are there cases 
//	   1.string1>string2=gives +ve value
//	   2.String1=string2= 0
//	   3.string1<string2=gives -ve value
//	   here comparasion is done like wise("hello,wello)
//	   in above wello is bigger than hello
//	   comparasion is done on character of string
	   System.out.println(value.compareTo(value1));
	   
	   
	}
public static String get_sum(String names[]) {
	int sum=0;
	for(int i=0;i<names.length;i++) {
		sum=sum+names[i].length();
	}
	return ""+sum;
}
	
}
