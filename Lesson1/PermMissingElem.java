class PermMissingElem {
    public int solution(int[] A) {
        long N = A.length+1;
        long sum = (1+N)*(N)/2;
        long errorSum = 0; 
        for(int i=0;i<A.length;i++){
            errorSum += A[i];
        }
        return (int) (sum-errorSum);
    }
}