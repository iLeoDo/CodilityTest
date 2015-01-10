class MinAvgTwoSlice {
    public int solution(int[] A) {
        // write your code in Java SE 8
        double min = Double.MAX_VALUE;
        int minIndex = 0;
        
        for(int i=0;i<A.length-2;i++){
            double avgPair=(A[i]+A[i+1])/2.0;
            double avgTriple=(A[i]+A[i+1]+A[i+2])/3.0;
            if(min>avgPair){
                min = avgPair;
                minIndex = i;
            }
            if(min>avgTriple){
                min = avgTriple;
                minIndex=i;
            }
        }
        double avgPair=(A[A.length-2]+A[A.length-1])/2;
        if(min>avgPair){
            min = avgPair;
            minIndex = A.length-2;
        }
        return minIndex;
    }
}