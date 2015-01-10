class PassingCars {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int count = 0;
        int pair = 0;
        for(int i=A.length-1; i>=0;i--){
            if(A[i]==1){
                count++;
            }else{
                pair = pair+count;
                if(pair>1000000000)
                    return -1;
            }
        }
        return pair;
    }
}