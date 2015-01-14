class MaxProfit {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length==1){
            return 0;    
        }
        
        int maxEnding = 0;
        int maxProfit = 0;
        for(int i = 1;i<A.length;i++){
            int dif = A[i]-A[i-1];
            maxEnding = Math.max(0,maxEnding+dif);
            maxProfit = Math.max(maxProfit,maxEnding);
        }
        
        return maxProfit;     
    }
}