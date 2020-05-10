package arrays.easy;

public class Problem_1252 {
	    public int oddCells(int n, int m, int[][] indices) {
	     
	        int[][] matrix = new int[n][m];
	        int count = 0;
	        int row = 0, col = 0;
	        for(int i =0; i < indices.length; i++){
	            row = indices[i][0];
	            col = indices[i][1];
	            
	            for (int j = 0; j < m; j++){
	                matrix[row][j] += 1;
	            }
	            for (int k = 0; k < n; k++){
	                matrix[k][col] += 1;
	            }
	        }
	        for (int i = 0; i < n; i++){
	            for (int j = 0; j <m; j++){
	                if(matrix[i][j]%2 != 0) count++;
	                
	            }
	        }
	        return count;
	}

}
