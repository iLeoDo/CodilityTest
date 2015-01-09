class PermCheck {
    public int solution(int[] A) {
        int N = A.length;
        int[] count = new int[N];
        for(int i=0;i<N;i++){
            if(A[i]>N) return 0;
            count[A[i]-1]++;
        }

        for(int i=0;i<count.length;i++){
            if(count[i]!=1){
                return 0;
            }
        }
        return 1;
    }
}