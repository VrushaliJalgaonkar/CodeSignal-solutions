int[][] solution(boolean[][] matrix) {
    
    int[][] result = new int[matrix.length][matrix[0].length];
    
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            int neighbors = 0;
            // 0,0  0,1  0,2
            // 1,0 [1,1] 1,2
            // 2,0  2,1  2,2
            
            // top
            if (i > 0 && matrix[i-1][j]) neighbors++;
            
            // bottom
            if (i+1 < matrix.length && matrix[i+1][j]) neighbors++;
            
            // left
            if(j > 0 && matrix[i][j-1]) neighbors++;
            
            // right
            if (j+1 < matrix[0].length && matrix[i][j+1]) neighbors++;
            
            // upper left
            if (i > 0 && j > 0 && matrix[i-1][j-1]) neighbors++;
            
            // upper right
            if (i > 0 && j+1 < matrix[0].length && matrix[i-1][j+1]) neighbors++;
            
            // lower left
            if (i+1 < matrix.length && j > 0 && matrix[i+1][j-1]) neighbors++;
            
            // lower right
            if (i+1 < matrix.length && j+1 < matrix[0].length && matrix[i+1][j+1]) neighbors++;
            
            result[i][j] = neighbors;
        }
    }
    
    return result;

}
