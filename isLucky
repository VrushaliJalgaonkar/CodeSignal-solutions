boolean solution(int n) {
    String str = n+"";
    int firstHalfSum =0, secondHalfSum = 0;
    for(int i=0;i<str.length()/2;i++){
        int a = Integer.parseInt(String.valueOf(str.charAt(i)));
        firstHalfSum = firstHalfSum + a;
    }
    for(int j=str.length()/2;j<str.length();j++){
        int a = Integer.parseInt(String.valueOf(str.charAt(j)));
        secondHalfSum = secondHalfSum + a;
    }
    return firstHalfSum == secondHalfSum;
}
