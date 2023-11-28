String[] solution(String[] picture) {
    String[] res = new String[picture.length + 2];
    int wordLen = picture[0].length()+2;
    res[0] = "*".repeat(wordLen);
    res[res.length-1] = "*".repeat(wordLen);
    for(int i=0;i<picture.length;i++){
       res[i+1] = '*' + picture[i] + '*';
    }
    return res;
}
