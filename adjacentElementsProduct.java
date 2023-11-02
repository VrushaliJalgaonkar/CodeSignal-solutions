int solution(int[] inputArray) {
    int max = Integer.MIN_VALUE;
    for(int i = 1;i<inputArray.length;i++){
        int prod = inputArray[i-1] * inputArray[i];
        max = Math.max(max,prod);
    }
    return max;
}
