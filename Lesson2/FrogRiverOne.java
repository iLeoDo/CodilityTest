class FrogRiverOne {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        int step = X;
        int[] map = new int[X];
        for(int i=0;i<A.length;i++){
            if(map[A[i]-1]==0){
                map[A[i]-1]=1;
                step--;
            }
            if(step==0){
                return i;
            }
        }
        return -1;
    }
}