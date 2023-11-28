int[][] solution(int[][] image) {
    int[][] result = new int[image.length - 2][image[0].length - 2];
    
    for (int i = 1; i < image.length - 1; i++) {
        for (int j = 1; j < image[0].length - 1; j++) {
            result[i - 1][j - 1] = boundSum(image, i, j);
        }
    }
    
    return result;
}

int boundSum(int[][] image, int row, int column) {
     int sum = 0;
    
    for (int i = row - 1; i <= row + 1; i++) {
        for (int j = column - 1; j <= column + 1; j++) {
            sum += image[i][j];
        }
    }
    
    return sum / 9;
}
