int[] solution(int[] a) {
    for(int i=0;i<a.length;i++){
        for(int j= i+1;j<a.length;j++){
            if(a[i] != -1 && a[j] != -1){
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    return a;
}
