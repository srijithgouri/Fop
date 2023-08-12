package day_14;

public class SumofDigonals {

	public static void main(String[] args) {
		int[][] matrix= {{1,2,3},{2,4,5},{5,6,7}};
System.out.println(get_matrix(matrix));
	}
	public static String get_matrix(int[][] matrix) {
		String result="";
		int sum=0;
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if(i==j) {
					sum+=matrix[i][j];
				}
				}
			}
		
		return "The sum of digonals in matrix is:"+sum;
	}

}
