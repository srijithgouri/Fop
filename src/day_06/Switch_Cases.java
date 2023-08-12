package day_06;

public class Switch_Cases {

	public static void main(String[] args) {
		System.out.println(get_Operation(20,10,'+'));

	}
public static String get_Operation(int a,int b,char key) {
	String result="";
	switch(key) {
	case '+':
		result+="Addition:"+(a+b);
		break;
	case '-':
		result+="Subtration:"+(a-b);
		break;
	case '*':
		result+="product:"+(a*b);
		break;
	case '/':
		result+="Division:"+(a/b);
		break;
	case '%':
		result+="Modulus:"+(a%b);
		break;
	default :
		result+="Invalid in put";
		
	}
	return result;
}
}
