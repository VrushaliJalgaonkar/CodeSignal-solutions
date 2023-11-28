int solution(int[] statues) {
    Arrays.sort(statues);
    int n = statues[statues.length-1] - statues[0];
    return n - statues.length + 1;
}
