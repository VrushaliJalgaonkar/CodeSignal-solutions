int solution(int[] inputArray) {
    int adjDiff = 0;
    for(int i=1;i<inputArray.length;i++){
        adjDiff = Math.max(adjDiff,Math.abs(inputArray[i] - inputArray[i-1]));
    }
    return adjDiff;
}
