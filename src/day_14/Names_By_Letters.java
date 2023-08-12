package day_14;

import java.util.Scanner;

public class Names_By_Letters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Give name: ");
		String name = sc.nextLine();
		char[] arr= name.toUpperCase().toCharArray();
		int n;
		System.out.print("Give size: ");
		n = sc.nextInt();
		System.out.println(printPattern(arr,n));
	}
	
	public static String printPattern(char[] arr, int n) {
		String result = "";
		for (int i = 1; i<=n; i++) {
			for (char ch: arr) {
				switch (ch) {
				case 'A':
					result+=printA(i, n);
					result+=" ";
					break;
				case 'B':
					result+=printB(i, n);
					result+=" ";
					break;
				case 'C':
					result+=printC(i, n);
					result+=" ";
					break;
				case 'D':
					result+=printD(i, n);
					result+=" ";
					break;
				case 'E':
					result+=printE(i, n);
					result+=" ";
					break;
				case 'F':
					result+=printF(i, n);
					result+=" ";
					break;
				case 'G':
					result+=printG(i, n);
					result+=" ";
					break;
				case 'H':
					result+=printH(i, n);
					result+=" ";
					break;
				case 'I':
					result+=printI(i, n);
					result+=" ";
					break;
				case 'J':
					result+=printJ(i, n);
					result+=" ";
					break;
				case 'K':
					result+=printK(i, n);
					result+=" ";
					break;
				case 'L':
					result+=printL(i, n);
					result+=" ";
					break;
				case 'M':
					result+=printM(i, n);
					result+=" ";
					break;
				case 'N':
					result+=printN(i, n);
					result+=" ";
					break;
				case 'O':
					result+=printO(i, n);
					result+=" ";
					break;
				case 'P':
					result+=printP(i, n);
					result+=" ";
					break;
				case 'Q':
					result+=printQ(i,n);
					result+=" ";
					break;
				case 'R':
					result+=printR(i,n);
					result+=" ";
					break;
				case 'S':
					result+=printS(i,n);
					result+=" ";
					break;
				case 'T':
					result+=printT(i,n);
					result+=" ";
					break;
				case 'U':
					result+=printU(i,n);
					result+=" ";
					break;
				case 'V':
					result+=printV(i,n);
					result+=" ";
					break;
				case 'W':
					result+=printW(i,n);
					result+=" ";
					break;
				case 'X':
					result+=printX(i,n);
					result+=" ";
					break;
				case 'Y':
					result+=printY(i,n);
					result+=" ";
					break;
				case 'Z':
					result+=printZ(i,n);
					result+=" ";
					break;
				default:
				}
			}
			result+="\n";
		}
		return result;
	}
	
	public static String printA(int i, int n) {
		String result = "";
		for (int j = 1; j<=n; j++) {
			if (i==1||i==n/2+1||j==1||j==n) {
				result+="A";
			}
			else {
				result+=" ";
			}
		}
		return result;
	}
	
	public static String printB(int i, int n){
		String res="";
			for(int j=1;j<=n;j++){
				if(j==1 || (i==1 && j<n) || (i==n && j<n) || (i==n/2+1 && j<n) || (j==n && i!=1 && i!=n &&i!=n/2+1) ){
				res+="B"+"";
				
				}else{
				res+=" ";
				}
				}
			return res;
	}
	public static String printC(int i, int n){
		String res="";
			for(int j=1;j<=n;j++){
				if(i==1 || i==n || j==1){
					res+="C";
				}else{
					res+=" ";
				}
			}return res;
	}
	public static String printD(int i, int n){
		String res="";
			for(int j=1;j<=n;j++){
				if(j==1 || (i==1&j<=n-1) || (i==n&j<=n-1) || ((i>=2 &i<=n-1)&j==n)){
					res+="D";
				}else{
					res+=" ";
				}
			}
		return res;
	}
	public static String printE(int i, int n){
		String res="";
			for(int j=1;j<=n;j++){
				if(i==1 || i==n/2+1 || i==n || j==1 ){
					res+="E";
				}else{
					res+=" ";
				}
			}
		return res;
	}
	public static String printF(int i, int n){
		String res="";
			for(int j=1;j<=n;j++){
				if(i==1 || i==n/2+1 || j==1){
					res+="F";
				}else{
					res+=" ";
				}
			}
		return res;
	}
	
	public static String printG(int i, int n) {
		String result = "";
		for (int j = 1; j<=n; j++) {
			if (((i==1)||(i==n))&&!(j==1 || j==n)) {
				result+="G";
			}
			else if ((j==1) && !(i==1||i==n)) {
				result+="G";
			}
			else if ((j==n)&&(i>=n/2+1&&i<=n-1)) {
				result+="G";
			}
			else if (i==n/2+1&&j>=n/2+1) {
				result+="G";
			}
			else {
				result+=" ";
			}
		}
		return result;
	}
	
	public static String printH(int i, int n) {
		String result = "";
		for (int j = 1; j<=n; j++) {
			if (i==n/2+1 || j == 1 || j==n) {
				result += "H";
			}
			else {
				result+=" ";
			}
		}
		return result;
	}
	
	public static String printI(int i, int n) {
		String result = "";
		for (int j = 1; j<=n; j++) {
			if (j==n/2+1 || i == 1 || i==n) {
				result += "I";
			}
			else {
				result+=" ";
			}
		}
		return result;
	}
	
	public static String printJ(int i, int n) {
		String result = "";
		for (int j = 1; j <=n; j++) {
			if (((i == n) && !(j==1 || j==n)) || ((j==1) && (i>=n/2+1 && i<=n-1)) || ((j==n) && (i!=n))) {
				result+="J";
			}
			else {
				result+=" ";
			}
		}
		return result;
	}
	
	public static String printK(int i, int n) {
		String result = "";
		for (int j = 1; j<=n; j++) {
 			if (j==1 || (i+j==(n+1)/2+2) || (i-j==n/2-1)) {
				result+="K";
			}
 			else {
 				result+=" ";
 			}
		}
		return result;
	}
	
	public static String printL(int i, int num1){
		String result1="";
			for(int j=1;j<=num1;j++){
				if(j==1||i==num1){
					result1+="L";
				}
				else{
					result1+=" ";
				}
			}
		return result1;
	}
	
	public static String printM(int i, int num1){
		String result1="";
			for(int j=1;j<=num1;j++){
				if(j==1||j==num1||(j<=(num1+1)/2&&i==j)||(j>(num1+1)/2&&(i+j)==num1+1)){
					result1+="M";
				}
				else{
					result1+=" ";
				}
			}
		return result1;
	}
	
	
	public static String printN(int i, int n){
		String result1="";
			for(int j=1;j<=n;j++){
				if(j==1||j==n||(i==j)){
					result1+="N";
				}
				else{
					result1+=" ";
				}
			}
		return result1;
	}
	
	
	public static String printO(int i, int num1){
		String result1="";
			for(int j=1;j<=num1;j++){
				if(((j==1||j==num1) && !(i==1 || i==num1))||((i==1||i==num1) && 
						!(j==1 || j==num1))){
					result1+="O";
				}
				else{
					result1+=" ";
				}
			}
		return result1;
	}
	public static String printP(int i, int num){
		String result ="";
			for( int j=1;j<=num;j++){
				if(i==1||j==1||i==num/2+1||(j==num && i>=2 && i<=num/2)){
					result+="P";
				}
				else{
					result+=" ";
				}
			}
 
		return result;

	}
	
	public static String printQ(int i, int n) {
		String res =  "";
		for (int j = 1; j<=n; j++) {
			if((i==1&&j>1&&j<n)||(i==n-1&&j>1&&j<n)||(j==1&&i>1&&i<n-1)||(j==n&&i>1&&i<n-1)||(i==j&&i==n/2+1)||(i==j&&i>n/2+1)){
				res+="Q";
			}
			else {
				res+=" ";
			}
		}
		return res;
	}
	
	public static String printR(int i, int rows)
	{
		String res="";
		i--;
	        for (int j = 0; j < rows; j++) {
	            if (j == 0 || (i == 0 || i == rows / 2) && j < rows - 1)
	            {
	                res+="R";
	            } 
	            else if ((i > 0 && i < rows / 2) && j == rows - 1) 
	            {
	                res+="R";
	            } 
	            else if (i > rows / 2 && j == i) 
	            {
	                res+="R";
	            } 
	            else 
	            {
	                res+=" ";
	            }
	        }
		return res;
	}
	  
	public static String printS(int i, int rows)
	{
		String res="";
		i--;
	        for (int j = 0; j < rows; j++) 
	        {
	            if ((i == 0 || i == rows - 1 || i == rows / 2)
	                    || (i < rows / 2 && j == 0)
	                    || (i > rows / 2 && j == rows - 1))
	            {
	                res+="S";
	            } 
	            else 
	            {
	                res+=" ";
	            }
	        }
		return res;
	}
	  
	public static String printT(int i, int rows)
	{
	    int j;
	    i--;
	    String res="";
	        for (j = 0; j < rows; j++) 
	        {
	            if (i == 0)
	                res+="T";
	            else if (j ==  rows/ 2)
	              res+="T";
	            else
	                res+=" ";
	        }
	    return res;
	    
	}
	  
	public static String printU(int i, int rows)
	{
	    int j;
	    i--;
	    String res="";
	        for (j = 0; j < rows; j++) 
	        {
	            if (((i == rows - 1)
	                && j > 0
	                && j < rows - 1))
	                res+=("U");
	            else if (j == rows - 1
	                    && i != rows - 1)
	                res+=("U");
	            else if (j == 0 && i != rows-1) 
	            	res+=("U");
	            else
	                res+=(" ");
	        }
	    return res;

	}
	
	public static String printV(int i, int n){
		String result="";
			for(int j=1;j<=n;j++){
				if((j==1&&i<=n/2+1)||(j==n&&i<=n/2+1)||(i-j==n/2&&i>=n/2+1)||(i+j)==(n+(n/2+1))) {
					result+="V";
				}
				else{
					result+=" ";
				}
			}
		return result;
	}
	public static String printW(int i, int n){
		String result="";
			for(int j=1;j<=n;j++){
				if( j==1 || j==n || i>=n/2+1 && j<=n/2+1 && n-i==j-1 || i>=n/2+1 && j>=n/2+1 && i==j ){
					result+="W";
				}
				else{
					result+=" ";
				}
		}
		return result;
	}
	public static String printX(int i, int n){
		String result="";
			for(int j=1;j<=n;j++){
				if(i==j || n-i==j-1 ){
					result+="X";
				}
				else{
					result+=" ";
				}
		}
		return result;
	}
	public static String printY(int i, int n){
		String result="";
			for(int j=1;j<=n;j++){
				if(i==j && i<=n/2 || i<n/2+1 && (n-i)==j-1 || i>=n/2+1 && j==n/2 ){
					result+="Y";
				}
				else{
					result+=" ";
				}
		}
		return result;
	}
	public static String printZ(int i, int n){
		String result="";
			for(int j=1;j<=n;j++){
				if(i==1 || n-i==j-1  || i==n){
					result+="Z";
				}
				else{
					result+=" ";
				}
		}
		return result;
	}
	
	
}