String solution(String inputString) {
    int startInd, lastInd;
    while(inputString.indexOf("(") != -1){
        startInd = inputString.lastIndexOf("(");
        lastInd = inputString.indexOf(")",startInd);
        String start = inputString.substring(0,startInd);
        String last = inputString.substring(lastInd+1);
        String revStr = new StringBuilder(inputString.subSequence(startInd+1, lastInd)).reverse().toString();
        inputString = start + revStr + last;
        
    }
    return inputString;
}
