package day_06;

public class Strong_number {

	public static void main(String[] args) {
		System.out.println(get_Strong(145));

	}
	public static String get_Strong(int n){
	    int sum=0;
	     int rem;
	    String result="";
	    int temp=n;
	    while(n>0){
	        rem=n%10;
	    int fact=1;
	    for(int i=1;i<=rem;i++){
	        fact=fact*i;
	    }
	    n/=10;
	    sum=sum+fact;
	    }
	    if(temp==sum){
	        result+="The number is strong number";
	    }else{
	        result+="The numbere is not Strong number";
	    }
	    return result;
	}
}
