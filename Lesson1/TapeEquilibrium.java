class TapeEquilibrium {
    public int solution(int[] A) {
        
        int length = A.length;
        int nlength = length-1;
        int[] VL = VR = new int[nlength];
        int[] VR = new int[nlength];
        
        VL[0] = A[0];
        VR[nlength-1] = A[length-1];
        
        for(int i=1;i<nlength;i++){
            VL[i] = VL[i-1] + A[i];
            VR[nlength-1-i] = VR[nlength-i]+A[nlength-i];
        }
        
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nlength-1;i++){
            int abs = Math.abs(VL[i]-VR[i]);
            if(abs<min){
                min = abs;
            }
        }
        return min;
        
    }
}
