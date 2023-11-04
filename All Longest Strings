String[] solution(String[] inputArray) {
    // get max length
    int max = Stream.<String>of(inputArray)
              .mapToInt(n -> n.length())
              .max()
              .getAsInt();
    //compare length of strings and return          
    return Stream.<String>of(inputArray)
           .filter(e -> e.length() == max)
           .toArray(String[]::new);
}
