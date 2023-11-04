int solution(String s1, String s2) {
    int count = 0;
    HashMap<Character,Integer> mp = new HashMap<>();
    for(char ch : s1.toCharArray()){
        mp.put(ch, mp.getOrDefault(ch, 0) + 1);
    }
    for(char ch : s2.toCharArray()){
        if(mp.containsKey(ch) && mp.get(ch) >0){
            count++;
            mp.put(ch,mp.get(ch) -1);
        }
    }
    return count;
}
