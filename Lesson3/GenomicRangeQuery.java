class GenomicRangeQuery {
    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        int len = S.length();
        int[] countA = new int[len+1];
        int[] countC = new int[len+1];
        int[] countG = new int[len+1];
        int[] countT = new int[len+1];
        
        
        for(int i =0;i<len;i++){
            countA[i+1] = countA[i];
            countC[i+1] = countC[i];
            countG[i+1] = countG[i];
            countT[i+1] = countT[i];
            switch(S.charAt(i)){
                case 'A':
                    countA[i+1] = countA[i+1]+1;
                    break;
                case 'C':
                    countC[i+1] = countC[i+1]+1;
                    break;
                case 'G':
                    countG[i+1] = countG[i+1]+1;
                    break;
                case 'T':
                    countT[i+1] = countT[i+1]+1;
                    break;
                default:
                    break;
            }
        }
        int[] result = new int[P.length];
        for(int i=0;i<P.length;i++){
            int start = P[i];
            int end = Q[i];
            if(countA[end+1]>countA[start]){
                result[i] = 1;
            }else if(countC[end+1]>countC[start]){
                result[i] = 2;
            }else if(countG[end+1]>countG[start]){
                result[i] = 3;
            }else if(countT[end+1]>countT[start]){
                result[i] = 4;
            }else{
                //only one element
                result[i] = letterToInt(S.charAt(start));
            }
        }
        return result;
    }
    
    private int letterToInt(char c){
        switch(c){
            case 'A': return 1;
            case 'C': return 2;
            case 'G': return 3;
            case 'T': return 4;
            default : return -1;
        }
    }
}
