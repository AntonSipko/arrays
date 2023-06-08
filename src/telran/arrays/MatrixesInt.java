package telran.arrays;

public class MatrixesInt {
public static int[][] multiplyConstant(int[][] matrix, int constant) {
	for (int i = 0; i < matrix.length; i++) {
		for (int j = 0; j < matrix[i].length; j++) {
			matrix[i][j] *= constant;
		}
	}
	return matrix;
}
	public static int[]getColumn(int [][]matrix,int column){
		int res[]=new int[matrix.length];
		for(int i=0;i<matrix.length;i++) {
			res[i]=matrix[i][0];
		}
		return res;
	}
	public static int [][] transpMatrix(int[][]matrix){
		int [][]resMatrix=new int[matrix[0].length][matrix.length];
		//TODO
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				resMatrix[j][i]=matrix[i][j];
			}
		}
		return resMatrix;
	}

}
