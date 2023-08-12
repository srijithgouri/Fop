package day_14;

public class Matrix {
	public static void main(String[] args) {
		int[][] array={{1,2,4,5},{4,5,3,5},{7,8,8,1},{10,11,7,5}};
		System.out.println(get_matrix(array));
	}
public static String get_matrix(int[][] array) {
	String result="";
	

	for(int i=0;i<array.length;i++) {
		int max=array[i][0];
		int min=array[i][0];
		for(int j=0;j<array[i].length;j++) {
			
			result+=array[i][j]+" ";
			if(array[i][j]>max){
				max=array[i][j];
			
			if(array[i][j]<min){
				min=array[i][j];
			}
			}
		}
		result+=" "+"The max is:"+max+"  "+"The min is:"+min;
		result+="\n";
		
	}
	return result;
}
}
