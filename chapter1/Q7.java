package chapter1;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		matrix = rotate(matrix, 4);
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.print('\n');
		}
	}
	
	//Mine - same as book solution. Took a long time and some bug fixing to arrive at this solution. REDO
	public static int[][] rotate(int[][] m, int n) {
		
	
		for (int i = 0; i < n/2; i++) {
			for (int j = i; j < n - 1 - i; j++) {
		
				int store = m[i][j];
				m[i][j] = m[n-1-j][i];
				m[n-1-j][i] = m[n-1-i][n-1-j];
				m[n-1-i][n-1-j] = m[j][n-1-i];
				m[j][n-1-i] = store;
				
				
			}
		}
		
		
		return m;
	}

}
