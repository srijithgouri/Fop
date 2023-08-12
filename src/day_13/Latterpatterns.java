package day_13;

public class Latterpatterns {

	public static void main(String[] args) {
		System.out.println(_V(7));
		System.out.println(_W(7));
		System.out.println(_X(7));
		System.out.println(_Y(7));
		System.out.println(_Z(7));
		}
	public static String _V(int n){
			String result="";
			for(int i=1;i<=n;i++){
				for(int j=1;j<=n;j++){
				   if((j==1&&i<=n/2+1)||(j==n&&i<=n/2+1)||(i-j==n/2&&i>=n/2+1)||(i+j)==(n+(n/2+1))) {
						result+="V";
					}
					else{
						result+=" ";
					}
				}
				result+="\n";
			}
			return result;
		}
	public static String _W(int n){
		String result="";
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if( j==1 || j==n || i>=n/2+1 && j<=n/2+1 && n-i==j-1 || i>=n/2+1 && j>=n/2+1 && i==j ){
					result+="W";
				}
				else{
					result+=" ";
				}
			}
			result+="\n";
		}
		return result;
	}
	public static String _X(int n){
		String result="";
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==j || n-i==j-1 ){
					result+="X";
				}
				else{
					result+=" ";
				}
			}
			result+="\n";
		}
		return result;
	}
	public static String _Y(int n){
		String result="";
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==j && i<=n/2 || i<n/2+1 && (n-i)==j-1 || i>=n/2+1 && j==n/2 ){
					result+="Y";
				}
				else{
					result+=" ";
				}
			}
			result+="\n";
		}
		return result;
	}
	public static String _Z(int n){
		String result="";
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==1 || n-i==j-1  || i==n){
					result+="Z";
				}
				else{
					result+=" ";
				}
			}
			result+="\n";
		}
		return result;
	}
}

