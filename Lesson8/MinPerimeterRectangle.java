class MinPerimeterRectangle {
    public int solution(int N) {
        // write your code in Java SE 8
        int min = Integer.MAX_VALUE;
        for(int i=1;(i*i)<=N;i++){
            if(N%i==0){
                 min = Math.min(min,(i+N/i));
            }
        }
        return 2*min;
    }
}