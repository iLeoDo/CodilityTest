class CountFactors {
    public int solution(int N) {
        // write your code in Java SE 8
        int count = 0;
        long i = 1;
        for(;(i*i)<N;i++){
            if(N%i==0){
                 count = count+2;
            }
        }
        if(i*i==N){
            count++;
        }
        return count;
    }
}