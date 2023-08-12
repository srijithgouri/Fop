package day_12;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		String str1= "srijith gouri";
		String str2="srijith gouri is good boy ";
		String str5="   sriJIth Gouri   ";
		String str3=new String("srijith gouri");
		String str4=new String("SriJiTh Gouri");
		String str6="srijith^ g^ouri i^s go^od boy ";
		String str7="1780";
		int i=Integer.valueOf(1780);
		
//		str.equals() this method used to equal the data present in the string not the address comparasion
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));
//        str.equalIgnoreCase() this method is used to compare the data present in the string .
//        if it is lowercase or uppercase it will ignore and compare whether tha data is same means i will return true
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str4));
        System.out.println(str1.equalsIgnoreCase(str3));
//        str.contains() it will check whether the letter is present in the string or not we can give single character or word
//        we have to use double codes in the method
        System.out.println(str1.contains("g"));
        System.out.println(str1.contains("gou"));
        System.out.println(str1.contains("srijith"));
        System.out.println(str1.contains("a"));
        System.out.println(str1.contains("gouri srijith"));
        System.out.println(str1.contains("sri gouri"));
//        str.startsWith() the word present in the string starting with ending with 
        System.out.println(str1.startsWith("sr"));
//        str.endsWith it will check how it is ending in the string
        System.out.println(str1.endsWith("th"));
        System.out.println(str1.endsWith("ir"));
        System.out.println(str1.endsWith("ri"));
//        str.length() length of the string to know how many characters are there n a string
        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println(str3.length());
        System.out.println(str4.length());
        System.out.println(str5.length());
//        str.trim() it will remove the spaces of leading and ending .starting and ending and print that string
        System.out.println(str5.trim());
        System.out.println(str5.trim().length());
//        str.toUpperCase() it will convert all the string into upper case in the 
        System.out.println(str1.toUpperCase());
//        str.toLpperCase()
        System.out.println(str1.toLowerCase());
//        str.CharArray() it will store every element as a array form like
//        this like [ , ,s,r,i,J,I,t,h, ,G,o,u,r,i, , ] but we can't seen on output
        System.out.println(str5.toCharArray());
        System.out.println(str1.toCharArray());
          char[] b=str1.toCharArray();
          System.out.println(b);
//          str.indexOf() in this we can know the index place of character by giving its character 
//          in this it will give only first position of that word .
//          it will not count other positions which are there in that sentence
//          if that character or any special character  is not present in the string  it will give -negetive valus
          System.out.println(str1.indexOf(" "));
          System.out.println(str5.indexOf(" "));
          System.out.println(str5.indexOf("g"));
          System.out.println(str5.indexOf("J"));
//          str.lastIndexOf() it will show the index value of that character which was at last position  
          System.out.println(str2.lastIndexOf("g"));
          System.out.println(str2.lastIndexOf("G"));
//          str.subString() sub string will giving starting and last value and ending value in between it will come 
//          if we give only starting value means ending automatically it will take
          System.out.println(str1.substring(1,5));
          System.out.println(str1.substring(0,12));
//          str.split() it will splite the words by using any specialcharacter
//          it will give in the form of arry
//          WE have to convert in to string
//          System.out.println(str1.split("\\ "));
          System.out.println(Arrays.toString(str1.split(" ")));
          System.out.println(Arrays.toString(str2.split(" ")));
          System.out.println(Arrays.toString(str6.split("\\^")));
//          str.CharAt()
          System.out.println(str1.charAt(5));
          System.out.println(str1.charAt(7));
//          str.replace()
          System.out.println(str1.replace("t", "f"));   
          System.out.println(str1.replace("i", "a")); 
          System.out.println(str1.replace("gouri", "srijith"));   
//          str.replaceall()
          System.out.println(str1.replaceAll("srijith", "srija"));   
//        str.value() it will convert in to  some  data type to string data type in to string boolean to string like wise  
          int j=1025;
          String str8=String.valueOf(j);
          System.out.println(str8);
          System.out.println(Integer.valueOf(str7));  
          System.out.println(i);
//          str.isEmpty() first it will find its length and gives in boolean form is empty or not if empty means it will 
//          give true if not it will give it is false
          String str9="  ";
          System.out.println(str1.length());
          System.out.println(str1.isEmpty());
          System.out.println(str9.isEmpty());
//          str.Blank() it will remove all spaces and returns 
//          meaning of Blank() is =str.trim().isEmpty()
          System.out.println(str9.isBlank());
          
          
          
          
	}

}
