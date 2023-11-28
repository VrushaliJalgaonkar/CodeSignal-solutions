int solution(int[] inputArray) {
    int max = inputArray[0];
    int moves = 0;
    for(int i=1;i<inputArray.length;i++){
        if(inputArray[i] <= max){
            moves = moves + max - inputArray[i] + 1;
            inputArray[i] = max + 1;
        }
        max = inputArray[i];
    }
    return moves;
}
