class MaxCounters {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] counter = new int[N];
        int max = 0;
        int min = 0;
        for(int i=0;i<A.length;i++){
            if(A[i]==N+1){
                min = max;
            }else{
                counter[A[i]-1]=Math.max(min,counter[A[i]-1])+1;
                max = Math.max(max,counter[A[i]-1]);
            }
        }
        for(int i=0;i<N;i++){
            counter[i]=Math.max(min,counter[i]);
        }
        return counter;
    }
}