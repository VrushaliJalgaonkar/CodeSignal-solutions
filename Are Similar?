boolean solution(int[] a, int[] b) {
    if(Arrays.equals(a,b)) return true;
    int p=0,q=0;
    for(int i=0, k=2;i<b.length;i++){
        if(a[i] != b[i]){
            if(k==2){
                p=i;
                k--;
            }
            else {
                q=i;
                k--;
            }
        }
        if(k==0){
            swap(b,p,q);
            return Arrays.equals(a,b);
        }
    }
    return false;

}
void swap(int[] a, int p, int q){
    int temp = a[p];
    a[p] = a[q];
    a[q] = temp;
}
