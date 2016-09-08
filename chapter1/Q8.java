package chapter1;

import java.util.ArrayList;
import java.util.Collections;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = new int[][] {{1,0,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,0}};
		
		matrix = zero(matrix);
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.print('\n');
		}

	}
	
	public static int[][] zero(int[][] m) {
		ArrayList<Integer> rows = new ArrayList<Integer>();
		ArrayList<Integer> cols = new ArrayList<Integer>();
		
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				if(m[i][j] == 0) {
					rows.add(i);
					cols.add(j);
				}
			}
		}
		if(rows.isEmpty() && cols.isEmpty()) return m;
		
		Collections.sort(rows);
		Collections.sort(cols);
		
		int prev = -1;
		
		for(int i = 0; i < rows.size(); i++) {
			if(rows.get(i) != prev) {
				for(int j = 0; j < m[0].length; j++) {
					m[rows.get(i)][j] = 0;
				}
			}
			
			prev = rows.get(i);
		}
		
		prev = -1;
		
		for(int i = 0; i < cols.size(); i++) {
			if(cols.get(i) != prev) {
				for(int j = 0; j < m.length; j++) {
					m[j][cols.get(i)] = 0;
				}
			}
			
			prev = cols.get(i);
		}
		
		
		return m;
		
	}

}
