class Peaks {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length<3){
            return 0;    
        }
        int[] peaks = new int[A.length];
        for(int i = 1;i<A.length-1;i++){
            if(A[i]>A[i-1]&&A[i]>A[i+1]){
                peaks[i] = peaks[i-1]+1;    
            }else{
                peaks[i] = peaks[i-1];
            }
        }
        peaks[A.length-1] = peaks[A.length-2];
        int totalPeaks = peaks[A.length-1];
        int totalElements = A.length;
        int res = 0;
        for(int noOfBlock=1;noOfBlock<=totalPeaks;noOfBlock++){
            if(totalElements%noOfBlock!=0){
                continue;
            }
            int noOfEach = totalElements/noOfBlock;
            boolean flag = true;
            for(int j=1;j<noOfBlock;j++){
                if(peaks[j*noOfEach-1]>=peaks[(j+1)*noOfEach-1]){
                    flag=false;
                    break;
                }
            }
            if(flag){
                res = noOfBlock;
            }
 
        }
        return res;
    }   
}