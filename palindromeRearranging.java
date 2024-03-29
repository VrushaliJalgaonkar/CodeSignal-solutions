boolean solution(String inputString) {
    Set<Character> chars = new HashSet<Character>();
    
    for (int i = 0; i < inputString.length();  ++i) {
        char c = inputString.charAt(i);
        if (chars.contains(c)) {
            chars.remove(c);
        }
        else {
            chars.add(c);
        }
    }
    return chars.size() <= 1 ? true : false; 

}
